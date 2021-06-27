// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/base.proto

package io.envoyproxy.envoy.config.core.v3;

/**
 * <pre>
 * Runtime derived FractionalPercent with defaults for when the numerator or denominator is not
 * specified via a runtime key.
 * .. note::
 *   Parsing of the runtime key's data is implemented such that it may be represented as a
 *   :ref:`FractionalPercent &lt;envoy_api_msg_type.v3.FractionalPercent&gt;` proto represented as JSON/YAML
 *   and may also be represented as an integer with the assumption that the value is an integral
 *   percentage out of 100. For instance, a runtime key lookup returning the value "42" would parse
 *   as a `FractionalPercent` whose numerator is 42 and denominator is HUNDRED.
 * </pre>
 *
 * Protobuf type {@code envoy.config.core.v3.RuntimeFractionalPercent}
 */
public final class RuntimeFractionalPercent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.core.v3.RuntimeFractionalPercent)
    RuntimeFractionalPercentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RuntimeFractionalPercent.newBuilder() to construct.
  private RuntimeFractionalPercent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RuntimeFractionalPercent() {
    runtimeKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RuntimeFractionalPercent();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RuntimeFractionalPercent(
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
          case 10: {
            io.envoyproxy.envoy.type.v3.FractionalPercent.Builder subBuilder = null;
            if (defaultValue_ != null) {
              subBuilder = defaultValue_.toBuilder();
            }
            defaultValue_ = input.readMessage(io.envoyproxy.envoy.type.v3.FractionalPercent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(defaultValue_);
              defaultValue_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            runtimeKey_ = s;
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
    return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_RuntimeFractionalPercent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_RuntimeFractionalPercent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent.class, io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent.Builder.class);
  }

  public static final int DEFAULT_VALUE_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.type.v3.FractionalPercent defaultValue_;
  /**
   * <pre>
   * Default value if the runtime value's for the numerator/denominator keys are not available.
   * </pre>
   *
   * <code>.envoy.type.v3.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the defaultValue field is set.
   */
  @java.lang.Override
  public boolean hasDefaultValue() {
    return defaultValue_ != null;
  }
  /**
   * <pre>
   * Default value if the runtime value's for the numerator/denominator keys are not available.
   * </pre>
   *
   * <code>.envoy.type.v3.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
   * @return The defaultValue.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.v3.FractionalPercent getDefaultValue() {
    return defaultValue_ == null ? io.envoyproxy.envoy.type.v3.FractionalPercent.getDefaultInstance() : defaultValue_;
  }
  /**
   * <pre>
   * Default value if the runtime value's for the numerator/denominator keys are not available.
   * </pre>
   *
   * <code>.envoy.type.v3.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.v3.FractionalPercentOrBuilder getDefaultValueOrBuilder() {
    return getDefaultValue();
  }

  public static final int RUNTIME_KEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object runtimeKey_;
  /**
   * <pre>
   * Runtime key for a YAML representation of a FractionalPercent.
   * </pre>
   *
   * <code>string runtime_key = 2;</code>
   * @return The runtimeKey.
   */
  @java.lang.Override
  public java.lang.String getRuntimeKey() {
    java.lang.Object ref = runtimeKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      runtimeKey_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Runtime key for a YAML representation of a FractionalPercent.
   * </pre>
   *
   * <code>string runtime_key = 2;</code>
   * @return The bytes for runtimeKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRuntimeKeyBytes() {
    java.lang.Object ref = runtimeKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      runtimeKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (defaultValue_ != null) {
      output.writeMessage(1, getDefaultValue());
    }
    if (!getRuntimeKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, runtimeKey_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (defaultValue_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDefaultValue());
    }
    if (!getRuntimeKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, runtimeKey_);
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
    if (!(obj instanceof io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent other = (io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent) obj;

    if (hasDefaultValue() != other.hasDefaultValue()) return false;
    if (hasDefaultValue()) {
      if (!getDefaultValue()
          .equals(other.getDefaultValue())) return false;
    }
    if (!getRuntimeKey()
        .equals(other.getRuntimeKey())) return false;
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
    if (hasDefaultValue()) {
      hash = (37 * hash) + DEFAULT_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getDefaultValue().hashCode();
    }
    hash = (37 * hash) + RUNTIME_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getRuntimeKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent prototype) {
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
   * <pre>
   * Runtime derived FractionalPercent with defaults for when the numerator or denominator is not
   * specified via a runtime key.
   * .. note::
   *   Parsing of the runtime key's data is implemented such that it may be represented as a
   *   :ref:`FractionalPercent &lt;envoy_api_msg_type.v3.FractionalPercent&gt;` proto represented as JSON/YAML
   *   and may also be represented as an integer with the assumption that the value is an integral
   *   percentage out of 100. For instance, a runtime key lookup returning the value "42" would parse
   *   as a `FractionalPercent` whose numerator is 42 and denominator is HUNDRED.
   * </pre>
   *
   * Protobuf type {@code envoy.config.core.v3.RuntimeFractionalPercent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.core.v3.RuntimeFractionalPercent)
      io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_RuntimeFractionalPercent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_RuntimeFractionalPercent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent.class, io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent.newBuilder()
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
      if (defaultValueBuilder_ == null) {
        defaultValue_ = null;
      } else {
        defaultValue_ = null;
        defaultValueBuilder_ = null;
      }
      runtimeKey_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.core.v3.BaseProto.internal_static_envoy_config_core_v3_RuntimeFractionalPercent_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent build() {
      io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent buildPartial() {
      io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent result = new io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent(this);
      if (defaultValueBuilder_ == null) {
        result.defaultValue_ = defaultValue_;
      } else {
        result.defaultValue_ = defaultValueBuilder_.build();
      }
      result.runtimeKey_ = runtimeKey_;
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
      if (other instanceof io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent) {
        return mergeFrom((io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent other) {
      if (other == io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent.getDefaultInstance()) return this;
      if (other.hasDefaultValue()) {
        mergeDefaultValue(other.getDefaultValue());
      }
      if (!other.getRuntimeKey().isEmpty()) {
        runtimeKey_ = other.runtimeKey_;
        onChanged();
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
      io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.envoyproxy.envoy.type.v3.FractionalPercent defaultValue_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.v3.FractionalPercent, io.envoyproxy.envoy.type.v3.FractionalPercent.Builder, io.envoyproxy.envoy.type.v3.FractionalPercentOrBuilder> defaultValueBuilder_;
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the defaultValue field is set.
     */
    public boolean hasDefaultValue() {
      return defaultValueBuilder_ != null || defaultValue_ != null;
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     * @return The defaultValue.
     */
    public io.envoyproxy.envoy.type.v3.FractionalPercent getDefaultValue() {
      if (defaultValueBuilder_ == null) {
        return defaultValue_ == null ? io.envoyproxy.envoy.type.v3.FractionalPercent.getDefaultInstance() : defaultValue_;
      } else {
        return defaultValueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setDefaultValue(io.envoyproxy.envoy.type.v3.FractionalPercent value) {
      if (defaultValueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        defaultValue_ = value;
        onChanged();
      } else {
        defaultValueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setDefaultValue(
        io.envoyproxy.envoy.type.v3.FractionalPercent.Builder builderForValue) {
      if (defaultValueBuilder_ == null) {
        defaultValue_ = builderForValue.build();
        onChanged();
      } else {
        defaultValueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeDefaultValue(io.envoyproxy.envoy.type.v3.FractionalPercent value) {
      if (defaultValueBuilder_ == null) {
        if (defaultValue_ != null) {
          defaultValue_ =
            io.envoyproxy.envoy.type.v3.FractionalPercent.newBuilder(defaultValue_).mergeFrom(value).buildPartial();
        } else {
          defaultValue_ = value;
        }
        onChanged();
      } else {
        defaultValueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearDefaultValue() {
      if (defaultValueBuilder_ == null) {
        defaultValue_ = null;
        onChanged();
      } else {
        defaultValue_ = null;
        defaultValueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.type.v3.FractionalPercent.Builder getDefaultValueBuilder() {
      
      onChanged();
      return getDefaultValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.type.v3.FractionalPercentOrBuilder getDefaultValueOrBuilder() {
      if (defaultValueBuilder_ != null) {
        return defaultValueBuilder_.getMessageOrBuilder();
      } else {
        return defaultValue_ == null ?
            io.envoyproxy.envoy.type.v3.FractionalPercent.getDefaultInstance() : defaultValue_;
      }
    }
    /**
     * <pre>
     * Default value if the runtime value's for the numerator/denominator keys are not available.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent default_value = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.v3.FractionalPercent, io.envoyproxy.envoy.type.v3.FractionalPercent.Builder, io.envoyproxy.envoy.type.v3.FractionalPercentOrBuilder> 
        getDefaultValueFieldBuilder() {
      if (defaultValueBuilder_ == null) {
        defaultValueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.type.v3.FractionalPercent, io.envoyproxy.envoy.type.v3.FractionalPercent.Builder, io.envoyproxy.envoy.type.v3.FractionalPercentOrBuilder>(
                getDefaultValue(),
                getParentForChildren(),
                isClean());
        defaultValue_ = null;
      }
      return defaultValueBuilder_;
    }

    private java.lang.Object runtimeKey_ = "";
    /**
     * <pre>
     * Runtime key for a YAML representation of a FractionalPercent.
     * </pre>
     *
     * <code>string runtime_key = 2;</code>
     * @return The runtimeKey.
     */
    public java.lang.String getRuntimeKey() {
      java.lang.Object ref = runtimeKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        runtimeKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Runtime key for a YAML representation of a FractionalPercent.
     * </pre>
     *
     * <code>string runtime_key = 2;</code>
     * @return The bytes for runtimeKey.
     */
    public com.google.protobuf.ByteString
        getRuntimeKeyBytes() {
      java.lang.Object ref = runtimeKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        runtimeKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Runtime key for a YAML representation of a FractionalPercent.
     * </pre>
     *
     * <code>string runtime_key = 2;</code>
     * @param value The runtimeKey to set.
     * @return This builder for chaining.
     */
    public Builder setRuntimeKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      runtimeKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Runtime key for a YAML representation of a FractionalPercent.
     * </pre>
     *
     * <code>string runtime_key = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRuntimeKey() {
      
      runtimeKey_ = getDefaultInstance().getRuntimeKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Runtime key for a YAML representation of a FractionalPercent.
     * </pre>
     *
     * <code>string runtime_key = 2;</code>
     * @param value The bytes for runtimeKey to set.
     * @return This builder for chaining.
     */
    public Builder setRuntimeKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      runtimeKey_ = value;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.core.v3.RuntimeFractionalPercent)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.core.v3.RuntimeFractionalPercent)
  private static final io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent();
  }

  public static io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuntimeFractionalPercent>
      PARSER = new com.google.protobuf.AbstractParser<RuntimeFractionalPercent>() {
    @java.lang.Override
    public RuntimeFractionalPercent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RuntimeFractionalPercent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RuntimeFractionalPercent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuntimeFractionalPercent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

