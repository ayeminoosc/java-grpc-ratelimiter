// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/cluster/v3/cluster.proto

package io.envoyproxy.envoy.config.cluster.v3;

/**
 * Protobuf type {@code envoy.config.cluster.v3.TrackClusterStats}
 */
public final class TrackClusterStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.cluster.v3.TrackClusterStats)
    TrackClusterStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TrackClusterStats.newBuilder() to construct.
  private TrackClusterStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrackClusterStats() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TrackClusterStats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TrackClusterStats(
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

            timeoutBudgets_ = input.readBool();
            break;
          }
          case 16: {

            requestResponseSizes_ = input.readBool();
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
    return io.envoyproxy.envoy.config.cluster.v3.ClusterProto.internal_static_envoy_config_cluster_v3_TrackClusterStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.cluster.v3.ClusterProto.internal_static_envoy_config_cluster_v3_TrackClusterStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats.class, io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats.Builder.class);
  }

  public static final int TIMEOUT_BUDGETS_FIELD_NUMBER = 1;
  private boolean timeoutBudgets_;
  /**
   * <pre>
   * If timeout_budgets is true, the :ref:`timeout budget histograms
   * &lt;config_cluster_manager_cluster_stats_timeout_budgets&gt;` will be published for each
   * request. These show what percentage of a request's per try and global timeout was used. A value
   * of 0 would indicate that none of the timeout was used or that the timeout was infinite. A value
   * of 100 would indicate that the request took the entirety of the timeout given to it.
   * </pre>
   *
   * <code>bool timeout_budgets = 1;</code>
   * @return The timeoutBudgets.
   */
  @java.lang.Override
  public boolean getTimeoutBudgets() {
    return timeoutBudgets_;
  }

  public static final int REQUEST_RESPONSE_SIZES_FIELD_NUMBER = 2;
  private boolean requestResponseSizes_;
  /**
   * <pre>
   * If request_response_sizes is true, then the :ref:`histograms
   * &lt;config_cluster_manager_cluster_stats_request_response_sizes&gt;`  tracking header and body sizes
   * of requests and responses will be published.
   * </pre>
   *
   * <code>bool request_response_sizes = 2;</code>
   * @return The requestResponseSizes.
   */
  @java.lang.Override
  public boolean getRequestResponseSizes() {
    return requestResponseSizes_;
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
    if (timeoutBudgets_ != false) {
      output.writeBool(1, timeoutBudgets_);
    }
    if (requestResponseSizes_ != false) {
      output.writeBool(2, requestResponseSizes_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timeoutBudgets_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, timeoutBudgets_);
    }
    if (requestResponseSizes_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, requestResponseSizes_);
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
    if (!(obj instanceof io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats other = (io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats) obj;

    if (getTimeoutBudgets()
        != other.getTimeoutBudgets()) return false;
    if (getRequestResponseSizes()
        != other.getRequestResponseSizes()) return false;
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
    hash = (37 * hash) + TIMEOUT_BUDGETS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getTimeoutBudgets());
    hash = (37 * hash) + REQUEST_RESPONSE_SIZES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getRequestResponseSizes());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats prototype) {
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
   * Protobuf type {@code envoy.config.cluster.v3.TrackClusterStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.cluster.v3.TrackClusterStats)
      io.envoyproxy.envoy.config.cluster.v3.TrackClusterStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.cluster.v3.ClusterProto.internal_static_envoy_config_cluster_v3_TrackClusterStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.cluster.v3.ClusterProto.internal_static_envoy_config_cluster_v3_TrackClusterStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats.class, io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats.newBuilder()
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
      timeoutBudgets_ = false;

      requestResponseSizes_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.cluster.v3.ClusterProto.internal_static_envoy_config_cluster_v3_TrackClusterStats_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats build() {
      io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats buildPartial() {
      io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats result = new io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats(this);
      result.timeoutBudgets_ = timeoutBudgets_;
      result.requestResponseSizes_ = requestResponseSizes_;
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
      if (other instanceof io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats) {
        return mergeFrom((io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats other) {
      if (other == io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats.getDefaultInstance()) return this;
      if (other.getTimeoutBudgets() != false) {
        setTimeoutBudgets(other.getTimeoutBudgets());
      }
      if (other.getRequestResponseSizes() != false) {
        setRequestResponseSizes(other.getRequestResponseSizes());
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
      io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean timeoutBudgets_ ;
    /**
     * <pre>
     * If timeout_budgets is true, the :ref:`timeout budget histograms
     * &lt;config_cluster_manager_cluster_stats_timeout_budgets&gt;` will be published for each
     * request. These show what percentage of a request's per try and global timeout was used. A value
     * of 0 would indicate that none of the timeout was used or that the timeout was infinite. A value
     * of 100 would indicate that the request took the entirety of the timeout given to it.
     * </pre>
     *
     * <code>bool timeout_budgets = 1;</code>
     * @return The timeoutBudgets.
     */
    @java.lang.Override
    public boolean getTimeoutBudgets() {
      return timeoutBudgets_;
    }
    /**
     * <pre>
     * If timeout_budgets is true, the :ref:`timeout budget histograms
     * &lt;config_cluster_manager_cluster_stats_timeout_budgets&gt;` will be published for each
     * request. These show what percentage of a request's per try and global timeout was used. A value
     * of 0 would indicate that none of the timeout was used or that the timeout was infinite. A value
     * of 100 would indicate that the request took the entirety of the timeout given to it.
     * </pre>
     *
     * <code>bool timeout_budgets = 1;</code>
     * @param value The timeoutBudgets to set.
     * @return This builder for chaining.
     */
    public Builder setTimeoutBudgets(boolean value) {
      
      timeoutBudgets_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If timeout_budgets is true, the :ref:`timeout budget histograms
     * &lt;config_cluster_manager_cluster_stats_timeout_budgets&gt;` will be published for each
     * request. These show what percentage of a request's per try and global timeout was used. A value
     * of 0 would indicate that none of the timeout was used or that the timeout was infinite. A value
     * of 100 would indicate that the request took the entirety of the timeout given to it.
     * </pre>
     *
     * <code>bool timeout_budgets = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimeoutBudgets() {
      
      timeoutBudgets_ = false;
      onChanged();
      return this;
    }

    private boolean requestResponseSizes_ ;
    /**
     * <pre>
     * If request_response_sizes is true, then the :ref:`histograms
     * &lt;config_cluster_manager_cluster_stats_request_response_sizes&gt;`  tracking header and body sizes
     * of requests and responses will be published.
     * </pre>
     *
     * <code>bool request_response_sizes = 2;</code>
     * @return The requestResponseSizes.
     */
    @java.lang.Override
    public boolean getRequestResponseSizes() {
      return requestResponseSizes_;
    }
    /**
     * <pre>
     * If request_response_sizes is true, then the :ref:`histograms
     * &lt;config_cluster_manager_cluster_stats_request_response_sizes&gt;`  tracking header and body sizes
     * of requests and responses will be published.
     * </pre>
     *
     * <code>bool request_response_sizes = 2;</code>
     * @param value The requestResponseSizes to set.
     * @return This builder for chaining.
     */
    public Builder setRequestResponseSizes(boolean value) {
      
      requestResponseSizes_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * If request_response_sizes is true, then the :ref:`histograms
     * &lt;config_cluster_manager_cluster_stats_request_response_sizes&gt;`  tracking header and body sizes
     * of requests and responses will be published.
     * </pre>
     *
     * <code>bool request_response_sizes = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestResponseSizes() {
      
      requestResponseSizes_ = false;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.cluster.v3.TrackClusterStats)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.cluster.v3.TrackClusterStats)
  private static final io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats();
  }

  public static io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrackClusterStats>
      PARSER = new com.google.protobuf.AbstractParser<TrackClusterStats>() {
    @java.lang.Override
    public TrackClusterStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TrackClusterStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TrackClusterStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrackClusterStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.cluster.v3.TrackClusterStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

