// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/aws_request_signing/v3/aws_request_signing.proto

package io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3;

/**
 * <pre>
 * Top level configuration for the AWS request signing filter.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning}
 */
public final class AwsRequestSigning extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning)
    AwsRequestSigningOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AwsRequestSigning.newBuilder() to construct.
  private AwsRequestSigning(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AwsRequestSigning() {
    serviceName_ = "";
    region_ = "";
    hostRewrite_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AwsRequestSigning();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AwsRequestSigning(
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

            serviceName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            region_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            hostRewrite_ = s;
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
    return io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigningProto.internal_static_envoy_extensions_filters_http_aws_request_signing_v3_AwsRequestSigning_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigningProto.internal_static_envoy_extensions_filters_http_aws_request_signing_v3_AwsRequestSigning_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning.class, io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning.Builder.class);
  }

  public static final int SERVICE_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object serviceName_;
  /**
   * <pre>
   * The `service namespace
   * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
   * of the HTTP endpoint.
   * Example: s3
   * </pre>
   *
   * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
   * @return The serviceName.
   */
  @java.lang.Override
  public java.lang.String getServiceName() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The `service namespace
   * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
   * of the HTTP endpoint.
   * Example: s3
   * </pre>
   *
   * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for serviceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getServiceNameBytes() {
    java.lang.Object ref = serviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REGION_FIELD_NUMBER = 2;
  private volatile java.lang.Object region_;
  /**
   * <pre>
   * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
   * endpoint.
   * Example: us-west-2
   * </pre>
   *
   * <code>string region = 2 [(.validate.rules) = { ... }</code>
   * @return The region.
   */
  @java.lang.Override
  public java.lang.String getRegion() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      region_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
   * endpoint.
   * Example: us-west-2
   * </pre>
   *
   * <code>string region = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for region.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRegionBytes() {
    java.lang.Object ref = region_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      region_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HOST_REWRITE_FIELD_NUMBER = 3;
  private volatile java.lang.Object hostRewrite_;
  /**
   * <pre>
   * Indicates that before signing headers, the host header will be swapped with
   * this value. If not set or empty, the original host header value
   * will be used and no rewrite will happen.
   * Note: this rewrite affects both signing and host header forwarding. However, this
   * option shouldn't be used with
   * :ref:`HCM host rewrite &lt;envoy_api_field_config.route.v3.RouteAction.host_rewrite_literal&gt;` given that the
   * value set here would be used for signing whereas the value set in the HCM would be used
   * for host header forwarding which is not the desired outcome.
   * </pre>
   *
   * <code>string host_rewrite = 3;</code>
   * @return The hostRewrite.
   */
  @java.lang.Override
  public java.lang.String getHostRewrite() {
    java.lang.Object ref = hostRewrite_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostRewrite_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Indicates that before signing headers, the host header will be swapped with
   * this value. If not set or empty, the original host header value
   * will be used and no rewrite will happen.
   * Note: this rewrite affects both signing and host header forwarding. However, this
   * option shouldn't be used with
   * :ref:`HCM host rewrite &lt;envoy_api_field_config.route.v3.RouteAction.host_rewrite_literal&gt;` given that the
   * value set here would be used for signing whereas the value set in the HCM would be used
   * for host header forwarding which is not the desired outcome.
   * </pre>
   *
   * <code>string host_rewrite = 3;</code>
   * @return The bytes for hostRewrite.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostRewriteBytes() {
    java.lang.Object ref = hostRewrite_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostRewrite_ = b;
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
    if (!getServiceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, serviceName_);
    }
    if (!getRegionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, region_);
    }
    if (!getHostRewriteBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, hostRewrite_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getServiceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, serviceName_);
    }
    if (!getRegionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, region_);
    }
    if (!getHostRewriteBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, hostRewrite_);
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning other = (io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning) obj;

    if (!getServiceName()
        .equals(other.getServiceName())) return false;
    if (!getRegion()
        .equals(other.getRegion())) return false;
    if (!getHostRewrite()
        .equals(other.getHostRewrite())) return false;
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
    hash = (37 * hash) + SERVICE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceName().hashCode();
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + getRegion().hashCode();
    hash = (37 * hash) + HOST_REWRITE_FIELD_NUMBER;
    hash = (53 * hash) + getHostRewrite().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning prototype) {
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
   * Top level configuration for the AWS request signing filter.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning)
      io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigningOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigningProto.internal_static_envoy_extensions_filters_http_aws_request_signing_v3_AwsRequestSigning_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigningProto.internal_static_envoy_extensions_filters_http_aws_request_signing_v3_AwsRequestSigning_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning.class, io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning.newBuilder()
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
      serviceName_ = "";

      region_ = "";

      hostRewrite_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigningProto.internal_static_envoy_extensions_filters_http_aws_request_signing_v3_AwsRequestSigning_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning build() {
      io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning buildPartial() {
      io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning result = new io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning(this);
      result.serviceName_ = serviceName_;
      result.region_ = region_;
      result.hostRewrite_ = hostRewrite_;
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning other) {
      if (other == io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning.getDefaultInstance()) return this;
      if (!other.getServiceName().isEmpty()) {
        serviceName_ = other.serviceName_;
        onChanged();
      }
      if (!other.getRegion().isEmpty()) {
        region_ = other.region_;
        onChanged();
      }
      if (!other.getHostRewrite().isEmpty()) {
        hostRewrite_ = other.hostRewrite_;
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
      io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object serviceName_ = "";
    /**
     * <pre>
     * The `service namespace
     * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
     * of the HTTP endpoint.
     * Example: s3
     * </pre>
     *
     * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
     * @return The serviceName.
     */
    public java.lang.String getServiceName() {
      java.lang.Object ref = serviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The `service namespace
     * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
     * of the HTTP endpoint.
     * Example: s3
     * </pre>
     *
     * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for serviceName.
     */
    public com.google.protobuf.ByteString
        getServiceNameBytes() {
      java.lang.Object ref = serviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The `service namespace
     * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
     * of the HTTP endpoint.
     * Example: s3
     * </pre>
     *
     * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
     * @param value The serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The `service namespace
     * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
     * of the HTTP endpoint.
     * Example: s3
     * </pre>
     *
     * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearServiceName() {
      
      serviceName_ = getDefaultInstance().getServiceName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The `service namespace
     * &lt;https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces&gt;`_
     * of the HTTP endpoint.
     * Example: s3
     * </pre>
     *
     * <code>string service_name = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for serviceName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object region_ = "";
    /**
     * <pre>
     * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
     * endpoint.
     * Example: us-west-2
     * </pre>
     *
     * <code>string region = 2 [(.validate.rules) = { ... }</code>
     * @return The region.
     */
    public java.lang.String getRegion() {
      java.lang.Object ref = region_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        region_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
     * endpoint.
     * Example: us-west-2
     * </pre>
     *
     * <code>string region = 2 [(.validate.rules) = { ... }</code>
     * @return The bytes for region.
     */
    public com.google.protobuf.ByteString
        getRegionBytes() {
      java.lang.Object ref = region_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        region_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
     * endpoint.
     * Example: us-west-2
     * </pre>
     *
     * <code>string region = 2 [(.validate.rules) = { ... }</code>
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      region_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
     * endpoint.
     * Example: us-west-2
     * </pre>
     *
     * <code>string region = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearRegion() {
      
      region_ = getDefaultInstance().getRegion();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The `region &lt;https://docs.aws.amazon.com/general/latest/gr/rande.html&gt;`_ hosting the HTTP
     * endpoint.
     * Example: us-west-2
     * </pre>
     *
     * <code>string region = 2 [(.validate.rules) = { ... }</code>
     * @param value The bytes for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      region_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object hostRewrite_ = "";
    /**
     * <pre>
     * Indicates that before signing headers, the host header will be swapped with
     * this value. If not set or empty, the original host header value
     * will be used and no rewrite will happen.
     * Note: this rewrite affects both signing and host header forwarding. However, this
     * option shouldn't be used with
     * :ref:`HCM host rewrite &lt;envoy_api_field_config.route.v3.RouteAction.host_rewrite_literal&gt;` given that the
     * value set here would be used for signing whereas the value set in the HCM would be used
     * for host header forwarding which is not the desired outcome.
     * </pre>
     *
     * <code>string host_rewrite = 3;</code>
     * @return The hostRewrite.
     */
    public java.lang.String getHostRewrite() {
      java.lang.Object ref = hostRewrite_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostRewrite_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Indicates that before signing headers, the host header will be swapped with
     * this value. If not set or empty, the original host header value
     * will be used and no rewrite will happen.
     * Note: this rewrite affects both signing and host header forwarding. However, this
     * option shouldn't be used with
     * :ref:`HCM host rewrite &lt;envoy_api_field_config.route.v3.RouteAction.host_rewrite_literal&gt;` given that the
     * value set here would be used for signing whereas the value set in the HCM would be used
     * for host header forwarding which is not the desired outcome.
     * </pre>
     *
     * <code>string host_rewrite = 3;</code>
     * @return The bytes for hostRewrite.
     */
    public com.google.protobuf.ByteString
        getHostRewriteBytes() {
      java.lang.Object ref = hostRewrite_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostRewrite_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Indicates that before signing headers, the host header will be swapped with
     * this value. If not set or empty, the original host header value
     * will be used and no rewrite will happen.
     * Note: this rewrite affects both signing and host header forwarding. However, this
     * option shouldn't be used with
     * :ref:`HCM host rewrite &lt;envoy_api_field_config.route.v3.RouteAction.host_rewrite_literal&gt;` given that the
     * value set here would be used for signing whereas the value set in the HCM would be used
     * for host header forwarding which is not the desired outcome.
     * </pre>
     *
     * <code>string host_rewrite = 3;</code>
     * @param value The hostRewrite to set.
     * @return This builder for chaining.
     */
    public Builder setHostRewrite(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hostRewrite_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates that before signing headers, the host header will be swapped with
     * this value. If not set or empty, the original host header value
     * will be used and no rewrite will happen.
     * Note: this rewrite affects both signing and host header forwarding. However, this
     * option shouldn't be used with
     * :ref:`HCM host rewrite &lt;envoy_api_field_config.route.v3.RouteAction.host_rewrite_literal&gt;` given that the
     * value set here would be used for signing whereas the value set in the HCM would be used
     * for host header forwarding which is not the desired outcome.
     * </pre>
     *
     * <code>string host_rewrite = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearHostRewrite() {
      
      hostRewrite_ = getDefaultInstance().getHostRewrite();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates that before signing headers, the host header will be swapped with
     * this value. If not set or empty, the original host header value
     * will be used and no rewrite will happen.
     * Note: this rewrite affects both signing and host header forwarding. However, this
     * option shouldn't be used with
     * :ref:`HCM host rewrite &lt;envoy_api_field_config.route.v3.RouteAction.host_rewrite_literal&gt;` given that the
     * value set here would be used for signing whereas the value set in the HCM would be used
     * for host header forwarding which is not the desired outcome.
     * </pre>
     *
     * <code>string host_rewrite = 3;</code>
     * @param value The bytes for hostRewrite to set.
     * @return This builder for chaining.
     */
    public Builder setHostRewriteBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hostRewrite_ = value;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning)
  private static final io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning();
  }

  public static io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AwsRequestSigning>
      PARSER = new com.google.protobuf.AbstractParser<AwsRequestSigning>() {
    @java.lang.Override
    public AwsRequestSigning parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AwsRequestSigning(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AwsRequestSigning> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AwsRequestSigning> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.http.aws_request_signing.v3.AwsRequestSigning getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
