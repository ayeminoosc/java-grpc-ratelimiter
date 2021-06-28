// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/starttls/v3/starttls.proto

package io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3;

/**
 * <pre>
 * Configuration for StartTls transport socket.
 * StartTls transport socket wraps two sockets:
 * - raw_buffer socket which is used at the beginning of the session
 * - TLS socket used when a protocol negotiates a switch to encrypted traffic.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig}
 */
public final class StartTlsConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig)
    StartTlsConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StartTlsConfig.newBuilder() to construct.
  private StartTlsConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StartTlsConfig() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StartTlsConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StartTlsConfig(
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
            io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer.Builder subBuilder = null;
            if (cleartextSocketConfig_ != null) {
              subBuilder = cleartextSocketConfig_.toBuilder();
            }
            cleartextSocketConfig_ = input.readMessage(io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cleartextSocketConfig_);
              cleartextSocketConfig_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.Builder subBuilder = null;
            if (tlsSocketConfig_ != null) {
              subBuilder = tlsSocketConfig_.toBuilder();
            }
            tlsSocketConfig_ = input.readMessage(io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tlsSocketConfig_);
              tlsSocketConfig_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StarttlsProto.internal_static_envoy_extensions_transport_sockets_starttls_v3_StartTlsConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StarttlsProto.internal_static_envoy_extensions_transport_sockets_starttls_v3_StartTlsConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig.class, io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig.Builder.class);
  }

  public static final int CLEARTEXT_SOCKET_CONFIG_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartextSocketConfig_;
  /**
   * <pre>
   * (optional) Configuration for clear-text socket used at the beginning of the session.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartext_socket_config = 1;</code>
   * @return Whether the cleartextSocketConfig field is set.
   */
  @java.lang.Override
  public boolean hasCleartextSocketConfig() {
    return cleartextSocketConfig_ != null;
  }
  /**
   * <pre>
   * (optional) Configuration for clear-text socket used at the beginning of the session.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartext_socket_config = 1;</code>
   * @return The cleartextSocketConfig.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer getCleartextSocketConfig() {
    return cleartextSocketConfig_ == null ? io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer.getDefaultInstance() : cleartextSocketConfig_;
  }
  /**
   * <pre>
   * (optional) Configuration for clear-text socket used at the beginning of the session.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartext_socket_config = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBufferOrBuilder getCleartextSocketConfigOrBuilder() {
    return getCleartextSocketConfig();
  }

  public static final int TLS_SOCKET_CONFIG_FIELD_NUMBER = 2;
  private io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tlsSocketConfig_;
  /**
   * <pre>
   * Configuration for TLS socket.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tls_socket_config = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the tlsSocketConfig field is set.
   */
  @java.lang.Override
  public boolean hasTlsSocketConfig() {
    return tlsSocketConfig_ != null;
  }
  /**
   * <pre>
   * Configuration for TLS socket.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tls_socket_config = 2 [(.validate.rules) = { ... }</code>
   * @return The tlsSocketConfig.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext getTlsSocketConfig() {
    return tlsSocketConfig_ == null ? io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.getDefaultInstance() : tlsSocketConfig_;
  }
  /**
   * <pre>
   * Configuration for TLS socket.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tls_socket_config = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContextOrBuilder getTlsSocketConfigOrBuilder() {
    return getTlsSocketConfig();
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
    if (cleartextSocketConfig_ != null) {
      output.writeMessage(1, getCleartextSocketConfig());
    }
    if (tlsSocketConfig_ != null) {
      output.writeMessage(2, getTlsSocketConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (cleartextSocketConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCleartextSocketConfig());
    }
    if (tlsSocketConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTlsSocketConfig());
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig other = (io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig) obj;

    if (hasCleartextSocketConfig() != other.hasCleartextSocketConfig()) return false;
    if (hasCleartextSocketConfig()) {
      if (!getCleartextSocketConfig()
          .equals(other.getCleartextSocketConfig())) return false;
    }
    if (hasTlsSocketConfig() != other.hasTlsSocketConfig()) return false;
    if (hasTlsSocketConfig()) {
      if (!getTlsSocketConfig()
          .equals(other.getTlsSocketConfig())) return false;
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
    if (hasCleartextSocketConfig()) {
      hash = (37 * hash) + CLEARTEXT_SOCKET_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getCleartextSocketConfig().hashCode();
    }
    if (hasTlsSocketConfig()) {
      hash = (37 * hash) + TLS_SOCKET_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getTlsSocketConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig prototype) {
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
   * Configuration for StartTls transport socket.
   * StartTls transport socket wraps two sockets:
   * - raw_buffer socket which is used at the beginning of the session
   * - TLS socket used when a protocol negotiates a switch to encrypted traffic.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig)
      io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StarttlsProto.internal_static_envoy_extensions_transport_sockets_starttls_v3_StartTlsConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StarttlsProto.internal_static_envoy_extensions_transport_sockets_starttls_v3_StartTlsConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig.class, io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig.newBuilder()
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
      if (cleartextSocketConfigBuilder_ == null) {
        cleartextSocketConfig_ = null;
      } else {
        cleartextSocketConfig_ = null;
        cleartextSocketConfigBuilder_ = null;
      }
      if (tlsSocketConfigBuilder_ == null) {
        tlsSocketConfig_ = null;
      } else {
        tlsSocketConfig_ = null;
        tlsSocketConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StarttlsProto.internal_static_envoy_extensions_transport_sockets_starttls_v3_StartTlsConfig_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig build() {
      io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig buildPartial() {
      io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig result = new io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig(this);
      if (cleartextSocketConfigBuilder_ == null) {
        result.cleartextSocketConfig_ = cleartextSocketConfig_;
      } else {
        result.cleartextSocketConfig_ = cleartextSocketConfigBuilder_.build();
      }
      if (tlsSocketConfigBuilder_ == null) {
        result.tlsSocketConfig_ = tlsSocketConfig_;
      } else {
        result.tlsSocketConfig_ = tlsSocketConfigBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig) {
        return mergeFrom((io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig other) {
      if (other == io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig.getDefaultInstance()) return this;
      if (other.hasCleartextSocketConfig()) {
        mergeCleartextSocketConfig(other.getCleartextSocketConfig());
      }
      if (other.hasTlsSocketConfig()) {
        mergeTlsSocketConfig(other.getTlsSocketConfig());
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
      io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartextSocketConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer, io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer.Builder, io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBufferOrBuilder> cleartextSocketConfigBuilder_;
    /**
     * <pre>
     * (optional) Configuration for clear-text socket used at the beginning of the session.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartext_socket_config = 1;</code>
     * @return Whether the cleartextSocketConfig field is set.
     */
    public boolean hasCleartextSocketConfig() {
      return cleartextSocketConfigBuilder_ != null || cleartextSocketConfig_ != null;
    }
    /**
     * <pre>
     * (optional) Configuration for clear-text socket used at the beginning of the session.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartext_socket_config = 1;</code>
     * @return The cleartextSocketConfig.
     */
    public io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer getCleartextSocketConfig() {
      if (cleartextSocketConfigBuilder_ == null) {
        return cleartextSocketConfig_ == null ? io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer.getDefaultInstance() : cleartextSocketConfig_;
      } else {
        return cleartextSocketConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * (optional) Configuration for clear-text socket used at the beginning of the session.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartext_socket_config = 1;</code>
     */
    public Builder setCleartextSocketConfig(io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer value) {
      if (cleartextSocketConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cleartextSocketConfig_ = value;
        onChanged();
      } else {
        cleartextSocketConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * (optional) Configuration for clear-text socket used at the beginning of the session.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartext_socket_config = 1;</code>
     */
    public Builder setCleartextSocketConfig(
        io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer.Builder builderForValue) {
      if (cleartextSocketConfigBuilder_ == null) {
        cleartextSocketConfig_ = builderForValue.build();
        onChanged();
      } else {
        cleartextSocketConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * (optional) Configuration for clear-text socket used at the beginning of the session.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartext_socket_config = 1;</code>
     */
    public Builder mergeCleartextSocketConfig(io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer value) {
      if (cleartextSocketConfigBuilder_ == null) {
        if (cleartextSocketConfig_ != null) {
          cleartextSocketConfig_ =
            io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer.newBuilder(cleartextSocketConfig_).mergeFrom(value).buildPartial();
        } else {
          cleartextSocketConfig_ = value;
        }
        onChanged();
      } else {
        cleartextSocketConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * (optional) Configuration for clear-text socket used at the beginning of the session.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartext_socket_config = 1;</code>
     */
    public Builder clearCleartextSocketConfig() {
      if (cleartextSocketConfigBuilder_ == null) {
        cleartextSocketConfig_ = null;
        onChanged();
      } else {
        cleartextSocketConfig_ = null;
        cleartextSocketConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * (optional) Configuration for clear-text socket used at the beginning of the session.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartext_socket_config = 1;</code>
     */
    public io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer.Builder getCleartextSocketConfigBuilder() {
      
      onChanged();
      return getCleartextSocketConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * (optional) Configuration for clear-text socket used at the beginning of the session.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartext_socket_config = 1;</code>
     */
    public io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBufferOrBuilder getCleartextSocketConfigOrBuilder() {
      if (cleartextSocketConfigBuilder_ != null) {
        return cleartextSocketConfigBuilder_.getMessageOrBuilder();
      } else {
        return cleartextSocketConfig_ == null ?
            io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer.getDefaultInstance() : cleartextSocketConfig_;
      }
    }
    /**
     * <pre>
     * (optional) Configuration for clear-text socket used at the beginning of the session.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer cleartext_socket_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer, io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer.Builder, io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBufferOrBuilder> 
        getCleartextSocketConfigFieldBuilder() {
      if (cleartextSocketConfigBuilder_ == null) {
        cleartextSocketConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer, io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBuffer.Builder, io.envoyproxy.envoy.extensions.transport_sockets.raw_buffer.v3.RawBufferOrBuilder>(
                getCleartextSocketConfig(),
                getParentForChildren(),
                isClean());
        cleartextSocketConfig_ = null;
      }
      return cleartextSocketConfigBuilder_;
    }

    private io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tlsSocketConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext, io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.Builder, io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContextOrBuilder> tlsSocketConfigBuilder_;
    /**
     * <pre>
     * Configuration for TLS socket.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tls_socket_config = 2 [(.validate.rules) = { ... }</code>
     * @return Whether the tlsSocketConfig field is set.
     */
    public boolean hasTlsSocketConfig() {
      return tlsSocketConfigBuilder_ != null || tlsSocketConfig_ != null;
    }
    /**
     * <pre>
     * Configuration for TLS socket.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tls_socket_config = 2 [(.validate.rules) = { ... }</code>
     * @return The tlsSocketConfig.
     */
    public io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext getTlsSocketConfig() {
      if (tlsSocketConfigBuilder_ == null) {
        return tlsSocketConfig_ == null ? io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.getDefaultInstance() : tlsSocketConfig_;
      } else {
        return tlsSocketConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Configuration for TLS socket.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tls_socket_config = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setTlsSocketConfig(io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext value) {
      if (tlsSocketConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tlsSocketConfig_ = value;
        onChanged();
      } else {
        tlsSocketConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Configuration for TLS socket.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tls_socket_config = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setTlsSocketConfig(
        io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.Builder builderForValue) {
      if (tlsSocketConfigBuilder_ == null) {
        tlsSocketConfig_ = builderForValue.build();
        onChanged();
      } else {
        tlsSocketConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Configuration for TLS socket.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tls_socket_config = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeTlsSocketConfig(io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext value) {
      if (tlsSocketConfigBuilder_ == null) {
        if (tlsSocketConfig_ != null) {
          tlsSocketConfig_ =
            io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.newBuilder(tlsSocketConfig_).mergeFrom(value).buildPartial();
        } else {
          tlsSocketConfig_ = value;
        }
        onChanged();
      } else {
        tlsSocketConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Configuration for TLS socket.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tls_socket_config = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearTlsSocketConfig() {
      if (tlsSocketConfigBuilder_ == null) {
        tlsSocketConfig_ = null;
        onChanged();
      } else {
        tlsSocketConfig_ = null;
        tlsSocketConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Configuration for TLS socket.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tls_socket_config = 2 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.Builder getTlsSocketConfigBuilder() {
      
      onChanged();
      return getTlsSocketConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Configuration for TLS socket.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tls_socket_config = 2 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContextOrBuilder getTlsSocketConfigOrBuilder() {
      if (tlsSocketConfigBuilder_ != null) {
        return tlsSocketConfigBuilder_.getMessageOrBuilder();
      } else {
        return tlsSocketConfig_ == null ?
            io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.getDefaultInstance() : tlsSocketConfig_;
      }
    }
    /**
     * <pre>
     * Configuration for TLS socket.
     * </pre>
     *
     * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext tls_socket_config = 2 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext, io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.Builder, io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContextOrBuilder> 
        getTlsSocketConfigFieldBuilder() {
      if (tlsSocketConfigBuilder_ == null) {
        tlsSocketConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext, io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.Builder, io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContextOrBuilder>(
                getTlsSocketConfig(),
                getParentForChildren(),
                isClean());
        tlsSocketConfig_ = null;
      }
      return tlsSocketConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig)
  private static final io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig();
  }

  public static io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartTlsConfig>
      PARSER = new com.google.protobuf.AbstractParser<StartTlsConfig>() {
    @java.lang.Override
    public StartTlsConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StartTlsConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StartTlsConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartTlsConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.transport_sockets.starttls.v3.StartTlsConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
