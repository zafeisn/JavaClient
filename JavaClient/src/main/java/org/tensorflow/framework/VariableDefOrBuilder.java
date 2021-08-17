// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/variable.proto

package org.tensorflow.framework;

public interface VariableDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.VariableDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the variable tensor.
   * </pre>
   *
   * <code>string variable_name = 1;</code>
   */
  java.lang.String getVariableName();
  /**
   * <pre>
   * Name of the variable tensor.
   * </pre>
   *
   * <code>string variable_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getVariableNameBytes();

  /**
   * <pre>
   * Name of the tensor holding the variable's initial value.
   * </pre>
   *
   * <code>string initial_value_name = 6;</code>
   */
  java.lang.String getInitialValueName();
  /**
   * <pre>
   * Name of the tensor holding the variable's initial value.
   * </pre>
   *
   * <code>string initial_value_name = 6;</code>
   */
  com.google.protobuf.ByteString
      getInitialValueNameBytes();

  /**
   * <pre>
   * Name of the initializer op.
   * </pre>
   *
   * <code>string initializer_name = 2;</code>
   */
  java.lang.String getInitializerName();
  /**
   * <pre>
   * Name of the initializer op.
   * </pre>
   *
   * <code>string initializer_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getInitializerNameBytes();

  /**
   * <pre>
   * Name of the snapshot tensor.
   * </pre>
   *
   * <code>string snapshot_name = 3;</code>
   */
  java.lang.String getSnapshotName();
  /**
   * <pre>
   * Name of the snapshot tensor.
   * </pre>
   *
   * <code>string snapshot_name = 3;</code>
   */
  com.google.protobuf.ByteString
      getSnapshotNameBytes();

  /**
   * <pre>
   * Support for saving variables as slices of a larger variable.
   * </pre>
   *
   * <code>.tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
   */
  boolean hasSaveSliceInfoDef();
  /**
   * <pre>
   * Support for saving variables as slices of a larger variable.
   * </pre>
   *
   * <code>.tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
   */
  org.tensorflow.framework.SaveSliceInfoDef getSaveSliceInfoDef();
  /**
   * <pre>
   * Support for saving variables as slices of a larger variable.
   * </pre>
   *
   * <code>.tensorflow.SaveSliceInfoDef save_slice_info_def = 4;</code>
   */
  org.tensorflow.framework.SaveSliceInfoDefOrBuilder getSaveSliceInfoDefOrBuilder();

  /**
   * <pre>
   * Whether to represent this as a ResourceVariable.
   * </pre>
   *
   * <code>bool is_resource = 5;</code>
   */
  boolean getIsResource();

  /**
   * <pre>
   * Whether this variable should be trained.
   * </pre>
   *
   * <code>bool trainable = 7;</code>
   */
  boolean getTrainable();
}
