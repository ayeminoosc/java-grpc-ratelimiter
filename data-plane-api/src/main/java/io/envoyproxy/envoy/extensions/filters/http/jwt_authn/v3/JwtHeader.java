// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/jwt_authn/v3/config.proto

package io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3;

/**
 * <pre>
 * This message specifies a header location to extract JWT token.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.filters.http.jwt_authn.v3.JwtHeader}
 */
public final class JwtHeader extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.http.jwt_authn.v3.JwtHeader)
    JwtHeaderOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JwtHeader.newBuilder() to construct.
  private JwtHeader(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JwtHeader() {
    name_ = "";
    valuePrefix_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new JwtHeader();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JwtHeader(
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
            java.lang.String s = input.readStringRequireUtf8();

            valuePrefix_ = s;
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
    return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_JwtHeader_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_JwtHeader_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader.class, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The HTTP header name.
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
   * The HTTP header name.
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

  public static final int VALUE_PREFIX_FIELD_NUMBER = 2;
  private volatile java.lang.Object valuePrefix_;
  /**
   * <pre>
   * The value prefix. The value format is "value_prefix&lt;token&gt;"
   * For example, for "Authorization: Bearer &lt;token&gt;", value_prefix="Bearer " with a space at the
   * end.
   * </pre>
   *
   * <code>string value_prefix = 2 [(.validate.rules) = { ... }</code>
   * @return The valuePrefix.
   */
  @java.lang.Override
  public java.lang.String getValuePrefix() {
    java.lang.Object ref = valuePrefix_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valuePrefix_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The value prefix. The value format is "value_prefix&lt;token&gt;"
   * For example, for "Authorization: Bearer &lt;token&gt;", value_prefix="Bearer " with a space at the
   * end.
   * </pre>
   *
   * <code>string value_prefix = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for valuePrefix.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValuePrefixBytes() {
    java.lang.Object ref = valuePrefix_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      valuePrefix_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!getValuePrefixBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, valuePrefix_);
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
    if (!getValuePrefixBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, valuePrefix_);
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader other = (io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getValuePrefix()
        .equals(other.getValuePrefix())) return false;
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
    hash = (37 * hash) + VALUE_PREFIX_FIELD_NUMBER;
    hash = (53 * hash) + getValuePrefix().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader prototype) {
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
   * This message specifies a header location to extract JWT token.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.filters.http.jwt_authn.v3.JwtHeader}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.http.jwt_authn.v3.JwtHeader)
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeaderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_JwtHeader_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_JwtHeader_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader.class, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader.newBuilder()
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

      valuePrefix_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_JwtHeader_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader build() {
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader buildPartial() {
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader result = new io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader(this);
      result.name_ = name_;
      result.valuePrefix_ = valuePrefix_;
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader other) {
      if (other == io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getValuePrefix().isEmpty()) {
        valuePrefix_ = other.valuePrefix_;
        onChanged();
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
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader) e.getUnfinishedMessage();
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
     * The HTTP header name.
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
     * The HTTP header name.
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
     * The HTTP header name.
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
     * The HTTP header name.
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
     * The HTTP header name.
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

    private java.lang.Object valuePrefix_ = "";
    /**
     * <pre>
     * The value prefix. The value format is "value_prefix&lt;token&gt;"
     * For example, for "Authorization: Bearer &lt;token&gt;", value_prefix="Bearer " with a space at the
     * end.
     * </pre>
     *
     * <code>string value_prefix = 2 [(.validate.rules) = { ... }</code>
     * @return The valuePrefix.
     */
    public java.lang.String getValuePrefix() {
      java.lang.Object ref = valuePrefix_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valuePrefix_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The value prefix. The value format is "value_prefix&lt;token&gt;"
     * For example, for "Authorization: Bearer &lt;token&gt;", value_prefix="Bearer " with a space at the
     * end.
     * </pre>
     *
     * <code>string value_prefix = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for valuePrefix.
     */
    public com.google.protobuf.ByteString
        getValuePrefixBytes() {
      java.lang.Object ref = valuePrefix_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        valuePrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The value prefix. The value format is "value_prefix&lt;token&gt;"
     * For example, for "Authorization: Bearer &lt;token&gt;", value_prefix="Bearer " with a space at the
     * end.
     * </pre>
     *
     * <code>string value_prefix = 2 [(.validate.rules) = { ... }</code>
     * @param value The valuePrefix to set.
     * @return This builder for chaining.
     */
    public Builder setValuePrefix(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      valuePrefix_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value prefix. The value format is "value_prefix&lt;token&gt;"
     * For example, for "Authorization: Bearer &lt;token&gt;", value_prefix="Bearer " with a space at the
     * end.
     * </pre>
     *
     * <code>string value_prefix = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearValuePrefix() {
      
      valuePrefix_ = getDefaultInstance().getValuePrefix();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The value prefix. The value format is "value_prefix&lt;token&gt;"
     * For example, for "Authorization: Bearer &lt;token&gt;", value_prefix="Bearer " with a space at the
     * end.
     * </pre>
     *
     * <code>string value_prefix = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes for valuePrefix to set.
     * @return This builder for chaining.
     */
    public Builder setValuePrefixBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      valuePrefix_ = value;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.http.jwt_authn.v3.JwtHeader)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.jwt_authn.v3.JwtHeader)
  private static final io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader();
  }

  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JwtHeader>
      PARSER = new com.google.protobuf.AbstractParser<JwtHeader>() {
    @java.lang.Override
    public JwtHeader parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JwtHeader(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JwtHeader> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JwtHeader> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.JwtHeader getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

