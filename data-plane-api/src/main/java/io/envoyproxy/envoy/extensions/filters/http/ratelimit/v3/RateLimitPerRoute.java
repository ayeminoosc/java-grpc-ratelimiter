// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/ratelimit/v3/rate_limit.proto

package io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3;

/**
 * Protobuf type {@code envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute}
 */
public final class RateLimitPerRoute extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute)
    RateLimitPerRouteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RateLimitPerRoute.newBuilder() to construct.
  private RateLimitPerRoute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RateLimitPerRoute() {
    vhRateLimits_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RateLimitPerRoute();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RateLimitPerRoute(
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

            vhRateLimits_ = rawValue;
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
    return io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitProto.internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitProto.internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.class, io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.Builder.class);
  }

  /**
   * Protobuf enum {@code envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions}
   */
  public enum VhRateLimitsOptions
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Use the virtual host rate limits unless the route has a rate limit policy.
     * </pre>
     *
     * <code>OVERRIDE = 0;</code>
     */
    OVERRIDE(0),
    /**
     * <pre>
     * Use the virtual host rate limits even if the route has a rate limit policy.
     * </pre>
     *
     * <code>INCLUDE = 1;</code>
     */
    INCLUDE(1),
    /**
     * <pre>
     * Ignore the virtual host rate limits even if the route does not have a rate limit policy.
     * </pre>
     *
     * <code>IGNORE = 2;</code>
     */
    IGNORE(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Use the virtual host rate limits unless the route has a rate limit policy.
     * </pre>
     *
     * <code>OVERRIDE = 0;</code>
     */
    public static final int OVERRIDE_VALUE = 0;
    /**
     * <pre>
     * Use the virtual host rate limits even if the route has a rate limit policy.
     * </pre>
     *
     * <code>INCLUDE = 1;</code>
     */
    public static final int INCLUDE_VALUE = 1;
    /**
     * <pre>
     * Ignore the virtual host rate limits even if the route does not have a rate limit policy.
     * </pre>
     *
     * <code>IGNORE = 2;</code>
     */
    public static final int IGNORE_VALUE = 2;


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
    public static VhRateLimitsOptions valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static VhRateLimitsOptions forNumber(int value) {
      switch (value) {
        case 0: return OVERRIDE;
        case 1: return INCLUDE;
        case 2: return IGNORE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VhRateLimitsOptions>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        VhRateLimitsOptions> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VhRateLimitsOptions>() {
            public VhRateLimitsOptions findValueByNumber(int number) {
              return VhRateLimitsOptions.forNumber(number);
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
      return io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.getDescriptor().getEnumTypes().get(0);
    }

    private static final VhRateLimitsOptions[] VALUES = values();

    public static VhRateLimitsOptions valueOf(
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

    private VhRateLimitsOptions(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions)
  }

  public static final int VH_RATE_LIMITS_FIELD_NUMBER = 1;
  private int vhRateLimits_;
  /**
   * <pre>
   * Specifies if the rate limit filter should include the virtual host rate limits.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions vh_rate_limits = 1 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for vhRateLimits.
   */
  @java.lang.Override public int getVhRateLimitsValue() {
    return vhRateLimits_;
  }
  /**
   * <pre>
   * Specifies if the rate limit filter should include the virtual host rate limits.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions vh_rate_limits = 1 [(.validate.rules) = { ... }</code>
   * @return The vhRateLimits.
   */
  @java.lang.Override public io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions getVhRateLimits() {
    @SuppressWarnings("deprecation")
    io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions result = io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions.valueOf(vhRateLimits_);
    return result == null ? io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions.UNRECOGNIZED : result;
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
    if (vhRateLimits_ != io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions.OVERRIDE.getNumber()) {
      output.writeEnum(1, vhRateLimits_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (vhRateLimits_ != io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions.OVERRIDE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, vhRateLimits_);
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute other = (io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute) obj;

    if (vhRateLimits_ != other.vhRateLimits_) return false;
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
    hash = (37 * hash) + VH_RATE_LIMITS_FIELD_NUMBER;
    hash = (53 * hash) + vhRateLimits_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute prototype) {
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
   * Protobuf type {@code envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute)
      io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRouteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitProto.internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitProto.internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.class, io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.newBuilder()
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
      vhRateLimits_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitProto.internal_static_envoy_extensions_filters_http_ratelimit_v3_RateLimitPerRoute_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute build() {
      io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute buildPartial() {
      io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute result = new io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute(this);
      result.vhRateLimits_ = vhRateLimits_;
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute other) {
      if (other == io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.getDefaultInstance()) return this;
      if (other.vhRateLimits_ != 0) {
        setVhRateLimitsValue(other.getVhRateLimitsValue());
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
      io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int vhRateLimits_ = 0;
    /**
     * <pre>
     * Specifies if the rate limit filter should include the virtual host rate limits.
     * </pre>
     *
     * <code>.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions vh_rate_limits = 1 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for vhRateLimits.
     */
    @java.lang.Override public int getVhRateLimitsValue() {
      return vhRateLimits_;
    }
    /**
     * <pre>
     * Specifies if the rate limit filter should include the virtual host rate limits.
     * </pre>
     *
     * <code>.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions vh_rate_limits = 1 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for vhRateLimits to set.
     * @return This builder for chaining.
     */
    public Builder setVhRateLimitsValue(int value) {
      
      vhRateLimits_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies if the rate limit filter should include the virtual host rate limits.
     * </pre>
     *
     * <code>.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions vh_rate_limits = 1 [(.validate.rules) = { ... }</code>
     * @return The vhRateLimits.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions getVhRateLimits() {
      @SuppressWarnings("deprecation")
      io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions result = io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions.valueOf(vhRateLimits_);
      return result == null ? io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Specifies if the rate limit filter should include the virtual host rate limits.
     * </pre>
     *
     * <code>.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions vh_rate_limits = 1 [(.validate.rules) = { ... }</code>
     * @param value The vhRateLimits to set.
     * @return This builder for chaining.
     */
    public Builder setVhRateLimits(io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      vhRateLimits_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies if the rate limit filter should include the virtual host rate limits.
     * </pre>
     *
     * <code>.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute.VhRateLimitsOptions vh_rate_limits = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearVhRateLimits() {
      
      vhRateLimits_ = 0;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute)
  private static final io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute();
  }

  public static io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RateLimitPerRoute>
      PARSER = new com.google.protobuf.AbstractParser<RateLimitPerRoute>() {
    @java.lang.Override
    public RateLimitPerRoute parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RateLimitPerRoute(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RateLimitPerRoute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RateLimitPerRoute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.http.ratelimit.v3.RateLimitPerRoute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
