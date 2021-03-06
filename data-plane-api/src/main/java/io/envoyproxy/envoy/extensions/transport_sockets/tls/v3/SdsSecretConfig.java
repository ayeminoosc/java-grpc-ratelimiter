// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/tls/v3/secret.proto

package io.envoyproxy.envoy.extensions.transport_sockets.tls.v3;

/**
 * Protobuf type {@code envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig}
 */
public final class SdsSecretConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig)
    SdsSecretConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SdsSecretConfig.newBuilder() to construct.
  private SdsSecretConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SdsSecretConfig() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SdsSecretConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SdsSecretConfig(
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

            name_ = s;
            break;
          }
          case 18: {
            io.envoyproxy.envoy.config.core.v3.ConfigSource.Builder subBuilder = null;
            if (sdsConfig_ != null) {
              subBuilder = sdsConfig_.toBuilder();
            }
            sdsConfig_ = input.readMessage(io.envoyproxy.envoy.config.core.v3.ConfigSource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(sdsConfig_);
              sdsConfig_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SecretProto.internal_static_envoy_extensions_transport_sockets_tls_v3_SdsSecretConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SecretProto.internal_static_envoy_extensions_transport_sockets_tls_v3_SdsSecretConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig.class, io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Name by which the secret can be uniquely referred to. When both name and config are specified,
   * then secret can be fetched and/or reloaded via SDS. When only name is specified, then secret
   * will be loaded from static resources.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name by which the secret can be uniquely referred to. When both name and config are specified,
   * then secret can be fetched and/or reloaded via SDS. When only name is specified, then secret
   * will be loaded from static resources.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SDS_CONFIG_FIELD_NUMBER = 2;
  private io.envoyproxy.envoy.config.core.v3.ConfigSource sdsConfig_;
  /**
   * <code>.envoy.config.core.v3.ConfigSource sds_config = 2;</code>
   * @return Whether the sdsConfig field is set.
   */
  @java.lang.Override
  public boolean hasSdsConfig() {
    return sdsConfig_ != null;
  }
  /**
   * <code>.envoy.config.core.v3.ConfigSource sds_config = 2;</code>
   * @return The sdsConfig.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.ConfigSource getSdsConfig() {
    return sdsConfig_ == null ? io.envoyproxy.envoy.config.core.v3.ConfigSource.getDefaultInstance() : sdsConfig_;
  }
  /**
   * <code>.envoy.config.core.v3.ConfigSource sds_config = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.ConfigSourceOrBuilder getSdsConfigOrBuilder() {
    return getSdsConfig();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (sdsConfig_ != null) {
      output.writeMessage(2, getSdsConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (sdsConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getSdsConfig());
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig other = (io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasSdsConfig() != other.hasSdsConfig()) return false;
    if (hasSdsConfig()) {
      if (!getSdsConfig()
          .equals(other.getSdsConfig())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasSdsConfig()) {
      hash = (37 * hash) + SDS_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getSdsConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig prototype) {
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
   * Protobuf type {@code envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig)
      io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SecretProto.internal_static_envoy_extensions_transport_sockets_tls_v3_SdsSecretConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SecretProto.internal_static_envoy_extensions_transport_sockets_tls_v3_SdsSecretConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig.class, io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig.newBuilder()
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
      name_ = "";

      if (sdsConfigBuilder_ == null) {
        sdsConfig_ = null;
      } else {
        sdsConfig_ = null;
        sdsConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SecretProto.internal_static_envoy_extensions_transport_sockets_tls_v3_SdsSecretConfig_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig build() {
      io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig buildPartial() {
      io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig result = new io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig(this);
      result.name_ = name_;
      if (sdsConfigBuilder_ == null) {
        result.sdsConfig_ = sdsConfig_;
      } else {
        result.sdsConfig_ = sdsConfigBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig) {
        return mergeFrom((io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig other) {
      if (other == io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasSdsConfig()) {
        mergeSdsConfig(other.getSdsConfig());
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
      io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Name by which the secret can be uniquely referred to. When both name and config are specified,
     * then secret can be fetched and/or reloaded via SDS. When only name is specified, then secret
     * will be loaded from static resources.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name by which the secret can be uniquely referred to. When both name and config are specified,
     * then secret can be fetched and/or reloaded via SDS. When only name is specified, then secret
     * will be loaded from static resources.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name by which the secret can be uniquely referred to. When both name and config are specified,
     * then secret can be fetched and/or reloaded via SDS. When only name is specified, then secret
     * will be loaded from static resources.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name by which the secret can be uniquely referred to. When both name and config are specified,
     * then secret can be fetched and/or reloaded via SDS. When only name is specified, then secret
     * will be loaded from static resources.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name by which the secret can be uniquely referred to. When both name and config are specified,
     * then secret can be fetched and/or reloaded via SDS. When only name is specified, then secret
     * will be loaded from static resources.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private io.envoyproxy.envoy.config.core.v3.ConfigSource sdsConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.ConfigSource, io.envoyproxy.envoy.config.core.v3.ConfigSource.Builder, io.envoyproxy.envoy.config.core.v3.ConfigSourceOrBuilder> sdsConfigBuilder_;
    /**
     * <code>.envoy.config.core.v3.ConfigSource sds_config = 2;</code>
     * @return Whether the sdsConfig field is set.
     */
    public boolean hasSdsConfig() {
      return sdsConfigBuilder_ != null || sdsConfig_ != null;
    }
    /**
     * <code>.envoy.config.core.v3.ConfigSource sds_config = 2;</code>
     * @return The sdsConfig.
     */
    public io.envoyproxy.envoy.config.core.v3.ConfigSource getSdsConfig() {
      if (sdsConfigBuilder_ == null) {
        return sdsConfig_ == null ? io.envoyproxy.envoy.config.core.v3.ConfigSource.getDefaultInstance() : sdsConfig_;
      } else {
        return sdsConfigBuilder_.getMessage();
      }
    }
    /**
     * <code>.envoy.config.core.v3.ConfigSource sds_config = 2;</code>
     */
    public Builder setSdsConfig(io.envoyproxy.envoy.config.core.v3.ConfigSource value) {
      if (sdsConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        sdsConfig_ = value;
        onChanged();
      } else {
        sdsConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.envoy.config.core.v3.ConfigSource sds_config = 2;</code>
     */
    public Builder setSdsConfig(
        io.envoyproxy.envoy.config.core.v3.ConfigSource.Builder builderForValue) {
      if (sdsConfigBuilder_ == null) {
        sdsConfig_ = builderForValue.build();
        onChanged();
      } else {
        sdsConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.envoy.config.core.v3.ConfigSource sds_config = 2;</code>
     */
    public Builder mergeSdsConfig(io.envoyproxy.envoy.config.core.v3.ConfigSource value) {
      if (sdsConfigBuilder_ == null) {
        if (sdsConfig_ != null) {
          sdsConfig_ =
            io.envoyproxy.envoy.config.core.v3.ConfigSource.newBuilder(sdsConfig_).mergeFrom(value).buildPartial();
        } else {
          sdsConfig_ = value;
        }
        onChanged();
      } else {
        sdsConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.envoy.config.core.v3.ConfigSource sds_config = 2;</code>
     */
    public Builder clearSdsConfig() {
      if (sdsConfigBuilder_ == null) {
        sdsConfig_ = null;
        onChanged();
      } else {
        sdsConfig_ = null;
        sdsConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.envoy.config.core.v3.ConfigSource sds_config = 2;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.ConfigSource.Builder getSdsConfigBuilder() {
      
      onChanged();
      return getSdsConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.envoy.config.core.v3.ConfigSource sds_config = 2;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.ConfigSourceOrBuilder getSdsConfigOrBuilder() {
      if (sdsConfigBuilder_ != null) {
        return sdsConfigBuilder_.getMessageOrBuilder();
      } else {
        return sdsConfig_ == null ?
            io.envoyproxy.envoy.config.core.v3.ConfigSource.getDefaultInstance() : sdsConfig_;
      }
    }
    /**
     * <code>.envoy.config.core.v3.ConfigSource sds_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.ConfigSource, io.envoyproxy.envoy.config.core.v3.ConfigSource.Builder, io.envoyproxy.envoy.config.core.v3.ConfigSourceOrBuilder> 
        getSdsConfigFieldBuilder() {
      if (sdsConfigBuilder_ == null) {
        sdsConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.ConfigSource, io.envoyproxy.envoy.config.core.v3.ConfigSource.Builder, io.envoyproxy.envoy.config.core.v3.ConfigSourceOrBuilder>(
                getSdsConfig(),
                getParentForChildren(),
                isClean());
        sdsConfig_ = null;
      }
      return sdsConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig)
  private static final io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig();
  }

  public static io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SdsSecretConfig>
      PARSER = new com.google.protobuf.AbstractParser<SdsSecretConfig>() {
    @java.lang.Override
    public SdsSecretConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SdsSecretConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SdsSecretConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SdsSecretConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

