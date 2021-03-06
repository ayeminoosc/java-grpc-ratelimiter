// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/config_source.proto

package io.envoyproxy.envoy.config.core.v3;

/**
 * <pre>
 * [#not-implemented-hide:]
 * Self-referencing config source options. This is currently empty, but when
 * set in :ref:`ConfigSource &lt;envoy_api_msg_config.core.v3.ConfigSource&gt;` can be used to
 * specify that other data can be obtained from the same server.
 * </pre>
 *
 * Protobuf type {@code envoy.config.core.v3.SelfConfigSource}
 */
public final class SelfConfigSource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.core.v3.SelfConfigSource)
    SelfConfigSourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SelfConfigSource.newBuilder() to construct.
  private SelfConfigSource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SelfConfigSource() {
    transportApiVersion_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SelfConfigSource();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SelfConfigSource(
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

            transportApiVersion_ = rawValue;
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
    return io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.internal_static_envoy_config_core_v3_SelfConfigSource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.internal_static_envoy_config_core_v3_SelfConfigSource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.core.v3.SelfConfigSource.class, io.envoyproxy.envoy.config.core.v3.SelfConfigSource.Builder.class);
  }

  public static final int TRANSPORT_API_VERSION_FIELD_NUMBER = 1;
  private int transportApiVersion_;
  /**
   * <pre>
   * API version for xDS transport protocol. This describes the xDS gRPC/REST
   * endpoint and version of [Delta]DiscoveryRequest/Response used on the wire.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 1 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for transportApiVersion.
   */
  @java.lang.Override public int getTransportApiVersionValue() {
    return transportApiVersion_;
  }
  /**
   * <pre>
   * API version for xDS transport protocol. This describes the xDS gRPC/REST
   * endpoint and version of [Delta]DiscoveryRequest/Response used on the wire.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 1 [(.validate.rules) = { ... }</code>
   * @return The transportApiVersion.
   */
  @java.lang.Override public io.envoyproxy.envoy.config.core.v3.ApiVersion getTransportApiVersion() {
    @SuppressWarnings("deprecation")
    io.envoyproxy.envoy.config.core.v3.ApiVersion result = io.envoyproxy.envoy.config.core.v3.ApiVersion.valueOf(transportApiVersion_);
    return result == null ? io.envoyproxy.envoy.config.core.v3.ApiVersion.UNRECOGNIZED : result;
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
    if (transportApiVersion_ != io.envoyproxy.envoy.config.core.v3.ApiVersion.AUTO.getNumber()) {
      output.writeEnum(1, transportApiVersion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transportApiVersion_ != io.envoyproxy.envoy.config.core.v3.ApiVersion.AUTO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, transportApiVersion_);
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
    if (!(obj instanceof io.envoyproxy.envoy.config.core.v3.SelfConfigSource)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.core.v3.SelfConfigSource other = (io.envoyproxy.envoy.config.core.v3.SelfConfigSource) obj;

    if (transportApiVersion_ != other.transportApiVersion_) return false;
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
    hash = (37 * hash) + TRANSPORT_API_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + transportApiVersion_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.core.v3.SelfConfigSource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.SelfConfigSource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.SelfConfigSource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.SelfConfigSource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.SelfConfigSource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.SelfConfigSource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.SelfConfigSource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.SelfConfigSource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.SelfConfigSource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.SelfConfigSource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.SelfConfigSource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.SelfConfigSource parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.core.v3.SelfConfigSource prototype) {
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
   * [#not-implemented-hide:]
   * Self-referencing config source options. This is currently empty, but when
   * set in :ref:`ConfigSource &lt;envoy_api_msg_config.core.v3.ConfigSource&gt;` can be used to
   * specify that other data can be obtained from the same server.
   * </pre>
   *
   * Protobuf type {@code envoy.config.core.v3.SelfConfigSource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.core.v3.SelfConfigSource)
      io.envoyproxy.envoy.config.core.v3.SelfConfigSourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.internal_static_envoy_config_core_v3_SelfConfigSource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.internal_static_envoy_config_core_v3_SelfConfigSource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.core.v3.SelfConfigSource.class, io.envoyproxy.envoy.config.core.v3.SelfConfigSource.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.core.v3.SelfConfigSource.newBuilder()
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
      transportApiVersion_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.core.v3.ConfigSourceProto.internal_static_envoy_config_core_v3_SelfConfigSource_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.SelfConfigSource getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.core.v3.SelfConfigSource.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.SelfConfigSource build() {
      io.envoyproxy.envoy.config.core.v3.SelfConfigSource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.SelfConfigSource buildPartial() {
      io.envoyproxy.envoy.config.core.v3.SelfConfigSource result = new io.envoyproxy.envoy.config.core.v3.SelfConfigSource(this);
      result.transportApiVersion_ = transportApiVersion_;
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
      if (other instanceof io.envoyproxy.envoy.config.core.v3.SelfConfigSource) {
        return mergeFrom((io.envoyproxy.envoy.config.core.v3.SelfConfigSource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.core.v3.SelfConfigSource other) {
      if (other == io.envoyproxy.envoy.config.core.v3.SelfConfigSource.getDefaultInstance()) return this;
      if (other.transportApiVersion_ != 0) {
        setTransportApiVersionValue(other.getTransportApiVersionValue());
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
      io.envoyproxy.envoy.config.core.v3.SelfConfigSource parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.core.v3.SelfConfigSource) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int transportApiVersion_ = 0;
    /**
     * <pre>
     * API version for xDS transport protocol. This describes the xDS gRPC/REST
     * endpoint and version of [Delta]DiscoveryRequest/Response used on the wire.
     * </pre>
     *
     * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 1 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for transportApiVersion.
     */
    @java.lang.Override public int getTransportApiVersionValue() {
      return transportApiVersion_;
    }
    /**
     * <pre>
     * API version for xDS transport protocol. This describes the xDS gRPC/REST
     * endpoint and version of [Delta]DiscoveryRequest/Response used on the wire.
     * </pre>
     *
     * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 1 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for transportApiVersion to set.
     * @return This builder for chaining.
     */
    public Builder setTransportApiVersionValue(int value) {
      
      transportApiVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * API version for xDS transport protocol. This describes the xDS gRPC/REST
     * endpoint and version of [Delta]DiscoveryRequest/Response used on the wire.
     * </pre>
     *
     * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 1 [(.validate.rules) = { ... }</code>
     * @return The transportApiVersion.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.ApiVersion getTransportApiVersion() {
      @SuppressWarnings("deprecation")
      io.envoyproxy.envoy.config.core.v3.ApiVersion result = io.envoyproxy.envoy.config.core.v3.ApiVersion.valueOf(transportApiVersion_);
      return result == null ? io.envoyproxy.envoy.config.core.v3.ApiVersion.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * API version for xDS transport protocol. This describes the xDS gRPC/REST
     * endpoint and version of [Delta]DiscoveryRequest/Response used on the wire.
     * </pre>
     *
     * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 1 [(.validate.rules) = { ... }</code>
     * @param value The transportApiVersion to set.
     * @return This builder for chaining.
     */
    public Builder setTransportApiVersion(io.envoyproxy.envoy.config.core.v3.ApiVersion value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      transportApiVersion_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * API version for xDS transport protocol. This describes the xDS gRPC/REST
     * endpoint and version of [Delta]DiscoveryRequest/Response used on the wire.
     * </pre>
     *
     * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearTransportApiVersion() {
      
      transportApiVersion_ = 0;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.core.v3.SelfConfigSource)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.core.v3.SelfConfigSource)
  private static final io.envoyproxy.envoy.config.core.v3.SelfConfigSource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.core.v3.SelfConfigSource();
  }

  public static io.envoyproxy.envoy.config.core.v3.SelfConfigSource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SelfConfigSource>
      PARSER = new com.google.protobuf.AbstractParser<SelfConfigSource>() {
    @java.lang.Override
    public SelfConfigSource parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SelfConfigSource(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SelfConfigSource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SelfConfigSource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.SelfConfigSource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

