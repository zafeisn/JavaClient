// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/debug.proto

package org.tensorflow.framework;

/**
 * Protobuf type {@code tensorflow.DebuggedSourceFiles}
 */
public  final class DebuggedSourceFiles extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tensorflow.DebuggedSourceFiles)
    DebuggedSourceFilesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DebuggedSourceFiles.newBuilder() to construct.
  private DebuggedSourceFiles(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DebuggedSourceFiles() {
    sourceFiles_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DebuggedSourceFiles(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              sourceFiles_ = new java.util.ArrayList<org.tensorflow.framework.DebuggedSourceFile>();
              mutable_bitField0_ |= 0x00000001;
            }
            sourceFiles_.add(
                input.readMessage(org.tensorflow.framework.DebuggedSourceFile.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        sourceFiles_ = java.util.Collections.unmodifiableList(sourceFiles_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.framework.DebugProtos.internal_static_tensorflow_DebuggedSourceFiles_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.framework.DebugProtos.internal_static_tensorflow_DebuggedSourceFiles_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.framework.DebuggedSourceFiles.class, org.tensorflow.framework.DebuggedSourceFiles.Builder.class);
  }

  public static final int SOURCE_FILES_FIELD_NUMBER = 1;
  private java.util.List<org.tensorflow.framework.DebuggedSourceFile> sourceFiles_;
  /**
   * <pre>
   * A collection of source code files.
   * </pre>
   *
   * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
   */
  public java.util.List<org.tensorflow.framework.DebuggedSourceFile> getSourceFilesList() {
    return sourceFiles_;
  }
  /**
   * <pre>
   * A collection of source code files.
   * </pre>
   *
   * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
   */
  public java.util.List<? extends org.tensorflow.framework.DebuggedSourceFileOrBuilder> 
      getSourceFilesOrBuilderList() {
    return sourceFiles_;
  }
  /**
   * <pre>
   * A collection of source code files.
   * </pre>
   *
   * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
   */
  public int getSourceFilesCount() {
    return sourceFiles_.size();
  }
  /**
   * <pre>
   * A collection of source code files.
   * </pre>
   *
   * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
   */
  public org.tensorflow.framework.DebuggedSourceFile getSourceFiles(int index) {
    return sourceFiles_.get(index);
  }
  /**
   * <pre>
   * A collection of source code files.
   * </pre>
   *
   * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
   */
  public org.tensorflow.framework.DebuggedSourceFileOrBuilder getSourceFilesOrBuilder(
      int index) {
    return sourceFiles_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < sourceFiles_.size(); i++) {
      output.writeMessage(1, sourceFiles_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < sourceFiles_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, sourceFiles_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.tensorflow.framework.DebuggedSourceFiles)) {
      return super.equals(obj);
    }
    org.tensorflow.framework.DebuggedSourceFiles other = (org.tensorflow.framework.DebuggedSourceFiles) obj;

    boolean result = true;
    result = result && getSourceFilesList()
        .equals(other.getSourceFilesList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getSourceFilesCount() > 0) {
      hash = (37 * hash) + SOURCE_FILES_FIELD_NUMBER;
      hash = (53 * hash) + getSourceFilesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.framework.DebuggedSourceFiles parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.DebuggedSourceFiles parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.DebuggedSourceFiles parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.DebuggedSourceFiles parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.DebuggedSourceFiles parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.framework.DebuggedSourceFiles parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.framework.DebuggedSourceFiles parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.DebuggedSourceFiles parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.DebuggedSourceFiles parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.DebuggedSourceFiles parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.framework.DebuggedSourceFiles parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.framework.DebuggedSourceFiles parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.tensorflow.framework.DebuggedSourceFiles prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tensorflow.DebuggedSourceFiles}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.DebuggedSourceFiles)
      org.tensorflow.framework.DebuggedSourceFilesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.framework.DebugProtos.internal_static_tensorflow_DebuggedSourceFiles_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.framework.DebugProtos.internal_static_tensorflow_DebuggedSourceFiles_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.framework.DebuggedSourceFiles.class, org.tensorflow.framework.DebuggedSourceFiles.Builder.class);
    }

    // Construct using org.tensorflow.framework.DebuggedSourceFiles.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getSourceFilesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (sourceFilesBuilder_ == null) {
        sourceFiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        sourceFilesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.framework.DebugProtos.internal_static_tensorflow_DebuggedSourceFiles_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.framework.DebuggedSourceFiles getDefaultInstanceForType() {
      return org.tensorflow.framework.DebuggedSourceFiles.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.framework.DebuggedSourceFiles build() {
      org.tensorflow.framework.DebuggedSourceFiles result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.framework.DebuggedSourceFiles buildPartial() {
      org.tensorflow.framework.DebuggedSourceFiles result = new org.tensorflow.framework.DebuggedSourceFiles(this);
      int from_bitField0_ = bitField0_;
      if (sourceFilesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          sourceFiles_ = java.util.Collections.unmodifiableList(sourceFiles_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sourceFiles_ = sourceFiles_;
      } else {
        result.sourceFiles_ = sourceFilesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.framework.DebuggedSourceFiles) {
        return mergeFrom((org.tensorflow.framework.DebuggedSourceFiles)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.framework.DebuggedSourceFiles other) {
      if (other == org.tensorflow.framework.DebuggedSourceFiles.getDefaultInstance()) return this;
      if (sourceFilesBuilder_ == null) {
        if (!other.sourceFiles_.isEmpty()) {
          if (sourceFiles_.isEmpty()) {
            sourceFiles_ = other.sourceFiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSourceFilesIsMutable();
            sourceFiles_.addAll(other.sourceFiles_);
          }
          onChanged();
        }
      } else {
        if (!other.sourceFiles_.isEmpty()) {
          if (sourceFilesBuilder_.isEmpty()) {
            sourceFilesBuilder_.dispose();
            sourceFilesBuilder_ = null;
            sourceFiles_ = other.sourceFiles_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sourceFilesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSourceFilesFieldBuilder() : null;
          } else {
            sourceFilesBuilder_.addAllMessages(other.sourceFiles_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.tensorflow.framework.DebuggedSourceFiles parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.tensorflow.framework.DebuggedSourceFiles) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.tensorflow.framework.DebuggedSourceFile> sourceFiles_ =
      java.util.Collections.emptyList();
    private void ensureSourceFilesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        sourceFiles_ = new java.util.ArrayList<org.tensorflow.framework.DebuggedSourceFile>(sourceFiles_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.DebuggedSourceFile, org.tensorflow.framework.DebuggedSourceFile.Builder, org.tensorflow.framework.DebuggedSourceFileOrBuilder> sourceFilesBuilder_;

    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.DebuggedSourceFile> getSourceFilesList() {
      if (sourceFilesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sourceFiles_);
      } else {
        return sourceFilesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public int getSourceFilesCount() {
      if (sourceFilesBuilder_ == null) {
        return sourceFiles_.size();
      } else {
        return sourceFilesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public org.tensorflow.framework.DebuggedSourceFile getSourceFiles(int index) {
      if (sourceFilesBuilder_ == null) {
        return sourceFiles_.get(index);
      } else {
        return sourceFilesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public Builder setSourceFiles(
        int index, org.tensorflow.framework.DebuggedSourceFile value) {
      if (sourceFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourceFilesIsMutable();
        sourceFiles_.set(index, value);
        onChanged();
      } else {
        sourceFilesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public Builder setSourceFiles(
        int index, org.tensorflow.framework.DebuggedSourceFile.Builder builderForValue) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        sourceFiles_.set(index, builderForValue.build());
        onChanged();
      } else {
        sourceFilesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public Builder addSourceFiles(org.tensorflow.framework.DebuggedSourceFile value) {
      if (sourceFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourceFilesIsMutable();
        sourceFiles_.add(value);
        onChanged();
      } else {
        sourceFilesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public Builder addSourceFiles(
        int index, org.tensorflow.framework.DebuggedSourceFile value) {
      if (sourceFilesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSourceFilesIsMutable();
        sourceFiles_.add(index, value);
        onChanged();
      } else {
        sourceFilesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public Builder addSourceFiles(
        org.tensorflow.framework.DebuggedSourceFile.Builder builderForValue) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        sourceFiles_.add(builderForValue.build());
        onChanged();
      } else {
        sourceFilesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public Builder addSourceFiles(
        int index, org.tensorflow.framework.DebuggedSourceFile.Builder builderForValue) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        sourceFiles_.add(index, builderForValue.build());
        onChanged();
      } else {
        sourceFilesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public Builder addAllSourceFiles(
        java.lang.Iterable<? extends org.tensorflow.framework.DebuggedSourceFile> values) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sourceFiles_);
        onChanged();
      } else {
        sourceFilesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public Builder clearSourceFiles() {
      if (sourceFilesBuilder_ == null) {
        sourceFiles_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sourceFilesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public Builder removeSourceFiles(int index) {
      if (sourceFilesBuilder_ == null) {
        ensureSourceFilesIsMutable();
        sourceFiles_.remove(index);
        onChanged();
      } else {
        sourceFilesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public org.tensorflow.framework.DebuggedSourceFile.Builder getSourceFilesBuilder(
        int index) {
      return getSourceFilesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public org.tensorflow.framework.DebuggedSourceFileOrBuilder getSourceFilesOrBuilder(
        int index) {
      if (sourceFilesBuilder_ == null) {
        return sourceFiles_.get(index);  } else {
        return sourceFilesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public java.util.List<? extends org.tensorflow.framework.DebuggedSourceFileOrBuilder> 
         getSourceFilesOrBuilderList() {
      if (sourceFilesBuilder_ != null) {
        return sourceFilesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sourceFiles_);
      }
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public org.tensorflow.framework.DebuggedSourceFile.Builder addSourceFilesBuilder() {
      return getSourceFilesFieldBuilder().addBuilder(
          org.tensorflow.framework.DebuggedSourceFile.getDefaultInstance());
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public org.tensorflow.framework.DebuggedSourceFile.Builder addSourceFilesBuilder(
        int index) {
      return getSourceFilesFieldBuilder().addBuilder(
          index, org.tensorflow.framework.DebuggedSourceFile.getDefaultInstance());
    }
    /**
     * <pre>
     * A collection of source code files.
     * </pre>
     *
     * <code>repeated .tensorflow.DebuggedSourceFile source_files = 1;</code>
     */
    public java.util.List<org.tensorflow.framework.DebuggedSourceFile.Builder> 
         getSourceFilesBuilderList() {
      return getSourceFilesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.tensorflow.framework.DebuggedSourceFile, org.tensorflow.framework.DebuggedSourceFile.Builder, org.tensorflow.framework.DebuggedSourceFileOrBuilder> 
        getSourceFilesFieldBuilder() {
      if (sourceFilesBuilder_ == null) {
        sourceFilesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.tensorflow.framework.DebuggedSourceFile, org.tensorflow.framework.DebuggedSourceFile.Builder, org.tensorflow.framework.DebuggedSourceFileOrBuilder>(
                sourceFiles_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        sourceFiles_ = null;
      }
      return sourceFilesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tensorflow.DebuggedSourceFiles)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.DebuggedSourceFiles)
  private static final org.tensorflow.framework.DebuggedSourceFiles DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.framework.DebuggedSourceFiles();
  }

  public static org.tensorflow.framework.DebuggedSourceFiles getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DebuggedSourceFiles>
      PARSER = new com.google.protobuf.AbstractParser<DebuggedSourceFiles>() {
    @java.lang.Override
    public DebuggedSourceFiles parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DebuggedSourceFiles(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DebuggedSourceFiles> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DebuggedSourceFiles> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.framework.DebuggedSourceFiles getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

