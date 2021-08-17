# JavaClient
Use (gRPC) java client to call the model deployed by TensorFlow Serving
#### Java客户端

```xml
（gRPC调用）若使用Java作为客户端，则需要编译proto文件 
```

###### 1、获取protobuf文件

```shell
// 需要注意版本问题，由.proto文件编译出来的java class依赖tensorflow的jar包，可能存在不兼容问题
【Linux】
export SRC=~/Documents/source_code/
mkdir -p $SRC

cd $SRC
git clone git@github.com:tensorflow/serving.git
cd serving
git checkout tags/2.1.0

cd $RSC
git clone git@github.com:tensorflow/tensorflow.git
cd tensorflow
git checkout tags/v2.1.0

【Windows】
// 创建文件夹
mkdir D:/file/source_code
cd D:/file/source_code
// git下载serving
git clone https://github.com/tensorflow/serving
cd serving
git checkout tags/2.1.0

cd D:/file/source_code
// git下载tensorflow
git clone https://github.com/tensorflow/tensorflow
cd tensorflow
git checkout tags/v2.1.0
```

###### 2、将需要的.proto文件复制到java工程下

```shell
$ mkdir -p $PROJECT_ROOT/src/main/proto/
$ rsync -arv  --prune-empty-dirs --include="*/" --include='*.proto' --exclude='*' $SRC/serving/tensorflow_serving  $PROJECT_ROOT/src/main/proto/
$ rsync -arv  --prune-empty-dirs --include="*/" --include="tensorflow/core/lib/core/*.proto" --include='tensorflow/core/framework/*.proto' --include="tensorflow/core/example/*.proto" --include="tensorflow/core/protobuf/*.proto" --exclude='*' $SRC/tensorflow/tensorflow  $PROJECT_ROOT/src/main/proto/
```

###### 3、生成java源码

```xml
<!-- 在maven项目中添加依赖 -->
    <properties>
        <grpc.version>1.20.0</grpc.version>
    </properties>
    
    <dependencies>
        <!-- gRPC protobuf client -->
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-protobuf</artifactId>
            <version>${grpc.version}</version>
        </dependency>
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-stub</artifactId>
            <version>${grpc.version}</version>
        </dependency>
        <dependency>
            <groupId>io.grpc</groupId>
            <artifactId>grpc-netty-shaded</artifactId>
            <version>${grpc.version}</version>
        </dependency>
        <dependency>
            <groupId>com.google.api.grpc</groupId>
            <artifactId>proto-google-common-protos</artifactId>
            <version>1.0.0</version>
        </dependency>
    </dependencies>
```

###### 4、安装protoc工具

```shell
brew install protobuf
```

###### 5.1、插件编译proto文件

```xml
<!-- 通过maven添加编译插件（注意版本） -->
<build>
        <extensions>
            <extension>
                <groupId>kr.motd.maven</groupId>
                <artifactId>os-maven-plugin</artifactId>
                <version>1.6.2</version>
            </extension>
        </extensions>
        <plugins>
            <plugin>
                <groupId>org.xolstice.maven.plugins</groupId>
                <artifactId>protobuf-maven-plugin</artifactId>
                <version>0.6.1</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>compile</goal>
                            <goal>compile-custom</goal>
                        </goals>
                    </execution>
                </executions>
                <configuration>
                    <checkStaleness>true</checkStaleness>
                    <protocArtifact>com.google.protobuf:protoc:3.6.1:exe:${os.detected.classifier}</protocArtifact>
                    <pluginId>grpc-java</pluginId>
                    <pluginArtifact>io.grpc:protoc-gen-grpc-java:${grpc.version}:exe:${os.detected.classifier}</pluginArtifact>
                </configuration>
            </plugin>
        </plugins>
</build>
```

```shell
// 在当前工程根路径下执行命令
mvn protobuf:compile（执行报错）
```

```xml
编译完成之后，在$PROJECT_ROOT/src/main/resources下会增加一个new_old的文件夹，将里面的./org/tensorflow 和 ./tensorflow/serving 两个文件夹移动至PROJECT_ROOT/src/main/java下即可
```
###### 5.2、手动编译proto文件

```xml
手动编译相较前者麻烦些，但是可以编译出静态的代码集成至工程中，而不是每次运行都动态生成（未尝试）
```

