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
        String modelName = "saved_model";

        Mnist mnist = new Mnist();
        mnist.load();

        /************************** 单张图片分类 *******************************/

        Mnist.Data testData = mnist.getTestData(0);
        float[] x = testData.input;
        int seqLen = 784;
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

//        float[] input = data[6].input;

//        Mnist.Data testData = mnist.getTestData(3);
//        System.out.println("testData.label = " + testData.label);
//        float[] input = testData.input;


        // assume this model takes input of free text, and make some sentiment prediction.
//        List<Float> intData = new ArrayList<Float>();
//        for(float i=0.f; i < seqLen; i++){
//            intData.add(i);
//        }

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
//            tensorProtoBuilder.addIntVal(intDatum);
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
        builder.putInputs("args_0", tp);
        Predict.PredictRequest request = builder.build();
//        System.out.println("request \n" + request);

        System.out.println("******************* 请求响应 *******************");
        // get response
        Predict.PredictResponse response = stub.predict(request);
        // 获取分类概率列表
        List<Float> pro = response.getOutputsMap().get("output_1").getFloatValList();
        // 获取分类结果
        int pre_y = pro.indexOf(pro.stream().max((o1, o2) -> o1.compareTo(o2)).get());
        System.out.println("data[0]的分类结果为：" + pre_y);
//        System.out.println(response);
//        System.out.println(response.getOutputsMap().get("output_1").getFloatValList().stream().max((o1, o2) -> o1.compareTo(o2)));
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
