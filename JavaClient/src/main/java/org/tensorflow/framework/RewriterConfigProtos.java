// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/rewriter_config.proto

package org.tensorflow.framework;

public final class RewriterConfigProtos {
  private RewriterConfigProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_AutoParallelOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_AutoParallelOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ScopedAllocatorOptions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ScopedAllocatorOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RewriterConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RewriterConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RewriterConfig_CustomGraphOptimizer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RewriterConfig_CustomGraphOptimizer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_RewriterConfig_CustomGraphOptimizer_ParameterMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_RewriterConfig_CustomGraphOptimizer_ParameterMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.tensorflow/core/protobuf/rewriter_conf" +
      "ig.proto\022\ntensorflow\032*tensorflow/core/fr" +
      "amework/attr_value.proto\";\n\023AutoParallel" +
      "Options\022\016\n\006enable\030\001 \001(\010\022\024\n\014num_replicas\030" +
      "\002 \001(\005\"+\n\026ScopedAllocatorOptions\022\021\n\tenabl" +
      "e_op\030\001 \003(\t\"\365\r\n\016RewriterConfig\022;\n\020layout_" +
      "optimizer\030\001 \001(\0162!.tensorflow.RewriterCon" +
      "fig.Toggle\022;\n\020constant_folding\030\003 \001(\0162!.t" +
      "ensorflow.RewriterConfig.Toggle\022=\n\022shape" +
      "_optimization\030\r \001(\0162!.tensorflow.Rewrite" +
      "rConfig.Toggle\0224\n\tremapping\030\016 \001(\0162!.tens" +
      "orflow.RewriterConfig.Toggle\022B\n\027arithmet" +
      "ic_optimization\030\007 \001(\0162!.tensorflow.Rewri" +
      "terConfig.Toggle\022B\n\027dependency_optimizat" +
      "ion\030\010 \001(\0162!.tensorflow.RewriterConfig.To" +
      "ggle\022<\n\021loop_optimization\030\t \001(\0162!.tensor" +
      "flow.RewriterConfig.Toggle\022@\n\025function_o" +
      "ptimization\030\n \001(\0162!.tensorflow.RewriterC" +
      "onfig.Toggle\0229\n\016debug_stripper\030\013 \001(\0162!.t" +
      "ensorflow.RewriterConfig.Toggle\022\035\n\025disab" +
      "le_model_pruning\030\002 \001(\010\022H\n\035scoped_allocat" +
      "or_optimization\030\017 \001(\0162!.tensorflow.Rewri" +
      "terConfig.Toggle\022C\n\030pin_to_host_optimiza" +
      "tion\030\022 \001(\0162!.tensorflow.RewriterConfig.T" +
      "oggle\022\036\n\026disable_meta_optimizer\030\023 \001(\010\022O\n" +
      "\031meta_optimizer_iterations\030\014 \001(\0162,.tenso" +
      "rflow.RewriterConfig.NumIterationsType\022\027" +
      "\n\017min_graph_nodes\030\021 \001(\005\022B\n\023memory_optimi" +
      "zation\030\004 \001(\0162%.tensorflow.RewriterConfig" +
      ".MemOptType\022/\n\'memory_optimizer_target_n" +
      "ode_name_scope\030\006 \001(\t\022!\n\031meta_optimizer_t" +
      "imeout_ms\030\024 \001(\003\0226\n\rauto_parallel\030\005 \001(\0132\037" +
      ".tensorflow.AutoParallelOptions\022 \n\030fail_" +
      "on_optimizer_errors\030\025 \001(\010\022A\n\025scoped_allo" +
      "cator_opts\030\020 \001(\0132\".tensorflow.ScopedAllo" +
      "catorOptions\022\022\n\noptimizers\030d \003(\t\022K\n\021cust" +
      "om_optimizers\030\310\001 \003(\0132/.tensorflow.Rewrit" +
      "erConfig.CustomGraphOptimizer\032\312\001\n\024Custom" +
      "GraphOptimizer\022\014\n\004name\030\001 \001(\t\022X\n\rparamete" +
      "r_map\030\002 \003(\0132A.tensorflow.RewriterConfig." +
      "CustomGraphOptimizer.ParameterMapEntry\032J" +
      "\n\021ParameterMapEntry\022\013\n\003key\030\001 \001(\t\022$\n\005valu" +
      "e\030\002 \001(\0132\025.tensorflow.AttrValue:\0028\001\"6\n\006To" +
      "ggle\022\013\n\007DEFAULT\020\000\022\006\n\002ON\020\001\022\007\n\003OFF\020\002\022\016\n\nAG" +
      "GRESSIVE\020\003\"<\n\021NumIterationsType\022\025\n\021DEFAU" +
      "LT_NUM_ITERS\020\000\022\007\n\003ONE\020\001\022\007\n\003TWO\020\002\"\237\001\n\nMem" +
      "OptType\022\023\n\017DEFAULT_MEM_OPT\020\000\022\016\n\nNO_MEM_O" +
      "PT\020\001\022\n\n\006MANUAL\020\002\022\027\n\023SWAPPING_HEURISTICS\020" +
      "\004\022\034\n\030RECOMPUTATION_HEURISTICS\020\005\022\031\n\025SCHED" +
      "ULING_HEURISTICS\020\006\022\016\n\nHEURISTICS\020\003Bs\n\030or" +
      "g.tensorflow.frameworkB\024RewriterConfigPr" +
      "otosP\001Z<github.com/tensorflow/tensorflow" +
      "/tensorflow/go/core/protobuf\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.framework.AttrValueProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_AutoParallelOptions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_AutoParallelOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_AutoParallelOptions_descriptor,
        new java.lang.String[] { "Enable", "NumReplicas", });
    internal_static_tensorflow_ScopedAllocatorOptions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_ScopedAllocatorOptions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ScopedAllocatorOptions_descriptor,
        new java.lang.String[] { "EnableOp", });
    internal_static_tensorflow_RewriterConfig_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_RewriterConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RewriterConfig_descriptor,
        new java.lang.String[] { "LayoutOptimizer", "ConstantFolding", "ShapeOptimization", "Remapping", "ArithmeticOptimization", "DependencyOptimization", "LoopOptimization", "FunctionOptimization", "DebugStripper", "DisableModelPruning", "ScopedAllocatorOptimization", "PinToHostOptimization", "DisableMetaOptimizer", "MetaOptimizerIterations", "MinGraphNodes", "MemoryOptimization", "MemoryOptimizerTargetNodeNameScope", "MetaOptimizerTimeoutMs", "AutoParallel", "FailOnOptimizerErrors", "ScopedAllocatorOpts", "Optimizers", "CustomOptimizers", });
    internal_static_tensorflow_RewriterConfig_CustomGraphOptimizer_descriptor =
      internal_static_tensorflow_RewriterConfig_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_RewriterConfig_CustomGraphOptimizer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RewriterConfig_CustomGraphOptimizer_descriptor,
        new java.lang.String[] { "Name", "ParameterMap", });
    internal_static_tensorflow_RewriterConfig_CustomGraphOptimizer_ParameterMapEntry_descriptor =
      internal_static_tensorflow_RewriterConfig_CustomGraphOptimizer_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_RewriterConfig_CustomGraphOptimizer_ParameterMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_RewriterConfig_CustomGraphOptimizer_ParameterMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    org.tensorflow.framework.AttrValueProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}