```shell
// grpc-java repo代码地址：https://github.com/grpc/grpc-java
$ cd $SRC
$ git clone https://github.com/grpc/grpc-java.git
Cloning into 'grpc-java'...
remote: Enumerating objects: 166, done.
remote: Counting objects: 100% (166/166), done.
remote: Compressing objects: 100% (121/121), done.
remote: Total 84096 (delta 66), reused 92 (delta 25), pack-reused 83930
Receiving objects: 100% (84096/84096), 31.18 MiB | 23.14 MiB/s, done.
Resolving deltas: 100% (38843/38843), done.

$ cd grpc-java/compiler/
$ ../gradlew java_pluginExecutable
$ ls -l build/exe/java_plugin/protoc-gen-grpc-java
```

```shell
// 运行shell脚本，编译protobuf文件
export SRC=~/code/TFS_source/
export PROJECT_ROOT=~/java/JavaClient/
cd $PROJECT_ROOT/src/main/proto/
protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/example/*.proto
# append by wangxiao
protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/core/logging.proto
protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/stream_executor/dnn.proto

protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/apis/*.proto
protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/config/*.proto
protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/util/*.proto
protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow_serving/sources/storage_path/*.proto

# the following 3 cmds will generate extra *Grpc.java stub source files in addition to the regular protobuf Java source files.
# The output grpc-java files are put in the same directory as the regular java source files.
# note the --plugin option uses the grpc-java plugin file we created in step 1.
protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/protobuf/*.proto
protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/lib/core/*.proto
protoc --java_out $PROJECT_ROOT/src/main/java --proto_path ./ ./tensorflow/core/framework/*.proto

protoc --grpc-java_out $PROJECT_ROOT/src/main/java --java_out $PROJECT_ROOT/src/main/java --proto_path ./ tensorflow_serving/apis/prediction_service.proto --plugin=protoc-gen-grpc-java=$SRC/grpc-java/compiler/build/exe/java_plugin/protoc-gen-grpc-java
protoc --grpc-java_out $PROJECT_ROOT/src/main/java --java_out $PROJECT_ROOT/src/main/java --proto_path ./ tensorflow_serving/apis/model_service.proto --plugin=protoc-gen-grpc-java=$SRC/grpc-java/compiler/build/exe/java_plugin/protoc-gen-grpc-java
protoc --grpc-java_out $PROJECT_ROOT/src/main/java --java_out $PROJECT_ROOT/src/main/java --proto_path ./ tensorflow_serving/apis/session_service.proto --plugin=protoc-gen-grpc-java=$SRC/grpc-java/compiler/build/exe/java_plugin/protoc-gen-grpc-java
```

```xml
运行正常的情况下，$PROJECT_ROOT/src/main/java/ 文件夹里应该新增了/org/tensorflow 和 /tensorflow/serving 两个文件夹，至此，编译结束！
```

###### 6、编写JavaClient

```xml
1、以MNIST数据集为例，在java客户端进行调用
2、需要编写load（读取）MNIST数据集的代码
```

```xml
<!-- 需要在pom文件中添加依赖 -->
<dependency>
    <groupId>org.tensorflow</groupId>
    <artifactId>tensorflow</artifactId>
    <version>1.7.0</version>
</dependency>
```

