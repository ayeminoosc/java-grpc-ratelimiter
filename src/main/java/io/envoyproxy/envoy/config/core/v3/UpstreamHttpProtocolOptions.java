// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/protocol.proto

package io.envoyproxy.envoy.config.core.v3;

/**
 * Protobuf type {@code envoy.config.core.v3.UpstreamHttpProtocolOptions}
 */
public final class UpstreamHttpProtocolOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.core.v3.UpstreamHttpProtocolOptions)
    UpstreamHttpProtocolOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpstreamHttpProtocolOptions.newBuilder() to construct.
  private UpstreamHttpProtocolOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpstreamHttpProtocolOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpstreamHttpProtocolOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpstreamHttpProtocolOptions(
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

            autoSni_ = input.readBool();
            break;
          }
          case 16: {

            autoSanValidation_ = input.readBool();
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
    return io.envoyproxy.envoy.config.core.v3.ProtocolProto.internal_static_envoy_config_core_v3_UpstreamHttpProtocolOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.core.v3.ProtocolProto.internal_static_envoy_config_core_v3_UpstreamHttpProtocolOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions.class, io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions.Builder.class);
  }

  public static final int AUTO_SNI_FIELD_NUMBER = 1;
  private boolean autoSni_;
  /**
   * <pre>
   * Set transport socket `SNI &lt;https://en.wikipedia.org/wiki/Server_Name_Indication&gt;`_ for new
   * upstream connections based on the downstream HTTP host/authority header, as seen by the
   * :ref:`router filter &lt;config_http_filters_router&gt;`.
   * </pre>
   *
   * <code>bool auto_sni = 1;</code>
   * @return The autoSni.
   */
  @java.lang.Override
  public boolean getAutoSni() {
    return autoSni_;
  }

  public static final int AUTO_SAN_VALIDATION_FIELD_NUMBER = 2;
  private boolean autoSanValidation_;
  /**
   * <pre>
   * Automatic validate upstream presented certificate for new upstream connections based on the
   * downstream HTTP host/authority header, as seen by the
   * :ref:`router filter &lt;config_http_filters_router&gt;`.
   * This field is intended to set with `auto_sni` field.
   * </pre>
   *
   * <code>bool auto_san_validation = 2;</code>
   * @return The autoSanValidation.
   */
  @java.lang.Override
  public boolean getAutoSanValidation() {
    return autoSanValidation_;
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
    if (autoSni_ != false) {
      output.writeBool(1, autoSni_);
    }
    if (autoSanValidation_ != false) {
      output.writeBool(2, autoSanValidation_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (autoSni_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, autoSni_);
    }
    if (autoSanValidation_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, autoSanValidation_);
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
    if (!(obj instanceof io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions other = (io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions) obj;

    if (getAutoSni()
        != other.getAutoSni()) return false;
    if (getAutoSanValidation()
        != other.getAutoSanValidation()) return false;
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
    hash = (37 * hash) + AUTO_SNI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAutoSni());
    hash = (37 * hash) + AUTO_SAN_VALIDATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAutoSanValidation());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions prototype) {
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
   * Protobuf type {@code envoy.config.core.v3.UpstreamHttpProtocolOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.core.v3.UpstreamHttpProtocolOptions)
      io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.core.v3.ProtocolProto.internal_static_envoy_config_core_v3_UpstreamHttpProtocolOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.core.v3.ProtocolProto.internal_static_envoy_config_core_v3_UpstreamHttpProtocolOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions.class, io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions.newBuilder()
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
      autoSni_ = false;

      autoSanValidation_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.core.v3.ProtocolProto.internal_static_envoy_config_core_v3_UpstreamHttpProtocolOptions_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions build() {
      io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions buildPartial() {
      io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions result = new io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions(this);
      result.autoSni_ = autoSni_;
      result.autoSanValidation_ = autoSanValidation_;
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
      if (other instanceof io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions) {
        return mergeFrom((io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions other) {
      if (other == io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions.getDefaultInstance()) return this;
      if (other.getAutoSni() != false) {
        setAutoSni(other.getAutoSni());
      }
      if (other.getAutoSanValidation() != false) {
        setAutoSanValidation(other.getAutoSanValidation());
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
      io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean autoSni_ ;
    /**
     * <pre>
     * Set transport socket `SNI &lt;https://en.wikipedia.org/wiki/Server_Name_Indication&gt;`_ for new
     * upstream connections based on the downstream HTTP host/authority header, as seen by the
     * :ref:`router filter &lt;config_http_filters_router&gt;`.
     * </pre>
     *
     * <code>bool auto_sni = 1;</code>
     * @return The autoSni.
     */
    @java.lang.Override
    public boolean getAutoSni() {
      return autoSni_;
    }
    /**
     * <pre>
     * Set transport socket `SNI &lt;https://en.wikipedia.org/wiki/Server_Name_Indication&gt;`_ for new
     * upstream connections based on the downstream HTTP host/authority header, as seen by the
     * :ref:`router filter &lt;config_http_filters_router&gt;`.
     * </pre>
     *
     * <code>bool auto_sni = 1;</code>
     * @param value The autoSni to set.
     * @return This builder for chaining.
     */
    public Builder setAutoSni(boolean value) {
      
      autoSni_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Set transport socket `SNI &lt;https://en.wikipedia.org/wiki/Server_Name_Indication&gt;`_ for new
     * upstream connections based on the downstream HTTP host/authority header, as seen by the
     * :ref:`router filter &lt;config_http_filters_router&gt;`.
     * </pre>
     *
     * <code>bool auto_sni = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAutoSni() {
      
      autoSni_ = false;
      onChanged();
      return this;
    }

    private boolean autoSanValidation_ ;
    /**
     * <pre>
     * Automatic validate upstream presented certificate for new upstream connections based on the
     * downstream HTTP host/authority header, as seen by the
     * :ref:`router filter &lt;config_http_filters_router&gt;`.
     * This field is intended to set with `auto_sni` field.
     * </pre>
     *
     * <code>bool auto_san_validation = 2;</code>
     * @return The autoSanValidation.
     */
    @java.lang.Override
    public boolean getAutoSanValidation() {
      return autoSanValidation_;
    }
    /**
     * <pre>
     * Automatic validate upstream presented certificate for new upstream connections based on the
     * downstream HTTP host/authority header, as seen by the
     * :ref:`router filter &lt;config_http_filters_router&gt;`.
     * This field is intended to set with `auto_sni` field.
     * </pre>
     *
     * <code>bool auto_san_validation = 2;</code>
     * @param value The autoSanValidation to set.
     * @return This builder for chaining.
     */
    public Builder setAutoSanValidation(boolean value) {
      
      autoSanValidation_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Automatic validate upstream presented certificate for new upstream connections based on the
     * downstream HTTP host/authority header, as seen by the
     * :ref:`router filter &lt;config_http_filters_router&gt;`.
     * This field is intended to set with `auto_sni` field.
     * </pre>
     *
     * <code>bool auto_san_validation = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearAutoSanValidation() {
      
      autoSanValidation_ = false;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.core.v3.UpstreamHttpProtocolOptions)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.core.v3.UpstreamHttpProtocolOptions)
  private static final io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions();
  }

  public static io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpstreamHttpProtocolOptions>
      PARSER = new com.google.protobuf.AbstractParser<UpstreamHttpProtocolOptions>() {
    @java.lang.Override
    public UpstreamHttpProtocolOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpstreamHttpProtocolOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpstreamHttpProtocolOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpstreamHttpProtocolOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.UpstreamHttpProtocolOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
