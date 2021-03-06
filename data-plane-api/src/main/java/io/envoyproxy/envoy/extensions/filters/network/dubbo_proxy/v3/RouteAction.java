// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/dubbo_proxy/v3/route.proto

package io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3;

/**
 * Protobuf type {@code envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction}
 */
public final class RouteAction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction)
    RouteActionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RouteAction.newBuilder() to construct.
  private RouteAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RouteAction() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RouteAction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RouteAction(
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
            clusterSpecifierCase_ = 1;
            clusterSpecifier_ = s;
            break;
          }
          case 18: {
            io.envoyproxy.envoy.config.route.v3.WeightedCluster.Builder subBuilder = null;
            if (clusterSpecifierCase_ == 2) {
              subBuilder = ((io.envoyproxy.envoy.config.route.v3.WeightedCluster) clusterSpecifier_).toBuilder();
            }
            clusterSpecifier_ =
                input.readMessage(io.envoyproxy.envoy.config.route.v3.WeightedCluster.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.envoyproxy.envoy.config.route.v3.WeightedCluster) clusterSpecifier_);
              clusterSpecifier_ = subBuilder.buildPartial();
            }
            clusterSpecifierCase_ = 2;
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
    return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_RouteAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_RouteAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.class, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.Builder.class);
  }

  private int clusterSpecifierCase_ = 0;
  private java.lang.Object clusterSpecifier_;
  public enum ClusterSpecifierCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CLUSTER(1),
    WEIGHTED_CLUSTERS(2),
    CLUSTERSPECIFIER_NOT_SET(0);
    private final int value;
    private ClusterSpecifierCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ClusterSpecifierCase valueOf(int value) {
      return forNumber(value);
    }

    public static ClusterSpecifierCase forNumber(int value) {
      switch (value) {
        case 1: return CLUSTER;
        case 2: return WEIGHTED_CLUSTERS;
        case 0: return CLUSTERSPECIFIER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ClusterSpecifierCase
  getClusterSpecifierCase() {
    return ClusterSpecifierCase.forNumber(
        clusterSpecifierCase_);
  }

  public static final int CLUSTER_FIELD_NUMBER = 1;
  /**
   * <pre>
   * Indicates the upstream cluster to which the request should be routed.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   * @return Whether the cluster field is set.
   */
  public boolean hasCluster() {
    return clusterSpecifierCase_ == 1;
  }
  /**
   * <pre>
   * Indicates the upstream cluster to which the request should be routed.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   * @return The cluster.
   */
  public java.lang.String getCluster() {
    java.lang.Object ref = "";
    if (clusterSpecifierCase_ == 1) {
      ref = clusterSpecifier_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (clusterSpecifierCase_ == 1) {
        clusterSpecifier_ = s;
      }
      return s;
    }
  }
  /**
   * <pre>
   * Indicates the upstream cluster to which the request should be routed.
   * </pre>
   *
   * <code>string cluster = 1;</code>
   * @return The bytes for cluster.
   */
  public com.google.protobuf.ByteString
      getClusterBytes() {
    java.lang.Object ref = "";
    if (clusterSpecifierCase_ == 1) {
      ref = clusterSpecifier_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (clusterSpecifierCase_ == 1) {
        clusterSpecifier_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WEIGHTED_CLUSTERS_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Multiple upstream clusters can be specified for a given route. The
   * request is routed to one of the upstream clusters based on weights
   * assigned to each cluster.
   * Currently ClusterWeight only supports the name and weight fields.
   * </pre>
   *
   * <code>.envoy.config.route.v3.WeightedCluster weighted_clusters = 2;</code>
   * @return Whether the weightedClusters field is set.
   */
  @java.lang.Override
  public boolean hasWeightedClusters() {
    return clusterSpecifierCase_ == 2;
  }
  /**
   * <pre>
   * Multiple upstream clusters can be specified for a given route. The
   * request is routed to one of the upstream clusters based on weights
   * assigned to each cluster.
   * Currently ClusterWeight only supports the name and weight fields.
   * </pre>
   *
   * <code>.envoy.config.route.v3.WeightedCluster weighted_clusters = 2;</code>
   * @return The weightedClusters.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.route.v3.WeightedCluster getWeightedClusters() {
    if (clusterSpecifierCase_ == 2) {
       return (io.envoyproxy.envoy.config.route.v3.WeightedCluster) clusterSpecifier_;
    }
    return io.envoyproxy.envoy.config.route.v3.WeightedCluster.getDefaultInstance();
  }
  /**
   * <pre>
   * Multiple upstream clusters can be specified for a given route. The
   * request is routed to one of the upstream clusters based on weights
   * assigned to each cluster.
   * Currently ClusterWeight only supports the name and weight fields.
   * </pre>
   *
   * <code>.envoy.config.route.v3.WeightedCluster weighted_clusters = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.route.v3.WeightedClusterOrBuilder getWeightedClustersOrBuilder() {
    if (clusterSpecifierCase_ == 2) {
       return (io.envoyproxy.envoy.config.route.v3.WeightedCluster) clusterSpecifier_;
    }
    return io.envoyproxy.envoy.config.route.v3.WeightedCluster.getDefaultInstance();
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
    if (clusterSpecifierCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clusterSpecifier_);
    }
    if (clusterSpecifierCase_ == 2) {
      output.writeMessage(2, (io.envoyproxy.envoy.config.route.v3.WeightedCluster) clusterSpecifier_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clusterSpecifierCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clusterSpecifier_);
    }
    if (clusterSpecifierCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.envoyproxy.envoy.config.route.v3.WeightedCluster) clusterSpecifier_);
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction other = (io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction) obj;

    if (!getClusterSpecifierCase().equals(other.getClusterSpecifierCase())) return false;
    switch (clusterSpecifierCase_) {
      case 1:
        if (!getCluster()
            .equals(other.getCluster())) return false;
        break;
      case 2:
        if (!getWeightedClusters()
            .equals(other.getWeightedClusters())) return false;
        break;
      case 0:
      default:
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
    switch (clusterSpecifierCase_) {
      case 1:
        hash = (37 * hash) + CLUSTER_FIELD_NUMBER;
        hash = (53 * hash) + getCluster().hashCode();
        break;
      case 2:
        hash = (37 * hash) + WEIGHTED_CLUSTERS_FIELD_NUMBER;
        hash = (53 * hash) + getWeightedClusters().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction prototype) {
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
   * Protobuf type {@code envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction)
      io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_RouteAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_RouteAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.class, io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.newBuilder()
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
      clusterSpecifierCase_ = 0;
      clusterSpecifier_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteProto.internal_static_envoy_extensions_filters_network_dubbo_proxy_v3_RouteAction_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction build() {
      io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction buildPartial() {
      io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction result = new io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction(this);
      if (clusterSpecifierCase_ == 1) {
        result.clusterSpecifier_ = clusterSpecifier_;
      }
      if (clusterSpecifierCase_ == 2) {
        if (weightedClustersBuilder_ == null) {
          result.clusterSpecifier_ = clusterSpecifier_;
        } else {
          result.clusterSpecifier_ = weightedClustersBuilder_.build();
        }
      }
      result.clusterSpecifierCase_ = clusterSpecifierCase_;
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction other) {
      if (other == io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction.getDefaultInstance()) return this;
      switch (other.getClusterSpecifierCase()) {
        case CLUSTER: {
          clusterSpecifierCase_ = 1;
          clusterSpecifier_ = other.clusterSpecifier_;
          onChanged();
          break;
        }
        case WEIGHTED_CLUSTERS: {
          mergeWeightedClusters(other.getWeightedClusters());
          break;
        }
        case CLUSTERSPECIFIER_NOT_SET: {
          break;
        }
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
      io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int clusterSpecifierCase_ = 0;
    private java.lang.Object clusterSpecifier_;
    public ClusterSpecifierCase
        getClusterSpecifierCase() {
      return ClusterSpecifierCase.forNumber(
          clusterSpecifierCase_);
    }

    public Builder clearClusterSpecifier() {
      clusterSpecifierCase_ = 0;
      clusterSpecifier_ = null;
      onChanged();
      return this;
    }


    /**
     * <pre>
     * Indicates the upstream cluster to which the request should be routed.
     * </pre>
     *
     * <code>string cluster = 1;</code>
     * @return Whether the cluster field is set.
     */
    @java.lang.Override
    public boolean hasCluster() {
      return clusterSpecifierCase_ == 1;
    }
    /**
     * <pre>
     * Indicates the upstream cluster to which the request should be routed.
     * </pre>
     *
     * <code>string cluster = 1;</code>
     * @return The cluster.
     */
    @java.lang.Override
    public java.lang.String getCluster() {
      java.lang.Object ref = "";
      if (clusterSpecifierCase_ == 1) {
        ref = clusterSpecifier_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (clusterSpecifierCase_ == 1) {
          clusterSpecifier_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Indicates the upstream cluster to which the request should be routed.
     * </pre>
     *
     * <code>string cluster = 1;</code>
     * @return The bytes for cluster.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getClusterBytes() {
      java.lang.Object ref = "";
      if (clusterSpecifierCase_ == 1) {
        ref = clusterSpecifier_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (clusterSpecifierCase_ == 1) {
          clusterSpecifier_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Indicates the upstream cluster to which the request should be routed.
     * </pre>
     *
     * <code>string cluster = 1;</code>
     * @param value The cluster to set.
     * @return This builder for chaining.
     */
    public Builder setCluster(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  clusterSpecifierCase_ = 1;
      clusterSpecifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Indicates the upstream cluster to which the request should be routed.
     * </pre>
     *
     * <code>string cluster = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCluster() {
      if (clusterSpecifierCase_ == 1) {
        clusterSpecifierCase_ = 0;
        clusterSpecifier_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <pre>
     * Indicates the upstream cluster to which the request should be routed.
     * </pre>
     *
     * <code>string cluster = 1;</code>
     * @param value The bytes for cluster to set.
     * @return This builder for chaining.
     */
    public Builder setClusterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      clusterSpecifierCase_ = 1;
      clusterSpecifier_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.route.v3.WeightedCluster, io.envoyproxy.envoy.config.route.v3.WeightedCluster.Builder, io.envoyproxy.envoy.config.route.v3.WeightedClusterOrBuilder> weightedClustersBuilder_;
    /**
     * <pre>
     * Multiple upstream clusters can be specified for a given route. The
     * request is routed to one of the upstream clusters based on weights
     * assigned to each cluster.
     * Currently ClusterWeight only supports the name and weight fields.
     * </pre>
     *
     * <code>.envoy.config.route.v3.WeightedCluster weighted_clusters = 2;</code>
     * @return Whether the weightedClusters field is set.
     */
    @java.lang.Override
    public boolean hasWeightedClusters() {
      return clusterSpecifierCase_ == 2;
    }
    /**
     * <pre>
     * Multiple upstream clusters can be specified for a given route. The
     * request is routed to one of the upstream clusters based on weights
     * assigned to each cluster.
     * Currently ClusterWeight only supports the name and weight fields.
     * </pre>
     *
     * <code>.envoy.config.route.v3.WeightedCluster weighted_clusters = 2;</code>
     * @return The weightedClusters.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.config.route.v3.WeightedCluster getWeightedClusters() {
      if (weightedClustersBuilder_ == null) {
        if (clusterSpecifierCase_ == 2) {
          return (io.envoyproxy.envoy.config.route.v3.WeightedCluster) clusterSpecifier_;
        }
        return io.envoyproxy.envoy.config.route.v3.WeightedCluster.getDefaultInstance();
      } else {
        if (clusterSpecifierCase_ == 2) {
          return weightedClustersBuilder_.getMessage();
        }
        return io.envoyproxy.envoy.config.route.v3.WeightedCluster.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Multiple upstream clusters can be specified for a given route. The
     * request is routed to one of the upstream clusters based on weights
     * assigned to each cluster.
     * Currently ClusterWeight only supports the name and weight fields.
     * </pre>
     *
     * <code>.envoy.config.route.v3.WeightedCluster weighted_clusters = 2;</code>
     */
    public Builder setWeightedClusters(io.envoyproxy.envoy.config.route.v3.WeightedCluster value) {
      if (weightedClustersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clusterSpecifier_ = value;
        onChanged();
      } else {
        weightedClustersBuilder_.setMessage(value);
      }
      clusterSpecifierCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Multiple upstream clusters can be specified for a given route. The
     * request is routed to one of the upstream clusters based on weights
     * assigned to each cluster.
     * Currently ClusterWeight only supports the name and weight fields.
     * </pre>
     *
     * <code>.envoy.config.route.v3.WeightedCluster weighted_clusters = 2;</code>
     */
    public Builder setWeightedClusters(
        io.envoyproxy.envoy.config.route.v3.WeightedCluster.Builder builderForValue) {
      if (weightedClustersBuilder_ == null) {
        clusterSpecifier_ = builderForValue.build();
        onChanged();
      } else {
        weightedClustersBuilder_.setMessage(builderForValue.build());
      }
      clusterSpecifierCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Multiple upstream clusters can be specified for a given route. The
     * request is routed to one of the upstream clusters based on weights
     * assigned to each cluster.
     * Currently ClusterWeight only supports the name and weight fields.
     * </pre>
     *
     * <code>.envoy.config.route.v3.WeightedCluster weighted_clusters = 2;</code>
     */
    public Builder mergeWeightedClusters(io.envoyproxy.envoy.config.route.v3.WeightedCluster value) {
      if (weightedClustersBuilder_ == null) {
        if (clusterSpecifierCase_ == 2 &&
            clusterSpecifier_ != io.envoyproxy.envoy.config.route.v3.WeightedCluster.getDefaultInstance()) {
          clusterSpecifier_ = io.envoyproxy.envoy.config.route.v3.WeightedCluster.newBuilder((io.envoyproxy.envoy.config.route.v3.WeightedCluster) clusterSpecifier_)
              .mergeFrom(value).buildPartial();
        } else {
          clusterSpecifier_ = value;
        }
        onChanged();
      } else {
        if (clusterSpecifierCase_ == 2) {
          weightedClustersBuilder_.mergeFrom(value);
        }
        weightedClustersBuilder_.setMessage(value);
      }
      clusterSpecifierCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Multiple upstream clusters can be specified for a given route. The
     * request is routed to one of the upstream clusters based on weights
     * assigned to each cluster.
     * Currently ClusterWeight only supports the name and weight fields.
     * </pre>
     *
     * <code>.envoy.config.route.v3.WeightedCluster weighted_clusters = 2;</code>
     */
    public Builder clearWeightedClusters() {
      if (weightedClustersBuilder_ == null) {
        if (clusterSpecifierCase_ == 2) {
          clusterSpecifierCase_ = 0;
          clusterSpecifier_ = null;
          onChanged();
        }
      } else {
        if (clusterSpecifierCase_ == 2) {
          clusterSpecifierCase_ = 0;
          clusterSpecifier_ = null;
        }
        weightedClustersBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Multiple upstream clusters can be specified for a given route. The
     * request is routed to one of the upstream clusters based on weights
     * assigned to each cluster.
     * Currently ClusterWeight only supports the name and weight fields.
     * </pre>
     *
     * <code>.envoy.config.route.v3.WeightedCluster weighted_clusters = 2;</code>
     */
    public io.envoyproxy.envoy.config.route.v3.WeightedCluster.Builder getWeightedClustersBuilder() {
      return getWeightedClustersFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Multiple upstream clusters can be specified for a given route. The
     * request is routed to one of the upstream clusters based on weights
     * assigned to each cluster.
     * Currently ClusterWeight only supports the name and weight fields.
     * </pre>
     *
     * <code>.envoy.config.route.v3.WeightedCluster weighted_clusters = 2;</code>
     */
    @java.lang.Override
    public io.envoyproxy.envoy.config.route.v3.WeightedClusterOrBuilder getWeightedClustersOrBuilder() {
      if ((clusterSpecifierCase_ == 2) && (weightedClustersBuilder_ != null)) {
        return weightedClustersBuilder_.getMessageOrBuilder();
      } else {
        if (clusterSpecifierCase_ == 2) {
          return (io.envoyproxy.envoy.config.route.v3.WeightedCluster) clusterSpecifier_;
        }
        return io.envoyproxy.envoy.config.route.v3.WeightedCluster.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Multiple upstream clusters can be specified for a given route. The
     * request is routed to one of the upstream clusters based on weights
     * assigned to each cluster.
     * Currently ClusterWeight only supports the name and weight fields.
     * </pre>
     *
     * <code>.envoy.config.route.v3.WeightedCluster weighted_clusters = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.route.v3.WeightedCluster, io.envoyproxy.envoy.config.route.v3.WeightedCluster.Builder, io.envoyproxy.envoy.config.route.v3.WeightedClusterOrBuilder> 
        getWeightedClustersFieldBuilder() {
      if (weightedClustersBuilder_ == null) {
        if (!(clusterSpecifierCase_ == 2)) {
          clusterSpecifier_ = io.envoyproxy.envoy.config.route.v3.WeightedCluster.getDefaultInstance();
        }
        weightedClustersBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.route.v3.WeightedCluster, io.envoyproxy.envoy.config.route.v3.WeightedCluster.Builder, io.envoyproxy.envoy.config.route.v3.WeightedClusterOrBuilder>(
                (io.envoyproxy.envoy.config.route.v3.WeightedCluster) clusterSpecifier_,
                getParentForChildren(),
                isClean());
        clusterSpecifier_ = null;
      }
      clusterSpecifierCase_ = 2;
      onChanged();;
      return weightedClustersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction)
  private static final io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction();
  }

  public static io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteAction>
      PARSER = new com.google.protobuf.AbstractParser<RouteAction>() {
    @java.lang.Override
    public RouteAction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RouteAction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RouteAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