```java
// Mnist.java

package data;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Random;
import java.util.zip.GZIPInputStream;

/**
 * @Title：Mnist
 * @Package：com.linjie.client
 * @Description：
 * @author：done
 * @date：2021/8/12 21:36
 */

public class Mnist {

    public static class Data {
        public byte[] data;
        public int label;
        public float[] input;
        public float[] output;
    }

    public static void main(String[] args) throws Exception {
        Mnist mnist = new Mnist();
        mnist.load();
        System.out.println("Data loaded.");
        Random rand = new Random(System.nanoTime());
        for (int i = 0; i < 20; i++) {
            int idx = rand.nextInt(60000);
            Data d = mnist.getTrainingData(idx);
            BufferedImage img = new BufferedImage(28, 28, BufferedImage.TYPE_INT_RGB);
            for (int x = 0; x < 28; x++) {
                for (int y = 0; y < 28; y++) {
                    img.setRGB(x, y, toRgb(d.data[y * 28 + x]));
                }
            }
            File output = new File(i + "_" + d.label + ".png");
            if (!output.exists()) {
                output.createNewFile();
            }
            ImageIO.write(img, "png", output);
        }
    }

    static int toRgb(byte bb) {
        int b = (255 - (0xff & bb));
        return (b << 16 | b << 8 | b) & 0xffffff;
    }

    Data[] trainingSet;
    Data[] testSet;

    public void shuffle() {
        Random rand = new Random();
        for (int i = 0; i < trainingSet.length; i++) {
            int x = rand.nextInt(trainingSet.length);
            Data d = trainingSet[i];
            trainingSet[i] = trainingSet[x];
            trainingSet[x] = trainingSet[i];
        }
    }

    public Data getTrainingData(int idx) {
        return trainingSet[idx];
    }

    public Data[] getTrainingSlice(int start, int count) {
        Data[] ret = new Data[count];
        System.arraycopy(trainingSet, start, ret, 0, count);
        return ret;
    }

    public Data getTestData(int idx) {
        return testSet[idx];
    }

    public Data[] getTestSlice(int start, int count) {
        Data[] ret = new Data[count];
        System.arraycopy(testSet, start, ret, 0, count);
        return ret;
    }

    public void load() {
        trainingSet = load("D:\\dowl\\mnist_dataset\\mnist_dataset\\train-images-idx3-ubyte.gz", "D:\\dowl\\mnist_dataset\\mnist_dataset\\train-labels-idx1-ubyte.gz");
        testSet = load("D:\\dowl\\mnist_dataset\\mnist_dataset\\t10k-images-idx3-ubyte.gz", "D:\\dowl\\mnist_dataset\\mnist_dataset\\t10k-labels-idx1-ubyte.gz");
        if (trainingSet.length != 60000 || testSet.length != 10000) {
            throw new RuntimeException("Unexpected training/test data size: " + trainingSet.length + "/" + testSet.length);
        }
    }

    private Data[] load(String imgFile, String labelFile) {
        byte[][] images = loadImages(imgFile);
        byte[] labels = loadLabels(labelFile);
        if (images.length != labels.length) {
            throw new RuntimeException("Images and label doesn't match: " + imgFile + " " + labelFile);
        }
        int len = images.length;
        Data[] data = new Data[len];
        for (int i = 0; i < len; i++) {
            data[i] = new Data();
            data[i].data = images[i];
            data[i].label = 0xff & labels[i];
            data[i].input = dataToInput(images[i]);
            data[i].output = labelToOutput(labels[i]);
        }
        return data;
    }

    private float[] labelToOutput(byte label) {
        float[] o = new float[10];
        o[label] = 1;
        return o;
    }

    private float[] dataToInput(byte[] b) {
        float[] d = new float[b.length];
        for (int i = 0; i < b.length; i++) {
            d[i] = (b[i] & 0xff) / 255.f;
        }
        return d;
    }

    private byte[][] loadImages(String imgFile) {
        try (DataInputStream in = new DataInputStream(new GZIPInputStream(new FileInputStream(imgFile)));) {
            int magic = in.readInt();
            if (magic != 0x00000803) {
                throw new RuntimeException("wrong magic: 0x" + Integer.toHexString(magic));
            }
            int count = in.readInt();
            int rows = in.readInt();
            int cols = in.readInt();
            if (rows != 28 || cols != 28) {
                throw new RuntimeException("Unexpected row and col count: " + rows + "x" + cols);
            }
            byte[][] data = new byte[count][rows * cols];
            for (int i = 0; i < count; i++) {
                in.readFully(data[i]);
            }
            return data;
        } catch (Exception ex) {
            throw new RuntimeException("Failed to read file: " + imgFile, ex);
        }
    }

    private byte[] loadLabels(String labelFile) {
        try (DataInputStream in = new DataInputStream(new GZIPInputStream(new FileInputStream(labelFile)));) {
            int magic = in.readInt();
            if (magic != 0x00000801) {
                throw new RuntimeException("wrong magic: 0x" + Integer.toHexString(magic));
            }
            int count = in.readInt();
            byte[] data = new byte[count];
            in.readFully(data);
            return data;
        } catch (Exception ex) {
            throw new RuntimeException("Failed to read file: " + labelFile, ex);
        }
    }
}
```

