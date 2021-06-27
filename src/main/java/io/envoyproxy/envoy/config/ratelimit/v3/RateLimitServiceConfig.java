// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/ratelimit/v3/rls.proto

package io.envoyproxy.envoy.config.ratelimit.v3;

/**
 * <pre>
 * Rate limit :ref:`configuration overview &lt;config_rate_limit_service&gt;`.
 * </pre>
 *
 * Protobuf type {@code envoy.config.ratelimit.v3.RateLimitServiceConfig}
 */
public final class RateLimitServiceConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.ratelimit.v3.RateLimitServiceConfig)
    RateLimitServiceConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RateLimitServiceConfig.newBuilder() to construct.
  private RateLimitServiceConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RateLimitServiceConfig() {
    transportApiVersion_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RateLimitServiceConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RateLimitServiceConfig(
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
          case 18: {
            io.envoyproxy.envoy.config.core.v3.GrpcService.Builder subBuilder = null;
            if (grpcService_ != null) {
              subBuilder = grpcService_.toBuilder();
            }
            grpcService_ = input.readMessage(io.envoyproxy.envoy.config.core.v3.GrpcService.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(grpcService_);
              grpcService_ = subBuilder.buildPartial();
            }

            break;
          }
          case 32: {
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
    return io.envoyproxy.envoy.config.ratelimit.v3.RlsProto.internal_static_envoy_config_ratelimit_v3_RateLimitServiceConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.ratelimit.v3.RlsProto.internal_static_envoy_config_ratelimit_v3_RateLimitServiceConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig.class, io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig.Builder.class);
  }

  public static final int GRPC_SERVICE_FIELD_NUMBER = 2;
  private io.envoyproxy.envoy.config.core.v3.GrpcService grpcService_;
  /**
   * <pre>
   * Specifies the gRPC service that hosts the rate limit service. The client
   * will connect to this cluster when it needs to make rate limit service
   * requests.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the grpcService field is set.
   */
  @java.lang.Override
  public boolean hasGrpcService() {
    return grpcService_ != null;
  }
  /**
   * <pre>
   * Specifies the gRPC service that hosts the rate limit service. The client
   * will connect to this cluster when it needs to make rate limit service
   * requests.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
   * @return The grpcService.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.GrpcService getGrpcService() {
    return grpcService_ == null ? io.envoyproxy.envoy.config.core.v3.GrpcService.getDefaultInstance() : grpcService_;
  }
  /**
   * <pre>
   * Specifies the gRPC service that hosts the rate limit service. The client
   * will connect to this cluster when it needs to make rate limit service
   * requests.
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.GrpcServiceOrBuilder getGrpcServiceOrBuilder() {
    return getGrpcService();
  }

  public static final int TRANSPORT_API_VERSION_FIELD_NUMBER = 4;
  private int transportApiVersion_;
  /**
   * <pre>
   * API version for rate limit transport protocol. This describes the rate limit gRPC endpoint and
   * version of messages used on the wire.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 4 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for transportApiVersion.
   */
  @java.lang.Override public int getTransportApiVersionValue() {
    return transportApiVersion_;
  }
  /**
   * <pre>
   * API version for rate limit transport protocol. This describes the rate limit gRPC endpoint and
   * version of messages used on the wire.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 4 [(.validate.rules) = { ... }</code>
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
    if (grpcService_ != null) {
      output.writeMessage(2, getGrpcService());
    }
    if (transportApiVersion_ != io.envoyproxy.envoy.config.core.v3.ApiVersion.AUTO.getNumber()) {
      output.writeEnum(4, transportApiVersion_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (grpcService_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getGrpcService());
    }
    if (transportApiVersion_ != io.envoyproxy.envoy.config.core.v3.ApiVersion.AUTO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, transportApiVersion_);
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
    if (!(obj instanceof io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig other = (io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig) obj;

    if (hasGrpcService() != other.hasGrpcService()) return false;
    if (hasGrpcService()) {
      if (!getGrpcService()
          .equals(other.getGrpcService())) return false;
    }
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
    if (hasGrpcService()) {
      hash = (37 * hash) + GRPC_SERVICE_FIELD_NUMBER;
      hash = (53 * hash) + getGrpcService().hashCode();
    }
    hash = (37 * hash) + TRANSPORT_API_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + transportApiVersion_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig prototype) {
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
   * Rate limit :ref:`configuration overview &lt;config_rate_limit_service&gt;`.
   * </pre>
   *
   * Protobuf type {@code envoy.config.ratelimit.v3.RateLimitServiceConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.ratelimit.v3.RateLimitServiceConfig)
      io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.ratelimit.v3.RlsProto.internal_static_envoy_config_ratelimit_v3_RateLimitServiceConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.ratelimit.v3.RlsProto.internal_static_envoy_config_ratelimit_v3_RateLimitServiceConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig.class, io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig.newBuilder()
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
      if (grpcServiceBuilder_ == null) {
        grpcService_ = null;
      } else {
        grpcService_ = null;
        grpcServiceBuilder_ = null;
      }
      transportApiVersion_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.ratelimit.v3.RlsProto.internal_static_envoy_config_ratelimit_v3_RateLimitServiceConfig_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig build() {
      io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig buildPartial() {
      io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig result = new io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig(this);
      if (grpcServiceBuilder_ == null) {
        result.grpcService_ = grpcService_;
      } else {
        result.grpcService_ = grpcServiceBuilder_.build();
      }
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
      if (other instanceof io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig) {
        return mergeFrom((io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig other) {
      if (other == io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig.getDefaultInstance()) return this;
      if (other.hasGrpcService()) {
        mergeGrpcService(other.getGrpcService());
      }
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
      io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.envoyproxy.envoy.config.core.v3.GrpcService grpcService_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.GrpcService, io.envoyproxy.envoy.config.core.v3.GrpcService.Builder, io.envoyproxy.envoy.config.core.v3.GrpcServiceOrBuilder> grpcServiceBuilder_;
    /**
     * <pre>
     * Specifies the gRPC service that hosts the rate limit service. The client
     * will connect to this cluster when it needs to make rate limit service
     * requests.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
     * @return Whether the grpcService field is set.
     */
    public boolean hasGrpcService() {
      return grpcServiceBuilder_ != null || grpcService_ != null;
    }
    /**
     * <pre>
     * Specifies the gRPC service that hosts the rate limit service. The client
     * will connect to this cluster when it needs to make rate limit service
     * requests.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
     * @return The grpcService.
     */
    public io.envoyproxy.envoy.config.core.v3.GrpcService getGrpcService() {
      if (grpcServiceBuilder_ == null) {
        return grpcService_ == null ? io.envoyproxy.envoy.config.core.v3.GrpcService.getDefaultInstance() : grpcService_;
      } else {
        return grpcServiceBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the gRPC service that hosts the rate limit service. The client
     * will connect to this cluster when it needs to make rate limit service
     * requests.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setGrpcService(io.envoyproxy.envoy.config.core.v3.GrpcService value) {
      if (grpcServiceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        grpcService_ = value;
        onChanged();
      } else {
        grpcServiceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the gRPC service that hosts the rate limit service. The client
     * will connect to this cluster when it needs to make rate limit service
     * requests.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setGrpcService(
        io.envoyproxy.envoy.config.core.v3.GrpcService.Builder builderForValue) {
      if (grpcServiceBuilder_ == null) {
        grpcService_ = builderForValue.build();
        onChanged();
      } else {
        grpcServiceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the gRPC service that hosts the rate limit service. The client
     * will connect to this cluster when it needs to make rate limit service
     * requests.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeGrpcService(io.envoyproxy.envoy.config.core.v3.GrpcService value) {
      if (grpcServiceBuilder_ == null) {
        if (grpcService_ != null) {
          grpcService_ =
            io.envoyproxy.envoy.config.core.v3.GrpcService.newBuilder(grpcService_).mergeFrom(value).buildPartial();
        } else {
          grpcService_ = value;
        }
        onChanged();
      } else {
        grpcServiceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the gRPC service that hosts the rate limit service. The client
     * will connect to this cluster when it needs to make rate limit service
     * requests.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearGrpcService() {
      if (grpcServiceBuilder_ == null) {
        grpcService_ = null;
        onChanged();
      } else {
        grpcService_ = null;
        grpcServiceBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the gRPC service that hosts the rate limit service. The client
     * will connect to this cluster when it needs to make rate limit service
     * requests.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.core.v3.GrpcService.Builder getGrpcServiceBuilder() {
      
      onChanged();
      return getGrpcServiceFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the gRPC service that hosts the rate limit service. The client
     * will connect to this cluster when it needs to make rate limit service
     * requests.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.core.v3.GrpcServiceOrBuilder getGrpcServiceOrBuilder() {
      if (grpcServiceBuilder_ != null) {
        return grpcServiceBuilder_.getMessageOrBuilder();
      } else {
        return grpcService_ == null ?
            io.envoyproxy.envoy.config.core.v3.GrpcService.getDefaultInstance() : grpcService_;
      }
    }
    /**
     * <pre>
     * Specifies the gRPC service that hosts the rate limit service. The client
     * will connect to this cluster when it needs to make rate limit service
     * requests.
     * </pre>
     *
     * <code>.envoy.config.core.v3.GrpcService grpc_service = 2 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.GrpcService, io.envoyproxy.envoy.config.core.v3.GrpcService.Builder, io.envoyproxy.envoy.config.core.v3.GrpcServiceOrBuilder> 
        getGrpcServiceFieldBuilder() {
      if (grpcServiceBuilder_ == null) {
        grpcServiceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.GrpcService, io.envoyproxy.envoy.config.core.v3.GrpcService.Builder, io.envoyproxy.envoy.config.core.v3.GrpcServiceOrBuilder>(
                getGrpcService(),
                getParentForChildren(),
                isClean());
        grpcService_ = null;
      }
      return grpcServiceBuilder_;
    }

    private int transportApiVersion_ = 0;
    /**
     * <pre>
     * API version for rate limit transport protocol. This describes the rate limit gRPC endpoint and
     * version of messages used on the wire.
     * </pre>
     *
     * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 4 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for transportApiVersion.
     */
    @java.lang.Override public int getTransportApiVersionValue() {
      return transportApiVersion_;
    }
    /**
     * <pre>
     * API version for rate limit transport protocol. This describes the rate limit gRPC endpoint and
     * version of messages used on the wire.
     * </pre>
     *
     * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 4 [(.validate.rules) = { ... }</code>
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
     * API version for rate limit transport protocol. This describes the rate limit gRPC endpoint and
     * version of messages used on the wire.
     * </pre>
     *
     * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 4 [(.validate.rules) = { ... }</code>
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
     * API version for rate limit transport protocol. This describes the rate limit gRPC endpoint and
     * version of messages used on the wire.
     * </pre>
     *
     * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 4 [(.validate.rules) = { ... }</code>
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
     * API version for rate limit transport protocol. This describes the rate limit gRPC endpoint and
     * version of messages used on the wire.
     * </pre>
     *
     * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 4 [(.validate.rules) = { ... }</code>
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


    // @@protoc_insertion_point(builder_scope:envoy.config.ratelimit.v3.RateLimitServiceConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.ratelimit.v3.RateLimitServiceConfig)
  private static final io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig();
  }

  public static io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RateLimitServiceConfig>
      PARSER = new com.google.protobuf.AbstractParser<RateLimitServiceConfig>() {
    @java.lang.Override
    public RateLimitServiceConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RateLimitServiceConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RateLimitServiceConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RateLimitServiceConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.ratelimit.v3.RateLimitServiceConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

