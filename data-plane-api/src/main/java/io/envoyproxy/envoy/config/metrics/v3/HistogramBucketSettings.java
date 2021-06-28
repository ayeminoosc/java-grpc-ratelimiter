// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/metrics/v3/stats.proto

package io.envoyproxy.envoy.config.metrics.v3;

/**
 * <pre>
 * Specifies a matcher for stats and the buckets that matching stats should use.
 * </pre>
 *
 * Protobuf type {@code envoy.config.metrics.v3.HistogramBucketSettings}
 */
public final class HistogramBucketSettings extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.metrics.v3.HistogramBucketSettings)
    HistogramBucketSettingsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HistogramBucketSettings.newBuilder() to construct.
  private HistogramBucketSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HistogramBucketSettings() {
    buckets_ = emptyDoubleList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HistogramBucketSettings();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HistogramBucketSettings(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder subBuilder = null;
            if (match_ != null) {
              subBuilder = match_.toBuilder();
            }
            match_ = input.readMessage(io.envoyproxy.envoy.type.matcher.v3.StringMatcher.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(match_);
              match_ = subBuilder.buildPartial();
            }

            break;
          }
          case 17: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              buckets_ = newDoubleList();
              mutable_bitField0_ |= 0x00000001;
            }
            buckets_.addDouble(input.readDouble());
            break;
          }
          case 18: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              buckets_ = newDoubleList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              buckets_.addDouble(input.readDouble());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        buckets_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.metrics.v3.StatsProto.internal_static_envoy_config_metrics_v3_HistogramBucketSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.metrics.v3.StatsProto.internal_static_envoy_config_metrics_v3_HistogramBucketSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings.class, io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings.Builder.class);
  }

  public static final int MATCH_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.type.matcher.v3.StringMatcher match_;
  /**
   * <pre>
   * The stats that this rule applies to. The match is applied to the original stat name
   * before tag-extraction, for example `cluster.exampleclustername.upstream_cx_length_ms`.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.StringMatcher match = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the match field is set.
   */
  @java.lang.Override
  public boolean hasMatch() {
    return match_ != null;
  }
  /**
   * <pre>
   * The stats that this rule applies to. The match is applied to the original stat name
   * before tag-extraction, for example `cluster.exampleclustername.upstream_cx_length_ms`.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.StringMatcher match = 1 [(.validate.rules) = { ... }</code>
   * @return The match.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.matcher.v3.StringMatcher getMatch() {
    return match_ == null ? io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance() : match_;
  }
  /**
   * <pre>
   * The stats that this rule applies to. The match is applied to the original stat name
   * before tag-extraction, for example `cluster.exampleclustername.upstream_cx_length_ms`.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.StringMatcher match = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder getMatchOrBuilder() {
    return getMatch();
  }

  public static final int BUCKETS_FIELD_NUMBER = 2;
  private com.google.protobuf.Internal.DoubleList buckets_;
  /**
   * <pre>
   * Each value is the upper bound of a bucket. Each bucket must be greater than 0 and unique.
   * The order of the buckets does not matter.
   * </pre>
   *
   * <code>repeated double buckets = 2 [(.validate.rules) = { ... }</code>
   * @return A list containing the buckets.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double>
      getBucketsList() {
    return buckets_;
  }
  /**
   * <pre>
   * Each value is the upper bound of a bucket. Each bucket must be greater than 0 and unique.
   * The order of the buckets does not matter.
   * </pre>
   *
   * <code>repeated double buckets = 2 [(.validate.rules) = { ... }</code>
   * @return The count of buckets.
   */
  public int getBucketsCount() {
    return buckets_.size();
  }
  /**
   * <pre>
   * Each value is the upper bound of a bucket. Each bucket must be greater than 0 and unique.
   * The order of the buckets does not matter.
   * </pre>
   *
   * <code>repeated double buckets = 2 [(.validate.rules) = { ... }</code>
   * @param index The index of the element to return.
   * @return The buckets at the given index.
   */
  public double getBuckets(int index) {
    return buckets_.getDouble(index);
  }
  private int bucketsMemoizedSerializedSize = -1;

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
    getSerializedSize();
    if (match_ != null) {
      output.writeMessage(1, getMatch());
    }
    if (getBucketsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(bucketsMemoizedSerializedSize);
    }
    for (int i = 0; i < buckets_.size(); i++) {
      output.writeDoubleNoTag(buckets_.getDouble(i));
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
    {
      int dataSize = 0;
      dataSize = 8 * getBucketsList().size();
      size += dataSize;
      if (!getBucketsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      bucketsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings other = (io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings) obj;

    if (hasMatch() != other.hasMatch()) return false;
    if (hasMatch()) {
      if (!getMatch()
          .equals(other.getMatch())) return false;
    }
    if (!getBucketsList()
        .equals(other.getBucketsList())) return false;
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
    if (getBucketsCount() > 0) {
      hash = (37 * hash) + BUCKETS_FIELD_NUMBER;
      hash = (53 * hash) + getBucketsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings prototype) {
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
   * Specifies a matcher for stats and the buckets that matching stats should use.
   * </pre>
   *
   * Protobuf type {@code envoy.config.metrics.v3.HistogramBucketSettings}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.metrics.v3.HistogramBucketSettings)
      io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.metrics.v3.StatsProto.internal_static_envoy_config_metrics_v3_HistogramBucketSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.metrics.v3.StatsProto.internal_static_envoy_config_metrics_v3_HistogramBucketSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings.class, io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings.newBuilder()
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
      buckets_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.metrics.v3.StatsProto.internal_static_envoy_config_metrics_v3_HistogramBucketSettings_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings build() {
      io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings buildPartial() {
      io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings result = new io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings(this);
      int from_bitField0_ = bitField0_;
      if (matchBuilder_ == null) {
        result.match_ = match_;
      } else {
        result.match_ = matchBuilder_.build();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        buckets_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.buckets_ = buckets_;
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
      if (other instanceof io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings) {
        return mergeFrom((io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings other) {
      if (other == io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings.getDefaultInstance()) return this;
      if (other.hasMatch()) {
        mergeMatch(other.getMatch());
      }
      if (!other.buckets_.isEmpty()) {
        if (buckets_.isEmpty()) {
          buckets_ = other.buckets_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureBucketsIsMutable();
          buckets_.addAll(other.buckets_);
        }
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
      io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private io.envoyproxy.envoy.type.matcher.v3.StringMatcher match_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.matcher.v3.StringMatcher, io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder, io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder> matchBuilder_;
    /**
     * <pre>
     * The stats that this rule applies to. The match is applied to the original stat name
     * before tag-extraction, for example `cluster.exampleclustername.upstream_cx_length_ms`.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher match = 1 [(.validate.rules) = { ... }</code>
     * @return Whether the match field is set.
     */
    public boolean hasMatch() {
      return matchBuilder_ != null || match_ != null;
    }
    /**
     * <pre>
     * The stats that this rule applies to. The match is applied to the original stat name
     * before tag-extraction, for example `cluster.exampleclustername.upstream_cx_length_ms`.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher match = 1 [(.validate.rules) = { ... }</code>
     * @return The match.
     */
    public io.envoyproxy.envoy.type.matcher.v3.StringMatcher getMatch() {
      if (matchBuilder_ == null) {
        return match_ == null ? io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance() : match_;
      } else {
        return matchBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The stats that this rule applies to. The match is applied to the original stat name
     * before tag-extraction, for example `cluster.exampleclustername.upstream_cx_length_ms`.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher match = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setMatch(io.envoyproxy.envoy.type.matcher.v3.StringMatcher value) {
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
     * The stats that this rule applies to. The match is applied to the original stat name
     * before tag-extraction, for example `cluster.exampleclustername.upstream_cx_length_ms`.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher match = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setMatch(
        io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder builderForValue) {
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
     * The stats that this rule applies to. The match is applied to the original stat name
     * before tag-extraction, for example `cluster.exampleclustername.upstream_cx_length_ms`.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher match = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeMatch(io.envoyproxy.envoy.type.matcher.v3.StringMatcher value) {
      if (matchBuilder_ == null) {
        if (match_ != null) {
          match_ =
            io.envoyproxy.envoy.type.matcher.v3.StringMatcher.newBuilder(match_).mergeFrom(value).buildPartial();
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
     * The stats that this rule applies to. The match is applied to the original stat name
     * before tag-extraction, for example `cluster.exampleclustername.upstream_cx_length_ms`.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher match = 1 [(.validate.rules) = { ... }</code>
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
     * The stats that this rule applies to. The match is applied to the original stat name
     * before tag-extraction, for example `cluster.exampleclustername.upstream_cx_length_ms`.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher match = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder getMatchBuilder() {
      
      onChanged();
      return getMatchFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The stats that this rule applies to. The match is applied to the original stat name
     * before tag-extraction, for example `cluster.exampleclustername.upstream_cx_length_ms`.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher match = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder getMatchOrBuilder() {
      if (matchBuilder_ != null) {
        return matchBuilder_.getMessageOrBuilder();
      } else {
        return match_ == null ?
            io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance() : match_;
      }
    }
    /**
     * <pre>
     * The stats that this rule applies to. The match is applied to the original stat name
     * before tag-extraction, for example `cluster.exampleclustername.upstream_cx_length_ms`.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher match = 1 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.matcher.v3.StringMatcher, io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder, io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder> 
        getMatchFieldBuilder() {
      if (matchBuilder_ == null) {
        matchBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.type.matcher.v3.StringMatcher, io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder, io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder>(
                getMatch(),
                getParentForChildren(),
                isClean());
        match_ = null;
      }
      return matchBuilder_;
    }

    private com.google.protobuf.Internal.DoubleList buckets_ = emptyDoubleList();
    private void ensureBucketsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        buckets_ = mutableCopy(buckets_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * Each value is the upper bound of a bucket. Each bucket must be greater than 0 and unique.
     * The order of the buckets does not matter.
     * </pre>
     *
     * <code>repeated double buckets = 2 [(.validate.rules) = { ... }</code>
     * @return A list containing the buckets.
     */
    public java.util.List<java.lang.Double>
        getBucketsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(buckets_) : buckets_;
    }
    /**
     * <pre>
     * Each value is the upper bound of a bucket. Each bucket must be greater than 0 and unique.
     * The order of the buckets does not matter.
     * </pre>
     *
     * <code>repeated double buckets = 2 [(.validate.rules) = { ... }</code>
     * @return The count of buckets.
     */
    public int getBucketsCount() {
      return buckets_.size();
    }
    /**
     * <pre>
     * Each value is the upper bound of a bucket. Each bucket must be greater than 0 and unique.
     * The order of the buckets does not matter.
     * </pre>
     *
     * <code>repeated double buckets = 2 [(.validate.rules) = { ... }</code>
     * @param index The index of the element to return.
     * @return The buckets at the given index.
     */
    public double getBuckets(int index) {
      return buckets_.getDouble(index);
    }
    /**
     * <pre>
     * Each value is the upper bound of a bucket. Each bucket must be greater than 0 and unique.
     * The order of the buckets does not matter.
     * </pre>
     *
     * <code>repeated double buckets = 2 [(.validate.rules) = { ... }</code>
     * @param index The index to set the value at.
     * @param value The buckets to set.
     * @return This builder for chaining.
     */
    public Builder setBuckets(
        int index, double value) {
      ensureBucketsIsMutable();
      buckets_.setDouble(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Each value is the upper bound of a bucket. Each bucket must be greater than 0 and unique.
     * The order of the buckets does not matter.
     * </pre>
     *
     * <code>repeated double buckets = 2 [(.validate.rules) = { ... }</code>
     * @param value The buckets to add.
     * @return This builder for chaining.
     */
    public Builder addBuckets(double value) {
      ensureBucketsIsMutable();
      buckets_.addDouble(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Each value is the upper bound of a bucket. Each bucket must be greater than 0 and unique.
     * The order of the buckets does not matter.
     * </pre>
     *
     * <code>repeated double buckets = 2 [(.validate.rules) = { ... }</code>
     * @param values The buckets to add.
     * @return This builder for chaining.
     */
    public Builder addAllBuckets(
        java.lang.Iterable<? extends java.lang.Double> values) {
      ensureBucketsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, buckets_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Each value is the upper bound of a bucket. Each bucket must be greater than 0 and unique.
     * The order of the buckets does not matter.
     * </pre>
     *
     * <code>repeated double buckets = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearBuckets() {
      buckets_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:envoy.config.metrics.v3.HistogramBucketSettings)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.metrics.v3.HistogramBucketSettings)
  private static final io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings();
  }

  public static io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HistogramBucketSettings>
      PARSER = new com.google.protobuf.AbstractParser<HistogramBucketSettings>() {
    @java.lang.Override
    public HistogramBucketSettings parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HistogramBucketSettings(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HistogramBucketSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HistogramBucketSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.metrics.v3.HistogramBucketSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