```java
// TestClient.java

package client;
import data.Mnist;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.tensorflow.Tensor;
import org.tensorflow.Tensors;
import org.tensorflow.framework.DataType;
import org.tensorflow.framework.TensorProto;
import org.tensorflow.framework.TensorShapeProto;
import tensorflow.serving.Model;
import tensorflow.serving.Predict;
import tensorflow.serving.PredictionServiceGrpc;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * @Title：TestClient
 * @Package：client
 * @Description：
 * @author：done
 * @date：2021/8/16 21:49
 */
public class TestClient {

    public static void main(String[] args) throws Exception {
        String host = "192.168.110.100";
        int port = 8500;
        // the model's name.
        // 使用命令查看模型 saved_model_cli show --dir model_dir_path --all
        String modelName = "saved_model";
        
        // Mnist实例化
        Mnist mnist = new Mnist();
        mnist.load();

        /************************** 单张图片分类 *******************************/
        
        Mnist.Data testData = mnist.getTestData(0);  // 获取第一张图片
        float[] x = testData.input;  // 获取单张图片的输入张量
        int seqLen = 784;  // 输入大小
        System.out.println("data[0]的真实标签为：" + testData.label);

        /************************** 单张图片分类 *******************************/
        /************************** 多张图片分类 *******************************/

//        ArrayList<float[]> X = new ArrayList<float[]>();
//        Mnist.Data[] data = mnist.getTestSlice(0, 10);
//        int seqLen = 784 * data.length;
//        System.out.print("data[0-10]真实标签为：");
//        for (int i=0; i<data.length; i++){
//            X.add(data[i].input);
//            System.out.print(data[i].label + " ");
//        }
        
        /************************** 多张图片分类 *******************************/

        // create a channel for gRPC
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
        PredictionServiceGrpc.PredictionServiceBlockingStub stub = PredictionServiceGrpc.newBlockingStub(channel);

        // create a modelspec
        Model.ModelSpec.Builder modelSpecBuilder = Model.ModelSpec.newBuilder();
        modelSpecBuilder.setName(modelName);
        modelSpecBuilder.setSignatureName("serving_default");

        Predict.PredictRequest.Builder builder = Predict.PredictRequest.newBuilder();
        builder.setModelSpec(modelSpecBuilder);

        // create the input TensorProto and request
        TensorProto.Builder tensorProtoBuilder = TensorProto.newBuilder();
        tensorProtoBuilder.setDtype(DataType.DT_FLOAT);

        /************************** 单张图片分类 *******************************/
        
        for (Float intDatum : x) {
            // 添加输入
            tensorProtoBuilder.addFloatVal(intDatum);
        }
        
        /************************** 单张图片分类 *******************************/
        /************************** 多张图片分类 *******************************/
        
//        for (float[] temp: X) {
//            float[] input = temp;
//            for (Float intDatum : input) {
//                tensorProtoBuilder.addFloatVal(intDatum);
//            }
//        }
        
        /************************** 多张图片分类 *******************************/

        // build input TensorProto shape
        TensorShapeProto.Builder tensorShapeBuilder = TensorShapeProto.newBuilder();
        tensorShapeBuilder.addDim(TensorShapeProto.Dim.newBuilder().setSize(1));
        tensorShapeBuilder.addDim(TensorShapeProto.Dim.newBuilder().setSize(seqLen));
        tensorProtoBuilder.setTensorShape(tensorShapeBuilder.build());

        TensorProto tp = tensorProtoBuilder.build();
        builder.putInputs("args_0", tp);  // 输入签名 args_0
        Predict.PredictRequest request = builder.build();

        System.out.println("******************* 请求响应 *******************");
        // get response
        Predict.PredictResponse response = stub.predict(request);
        // 获取分类概率列表
        List<Float> pro = response.getOutputsMap().get("output_1").getFloatValList(); // 输出签名output_1
        // 获取分类结果
        int pre_y = pro.indexOf(pro.stream().max((o1, o2) -> o1.compareTo(o2)).get());
        System.out.println("data[0]的分类结果为：" + pre_y);
    }

    static private byte[] loadTensorflowModel(String path){
        try {
            return Files.readAllBytes(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    static private Tensor<Double> covertArrayToTensor(double inputs[]){
        return Tensors.create(inputs);
    }
}
```
![image-20210817155153710](C:\Users\LinJie\AppData\Roaming\Typora\typora-user-images\image-20210817155153710.png)
