// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/tap/v3/tap.proto

package io.envoyproxy.envoy.extensions.transport_sockets.tap.v3;

/**
 * <pre>
 * Configuration for tap transport socket. This wraps another transport socket, providing the
 * ability to interpose and record in plain text any traffic that is surfaced to Envoy.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.transport_sockets.tap.v3.Tap}
 */
public final class Tap extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.transport_sockets.tap.v3.Tap)
    TapOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Tap.newBuilder() to construct.
  private Tap(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Tap() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Tap();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Tap(
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
            io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig.Builder subBuilder = null;
            if (commonConfig_ != null) {
              subBuilder = commonConfig_.toBuilder();
            }
            commonConfig_ = input.readMessage(io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(commonConfig_);
              commonConfig_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.envoyproxy.envoy.config.core.v3.TransportSocket.Builder subBuilder = null;
            if (transportSocket_ != null) {
              subBuilder = transportSocket_.toBuilder();
            }
            transportSocket_ = input.readMessage(io.envoyproxy.envoy.config.core.v3.TransportSocket.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(transportSocket_);
              transportSocket_ = subBuilder.buildPartial();
            }

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
    return io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.TapProto.internal_static_envoy_extensions_transport_sockets_tap_v3_Tap_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.TapProto.internal_static_envoy_extensions_transport_sockets_tap_v3_Tap_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap.class, io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap.Builder.class);
  }

  public static final int COMMON_CONFIG_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig commonConfig_;
  /**
   * <pre>
   * Common configuration for the tap transport socket.
   * </pre>
   *
   * <code>.envoy.extensions.common.tap.v3.CommonExtensionConfig common_config = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the commonConfig field is set.
   */
  @java.lang.Override
  public boolean hasCommonConfig() {
    return commonConfig_ != null;
  }
  /**
   * <pre>
   * Common configuration for the tap transport socket.
   * </pre>
   *
   * <code>.envoy.extensions.common.tap.v3.CommonExtensionConfig common_config = 1 [(.validate.rules) = { ... }</code>
   * @return The commonConfig.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig getCommonConfig() {
    return commonConfig_ == null ? io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig.getDefaultInstance() : commonConfig_;
  }
  /**
   * <pre>
   * Common configuration for the tap transport socket.
   * </pre>
   *
   * <code>.envoy.extensions.common.tap.v3.CommonExtensionConfig common_config = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfigOrBuilder getCommonConfigOrBuilder() {
    return getCommonConfig();
  }

  public static final int TRANSPORT_SOCKET_FIELD_NUMBER = 2;
  private io.envoyproxy.envoy.config.core.v3.TransportSocket transportSocket_;
  /**
   * <pre>
   * The underlying transport socket being wrapped.
   * </pre>
   *
   * <code>.envoy.config.core.v3.TransportSocket transport_socket = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the transportSocket field is set.
   */
  @java.lang.Override
  public boolean hasTransportSocket() {
    return transportSocket_ != null;
  }
  /**
   * <pre>
   * The underlying transport socket being wrapped.
   * </pre>
   *
   * <code>.envoy.config.core.v3.TransportSocket transport_socket = 2 [(.validate.rules) = { ... }</code>
   * @return The transportSocket.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.TransportSocket getTransportSocket() {
    return transportSocket_ == null ? io.envoyproxy.envoy.config.core.v3.TransportSocket.getDefaultInstance() : transportSocket_;
  }
  /**
   * <pre>
   * The underlying transport socket being wrapped.
   * </pre>
   *
   * <code>.envoy.config.core.v3.TransportSocket transport_socket = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.TransportSocketOrBuilder getTransportSocketOrBuilder() {
    return getTransportSocket();
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
    if (commonConfig_ != null) {
      output.writeMessage(1, getCommonConfig());
    }
    if (transportSocket_ != null) {
      output.writeMessage(2, getTransportSocket());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (commonConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCommonConfig());
    }
    if (transportSocket_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTransportSocket());
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap other = (io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap) obj;

    if (hasCommonConfig() != other.hasCommonConfig()) return false;
    if (hasCommonConfig()) {
      if (!getCommonConfig()
          .equals(other.getCommonConfig())) return false;
    }
    if (hasTransportSocket() != other.hasTransportSocket()) return false;
    if (hasTransportSocket()) {
      if (!getTransportSocket()
          .equals(other.getTransportSocket())) return false;
    }
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
    if (hasCommonConfig()) {
      hash = (37 * hash) + COMMON_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getCommonConfig().hashCode();
    }
    if (hasTransportSocket()) {
      hash = (37 * hash) + TRANSPORT_SOCKET_FIELD_NUMBER;
      hash = (53 * hash) + getTransportSocket().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap prototype) {
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
   * Configuration for tap transport socket. This wraps another transport socket, providing the
   * ability to interpose and record in plain text any traffic that is surfaced to Envoy.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.transport_sockets.tap.v3.Tap}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.transport_sockets.tap.v3.Tap)
      io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.TapOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.TapProto.internal_static_envoy_extensions_transport_sockets_tap_v3_Tap_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.TapProto.internal_static_envoy_extensions_transport_sockets_tap_v3_Tap_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap.class, io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap.newBuilder()
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
      if (commonConfigBuilder_ == null) {
        commonConfig_ = null;
      } else {
        commonConfig_ = null;
        commonConfigBuilder_ = null;
      }
      if (transportSocketBuilder_ == null) {
        transportSocket_ = null;
      } else {
        transportSocket_ = null;
        transportSocketBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.TapProto.internal_static_envoy_extensions_transport_sockets_tap_v3_Tap_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap build() {
      io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap buildPartial() {
      io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap result = new io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap(this);
      if (commonConfigBuilder_ == null) {
        result.commonConfig_ = commonConfig_;
      } else {
        result.commonConfig_ = commonConfigBuilder_.build();
      }
      if (transportSocketBuilder_ == null) {
        result.transportSocket_ = transportSocket_;
      } else {
        result.transportSocket_ = transportSocketBuilder_.build();
      }
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
      if (other instanceof io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap) {
        return mergeFrom((io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap other) {
      if (other == io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap.getDefaultInstance()) return this;
      if (other.hasCommonConfig()) {
        mergeCommonConfig(other.getCommonConfig());
      }
      if (other.hasTransportSocket()) {
        mergeTransportSocket(other.getTransportSocket());
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
      io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig commonConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig, io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig.Builder, io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfigOrBuilder> commonConfigBuilder_;
    /**
     * <pre>
     * Common configuration for the tap transport socket.
     * </pre>
     *
     * <code>.envoy.extensions.common.tap.v3.CommonExtensionConfig common_config = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the commonConfig field is set.
     */
    public boolean hasCommonConfig() {
      return commonConfigBuilder_ != null || commonConfig_ != null;
    }
    /**
     * <pre>
     * Common configuration for the tap transport socket.
     * </pre>
     *
     * <code>.envoy.extensions.common.tap.v3.CommonExtensionConfig common_config = 1 [(.validate.rules) = { ... }</code>
     * @return The commonConfig.
     */
    public io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig getCommonConfig() {
      if (commonConfigBuilder_ == null) {
        return commonConfig_ == null ? io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig.getDefaultInstance() : commonConfig_;
      } else {
        return commonConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Common configuration for the tap transport socket.
     * </pre>
     *
     * <code>.envoy.extensions.common.tap.v3.CommonExtensionConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setCommonConfig(io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig value) {
      if (commonConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commonConfig_ = value;
        onChanged();
      } else {
        commonConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Common configuration for the tap transport socket.
     * </pre>
     *
     * <code>.envoy.extensions.common.tap.v3.CommonExtensionConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setCommonConfig(
        io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig.Builder builderForValue) {
      if (commonConfigBuilder_ == null) {
        commonConfig_ = builderForValue.build();
        onChanged();
      } else {
        commonConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Common configuration for the tap transport socket.
     * </pre>
     *
     * <code>.envoy.extensions.common.tap.v3.CommonExtensionConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeCommonConfig(io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig value) {
      if (commonConfigBuilder_ == null) {
        if (commonConfig_ != null) {
          commonConfig_ =
            io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig.newBuilder(commonConfig_).mergeFrom(value).buildPartial();
        } else {
          commonConfig_ = value;
        }
        onChanged();
      } else {
        commonConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Common configuration for the tap transport socket.
     * </pre>
     *
     * <code>.envoy.extensions.common.tap.v3.CommonExtensionConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearCommonConfig() {
      if (commonConfigBuilder_ == null) {
        commonConfig_ = null;
        onChanged();
      } else {
        commonConfig_ = null;
        commonConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Common configuration for the tap transport socket.
     * </pre>
     *
     * <code>.envoy.extensions.common.tap.v3.CommonExtensionConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig.Builder getCommonConfigBuilder() {
      
      onChanged();
      return getCommonConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Common configuration for the tap transport socket.
     * </pre>
     *
     * <code>.envoy.extensions.common.tap.v3.CommonExtensionConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfigOrBuilder getCommonConfigOrBuilder() {
      if (commonConfigBuilder_ != null) {
        return commonConfigBuilder_.getMessageOrBuilder();
      } else {
        return commonConfig_ == null ?
            io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig.getDefaultInstance() : commonConfig_;
      }
    }
    /**
     * <pre>
     * Common configuration for the tap transport socket.
     * </pre>
     *
     * <code>.envoy.extensions.common.tap.v3.CommonExtensionConfig common_config = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig, io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig.Builder, io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfigOrBuilder> 
        getCommonConfigFieldBuilder() {
      if (commonConfigBuilder_ == null) {
        commonConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig, io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfig.Builder, io.envoyproxy.envoy.extensions.common.tap.v3.CommonExtensionConfigOrBuilder>(
                getCommonConfig(),
                getParentForChildren(),
                isClean());
        commonConfig_ = null;
      }
      return commonConfigBuilder_;
    }

    private io.envoyproxy.envoy.config.core.v3.TransportSocket transportSocket_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.TransportSocket, io.envoyproxy.envoy.config.core.v3.TransportSocket.Builder, io.envoyproxy.envoy.config.core.v3.TransportSocketOrBuilder> transportSocketBuilder_;
    /**
     * <pre>
     * The underlying transport socket being wrapped.
     * </pre>
     *
     * <code>.envoy.config.core.v3.TransportSocket transport_socket = 2 [(.validate.rules) = { ... }</code>
     * @return Whether the transportSocket field is set.
     */
    public boolean hasTransportSocket() {
      return transportSocketBuilder_ != null || transportSocket_ != null;
    }
    /**
     * <pre>
     * The underlying transport socket being wrapped.
     * </pre>
     *
     * <code>.envoy.config.core.v3.TransportSocket transport_socket = 2 [(.validate.rules) = { ... }</code>
     * @return The transportSocket.
     */
    public io.envoyproxy.envoy.config.core.v3.TransportSocket getTransportSocket() {
      if (transportSocketBuilder_ == null) {
        return transportSocket_ == null ? io.envoyproxy.envoy.config.core.v3.TransportSocket.getDefaultInstance() : transportSocket_;
      } else {
        return transportSocketBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The underlying transport socket being wrapped.
     * </pre>
     *
     * <code>.envoy.config.core.v3.TransportSocket transport_socket = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setTransportSocket(io.envoyproxy.envoy.config.core.v3.TransportSocket value) {
      if (transportSocketBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transportSocket_ = value;
        onChanged();
      } else {
        transportSocketBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The underlying transport socket being wrapped.
     * </pre>
     *
     * <code>.envoy.config.core.v3.TransportSocket transport_socket = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setTransportSocket(
        io.envoyproxy.envoy.config.core.v3.TransportSocket.Builder builderForValue) {
      if (transportSocketBuilder_ == null) {
        transportSocket_ = builderForValue.build();
        onChanged();
      } else {
        transportSocketBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The underlying transport socket being wrapped.
     * </pre>
     *
     * <code>.envoy.config.core.v3.TransportSocket transport_socket = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeTransportSocket(io.envoyproxy.envoy.config.core.v3.TransportSocket value) {
      if (transportSocketBuilder_ == null) {
        if (transportSocket_ != null) {
          transportSocket_ =
            io.envoyproxy.envoy.config.core.v3.TransportSocket.newBuilder(transportSocket_).mergeFrom(value).buildPartial();
        } else {
          transportSocket_ = value;
        }
        onChanged();
      } else {
        transportSocketBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The underlying transport socket being wrapped.
     * </pre>
     *
     * <code>.envoy.config.core.v3.TransportSocket transport_socket = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearTransportSocket() {
      if (transportSocketBuilder_ == null) {
        transportSocket_ = null;
        onChanged();
      } else {
        transportSocket_ = null;
        transportSocketBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The underlying transport socket being wrapped.
     * </pre>
     *
     * <code>.envoy.config.core.v3.TransportSocket transport_socket = 2 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.core.v3.TransportSocket.Builder getTransportSocketBuilder() {
      
      onChanged();
      return getTransportSocketFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The underlying transport socket being wrapped.
     * </pre>
     *
     * <code>.envoy.config.core.v3.TransportSocket transport_socket = 2 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.core.v3.TransportSocketOrBuilder getTransportSocketOrBuilder() {
      if (transportSocketBuilder_ != null) {
        return transportSocketBuilder_.getMessageOrBuilder();
      } else {
        return transportSocket_ == null ?
            io.envoyproxy.envoy.config.core.v3.TransportSocket.getDefaultInstance() : transportSocket_;
      }
    }
    /**
     * <pre>
     * The underlying transport socket being wrapped.
     * </pre>
     *
     * <code>.envoy.config.core.v3.TransportSocket transport_socket = 2 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.TransportSocket, io.envoyproxy.envoy.config.core.v3.TransportSocket.Builder, io.envoyproxy.envoy.config.core.v3.TransportSocketOrBuilder> 
        getTransportSocketFieldBuilder() {
      if (transportSocketBuilder_ == null) {
        transportSocketBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.TransportSocket, io.envoyproxy.envoy.config.core.v3.TransportSocket.Builder, io.envoyproxy.envoy.config.core.v3.TransportSocketOrBuilder>(
                getTransportSocket(),
                getParentForChildren(),
                isClean());
        transportSocket_ = null;
      }
      return transportSocketBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.transport_sockets.tap.v3.Tap)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.transport_sockets.tap.v3.Tap)
  private static final io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap();
  }

  public static io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Tap>
      PARSER = new com.google.protobuf.AbstractParser<Tap>() {
    @java.lang.Override
    public Tap parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Tap(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Tap> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Tap> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.transport_sockets.tap.v3.Tap getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

