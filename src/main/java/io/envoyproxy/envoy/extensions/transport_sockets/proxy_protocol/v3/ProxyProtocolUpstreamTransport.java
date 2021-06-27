// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/proxy_protocol/v3/upstream_proxy_protocol.proto

package io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3;

/**
 * <pre>
 * Configuration for PROXY protocol socket
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport}
 */
public final class ProxyProtocolUpstreamTransport extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport)
    ProxyProtocolUpstreamTransportOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProxyProtocolUpstreamTransport.newBuilder() to construct.
  private ProxyProtocolUpstreamTransport(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProxyProtocolUpstreamTransport() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProxyProtocolUpstreamTransport();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProxyProtocolUpstreamTransport(
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
            io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Builder subBuilder = null;
            if (config_ != null) {
              subBuilder = config_.toBuilder();
            }
            config_ = input.readMessage(io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(config_);
              config_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.UpstreamProxyProtocolProto.internal_static_envoy_extensions_transport_sockets_proxy_protocol_v3_ProxyProtocolUpstreamTransport_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.UpstreamProxyProtocolProto.internal_static_envoy_extensions_transport_sockets_proxy_protocol_v3_ProxyProtocolUpstreamTransport_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport.class, io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport.Builder.class);
  }

  public static final int CONFIG_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig config_;
  /**
   * <pre>
   * The PROXY protocol settings
   * </pre>
   *
   * <code>.envoy.config.core.v3.ProxyProtocolConfig config = 1;</code>
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   * <pre>
   * The PROXY protocol settings
   * </pre>
   *
   * <code>.envoy.config.core.v3.ProxyProtocolConfig config = 1;</code>
   * @return The config.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig getConfig() {
    return config_ == null ? io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.getDefaultInstance() : config_;
  }
  /**
   * <pre>
   * The PROXY protocol settings
   * </pre>
   *
   * <code>.envoy.config.core.v3.ProxyProtocolConfig config = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfigOrBuilder getConfigOrBuilder() {
    return getConfig();
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
    if (config_ != null) {
      output.writeMessage(1, getConfig());
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
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getConfig());
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport other = (io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport) obj;

    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig()
          .equals(other.getConfig())) return false;
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
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    if (hasTransportSocket()) {
      hash = (37 * hash) + TRANSPORT_SOCKET_FIELD_NUMBER;
      hash = (53 * hash) + getTransportSocket().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport prototype) {
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
   * Configuration for PROXY protocol socket
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport)
      io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransportOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.UpstreamProxyProtocolProto.internal_static_envoy_extensions_transport_sockets_proxy_protocol_v3_ProxyProtocolUpstreamTransport_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.UpstreamProxyProtocolProto.internal_static_envoy_extensions_transport_sockets_proxy_protocol_v3_ProxyProtocolUpstreamTransport_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport.class, io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport.newBuilder()
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
      if (configBuilder_ == null) {
        config_ = null;
      } else {
        config_ = null;
        configBuilder_ = null;
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
      return io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.UpstreamProxyProtocolProto.internal_static_envoy_extensions_transport_sockets_proxy_protocol_v3_ProxyProtocolUpstreamTransport_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport build() {
      io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport buildPartial() {
      io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport result = new io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport(this);
      if (configBuilder_ == null) {
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport) {
        return mergeFrom((io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport other) {
      if (other == io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport.getDefaultInstance()) return this;
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
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
      io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig config_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig, io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Builder, io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfigOrBuilder> configBuilder_;
    /**
     * <pre>
     * The PROXY protocol settings
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig config = 1;</code>
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return configBuilder_ != null || config_ != null;
    }
    /**
     * <pre>
     * The PROXY protocol settings
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig config = 1;</code>
     * @return The config.
     */
    public io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The PROXY protocol settings
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig config = 1;</code>
     */
    public Builder setConfig(io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The PROXY protocol settings
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig config = 1;</code>
     */
    public Builder setConfig(
        io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The PROXY protocol settings
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig config = 1;</code>
     */
    public Builder mergeConfig(io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig value) {
      if (configBuilder_ == null) {
        if (config_ != null) {
          config_ =
            io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.newBuilder(config_).mergeFrom(value).buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        configBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The PROXY protocol settings
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig config = 1;</code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        config_ = null;
        onChanged();
      } else {
        config_ = null;
        configBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The PROXY protocol settings
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig config = 1;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Builder getConfigBuilder() {
      
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The PROXY protocol settings
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig config = 1;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.getDefaultInstance() : config_;
      }
    }
    /**
     * <pre>
     * The PROXY protocol settings
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig, io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Builder, io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig, io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Builder, io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfigOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport)
  private static final io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport();
  }

  public static io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProxyProtocolUpstreamTransport>
      PARSER = new com.google.protobuf.AbstractParser<ProxyProtocolUpstreamTransport>() {
    @java.lang.Override
    public ProxyProtocolUpstreamTransport parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProxyProtocolUpstreamTransport(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProxyProtocolUpstreamTransport> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProxyProtocolUpstreamTransport> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.transport_sockets.proxy_protocol.v3.ProxyProtocolUpstreamTransport getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

