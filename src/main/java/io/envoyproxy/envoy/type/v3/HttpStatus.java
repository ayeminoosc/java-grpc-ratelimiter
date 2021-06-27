// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/v3/http_status.proto

package io.envoyproxy.envoy.type.v3;

/**
 * <pre>
 * HTTP status.
 * </pre>
 *
 * Protobuf type {@code envoy.type.v3.HttpStatus}
 */
public final class HttpStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.type.v3.HttpStatus)
    HttpStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HttpStatus.newBuilder() to construct.
  private HttpStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HttpStatus() {
    code_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HttpStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HttpStatus(
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

            code_ = rawValue;
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
    return io.envoyproxy.envoy.type.v3.HttpStatusProto.internal_static_envoy_type_v3_HttpStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.type.v3.HttpStatusProto.internal_static_envoy_type_v3_HttpStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.type.v3.HttpStatus.class, io.envoyproxy.envoy.type.v3.HttpStatus.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <pre>
   * Supplies HTTP response code.
   * </pre>
   *
   * <code>.envoy.type.v3.StatusCode code = 1 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for code.
   */
  @java.lang.Override public int getCodeValue() {
    return code_;
  }
  /**
   * <pre>
   * Supplies HTTP response code.
   * </pre>
   *
   * <code>.envoy.type.v3.StatusCode code = 1 [(.validate.rules) = { ... }</code>
   * @return The code.
   */
  @java.lang.Override public io.envoyproxy.envoy.type.v3.StatusCode getCode() {
    @SuppressWarnings("deprecation")
    io.envoyproxy.envoy.type.v3.StatusCode result = io.envoyproxy.envoy.type.v3.StatusCode.valueOf(code_);
    return result == null ? io.envoyproxy.envoy.type.v3.StatusCode.UNRECOGNIZED : result;
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
    if (code_ != io.envoyproxy.envoy.type.v3.StatusCode.Empty.getNumber()) {
      output.writeEnum(1, code_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != io.envoyproxy.envoy.type.v3.StatusCode.Empty.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, code_);
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
    if (!(obj instanceof io.envoyproxy.envoy.type.v3.HttpStatus)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.type.v3.HttpStatus other = (io.envoyproxy.envoy.type.v3.HttpStatus) obj;

    if (code_ != other.code_) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.type.v3.HttpStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.v3.HttpStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.HttpStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.v3.HttpStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.HttpStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.v3.HttpStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.HttpStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.v3.HttpStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.HttpStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.v3.HttpStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.HttpStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.v3.HttpStatus parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.type.v3.HttpStatus prototype) {
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
   * HTTP status.
   * </pre>
   *
   * Protobuf type {@code envoy.type.v3.HttpStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.type.v3.HttpStatus)
      io.envoyproxy.envoy.type.v3.HttpStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.type.v3.HttpStatusProto.internal_static_envoy_type_v3_HttpStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.type.v3.HttpStatusProto.internal_static_envoy_type_v3_HttpStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.type.v3.HttpStatus.class, io.envoyproxy.envoy.type.v3.HttpStatus.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.type.v3.HttpStatus.newBuilder()
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
      code_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.type.v3.HttpStatusProto.internal_static_envoy_type_v3_HttpStatus_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.v3.HttpStatus getDefaultInstanceForType() {
      return io.envoyproxy.envoy.type.v3.HttpStatus.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.v3.HttpStatus build() {
      io.envoyproxy.envoy.type.v3.HttpStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.v3.HttpStatus buildPartial() {
      io.envoyproxy.envoy.type.v3.HttpStatus result = new io.envoyproxy.envoy.type.v3.HttpStatus(this);
      result.code_ = code_;
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
      if (other instanceof io.envoyproxy.envoy.type.v3.HttpStatus) {
        return mergeFrom((io.envoyproxy.envoy.type.v3.HttpStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.type.v3.HttpStatus other) {
      if (other == io.envoyproxy.envoy.type.v3.HttpStatus.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
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
      io.envoyproxy.envoy.type.v3.HttpStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.type.v3.HttpStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int code_ = 0;
    /**
     * <pre>
     * Supplies HTTP response code.
     * </pre>
     *
     * <code>.envoy.type.v3.StatusCode code = 1 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for code.
     */
    @java.lang.Override public int getCodeValue() {
      return code_;
    }
    /**
     * <pre>
     * Supplies HTTP response code.
     * </pre>
     *
     * <code>.envoy.type.v3.StatusCode code = 1 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeValue(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Supplies HTTP response code.
     * </pre>
     *
     * <code>.envoy.type.v3.StatusCode code = 1 [(.validate.rules) = { ... }</code>
     * @return The code.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.type.v3.StatusCode getCode() {
      @SuppressWarnings("deprecation")
      io.envoyproxy.envoy.type.v3.StatusCode result = io.envoyproxy.envoy.type.v3.StatusCode.valueOf(code_);
      return result == null ? io.envoyproxy.envoy.type.v3.StatusCode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Supplies HTTP response code.
     * </pre>
     *
     * <code>.envoy.type.v3.StatusCode code = 1 [(.validate.rules) = { ... }</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(io.envoyproxy.envoy.type.v3.StatusCode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Supplies HTTP response code.
     * </pre>
     *
     * <code>.envoy.type.v3.StatusCode code = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      
      code_ = 0;
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


    // @@protoc_insertion_point(builder_scope:envoy.type.v3.HttpStatus)
  }

  // @@protoc_insertion_point(class_scope:envoy.type.v3.HttpStatus)
  private static final io.envoyproxy.envoy.type.v3.HttpStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.type.v3.HttpStatus();
  }

  public static io.envoyproxy.envoy.type.v3.HttpStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpStatus>
      PARSER = new com.google.protobuf.AbstractParser<HttpStatus>() {
    @java.lang.Override
    public HttpStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HttpStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HttpStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.type.v3.HttpStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

