// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/grpc_http1_reverse_bridge/v3/config.proto

package io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3;

/**
 * <pre>
 * gRPC reverse bridge filter configuration per virtualhost/route/weighted-cluster level.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute}
 */
public final class FilterConfigPerRoute extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute)
    FilterConfigPerRouteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FilterConfigPerRoute.newBuilder() to construct.
  private FilterConfigPerRoute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FilterConfigPerRoute() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FilterConfigPerRoute();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FilterConfigPerRoute(
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

            disabled_ = input.readBool();
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
    return io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.ConfigProto.internal_static_envoy_extensions_filters_http_grpc_http1_reverse_bridge_v3_FilterConfigPerRoute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.ConfigProto.internal_static_envoy_extensions_filters_http_grpc_http1_reverse_bridge_v3_FilterConfigPerRoute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute.class, io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute.Builder.class);
  }

  public static final int DISABLED_FIELD_NUMBER = 1;
  private boolean disabled_;
  /**
   * <pre>
   * If true, disables gRPC reverse bridge filter for this particular vhost or route.
   * If disabled is specified in multiple per-filter-configs, the most specific one will be used.
   * </pre>
   *
   * <code>bool disabled = 1;</code>
   * @return The disabled.
   */
  @java.lang.Override
  public boolean getDisabled() {
    return disabled_;
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
    if (disabled_ != false) {
      output.writeBool(1, disabled_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (disabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, disabled_);
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute other = (io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute) obj;

    if (getDisabled()
        != other.getDisabled()) return false;
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
    hash = (37 * hash) + DISABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDisabled());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute prototype) {
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
   * gRPC reverse bridge filter configuration per virtualhost/route/weighted-cluster level.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute)
      io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRouteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.ConfigProto.internal_static_envoy_extensions_filters_http_grpc_http1_reverse_bridge_v3_FilterConfigPerRoute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.ConfigProto.internal_static_envoy_extensions_filters_http_grpc_http1_reverse_bridge_v3_FilterConfigPerRoute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute.class, io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute.newBuilder()
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
      disabled_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.ConfigProto.internal_static_envoy_extensions_filters_http_grpc_http1_reverse_bridge_v3_FilterConfigPerRoute_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute build() {
      io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute buildPartial() {
      io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute result = new io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute(this);
      result.disabled_ = disabled_;
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute other) {
      if (other == io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute.getDefaultInstance()) return this;
      if (other.getDisabled() != false) {
        setDisabled(other.getDisabled());
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
      io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean disabled_ ;
    /**
     * <pre>
     * If true, disables gRPC reverse bridge filter for this particular vhost or route.
     * If disabled is specified in multiple per-filter-configs, the most specific one will be used.
     * </pre>
     *
     * <code>bool disabled = 1;</code>
     * @return The disabled.
     */
    @java.lang.Override
    public boolean getDisabled() {
      return disabled_;
    }
    /**
     * <pre>
     * If true, disables gRPC reverse bridge filter for this particular vhost or route.
     * If disabled is specified in multiple per-filter-configs, the most specific one will be used.
     * </pre>
     *
     * <code>bool disabled = 1;</code>
     * @param value The disabled to set.
     * @return This builder for chaining.
     */
    public Builder setDisabled(boolean value) {
      
      disabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If true, disables gRPC reverse bridge filter for this particular vhost or route.
     * If disabled is specified in multiple per-filter-configs, the most specific one will be used.
     * </pre>
     *
     * <code>bool disabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDisabled() {
      
      disabled_ = false;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute)
  private static final io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute();
  }

  public static io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FilterConfigPerRoute>
      PARSER = new com.google.protobuf.AbstractParser<FilterConfigPerRoute>() {
    @java.lang.Override
    public FilterConfigPerRoute parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FilterConfigPerRoute(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FilterConfigPerRoute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FilterConfigPerRoute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.http.grpc_http1_reverse_bridge.v3.FilterConfigPerRoute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

