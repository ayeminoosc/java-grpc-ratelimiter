// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/accesslog/v3/accesslog.proto

package io.envoyproxy.envoy.config.accesslog.v3;

/**
 * <pre>
 * Filters for random sampling of requests.
 * </pre>
 *
 * Protobuf type {@code envoy.config.accesslog.v3.RuntimeFilter}
 */
public final class RuntimeFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.accesslog.v3.RuntimeFilter)
    RuntimeFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RuntimeFilter.newBuilder() to construct.
  private RuntimeFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RuntimeFilter() {
    runtimeKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RuntimeFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RuntimeFilter(
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
            java.lang.String s = input.readStringRequireUtf8();

            runtimeKey_ = s;
            break;
          }
          case 18: {
            io.envoyproxy.envoy.type.v3.FractionalPercent.Builder subBuilder = null;
            if (percentSampled_ != null) {
              subBuilder = percentSampled_.toBuilder();
            }
            percentSampled_ = input.readMessage(io.envoyproxy.envoy.type.v3.FractionalPercent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(percentSampled_);
              percentSampled_ = subBuilder.buildPartial();
            }

            break;
          }
          case 24: {

            useIndependentRandomness_ = input.readBool();
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
    return io.envoyproxy.envoy.config.accesslog.v3.AccesslogProto.internal_static_envoy_config_accesslog_v3_RuntimeFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.accesslog.v3.AccesslogProto.internal_static_envoy_config_accesslog_v3_RuntimeFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter.class, io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter.Builder.class);
  }

  public static final int RUNTIME_KEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object runtimeKey_;
  /**
   * <pre>
   * Runtime key to get an optional overridden numerator for use in the
   * *percent_sampled* field. If found in runtime, this value will replace the
   * default numerator.
   * </pre>
   *
   * <code>string runtime_key = 1 [(.validate.rules) = { ... }</code>
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
   * Runtime key to get an optional overridden numerator for use in the
   * *percent_sampled* field. If found in runtime, this value will replace the
   * default numerator.
   * </pre>
   *
   * <code>string runtime_key = 1 [(.validate.rules) = { ... }</code>
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

  public static final int PERCENT_SAMPLED_FIELD_NUMBER = 2;
  private io.envoyproxy.envoy.type.v3.FractionalPercent percentSampled_;
  /**
   * <pre>
   * The default sampling percentage. If not specified, defaults to 0% with
   * denominator of 100.
   * </pre>
   *
   * <code>.envoy.type.v3.FractionalPercent percent_sampled = 2;</code>
   * @return Whether the percentSampled field is set.
   */
  @java.lang.Override
  public boolean hasPercentSampled() {
    return percentSampled_ != null;
  }
  /**
   * <pre>
   * The default sampling percentage. If not specified, defaults to 0% with
   * denominator of 100.
   * </pre>
   *
   * <code>.envoy.type.v3.FractionalPercent percent_sampled = 2;</code>
   * @return The percentSampled.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.v3.FractionalPercent getPercentSampled() {
    return percentSampled_ == null ? io.envoyproxy.envoy.type.v3.FractionalPercent.getDefaultInstance() : percentSampled_;
  }
  /**
   * <pre>
   * The default sampling percentage. If not specified, defaults to 0% with
   * denominator of 100.
   * </pre>
   *
   * <code>.envoy.type.v3.FractionalPercent percent_sampled = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.v3.FractionalPercentOrBuilder getPercentSampledOrBuilder() {
    return getPercentSampled();
  }

  public static final int USE_INDEPENDENT_RANDOMNESS_FIELD_NUMBER = 3;
  private boolean useIndependentRandomness_;
  /**
   * <pre>
   * By default, sampling pivots on the header
   * :ref:`x-request-id&lt;config_http_conn_man_headers_x-request-id&gt;` being
   * present. If :ref:`x-request-id&lt;config_http_conn_man_headers_x-request-id&gt;`
   * is present, the filter will consistently sample across multiple hosts based
   * on the runtime key value and the value extracted from
   * :ref:`x-request-id&lt;config_http_conn_man_headers_x-request-id&gt;`. If it is
   * missing, or *use_independent_randomness* is set to true, the filter will
   * randomly sample based on the runtime key value alone.
   * *use_independent_randomness* can be used for logging kill switches within
   * complex nested :ref:`AndFilter
   * &lt;envoy_api_msg_config.accesslog.v3.AndFilter&gt;` and :ref:`OrFilter
   * &lt;envoy_api_msg_config.accesslog.v3.OrFilter&gt;` blocks that are easier to
   * reason about from a probability perspective (i.e., setting to true will
   * cause the filter to behave like an independent random variable when
   * composed within logical operator filters).
   * </pre>
   *
   * <code>bool use_independent_randomness = 3;</code>
   * @return The useIndependentRandomness.
   */
  @java.lang.Override
  public boolean getUseIndependentRandomness() {
    return useIndependentRandomness_;
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
    if (!getRuntimeKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, runtimeKey_);
    }
    if (percentSampled_ != null) {
      output.writeMessage(2, getPercentSampled());
    }
    if (useIndependentRandomness_ != false) {
      output.writeBool(3, useIndependentRandomness_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getRuntimeKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, runtimeKey_);
    }
    if (percentSampled_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPercentSampled());
    }
    if (useIndependentRandomness_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, useIndependentRandomness_);
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
    if (!(obj instanceof io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter other = (io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter) obj;

    if (!getRuntimeKey()
        .equals(other.getRuntimeKey())) return false;
    if (hasPercentSampled() != other.hasPercentSampled()) return false;
    if (hasPercentSampled()) {
      if (!getPercentSampled()
          .equals(other.getPercentSampled())) return false;
    }
    if (getUseIndependentRandomness()
        != other.getUseIndependentRandomness()) return false;
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
    hash = (37 * hash) + RUNTIME_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getRuntimeKey().hashCode();
    if (hasPercentSampled()) {
      hash = (37 * hash) + PERCENT_SAMPLED_FIELD_NUMBER;
      hash = (53 * hash) + getPercentSampled().hashCode();
    }
    hash = (37 * hash) + USE_INDEPENDENT_RANDOMNESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseIndependentRandomness());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter prototype) {
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
   * Filters for random sampling of requests.
   * </pre>
   *
   * Protobuf type {@code envoy.config.accesslog.v3.RuntimeFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.accesslog.v3.RuntimeFilter)
      io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.accesslog.v3.AccesslogProto.internal_static_envoy_config_accesslog_v3_RuntimeFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.accesslog.v3.AccesslogProto.internal_static_envoy_config_accesslog_v3_RuntimeFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter.class, io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter.newBuilder()
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
      runtimeKey_ = "";

      if (percentSampledBuilder_ == null) {
        percentSampled_ = null;
      } else {
        percentSampled_ = null;
        percentSampledBuilder_ = null;
      }
      useIndependentRandomness_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.accesslog.v3.AccesslogProto.internal_static_envoy_config_accesslog_v3_RuntimeFilter_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter build() {
      io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter buildPartial() {
      io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter result = new io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter(this);
      result.runtimeKey_ = runtimeKey_;
      if (percentSampledBuilder_ == null) {
        result.percentSampled_ = percentSampled_;
      } else {
        result.percentSampled_ = percentSampledBuilder_.build();
      }
      result.useIndependentRandomness_ = useIndependentRandomness_;
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
      if (other instanceof io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter) {
        return mergeFrom((io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter other) {
      if (other == io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter.getDefaultInstance()) return this;
      if (!other.getRuntimeKey().isEmpty()) {
        runtimeKey_ = other.runtimeKey_;
        onChanged();
      }
      if (other.hasPercentSampled()) {
        mergePercentSampled(other.getPercentSampled());
      }
      if (other.getUseIndependentRandomness() != false) {
        setUseIndependentRandomness(other.getUseIndependentRandomness());
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
      io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object runtimeKey_ = "";
    /**
     * <pre>
     * Runtime key to get an optional overridden numerator for use in the
     * *percent_sampled* field. If found in runtime, this value will replace the
     * default numerator.
     * </pre>
     *
     * <code>string runtime_key = 1 [(.validate.rules) = { ... }</code>
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
     * Runtime key to get an optional overridden numerator for use in the
     * *percent_sampled* field. If found in runtime, this value will replace the
     * default numerator.
     * </pre>
     *
     * <code>string runtime_key = 1 [(.validate.rules) = { ... }</code>
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
     * Runtime key to get an optional overridden numerator for use in the
     * *percent_sampled* field. If found in runtime, this value will replace the
     * default numerator.
     * </pre>
     *
     * <code>string runtime_key = 1 [(.validate.rules) = { ... }</code>
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
     * Runtime key to get an optional overridden numerator for use in the
     * *percent_sampled* field. If found in runtime, this value will replace the
     * default numerator.
     * </pre>
     *
     * <code>string runtime_key = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearRuntimeKey() {
      
      runtimeKey_ = getDefaultInstance().getRuntimeKey();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Runtime key to get an optional overridden numerator for use in the
     * *percent_sampled* field. If found in runtime, this value will replace the
     * default numerator.
     * </pre>
     *
     * <code>string runtime_key = 1 [(.validate.rules) = { ... }</code>
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

    private io.envoyproxy.envoy.type.v3.FractionalPercent percentSampled_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.v3.FractionalPercent, io.envoyproxy.envoy.type.v3.FractionalPercent.Builder, io.envoyproxy.envoy.type.v3.FractionalPercentOrBuilder> percentSampledBuilder_;
    /**
     * <pre>
     * The default sampling percentage. If not specified, defaults to 0% with
     * denominator of 100.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent percent_sampled = 2;</code>
     * @return Whether the percentSampled field is set.
     */
    public boolean hasPercentSampled() {
      return percentSampledBuilder_ != null || percentSampled_ != null;
    }
    /**
     * <pre>
     * The default sampling percentage. If not specified, defaults to 0% with
     * denominator of 100.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent percent_sampled = 2;</code>
     * @return The percentSampled.
     */
    public io.envoyproxy.envoy.type.v3.FractionalPercent getPercentSampled() {
      if (percentSampledBuilder_ == null) {
        return percentSampled_ == null ? io.envoyproxy.envoy.type.v3.FractionalPercent.getDefaultInstance() : percentSampled_;
      } else {
        return percentSampledBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The default sampling percentage. If not specified, defaults to 0% with
     * denominator of 100.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent percent_sampled = 2;</code>
     */
    public Builder setPercentSampled(io.envoyproxy.envoy.type.v3.FractionalPercent value) {
      if (percentSampledBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        percentSampled_ = value;
        onChanged();
      } else {
        percentSampledBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The default sampling percentage. If not specified, defaults to 0% with
     * denominator of 100.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent percent_sampled = 2;</code>
     */
    public Builder setPercentSampled(
        io.envoyproxy.envoy.type.v3.FractionalPercent.Builder builderForValue) {
      if (percentSampledBuilder_ == null) {
        percentSampled_ = builderForValue.build();
        onChanged();
      } else {
        percentSampledBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The default sampling percentage. If not specified, defaults to 0% with
     * denominator of 100.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent percent_sampled = 2;</code>
     */
    public Builder mergePercentSampled(io.envoyproxy.envoy.type.v3.FractionalPercent value) {
      if (percentSampledBuilder_ == null) {
        if (percentSampled_ != null) {
          percentSampled_ =
            io.envoyproxy.envoy.type.v3.FractionalPercent.newBuilder(percentSampled_).mergeFrom(value).buildPartial();
        } else {
          percentSampled_ = value;
        }
        onChanged();
      } else {
        percentSampledBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The default sampling percentage. If not specified, defaults to 0% with
     * denominator of 100.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent percent_sampled = 2;</code>
     */
    public Builder clearPercentSampled() {
      if (percentSampledBuilder_ == null) {
        percentSampled_ = null;
        onChanged();
      } else {
        percentSampled_ = null;
        percentSampledBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The default sampling percentage. If not specified, defaults to 0% with
     * denominator of 100.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent percent_sampled = 2;</code>
     */
    public io.envoyproxy.envoy.type.v3.FractionalPercent.Builder getPercentSampledBuilder() {
      
      onChanged();
      return getPercentSampledFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The default sampling percentage. If not specified, defaults to 0% with
     * denominator of 100.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent percent_sampled = 2;</code>
     */
    public io.envoyproxy.envoy.type.v3.FractionalPercentOrBuilder getPercentSampledOrBuilder() {
      if (percentSampledBuilder_ != null) {
        return percentSampledBuilder_.getMessageOrBuilder();
      } else {
        return percentSampled_ == null ?
            io.envoyproxy.envoy.type.v3.FractionalPercent.getDefaultInstance() : percentSampled_;
      }
    }
    /**
     * <pre>
     * The default sampling percentage. If not specified, defaults to 0% with
     * denominator of 100.
     * </pre>
     *
     * <code>.envoy.type.v3.FractionalPercent percent_sampled = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.v3.FractionalPercent, io.envoyproxy.envoy.type.v3.FractionalPercent.Builder, io.envoyproxy.envoy.type.v3.FractionalPercentOrBuilder> 
        getPercentSampledFieldBuilder() {
      if (percentSampledBuilder_ == null) {
        percentSampledBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.type.v3.FractionalPercent, io.envoyproxy.envoy.type.v3.FractionalPercent.Builder, io.envoyproxy.envoy.type.v3.FractionalPercentOrBuilder>(
                getPercentSampled(),
                getParentForChildren(),
                isClean());
        percentSampled_ = null;
      }
      return percentSampledBuilder_;
    }

    private boolean useIndependentRandomness_ ;
    /**
     * <pre>
     * By default, sampling pivots on the header
     * :ref:`x-request-id&lt;config_http_conn_man_headers_x-request-id&gt;` being
     * present. If :ref:`x-request-id&lt;config_http_conn_man_headers_x-request-id&gt;`
     * is present, the filter will consistently sample across multiple hosts based
     * on the runtime key value and the value extracted from
     * :ref:`x-request-id&lt;config_http_conn_man_headers_x-request-id&gt;`. If it is
     * missing, or *use_independent_randomness* is set to true, the filter will
     * randomly sample based on the runtime key value alone.
     * *use_independent_randomness* can be used for logging kill switches within
     * complex nested :ref:`AndFilter
     * &lt;envoy_api_msg_config.accesslog.v3.AndFilter&gt;` and :ref:`OrFilter
     * &lt;envoy_api_msg_config.accesslog.v3.OrFilter&gt;` blocks that are easier to
     * reason about from a probability perspective (i.e., setting to true will
     * cause the filter to behave like an independent random variable when
     * composed within logical operator filters).
     * </pre>
     *
     * <code>bool use_independent_randomness = 3;</code>
     * @return The useIndependentRandomness.
     */
    @java.lang.Override
    public boolean getUseIndependentRandomness() {
      return useIndependentRandomness_;
    }
    /**
     * <pre>
     * By default, sampling pivots on the header
     * :ref:`x-request-id&lt;config_http_conn_man_headers_x-request-id&gt;` being
     * present. If :ref:`x-request-id&lt;config_http_conn_man_headers_x-request-id&gt;`
     * is present, the filter will consistently sample across multiple hosts based
     * on the runtime key value and the value extracted from
     * :ref:`x-request-id&lt;config_http_conn_man_headers_x-request-id&gt;`. If it is
     * missing, or *use_independent_randomness* is set to true, the filter will
     * randomly sample based on the runtime key value alone.
     * *use_independent_randomness* can be used for logging kill switches within
     * complex nested :ref:`AndFilter
     * &lt;envoy_api_msg_config.accesslog.v3.AndFilter&gt;` and :ref:`OrFilter
     * &lt;envoy_api_msg_config.accesslog.v3.OrFilter&gt;` blocks that are easier to
     * reason about from a probability perspective (i.e., setting to true will
     * cause the filter to behave like an independent random variable when
     * composed within logical operator filters).
     * </pre>
     *
     * <code>bool use_independent_randomness = 3;</code>
     * @param value The useIndependentRandomness to set.
     * @return This builder for chaining.
     */
    public Builder setUseIndependentRandomness(boolean value) {
      
      useIndependentRandomness_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * By default, sampling pivots on the header
     * :ref:`x-request-id&lt;config_http_conn_man_headers_x-request-id&gt;` being
     * present. If :ref:`x-request-id&lt;config_http_conn_man_headers_x-request-id&gt;`
     * is present, the filter will consistently sample across multiple hosts based
     * on the runtime key value and the value extracted from
     * :ref:`x-request-id&lt;config_http_conn_man_headers_x-request-id&gt;`. If it is
     * missing, or *use_independent_randomness* is set to true, the filter will
     * randomly sample based on the runtime key value alone.
     * *use_independent_randomness* can be used for logging kill switches within
     * complex nested :ref:`AndFilter
     * &lt;envoy_api_msg_config.accesslog.v3.AndFilter&gt;` and :ref:`OrFilter
     * &lt;envoy_api_msg_config.accesslog.v3.OrFilter&gt;` blocks that are easier to
     * reason about from a probability perspective (i.e., setting to true will
     * cause the filter to behave like an independent random variable when
     * composed within logical operator filters).
     * </pre>
     *
     * <code>bool use_independent_randomness = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUseIndependentRandomness() {
      
      useIndependentRandomness_ = false;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.accesslog.v3.RuntimeFilter)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.accesslog.v3.RuntimeFilter)
  private static final io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter();
  }

  public static io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RuntimeFilter>
      PARSER = new com.google.protobuf.AbstractParser<RuntimeFilter>() {
    @java.lang.Override
    public RuntimeFilter parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RuntimeFilter(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RuntimeFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RuntimeFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.accesslog.v3.RuntimeFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

