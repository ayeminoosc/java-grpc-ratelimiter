// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/extension.proto

package io.envoyproxy.envoy.config.core.v3;

/**
 * <pre>
 * Message type for extension configuration.
 * [#next-major-version: revisit all existing typed_config that doesn't use this wrapper.].
 * </pre>
 *
 * Protobuf type {@code envoy.config.core.v3.TypedExtensionConfig}
 */
public final class TypedExtensionConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.core.v3.TypedExtensionConfig)
    TypedExtensionConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TypedExtensionConfig.newBuilder() to construct.
  private TypedExtensionConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TypedExtensionConfig() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TypedExtensionConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TypedExtensionConfig(
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
            com.google.protobuf.Any.Builder subBuilder = null;
            if (typedConfig_ != null) {
              subBuilder = typedConfig_.toBuilder();
            }
            typedConfig_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(typedConfig_);
              typedConfig_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.config.core.v3.ExtensionProto.internal_static_envoy_config_core_v3_TypedExtensionConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.core.v3.ExtensionProto.internal_static_envoy_config_core_v3_TypedExtensionConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig.class, io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of an extension. This is not used to select the extension, instead
   * it serves the role of an opaque identifier.
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
   * The name of an extension. This is not used to select the extension, instead
   * it serves the role of an opaque identifier.
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

  public static final int TYPED_CONFIG_FIELD_NUMBER = 2;
  private com.google.protobuf.Any typedConfig_;
  /**
   * <pre>
   * The typed config for the extension. The type URL will be used to identify
   * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
   * the inner type URL of *TypedStruct* will be utilized. See the
   * :ref:`extension configuration overview
   * &lt;config_overview_extension_configuration&gt;` for further details.
   * </pre>
   *
   * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the typedConfig field is set.
   */
  @java.lang.Override
  public boolean hasTypedConfig() {
    return typedConfig_ != null;
  }
  /**
   * <pre>
   * The typed config for the extension. The type URL will be used to identify
   * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
   * the inner type URL of *TypedStruct* will be utilized. See the
   * :ref:`extension configuration overview
   * &lt;config_overview_extension_configuration&gt;` for further details.
   * </pre>
   *
   * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
   * @return The typedConfig.
   */
  @java.lang.Override
  public com.google.protobuf.Any getTypedConfig() {
    return typedConfig_ == null ? com.google.protobuf.Any.getDefaultInstance() : typedConfig_;
  }
  /**
   * <pre>
   * The typed config for the extension. The type URL will be used to identify
   * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
   * the inner type URL of *TypedStruct* will be utilized. See the
   * :ref:`extension configuration overview
   * &lt;config_overview_extension_configuration&gt;` for further details.
   * </pre>
   *
   * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getTypedConfigOrBuilder() {
    return getTypedConfig();
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
    if (typedConfig_ != null) {
      output.writeMessage(2, getTypedConfig());
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
    if (typedConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTypedConfig());
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
    if (!(obj instanceof io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig other = (io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (hasTypedConfig() != other.hasTypedConfig()) return false;
    if (hasTypedConfig()) {
      if (!getTypedConfig()
          .equals(other.getTypedConfig())) return false;
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
    if (hasTypedConfig()) {
      hash = (37 * hash) + TYPED_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getTypedConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig prototype) {
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
   * Message type for extension configuration.
   * [#next-major-version: revisit all existing typed_config that doesn't use this wrapper.].
   * </pre>
   *
   * Protobuf type {@code envoy.config.core.v3.TypedExtensionConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.core.v3.TypedExtensionConfig)
      io.envoyproxy.envoy.config.core.v3.TypedExtensionConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.core.v3.ExtensionProto.internal_static_envoy_config_core_v3_TypedExtensionConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.core.v3.ExtensionProto.internal_static_envoy_config_core_v3_TypedExtensionConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig.class, io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig.newBuilder()
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

      if (typedConfigBuilder_ == null) {
        typedConfig_ = null;
      } else {
        typedConfig_ = null;
        typedConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.core.v3.ExtensionProto.internal_static_envoy_config_core_v3_TypedExtensionConfig_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig build() {
      io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig buildPartial() {
      io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig result = new io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig(this);
      result.name_ = name_;
      if (typedConfigBuilder_ == null) {
        result.typedConfig_ = typedConfig_;
      } else {
        result.typedConfig_ = typedConfigBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig) {
        return mergeFrom((io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig other) {
      if (other == io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasTypedConfig()) {
        mergeTypedConfig(other.getTypedConfig());
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
      io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig) e.getUnfinishedMessage();
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
     * The name of an extension. This is not used to select the extension, instead
     * it serves the role of an opaque identifier.
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
     * The name of an extension. This is not used to select the extension, instead
     * it serves the role of an opaque identifier.
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
     * The name of an extension. This is not used to select the extension, instead
     * it serves the role of an opaque identifier.
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
     * The name of an extension. This is not used to select the extension, instead
     * it serves the role of an opaque identifier.
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
     * The name of an extension. This is not used to select the extension, instead
     * it serves the role of an opaque identifier.
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

    private com.google.protobuf.Any typedConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> typedConfigBuilder_;
    /**
     * <pre>
     * The typed config for the extension. The type URL will be used to identify
     * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
     * the inner type URL of *TypedStruct* will be utilized. See the
     * :ref:`extension configuration overview
     * &lt;config_overview_extension_configuration&gt;` for further details.
     * </pre>
     *
     * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
     * @return Whether the typedConfig field is set.
     */
    public boolean hasTypedConfig() {
      return typedConfigBuilder_ != null || typedConfig_ != null;
    }
    /**
     * <pre>
     * The typed config for the extension. The type URL will be used to identify
     * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
     * the inner type URL of *TypedStruct* will be utilized. See the
     * :ref:`extension configuration overview
     * &lt;config_overview_extension_configuration&gt;` for further details.
     * </pre>
     *
     * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
     * @return The typedConfig.
     */
    public com.google.protobuf.Any getTypedConfig() {
      if (typedConfigBuilder_ == null) {
        return typedConfig_ == null ? com.google.protobuf.Any.getDefaultInstance() : typedConfig_;
      } else {
        return typedConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The typed config for the extension. The type URL will be used to identify
     * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
     * the inner type URL of *TypedStruct* will be utilized. See the
     * :ref:`extension configuration overview
     * &lt;config_overview_extension_configuration&gt;` for further details.
     * </pre>
     *
     * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setTypedConfig(com.google.protobuf.Any value) {
      if (typedConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        typedConfig_ = value;
        onChanged();
      } else {
        typedConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The typed config for the extension. The type URL will be used to identify
     * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
     * the inner type URL of *TypedStruct* will be utilized. See the
     * :ref:`extension configuration overview
     * &lt;config_overview_extension_configuration&gt;` for further details.
     * </pre>
     *
     * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setTypedConfig(
        com.google.protobuf.Any.Builder builderForValue) {
      if (typedConfigBuilder_ == null) {
        typedConfig_ = builderForValue.build();
        onChanged();
      } else {
        typedConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The typed config for the extension. The type URL will be used to identify
     * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
     * the inner type URL of *TypedStruct* will be utilized. See the
     * :ref:`extension configuration overview
     * &lt;config_overview_extension_configuration&gt;` for further details.
     * </pre>
     *
     * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeTypedConfig(com.google.protobuf.Any value) {
      if (typedConfigBuilder_ == null) {
        if (typedConfig_ != null) {
          typedConfig_ =
            com.google.protobuf.Any.newBuilder(typedConfig_).mergeFrom(value).buildPartial();
        } else {
          typedConfig_ = value;
        }
        onChanged();
      } else {
        typedConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The typed config for the extension. The type URL will be used to identify
     * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
     * the inner type URL of *TypedStruct* will be utilized. See the
     * :ref:`extension configuration overview
     * &lt;config_overview_extension_configuration&gt;` for further details.
     * </pre>
     *
     * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearTypedConfig() {
      if (typedConfigBuilder_ == null) {
        typedConfig_ = null;
        onChanged();
      } else {
        typedConfig_ = null;
        typedConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The typed config for the extension. The type URL will be used to identify
     * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
     * the inner type URL of *TypedStruct* will be utilized. See the
     * :ref:`extension configuration overview
     * &lt;config_overview_extension_configuration&gt;` for further details.
     * </pre>
     *
     * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.Any.Builder getTypedConfigBuilder() {
      
      onChanged();
      return getTypedConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The typed config for the extension. The type URL will be used to identify
     * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
     * the inner type URL of *TypedStruct* will be utilized. See the
     * :ref:`extension configuration overview
     * &lt;config_overview_extension_configuration&gt;` for further details.
     * </pre>
     *
     * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.AnyOrBuilder getTypedConfigOrBuilder() {
      if (typedConfigBuilder_ != null) {
        return typedConfigBuilder_.getMessageOrBuilder();
      } else {
        return typedConfig_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : typedConfig_;
      }
    }
    /**
     * <pre>
     * The typed config for the extension. The type URL will be used to identify
     * the extension. In the case that the type URL is *udpa.type.v1.TypedStruct*,
     * the inner type URL of *TypedStruct* will be utilized. See the
     * :ref:`extension configuration overview
     * &lt;config_overview_extension_configuration&gt;` for further details.
     * </pre>
     *
     * <code>.google.protobuf.Any typed_config = 2 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getTypedConfigFieldBuilder() {
      if (typedConfigBuilder_ == null) {
        typedConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getTypedConfig(),
                getParentForChildren(),
                isClean());
        typedConfig_ = null;
      }
      return typedConfigBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.core.v3.TypedExtensionConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.core.v3.TypedExtensionConfig)
  private static final io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig();
  }

  public static io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TypedExtensionConfig>
      PARSER = new com.google.protobuf.AbstractParser<TypedExtensionConfig>() {
    @java.lang.Override
    public TypedExtensionConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TypedExtensionConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TypedExtensionConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TypedExtensionConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
