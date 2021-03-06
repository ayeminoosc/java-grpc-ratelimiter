// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/dubbo_proxy/v3/route.proto

package io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3;

/**
 * Protobuf type {@code envoy.extensions.filters.network.dubbo_proxy.v3.Route}
 */
public final class Route extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.network.dubbo_proxy.v3.Route)
    RouteOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Route.newBuilder() to construct.
  private Route(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Route() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Route();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Route(
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
            io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch.Builder subBuilder = null;
            if (match_ != null) {
              subBuilder = match_.toBuilder();
            }
            match_ = input.readMessage(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(match_);
              match_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.Builder subBuilder = null;
            if (route_ != null) {
              subBuilder = route_.toBuilder();
            }
            route_ = input.readMessage(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(route_);
              route_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_Route_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_Route_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route.class, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route.Builder.class);
  }

  public static final int MATCH_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match_;
  /**
   * <pre>
   * Route matching parameters.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the match field is set.
   */
  @java.lang.Override
  public boolean hasMatch() {
    return match_ != null;
  }
  /**
   * <pre>
   * Route matching parameters.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match = 1 [(.validate.rules) = { ... }</code>
   * @return The match.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch getMatch() {
    return match_ == null ? io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch.getDefaultInstance() : match_;
  }
  /**
   * <pre>
   * Route matching parameters.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatchOrBuilder getMatchOrBuilder() {
    return getMatch();
  }

  public static final int ROUTE_FIELD_NUMBER = 2;
  private io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route_;
  /**
   * <pre>
   * Route request to some upstream cluster.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the route field is set.
   */
  @java.lang.Override
  public boolean hasRoute() {
    return route_ != null;
  }
  /**
   * <pre>
   * Route request to some upstream cluster.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route = 2 [(.validate.rules) = { ... }</code>
   * @return The route.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction getRoute() {
    return route_ == null ? io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.getDefaultInstance() : route_;
  }
  /**
   * <pre>
   * Route request to some upstream cluster.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteActionOrBuilder getRouteOrBuilder() {
    return getRoute();
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
    if (match_ != null) {
      output.writeMessage(1, getMatch());
    }
    if (route_ != null) {
      output.writeMessage(2, getRoute());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (match_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMatch());
    }
    if (route_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRoute());
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route other = (io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route) obj;

    if (hasMatch() != other.hasMatch()) return false;
    if (hasMatch()) {
      if (!getMatch()
          .equals(other.getMatch())) return false;
    }
    if (hasRoute() != other.hasRoute()) return false;
    if (hasRoute()) {
      if (!getRoute()
          .equals(other.getRoute())) return false;
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
    if (hasMatch()) {
      hash = (37 * hash) + MATCH_FIELD_NUMBER;
      hash = (53 * hash) + getMatch().hashCode();
    }
    if (hasRoute()) {
      hash = (37 * hash) + ROUTE_FIELD_NUMBER;
      hash = (53 * hash) + getRoute().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route prototype) {
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
   * Protobuf type {@code envoy.extensions.filters.network.dubbo_proxy.v3.Route}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.network.dubbo_proxy.v3.Route)
      io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_Route_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_Route_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route.class, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route.newBuilder()
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
      if (matchBuilder_ == null) {
        match_ = null;
      } else {
        match_ = null;
        matchBuilder_ = null;
      }
      if (routeBuilder_ == null) {
        route_ = null;
      } else {
        route_ = null;
        routeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_Route_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route build() {
      io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route buildPartial() {
      io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route result = new io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route(this);
      if (matchBuilder_ == null) {
        result.match_ = match_;
      } else {
        result.match_ = matchBuilder_.build();
      }
      if (routeBuilder_ == null) {
        result.route_ = route_;
      } else {
        result.route_ = routeBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route other) {
      if (other == io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route.getDefaultInstance()) return this;
      if (other.hasMatch()) {
        mergeMatch(other.getMatch());
      }
      if (other.hasRoute()) {
        mergeRoute(other.getRoute());
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
      io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch.Builder, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatchOrBuilder> matchBuilder_;
    /**
     * <pre>
     * Route matching parameters.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the match field is set.
     */
    public boolean hasMatch() {
      return matchBuilder_ != null || match_ != null;
    }
    /**
     * <pre>
     * Route matching parameters.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match = 1 [(.validate.rules) = { ... }</code>
     * @return The match.
     */
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch getMatch() {
      if (matchBuilder_ == null) {
        return match_ == null ? io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch.getDefaultInstance() : match_;
      } else {
        return matchBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Route matching parameters.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setMatch(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch value) {
      if (matchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        match_ = value;
        onChanged();
      } else {
        matchBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Route matching parameters.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setMatch(
        io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch.Builder builderForValue) {
      if (matchBuilder_ == null) {
        match_ = builderForValue.build();
        onChanged();
      } else {
        matchBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Route matching parameters.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeMatch(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch value) {
      if (matchBuilder_ == null) {
        if (match_ != null) {
          match_ =
            io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch.newBuilder(match_).mergeFrom(value).buildPartial();
        } else {
          match_ = value;
        }
        onChanged();
      } else {
        matchBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Route matching parameters.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearMatch() {
      if (matchBuilder_ == null) {
        match_ = null;
        onChanged();
      } else {
        match_ = null;
        matchBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Route matching parameters.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch.Builder getMatchBuilder() {
      
      onChanged();
      return getMatchFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Route matching parameters.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatchOrBuilder getMatchOrBuilder() {
      if (matchBuilder_ != null) {
        return matchBuilder_.getMessageOrBuilder();
      } else {
        return match_ == null ?
            io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch.getDefaultInstance() : match_;
      }
    }
    /**
     * <pre>
     * Route matching parameters.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch match = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch.Builder, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatchOrBuilder> 
        getMatchFieldBuilder() {
      if (matchBuilder_ == null) {
        matchBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatch.Builder, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteMatchOrBuilder>(
                getMatch(),
                getParentForChildren(),
                isClean());
        match_ = null;
      }
      return matchBuilder_;
    }

    private io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.Builder, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteActionOrBuilder> routeBuilder_;
    /**
     * <pre>
     * Route request to some upstream cluster.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route = 2 [(.validate.rules) = { ... }</code>
     * @return Whether the route field is set.
     */
    public boolean hasRoute() {
      return routeBuilder_ != null || route_ != null;
    }
    /**
     * <pre>
     * Route request to some upstream cluster.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route = 2 [(.validate.rules) = { ... }</code>
     * @return The route.
     */
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction getRoute() {
      if (routeBuilder_ == null) {
        return route_ == null ? io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.getDefaultInstance() : route_;
      } else {
        return routeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Route request to some upstream cluster.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setRoute(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction value) {
      if (routeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        route_ = value;
        onChanged();
      } else {
        routeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Route request to some upstream cluster.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setRoute(
        io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.Builder builderForValue) {
      if (routeBuilder_ == null) {
        route_ = builderForValue.build();
        onChanged();
      } else {
        routeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Route request to some upstream cluster.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeRoute(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction value) {
      if (routeBuilder_ == null) {
        if (route_ != null) {
          route_ =
            io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.newBuilder(route_).mergeFrom(value).buildPartial();
        } else {
          route_ = value;
        }
        onChanged();
      } else {
        routeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Route request to some upstream cluster.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearRoute() {
      if (routeBuilder_ == null) {
        route_ = null;
        onChanged();
      } else {
        route_ = null;
        routeBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Route request to some upstream cluster.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route = 2 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.Builder getRouteBuilder() {
      
      onChanged();
      return getRouteFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Route request to some upstream cluster.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route = 2 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteActionOrBuilder getRouteOrBuilder() {
      if (routeBuilder_ != null) {
        return routeBuilder_.getMessageOrBuilder();
      } else {
        return route_ == null ?
            io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.getDefaultInstance() : route_;
      }
    }
    /**
     * <pre>
     * Route request to some upstream cluster.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction route = 2 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.Builder, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteActionOrBuilder> 
        getRouteFieldBuilder() {
      if (routeBuilder_ == null) {
        routeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.Builder, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteActionOrBuilder>(
                getRoute(),
                getParentForChildren(),
                isClean());
        route_ = null;
      }
      return routeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.network.dubbo_proxy.v3.Route)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.dubbo_proxy.v3.Route)
  private static final io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route();
  }

  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Route>
      PARSER = new com.google.protobuf.AbstractParser<Route>() {
    @java.lang.Override
    public Route parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Route(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Route> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Route> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.Route getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

