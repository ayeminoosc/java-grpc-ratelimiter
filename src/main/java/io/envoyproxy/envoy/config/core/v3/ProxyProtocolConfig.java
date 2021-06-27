// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/proxy_protocol.proto

package io.envoyproxy.envoy.config.core.v3;

/**
 * Protobuf type {@code envoy.config.core.v3.ProxyProtocolConfig}
 */
public final class ProxyProtocolConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.core.v3.ProxyProtocolConfig)
    ProxyProtocolConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProxyProtocolConfig.newBuilder() to construct.
  private ProxyProtocolConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProxyProtocolConfig() {
    version_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProxyProtocolConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProxyProtocolConfig(
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

            version_ = rawValue;
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
    return io.envoyproxy.envoy.config.core.v3.ProxyProtocolProto.internal_static_envoy_config_core_v3_ProxyProtocolConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.core.v3.ProxyProtocolProto.internal_static_envoy_config_core_v3_ProxyProtocolConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.class, io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Builder.class);
  }

  /**
   * Protobuf enum {@code envoy.config.core.v3.ProxyProtocolConfig.Version}
   */
  public enum Version
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * PROXY protocol version 1. Human readable format.
     * </pre>
     *
     * <code>V1 = 0;</code>
     */
    V1(0),
    /**
     * <pre>
     * PROXY protocol version 2. Binary format.
     * </pre>
     *
     * <code>V2 = 1;</code>
     */
    V2(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * PROXY protocol version 1. Human readable format.
     * </pre>
     *
     * <code>V1 = 0;</code>
     */
    public static final int V1_VALUE = 0;
    /**
     * <pre>
     * PROXY protocol version 2. Binary format.
     * </pre>
     *
     * <code>V2 = 1;</code>
     */
    public static final int V2_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Version valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Version forNumber(int value) {
      switch (value) {
        case 0: return V1;
        case 1: return V2;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Version>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Version> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Version>() {
            public Version findValueByNumber(int number) {
              return Version.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final Version[] VALUES = values();

    public static Version valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Version(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:envoy.config.core.v3.ProxyProtocolConfig.Version)
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_;
  /**
   * <pre>
   * The PROXY protocol version to use. See https://www.haproxy.org/download/2.1/doc/proxy-protocol.txt for details
   * </pre>
   *
   * <code>.envoy.config.core.v3.ProxyProtocolConfig.Version version = 1;</code>
   * @return The enum numeric value on the wire for version.
   */
  @java.lang.Override public int getVersionValue() {
    return version_;
  }
  /**
   * <pre>
   * The PROXY protocol version to use. See https://www.haproxy.org/download/2.1/doc/proxy-protocol.txt for details
   * </pre>
   *
   * <code>.envoy.config.core.v3.ProxyProtocolConfig.Version version = 1;</code>
   * @return The version.
   */
  @java.lang.Override public io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Version getVersion() {
    @SuppressWarnings("deprecation")
    io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Version result = io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Version.valueOf(version_);
    return result == null ? io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Version.UNRECOGNIZED : result;
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
    if (version_ != io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Version.V1.getNumber()) {
      output.writeEnum(1, version_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Version.V1.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, version_);
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
    if (!(obj instanceof io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig other = (io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig) obj;

    if (version_ != other.version_) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + version_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig prototype) {
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
   * Protobuf type {@code envoy.config.core.v3.ProxyProtocolConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.core.v3.ProxyProtocolConfig)
      io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.core.v3.ProxyProtocolProto.internal_static_envoy_config_core_v3_ProxyProtocolConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.core.v3.ProxyProtocolProto.internal_static_envoy_config_core_v3_ProxyProtocolConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.class, io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.newBuilder()
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
      version_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.core.v3.ProxyProtocolProto.internal_static_envoy_config_core_v3_ProxyProtocolConfig_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig build() {
      io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig buildPartial() {
      io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig result = new io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig(this);
      result.version_ = version_;
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
      if (other instanceof io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig) {
        return mergeFrom((io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig other) {
      if (other == io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.getDefaultInstance()) return this;
      if (other.version_ != 0) {
        setVersionValue(other.getVersionValue());
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
      io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int version_ = 0;
    /**
     * <pre>
     * The PROXY protocol version to use. See https://www.haproxy.org/download/2.1/doc/proxy-protocol.txt for details
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig.Version version = 1;</code>
     * @return The enum numeric value on the wire for version.
     */
    @java.lang.Override public int getVersionValue() {
      return version_;
    }
    /**
     * <pre>
     * The PROXY protocol version to use. See https://www.haproxy.org/download/2.1/doc/proxy-protocol.txt for details
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig.Version version = 1;</code>
     * @param value The enum numeric value on the wire for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionValue(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The PROXY protocol version to use. See https://www.haproxy.org/download/2.1/doc/proxy-protocol.txt for details
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig.Version version = 1;</code>
     * @return The version.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Version getVersion() {
      @SuppressWarnings("deprecation")
      io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Version result = io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Version.valueOf(version_);
      return result == null ? io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Version.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The PROXY protocol version to use. See https://www.haproxy.org/download/2.1/doc/proxy-protocol.txt for details
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig.Version version = 1;</code>
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig.Version value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      version_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The PROXY protocol version to use. See https://www.haproxy.org/download/2.1/doc/proxy-protocol.txt for details
     * </pre>
     *
     * <code>.envoy.config.core.v3.ProxyProtocolConfig.Version version = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      
      version_ = 0;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.core.v3.ProxyProtocolConfig)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.core.v3.ProxyProtocolConfig)
  private static final io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig();
  }

  public static io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProxyProtocolConfig>
      PARSER = new com.google.protobuf.AbstractParser<ProxyProtocolConfig>() {
    @java.lang.Override
    public ProxyProtocolConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProxyProtocolConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProxyProtocolConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProxyProtocolConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.ProxyProtocolConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

