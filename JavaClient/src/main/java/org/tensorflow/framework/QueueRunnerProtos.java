// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/queue_runner.proto

package org.tensorflow.framework;

public final class QueueRunnerProtos {
  private QueueRunnerProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_QueueRunnerDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_QueueRunnerDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+tensorflow/core/protobuf/queue_runner." +
      "proto\022\ntensorflow\032*tensorflow/core/lib/c" +
      "ore/error_codes.proto\"\252\001\n\016QueueRunnerDef" +
      "\022\022\n\nqueue_name\030\001 \001(\t\022\027\n\017enqueue_op_name\030" +
      "\002 \003(\t\022\025\n\rclose_op_name\030\003 \001(\t\022\026\n\016cancel_o" +
      "p_name\030\004 \001(\t\022<\n\034queue_closed_exception_t" +
      "ypes\030\005 \003(\0162\026.tensorflow.error.CodeBp\n\030or" +
      "g.tensorflow.frameworkB\021QueueRunnerProto" +
      "sP\001Z<github.com/tensorflow/tensorflow/te" +
      "nsorflow/go/core/protobuf\370\001\001b\006proto3"
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
          org.tensorflow.framework.ErrorCodesProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_QueueRunnerDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_QueueRunnerDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_QueueRunnerDef_descriptor,
        new java.lang.String[] { "QueueName", "EnqueueOpName", "CloseOpName", "CancelOpName", "QueueClosedExceptionTypes", });
    org.tensorflow.framework.ErrorCodesProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
