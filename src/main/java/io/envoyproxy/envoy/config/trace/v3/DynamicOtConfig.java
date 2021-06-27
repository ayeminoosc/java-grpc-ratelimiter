// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/trace/v3/dynamic_ot.proto

package io.envoyproxy.envoy.config.trace.v3;

/**
 * <pre>
 * DynamicOtConfig is used to dynamically load a tracer from a shared library
 * that implements the `OpenTracing dynamic loading API
 * &lt;https://github.com/opentracing/opentracing-cpp&gt;`_.
 * [#extension: envoy.tracers.dynamic_ot]
 * </pre>
 *
 * Protobuf type {@code envoy.config.trace.v3.DynamicOtConfig}
 */
public final class DynamicOtConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.trace.v3.DynamicOtConfig)
    DynamicOtConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynamicOtConfig.newBuilder() to construct.
  private DynamicOtConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynamicOtConfig() {
    library_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DynamicOtConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DynamicOtConfig(
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

            library_ = s;
            break;
          }
          case 18: {
            com.google.protobuf.Struct.Builder subBuilder = null;
            if (config_ != null) {
              subBuilder = config_.toBuilder();
            }
            config_ = input.readMessage(com.google.protobuf.Struct.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(config_);
              config_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.config.trace.v3.DynamicOtProto.internal_static_envoy_config_trace_v3_DynamicOtConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.trace.v3.DynamicOtProto.internal_static_envoy_config_trace_v3_DynamicOtConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig.class, io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig.Builder.class);
  }

  public static final int LIBRARY_FIELD_NUMBER = 1;
  private volatile java.lang.Object library_;
  /**
   * <pre>
   * Dynamic library implementing the `OpenTracing API
   * &lt;https://github.com/opentracing/opentracing-cpp&gt;`_.
   * </pre>
   *
   * <code>string library = 1 [(.validate.rules) = { ... }</code>
   * @return The library.
   */
  @java.lang.Override
  public java.lang.String getLibrary() {
    java.lang.Object ref = library_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      library_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Dynamic library implementing the `OpenTracing API
   * &lt;https://github.com/opentracing/opentracing-cpp&gt;`_.
   * </pre>
   *
   * <code>string library = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for library.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLibraryBytes() {
    java.lang.Object ref = library_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      library_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIG_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct config_;
  /**
   * <pre>
   * The configuration to use when creating a tracer from the given dynamic
   * library.
   * </pre>
   *
   * <code>.google.protobuf.Struct config = 2;</code>
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   * <pre>
   * The configuration to use when creating a tracer from the given dynamic
   * library.
   * </pre>
   *
   * <code>.google.protobuf.Struct config = 2;</code>
   * @return The config.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getConfig() {
    return config_ == null ? com.google.protobuf.Struct.getDefaultInstance() : config_;
  }
  /**
   * <pre>
   * The configuration to use when creating a tracer from the given dynamic
   * library.
   * </pre>
   *
   * <code>.google.protobuf.Struct config = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getConfigOrBuilder() {
    return getConfig();
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
    if (!getLibraryBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, library_);
    }
    if (config_ != null) {
      output.writeMessage(2, getConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLibraryBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, library_);
    }
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConfig());
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
    if (!(obj instanceof io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig other = (io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig) obj;

    if (!getLibrary()
        .equals(other.getLibrary())) return false;
    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig()
          .equals(other.getConfig())) return false;
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
    hash = (37 * hash) + LIBRARY_FIELD_NUMBER;
    hash = (53 * hash) + getLibrary().hashCode();
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig prototype) {
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
   * DynamicOtConfig is used to dynamically load a tracer from a shared library
   * that implements the `OpenTracing dynamic loading API
   * &lt;https://github.com/opentracing/opentracing-cpp&gt;`_.
   * [#extension: envoy.tracers.dynamic_ot]
   * </pre>
   *
   * Protobuf type {@code envoy.config.trace.v3.DynamicOtConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.trace.v3.DynamicOtConfig)
      io.envoyproxy.envoy.config.trace.v3.DynamicOtConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.trace.v3.DynamicOtProto.internal_static_envoy_config_trace_v3_DynamicOtConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.trace.v3.DynamicOtProto.internal_static_envoy_config_trace_v3_DynamicOtConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig.class, io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig.newBuilder()
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
      library_ = "";

      if (configBuilder_ == null) {
        config_ = null;
      } else {
        config_ = null;
        configBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.trace.v3.DynamicOtProto.internal_static_envoy_config_trace_v3_DynamicOtConfig_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig build() {
      io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig buildPartial() {
      io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig result = new io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig(this);
      result.library_ = library_;
      if (configBuilder_ == null) {
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig) {
        return mergeFrom((io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig other) {
      if (other == io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig.getDefaultInstance()) return this;
      if (!other.getLibrary().isEmpty()) {
        library_ = other.library_;
        onChanged();
      }
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
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
      io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object library_ = "";
    /**
     * <pre>
     * Dynamic library implementing the `OpenTracing API
     * &lt;https://github.com/opentracing/opentracing-cpp&gt;`_.
     * </pre>
     *
     * <code>string library = 1 [(.validate.rules) = { ... }</code>
     * @return The library.
     */
    public java.lang.String getLibrary() {
      java.lang.Object ref = library_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        library_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Dynamic library implementing the `OpenTracing API
     * &lt;https://github.com/opentracing/opentracing-cpp&gt;`_.
     * </pre>
     *
     * <code>string library = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for library.
     */
    public com.google.protobuf.ByteString
        getLibraryBytes() {
      java.lang.Object ref = library_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        library_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Dynamic library implementing the `OpenTracing API
     * &lt;https://github.com/opentracing/opentracing-cpp&gt;`_.
     * </pre>
     *
     * <code>string library = 1 [(.validate.rules) = { ... }</code>
     * @param value The library to set.
     * @return This builder for chaining.
     */
    public Builder setLibrary(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      library_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Dynamic library implementing the `OpenTracing API
     * &lt;https://github.com/opentracing/opentracing-cpp&gt;`_.
     * </pre>
     *
     * <code>string library = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearLibrary() {
      
      library_ = getDefaultInstance().getLibrary();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Dynamic library implementing the `OpenTracing API
     * &lt;https://github.com/opentracing/opentracing-cpp&gt;`_.
     * </pre>
     *
     * <code>string library = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for library to set.
     * @return This builder for chaining.
     */
    public Builder setLibraryBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      library_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct config_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> configBuilder_;
    /**
     * <pre>
     * The configuration to use when creating a tracer from the given dynamic
     * library.
     * </pre>
     *
     * <code>.google.protobuf.Struct config = 2;</code>
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return configBuilder_ != null || config_ != null;
    }
    /**
     * <pre>
     * The configuration to use when creating a tracer from the given dynamic
     * library.
     * </pre>
     *
     * <code>.google.protobuf.Struct config = 2;</code>
     * @return The config.
     */
    public com.google.protobuf.Struct getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? com.google.protobuf.Struct.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The configuration to use when creating a tracer from the given dynamic
     * library.
     * </pre>
     *
     * <code>.google.protobuf.Struct config = 2;</code>
     */
    public Builder setConfig(com.google.protobuf.Struct value) {
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
     * The configuration to use when creating a tracer from the given dynamic
     * library.
     * </pre>
     *
     * <code>.google.protobuf.Struct config = 2;</code>
     */
    public Builder setConfig(
        com.google.protobuf.Struct.Builder builderForValue) {
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
     * The configuration to use when creating a tracer from the given dynamic
     * library.
     * </pre>
     *
     * <code>.google.protobuf.Struct config = 2;</code>
     */
    public Builder mergeConfig(com.google.protobuf.Struct value) {
      if (configBuilder_ == null) {
        if (config_ != null) {
          config_ =
            com.google.protobuf.Struct.newBuilder(config_).mergeFrom(value).buildPartial();
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
     * The configuration to use when creating a tracer from the given dynamic
     * library.
     * </pre>
     *
     * <code>.google.protobuf.Struct config = 2;</code>
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
     * The configuration to use when creating a tracer from the given dynamic
     * library.
     * </pre>
     *
     * <code>.google.protobuf.Struct config = 2;</code>
     */
    public com.google.protobuf.Struct.Builder getConfigBuilder() {
      
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The configuration to use when creating a tracer from the given dynamic
     * library.
     * </pre>
     *
     * <code>.google.protobuf.Struct config = 2;</code>
     */
    public com.google.protobuf.StructOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : config_;
      }
    }
    /**
     * <pre>
     * The configuration to use when creating a tracer from the given dynamic
     * library.
     * </pre>
     *
     * <code>.google.protobuf.Struct config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.trace.v3.DynamicOtConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.trace.v3.DynamicOtConfig)
  private static final io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig();
  }

  public static io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynamicOtConfig>
      PARSER = new com.google.protobuf.AbstractParser<DynamicOtConfig>() {
    @java.lang.Override
    public DynamicOtConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DynamicOtConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DynamicOtConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynamicOtConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.trace.v3.DynamicOtConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

