// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/aws_lambda/v3/aws_lambda.proto

package io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3;

/**
 * <pre>
 * AWS Lambda filter config
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.filters.http.aws_lambda.v3.Config}
 */
public final class Config extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.http.aws_lambda.v3.Config)
    ConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Config.newBuilder() to construct.
  private Config(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Config() {
    arn_ = "";
    invocationMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Config();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Config(
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

            arn_ = s;
            break;
          }
          case 16: {

            payloadPassthrough_ = input.readBool();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            invocationMode_ = rawValue;
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
    return io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.AwsLambdaProto.internal_static_envoy_extensions_filters_http_aws_lambda_v3_Config_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.AwsLambdaProto.internal_static_envoy_extensions_filters_http_aws_lambda_v3_Config_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.class, io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.Builder.class);
  }

  /**
   * Protobuf enum {@code envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode}
   */
  public enum InvocationMode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * This is the more common mode of invocation, in which Lambda responds after it has completed the function. In
     * this mode the output of the Lambda function becomes the response of the HTTP request.
     * </pre>
     *
     * <code>SYNCHRONOUS = 0;</code>
     */
    SYNCHRONOUS(0),
    /**
     * <pre>
     * In this mode Lambda responds immediately but continues to process the function asynchronously. This mode can be
     * used to signal events for example. In this mode, Lambda responds with an acknowledgment that it received the
     * call which is translated to an HTTP 200 OK by the filter.
     * </pre>
     *
     * <code>ASYNCHRONOUS = 1;</code>
     */
    ASYNCHRONOUS(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * This is the more common mode of invocation, in which Lambda responds after it has completed the function. In
     * this mode the output of the Lambda function becomes the response of the HTTP request.
     * </pre>
     *
     * <code>SYNCHRONOUS = 0;</code>
     */
    public static final int SYNCHRONOUS_VALUE = 0;
    /**
     * <pre>
     * In this mode Lambda responds immediately but continues to process the function asynchronously. This mode can be
     * used to signal events for example. In this mode, Lambda responds with an acknowledgment that it received the
     * call which is translated to an HTTP 200 OK by the filter.
     * </pre>
     *
     * <code>ASYNCHRONOUS = 1;</code>
     */
    public static final int ASYNCHRONOUS_VALUE = 1;


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
    public static InvocationMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static InvocationMode forNumber(int value) {
      switch (value) {
        case 0: return SYNCHRONOUS;
        case 1: return ASYNCHRONOUS;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<InvocationMode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        InvocationMode> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<InvocationMode>() {
            public InvocationMode findValueByNumber(int number) {
              return InvocationMode.forNumber(number);
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
      return io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.getDescriptor().getEnumTypes().get(0);
    }

    private static final InvocationMode[] VALUES = values();

    public static InvocationMode valueOf(
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

    private InvocationMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode)
  }

  public static final int ARN_FIELD_NUMBER = 1;
  private volatile java.lang.Object arn_;
  /**
   * <pre>
   * The ARN of the AWS Lambda to invoke when the filter is engaged
   * Must be in the following format:
   * arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account-number&gt;:function:&lt;function-name&gt;
   * </pre>
   *
   * <code>string arn = 1 [(.validate.rules) = { ... }</code>
   * @return The arn.
   */
  @java.lang.Override
  public java.lang.String getArn() {
    java.lang.Object ref = arn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      arn_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The ARN of the AWS Lambda to invoke when the filter is engaged
   * Must be in the following format:
   * arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account-number&gt;:function:&lt;function-name&gt;
   * </pre>
   *
   * <code>string arn = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for arn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getArnBytes() {
    java.lang.Object ref = arn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      arn_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PAYLOAD_PASSTHROUGH_FIELD_NUMBER = 2;
  private boolean payloadPassthrough_;
  /**
   * <pre>
   * Whether to transform the request (headers and body) to a JSON payload or pass it as is.
   * </pre>
   *
   * <code>bool payload_passthrough = 2;</code>
   * @return The payloadPassthrough.
   */
  @java.lang.Override
  public boolean getPayloadPassthrough() {
    return payloadPassthrough_;
  }

  public static final int INVOCATION_MODE_FIELD_NUMBER = 3;
  private int invocationMode_;
  /**
   * <pre>
   * Determines the way to invoke the Lambda function.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode invocation_mode = 3 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for invocationMode.
   */
  @java.lang.Override public int getInvocationModeValue() {
    return invocationMode_;
  }
  /**
   * <pre>
   * Determines the way to invoke the Lambda function.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode invocation_mode = 3 [(.validate.rules) = { ... }</code>
   * @return The invocationMode.
   */
  @java.lang.Override public io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode getInvocationMode() {
    @SuppressWarnings("deprecation")
    io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode result = io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode.valueOf(invocationMode_);
    return result == null ? io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode.UNRECOGNIZED : result;
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
    if (!getArnBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, arn_);
    }
    if (payloadPassthrough_ != false) {
      output.writeBool(2, payloadPassthrough_);
    }
    if (invocationMode_ != io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode.SYNCHRONOUS.getNumber()) {
      output.writeEnum(3, invocationMode_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getArnBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, arn_);
    }
    if (payloadPassthrough_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, payloadPassthrough_);
    }
    if (invocationMode_ != io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode.SYNCHRONOUS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, invocationMode_);
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config other = (io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config) obj;

    if (!getArn()
        .equals(other.getArn())) return false;
    if (getPayloadPassthrough()
        != other.getPayloadPassthrough()) return false;
    if (invocationMode_ != other.invocationMode_) return false;
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
    hash = (37 * hash) + ARN_FIELD_NUMBER;
    hash = (53 * hash) + getArn().hashCode();
    hash = (37 * hash) + PAYLOAD_PASSTHROUGH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPayloadPassthrough());
    hash = (37 * hash) + INVOCATION_MODE_FIELD_NUMBER;
    hash = (53 * hash) + invocationMode_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config prototype) {
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
   * AWS Lambda filter config
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.filters.http.aws_lambda.v3.Config}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.http.aws_lambda.v3.Config)
      io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.ConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.AwsLambdaProto.internal_static_envoy_extensions_filters_http_aws_lambda_v3_Config_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.AwsLambdaProto.internal_static_envoy_extensions_filters_http_aws_lambda_v3_Config_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.class, io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.newBuilder()
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
      arn_ = "";

      payloadPassthrough_ = false;

      invocationMode_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.AwsLambdaProto.internal_static_envoy_extensions_filters_http_aws_lambda_v3_Config_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config build() {
      io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config buildPartial() {
      io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config result = new io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config(this);
      result.arn_ = arn_;
      result.payloadPassthrough_ = payloadPassthrough_;
      result.invocationMode_ = invocationMode_;
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config other) {
      if (other == io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.getDefaultInstance()) return this;
      if (!other.getArn().isEmpty()) {
        arn_ = other.arn_;
        onChanged();
      }
      if (other.getPayloadPassthrough() != false) {
        setPayloadPassthrough(other.getPayloadPassthrough());
      }
      if (other.invocationMode_ != 0) {
        setInvocationModeValue(other.getInvocationModeValue());
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
      io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object arn_ = "";
    /**
     * <pre>
     * The ARN of the AWS Lambda to invoke when the filter is engaged
     * Must be in the following format:
     * arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account-number&gt;:function:&lt;function-name&gt;
     * </pre>
     *
     * <code>string arn = 1 [(.validate.rules) = { ... }</code>
     * @return The arn.
     */
    public java.lang.String getArn() {
      java.lang.Object ref = arn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        arn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The ARN of the AWS Lambda to invoke when the filter is engaged
     * Must be in the following format:
     * arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account-number&gt;:function:&lt;function-name&gt;
     * </pre>
     *
     * <code>string arn = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for arn.
     */
    public com.google.protobuf.ByteString
        getArnBytes() {
      java.lang.Object ref = arn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        arn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The ARN of the AWS Lambda to invoke when the filter is engaged
     * Must be in the following format:
     * arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account-number&gt;:function:&lt;function-name&gt;
     * </pre>
     *
     * <code>string arn = 1 [(.validate.rules) = { ... }</code>
     * @param value The arn to set.
     * @return This builder for chaining.
     */
    public Builder setArn(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      arn_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ARN of the AWS Lambda to invoke when the filter is engaged
     * Must be in the following format:
     * arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account-number&gt;:function:&lt;function-name&gt;
     * </pre>
     *
     * <code>string arn = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearArn() {
      
      arn_ = getDefaultInstance().getArn();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The ARN of the AWS Lambda to invoke when the filter is engaged
     * Must be in the following format:
     * arn:&lt;partition&gt;:lambda:&lt;region&gt;:&lt;account-number&gt;:function:&lt;function-name&gt;
     * </pre>
     *
     * <code>string arn = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for arn to set.
     * @return This builder for chaining.
     */
    public Builder setArnBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      arn_ = value;
      onChanged();
      return this;
    }

    private boolean payloadPassthrough_ ;
    /**
     * <pre>
     * Whether to transform the request (headers and body) to a JSON payload or pass it as is.
     * </pre>
     *
     * <code>bool payload_passthrough = 2;</code>
     * @return The payloadPassthrough.
     */
    @java.lang.Override
    public boolean getPayloadPassthrough() {
      return payloadPassthrough_;
    }
    /**
     * <pre>
     * Whether to transform the request (headers and body) to a JSON payload or pass it as is.
     * </pre>
     *
     * <code>bool payload_passthrough = 2;</code>
     * @param value The payloadPassthrough to set.
     * @return This builder for chaining.
     */
    public Builder setPayloadPassthrough(boolean value) {
      
      payloadPassthrough_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Whether to transform the request (headers and body) to a JSON payload or pass it as is.
     * </pre>
     *
     * <code>bool payload_passthrough = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPayloadPassthrough() {
      
      payloadPassthrough_ = false;
      onChanged();
      return this;
    }

    private int invocationMode_ = 0;
    /**
     * <pre>
     * Determines the way to invoke the Lambda function.
     * </pre>
     *
     * <code>.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode invocation_mode = 3 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for invocationMode.
     */
    @java.lang.Override public int getInvocationModeValue() {
      return invocationMode_;
    }
    /**
     * <pre>
     * Determines the way to invoke the Lambda function.
     * </pre>
     *
     * <code>.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode invocation_mode = 3 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for invocationMode to set.
     * @return This builder for chaining.
     */
    public Builder setInvocationModeValue(int value) {
      
      invocationMode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Determines the way to invoke the Lambda function.
     * </pre>
     *
     * <code>.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode invocation_mode = 3 [(.validate.rules) = { ... }</code>
     * @return The invocationMode.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode getInvocationMode() {
      @SuppressWarnings("deprecation")
      io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode result = io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode.valueOf(invocationMode_);
      return result == null ? io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Determines the way to invoke the Lambda function.
     * </pre>
     *
     * <code>.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode invocation_mode = 3 [(.validate.rules) = { ... }</code>
     * @param value The invocationMode to set.
     * @return This builder for chaining.
     */
    public Builder setInvocationMode(io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      invocationMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Determines the way to invoke the Lambda function.
     * </pre>
     *
     * <code>.envoy.extensions.filters.http.aws_lambda.v3.Config.InvocationMode invocation_mode = 3 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearInvocationMode() {
      
      invocationMode_ = 0;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.http.aws_lambda.v3.Config)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.aws_lambda.v3.Config)
  private static final io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config();
  }

  public static io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Config>
      PARSER = new com.google.protobuf.AbstractParser<Config>() {
    @java.lang.Override
    public Config parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Config(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Config> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Config> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.http.aws_lambda.v3.Config getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

