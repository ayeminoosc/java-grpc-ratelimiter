// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/data/core/v3/health_check_event.proto

package io.envoyproxy.envoy.data.core.v3;

/**
 * Protobuf type {@code envoy.data.core.v3.HealthCheckEjectUnhealthy}
 */
public final class HealthCheckEjectUnhealthy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.data.core.v3.HealthCheckEjectUnhealthy)
    HealthCheckEjectUnhealthyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HealthCheckEjectUnhealthy.newBuilder() to construct.
  private HealthCheckEjectUnhealthy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HealthCheckEjectUnhealthy() {
    failureType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HealthCheckEjectUnhealthy();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HealthCheckEjectUnhealthy(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {
            int rawValue = input.readEnum();

            failureType_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.data.core.v3.HealthCheckEventProto.internal_static_envoy_data_core_v3_HealthCheckEjectUnhealthy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.data.core.v3.HealthCheckEventProto.internal_static_envoy_data_core_v3_HealthCheckEjectUnhealthy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy.class, io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy.Builder.class);
  }

  public static final int FAILURE_TYPE_FIELD_NUMBER = 1;
  private int failureType_;
  /**
   * <pre>
   * The type of failure that caused this ejection.
   * </pre>
   *
   * <code>.envoy.data.core.v3.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for failureType.
   */
  @java.lang.Override public int getFailureTypeValue() {
    return failureType_;
  }
  /**
   * <pre>
   * The type of failure that caused this ejection.
   * </pre>
   *
   * <code>.envoy.data.core.v3.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
   * @return The failureType.
   */
  @java.lang.Override public io.envoyproxy.envoy.data.core.v3.HealthCheckFailureType getFailureType() {
    @SuppressWarnings("deprecation")
    io.envoyproxy.envoy.data.core.v3.HealthCheckFailureType result = io.envoyproxy.envoy.data.core.v3.HealthCheckFailureType.valueOf(failureType_);
    return result == null ? io.envoyproxy.envoy.data.core.v3.HealthCheckFailureType.UNRECOGNIZED : result;
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
    if (failureType_ != io.envoyproxy.envoy.data.core.v3.HealthCheckFailureType.ACTIVE.getNumber()) {
      output.writeEnum(1, failureType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (failureType_ != io.envoyproxy.envoy.data.core.v3.HealthCheckFailureType.ACTIVE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, failureType_);
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
    if (!(obj instanceof io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy other = (io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy) obj;

    if (failureType_ != other.failureType_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FAILURE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + failureType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy prototype) {
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
   * Protobuf type {@code envoy.data.core.v3.HealthCheckEjectUnhealthy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.data.core.v3.HealthCheckEjectUnhealthy)
      io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.data.core.v3.HealthCheckEventProto.internal_static_envoy_data_core_v3_HealthCheckEjectUnhealthy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.data.core.v3.HealthCheckEventProto.internal_static_envoy_data_core_v3_HealthCheckEjectUnhealthy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy.class, io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      failureType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.data.core.v3.HealthCheckEventProto.internal_static_envoy_data_core_v3_HealthCheckEjectUnhealthy_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy getDefaultInstanceForType() {
      return io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy build() {
      io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy buildPartial() {
      io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy result = new io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy(this);
      result.failureType_ = failureType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy) {
        return mergeFrom((io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy other) {
      if (other == io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy.getDefaultInstance()) return this;
      if (other.failureType_ != 0) {
        setFailureTypeValue(other.getFailureTypeValue());
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
      io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int failureType_ = 0;
    /**
     * <pre>
     * The type of failure that caused this ejection.
     * </pre>
     *
     * <code>.envoy.data.core.v3.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for failureType.
     */
    @java.lang.Override public int getFailureTypeValue() {
      return failureType_;
    }
    /**
     * <pre>
     * The type of failure that caused this ejection.
     * </pre>
     *
     * <code>.envoy.data.core.v3.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for failureType to set.
     * @return This builder for chaining.
     */
    public Builder setFailureTypeValue(int value) {
      
      failureType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of failure that caused this ejection.
     * </pre>
     *
     * <code>.envoy.data.core.v3.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
     * @return The failureType.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.data.core.v3.HealthCheckFailureType getFailureType() {
      @SuppressWarnings("deprecation")
      io.envoyproxy.envoy.data.core.v3.HealthCheckFailureType result = io.envoyproxy.envoy.data.core.v3.HealthCheckFailureType.valueOf(failureType_);
      return result == null ? io.envoyproxy.envoy.data.core.v3.HealthCheckFailureType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The type of failure that caused this ejection.
     * </pre>
     *
     * <code>.envoy.data.core.v3.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
     * @param value The failureType to set.
     * @return This builder for chaining.
     */
    public Builder setFailureType(io.envoyproxy.envoy.data.core.v3.HealthCheckFailureType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      failureType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The type of failure that caused this ejection.
     * </pre>
     *
     * <code>.envoy.data.core.v3.HealthCheckFailureType failure_type = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearFailureType() {
      
      failureType_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:envoy.data.core.v3.HealthCheckEjectUnhealthy)
  }

  // @@protoc_insertion_point(class_scope:envoy.data.core.v3.HealthCheckEjectUnhealthy)
  private static final io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy();
  }

  public static io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HealthCheckEjectUnhealthy>
      PARSER = new com.google.protobuf.AbstractParser<HealthCheckEjectUnhealthy>() {
    @java.lang.Override
    public HealthCheckEjectUnhealthy parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HealthCheckEjectUnhealthy(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HealthCheckEjectUnhealthy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HealthCheckEjectUnhealthy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.data.core.v3.HealthCheckEjectUnhealthy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
