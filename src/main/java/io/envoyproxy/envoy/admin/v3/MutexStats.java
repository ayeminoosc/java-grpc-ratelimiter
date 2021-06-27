// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v3/mutex_stats.proto

package io.envoyproxy.envoy.admin.v3;

/**
 * <pre>
 * Proto representation of the statistics collected upon absl::Mutex contention, if Envoy is run
 * under :option:`--enable-mutex-tracing`. For more information, see the `absl::Mutex`
 * [docs](https://abseil.io/about/design/mutex#extra-features).
 * *NB*: The wait cycles below are measured by `absl::base_internal::CycleClock`, and may not
 * correspond to core clock frequency. For more information, see the `CycleClock`
 * [docs](https://github.com/abseil/abseil-cpp/blob/master/absl/base/internal/cycleclock.h).
 * </pre>
 *
 * Protobuf type {@code envoy.admin.v3.MutexStats}
 */
public final class MutexStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.admin.v3.MutexStats)
    MutexStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MutexStats.newBuilder() to construct.
  private MutexStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MutexStats() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MutexStats();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MutexStats(
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

            numContentions_ = input.readUInt64();
            break;
          }
          case 16: {

            currentWaitCycles_ = input.readUInt64();
            break;
          }
          case 24: {

            lifetimeWaitCycles_ = input.readUInt64();
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
    return io.envoyproxy.envoy.admin.v3.MutexStatsProto.internal_static_envoy_admin_v3_MutexStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.admin.v3.MutexStatsProto.internal_static_envoy_admin_v3_MutexStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.admin.v3.MutexStats.class, io.envoyproxy.envoy.admin.v3.MutexStats.Builder.class);
  }

  public static final int NUM_CONTENTIONS_FIELD_NUMBER = 1;
  private long numContentions_;
  /**
   * <pre>
   * The number of individual mutex contentions which have occurred since startup.
   * </pre>
   *
   * <code>uint64 num_contentions = 1;</code>
   * @return The numContentions.
   */
  @java.lang.Override
  public long getNumContentions() {
    return numContentions_;
  }

  public static final int CURRENT_WAIT_CYCLES_FIELD_NUMBER = 2;
  private long currentWaitCycles_;
  /**
   * <pre>
   * The length of the current contention wait cycle.
   * </pre>
   *
   * <code>uint64 current_wait_cycles = 2;</code>
   * @return The currentWaitCycles.
   */
  @java.lang.Override
  public long getCurrentWaitCycles() {
    return currentWaitCycles_;
  }

  public static final int LIFETIME_WAIT_CYCLES_FIELD_NUMBER = 3;
  private long lifetimeWaitCycles_;
  /**
   * <pre>
   * The lifetime total of all contention wait cycles.
   * </pre>
   *
   * <code>uint64 lifetime_wait_cycles = 3;</code>
   * @return The lifetimeWaitCycles.
   */
  @java.lang.Override
  public long getLifetimeWaitCycles() {
    return lifetimeWaitCycles_;
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
    if (numContentions_ != 0L) {
      output.writeUInt64(1, numContentions_);
    }
    if (currentWaitCycles_ != 0L) {
      output.writeUInt64(2, currentWaitCycles_);
    }
    if (lifetimeWaitCycles_ != 0L) {
      output.writeUInt64(3, lifetimeWaitCycles_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (numContentions_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, numContentions_);
    }
    if (currentWaitCycles_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, currentWaitCycles_);
    }
    if (lifetimeWaitCycles_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, lifetimeWaitCycles_);
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
    if (!(obj instanceof io.envoyproxy.envoy.admin.v3.MutexStats)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.admin.v3.MutexStats other = (io.envoyproxy.envoy.admin.v3.MutexStats) obj;

    if (getNumContentions()
        != other.getNumContentions()) return false;
    if (getCurrentWaitCycles()
        != other.getCurrentWaitCycles()) return false;
    if (getLifetimeWaitCycles()
        != other.getLifetimeWaitCycles()) return false;
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
    hash = (37 * hash) + NUM_CONTENTIONS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getNumContentions());
    hash = (37 * hash) + CURRENT_WAIT_CYCLES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCurrentWaitCycles());
    hash = (37 * hash) + LIFETIME_WAIT_CYCLES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLifetimeWaitCycles());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.admin.v3.MutexStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v3.MutexStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.MutexStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v3.MutexStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.MutexStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v3.MutexStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.MutexStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v3.MutexStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.MutexStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v3.MutexStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.MutexStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v3.MutexStats parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.admin.v3.MutexStats prototype) {
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
   * Proto representation of the statistics collected upon absl::Mutex contention, if Envoy is run
   * under :option:`--enable-mutex-tracing`. For more information, see the `absl::Mutex`
   * [docs](https://abseil.io/about/design/mutex#extra-features).
   * *NB*: The wait cycles below are measured by `absl::base_internal::CycleClock`, and may not
   * correspond to core clock frequency. For more information, see the `CycleClock`
   * [docs](https://github.com/abseil/abseil-cpp/blob/master/absl/base/internal/cycleclock.h).
   * </pre>
   *
   * Protobuf type {@code envoy.admin.v3.MutexStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.admin.v3.MutexStats)
      io.envoyproxy.envoy.admin.v3.MutexStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.admin.v3.MutexStatsProto.internal_static_envoy_admin_v3_MutexStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.admin.v3.MutexStatsProto.internal_static_envoy_admin_v3_MutexStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.admin.v3.MutexStats.class, io.envoyproxy.envoy.admin.v3.MutexStats.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.admin.v3.MutexStats.newBuilder()
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
      numContentions_ = 0L;

      currentWaitCycles_ = 0L;

      lifetimeWaitCycles_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.admin.v3.MutexStatsProto.internal_static_envoy_admin_v3_MutexStats_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v3.MutexStats getDefaultInstanceForType() {
      return io.envoyproxy.envoy.admin.v3.MutexStats.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v3.MutexStats build() {
      io.envoyproxy.envoy.admin.v3.MutexStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v3.MutexStats buildPartial() {
      io.envoyproxy.envoy.admin.v3.MutexStats result = new io.envoyproxy.envoy.admin.v3.MutexStats(this);
      result.numContentions_ = numContentions_;
      result.currentWaitCycles_ = currentWaitCycles_;
      result.lifetimeWaitCycles_ = lifetimeWaitCycles_;
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
      if (other instanceof io.envoyproxy.envoy.admin.v3.MutexStats) {
        return mergeFrom((io.envoyproxy.envoy.admin.v3.MutexStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.admin.v3.MutexStats other) {
      if (other == io.envoyproxy.envoy.admin.v3.MutexStats.getDefaultInstance()) return this;
      if (other.getNumContentions() != 0L) {
        setNumContentions(other.getNumContentions());
      }
      if (other.getCurrentWaitCycles() != 0L) {
        setCurrentWaitCycles(other.getCurrentWaitCycles());
      }
      if (other.getLifetimeWaitCycles() != 0L) {
        setLifetimeWaitCycles(other.getLifetimeWaitCycles());
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
      io.envoyproxy.envoy.admin.v3.MutexStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.admin.v3.MutexStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long numContentions_ ;
    /**
     * <pre>
     * The number of individual mutex contentions which have occurred since startup.
     * </pre>
     *
     * <code>uint64 num_contentions = 1;</code>
     * @return The numContentions.
     */
    @java.lang.Override
    public long getNumContentions() {
      return numContentions_;
    }
    /**
     * <pre>
     * The number of individual mutex contentions which have occurred since startup.
     * </pre>
     *
     * <code>uint64 num_contentions = 1;</code>
     * @param value The numContentions to set.
     * @return This builder for chaining.
     */
    public Builder setNumContentions(long value) {
      
      numContentions_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The number of individual mutex contentions which have occurred since startup.
     * </pre>
     *
     * <code>uint64 num_contentions = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumContentions() {
      
      numContentions_ = 0L;
      onChanged();
      return this;
    }

    private long currentWaitCycles_ ;
    /**
     * <pre>
     * The length of the current contention wait cycle.
     * </pre>
     *
     * <code>uint64 current_wait_cycles = 2;</code>
     * @return The currentWaitCycles.
     */
    @java.lang.Override
    public long getCurrentWaitCycles() {
      return currentWaitCycles_;
    }
    /**
     * <pre>
     * The length of the current contention wait cycle.
     * </pre>
     *
     * <code>uint64 current_wait_cycles = 2;</code>
     * @param value The currentWaitCycles to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentWaitCycles(long value) {
      
      currentWaitCycles_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The length of the current contention wait cycle.
     * </pre>
     *
     * <code>uint64 current_wait_cycles = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrentWaitCycles() {
      
      currentWaitCycles_ = 0L;
      onChanged();
      return this;
    }

    private long lifetimeWaitCycles_ ;
    /**
     * <pre>
     * The lifetime total of all contention wait cycles.
     * </pre>
     *
     * <code>uint64 lifetime_wait_cycles = 3;</code>
     * @return The lifetimeWaitCycles.
     */
    @java.lang.Override
    public long getLifetimeWaitCycles() {
      return lifetimeWaitCycles_;
    }
    /**
     * <pre>
     * The lifetime total of all contention wait cycles.
     * </pre>
     *
     * <code>uint64 lifetime_wait_cycles = 3;</code>
     * @param value The lifetimeWaitCycles to set.
     * @return This builder for chaining.
     */
    public Builder setLifetimeWaitCycles(long value) {
      
      lifetimeWaitCycles_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The lifetime total of all contention wait cycles.
     * </pre>
     *
     * <code>uint64 lifetime_wait_cycles = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLifetimeWaitCycles() {
      
      lifetimeWaitCycles_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:envoy.admin.v3.MutexStats)
  }

  // @@protoc_insertion_point(class_scope:envoy.admin.v3.MutexStats)
  private static final io.envoyproxy.envoy.admin.v3.MutexStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.admin.v3.MutexStats();
  }

  public static io.envoyproxy.envoy.admin.v3.MutexStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MutexStats>
      PARSER = new com.google.protobuf.AbstractParser<MutexStats>() {
    @java.lang.Override
    public MutexStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MutexStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MutexStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MutexStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.admin.v3.MutexStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

