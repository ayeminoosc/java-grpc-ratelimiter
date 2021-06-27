// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v3/clusters.proto

package io.envoyproxy.envoy.admin.v3;

/**
 * <pre>
 * Health status for a host.
 * [#next-free-field: 7]
 * </pre>
 *
 * Protobuf type {@code envoy.admin.v3.HostHealthStatus}
 */
public final class HostHealthStatus extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.admin.v3.HostHealthStatus)
    HostHealthStatusOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HostHealthStatus.newBuilder() to construct.
  private HostHealthStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HostHealthStatus() {
    edsHealthStatus_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HostHealthStatus();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HostHealthStatus(
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

            failedActiveHealthCheck_ = input.readBool();
            break;
          }
          case 16: {

            failedOutlierCheck_ = input.readBool();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            edsHealthStatus_ = rawValue;
            break;
          }
          case 32: {

            failedActiveDegradedCheck_ = input.readBool();
            break;
          }
          case 40: {

            pendingDynamicRemoval_ = input.readBool();
            break;
          }
          case 48: {

            pendingActiveHc_ = input.readBool();
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
    return io.envoyproxy.envoy.admin.v3.ClustersProto.internal_static_envoy_admin_v3_HostHealthStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.admin.v3.ClustersProto.internal_static_envoy_admin_v3_HostHealthStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.admin.v3.HostHealthStatus.class, io.envoyproxy.envoy.admin.v3.HostHealthStatus.Builder.class);
  }

  public static final int FAILED_ACTIVE_HEALTH_CHECK_FIELD_NUMBER = 1;
  private boolean failedActiveHealthCheck_;
  /**
   * <pre>
   * The host is currently failing active health checks.
   * </pre>
   *
   * <code>bool failed_active_health_check = 1;</code>
   * @return The failedActiveHealthCheck.
   */
  @java.lang.Override
  public boolean getFailedActiveHealthCheck() {
    return failedActiveHealthCheck_;
  }

  public static final int FAILED_OUTLIER_CHECK_FIELD_NUMBER = 2;
  private boolean failedOutlierCheck_;
  /**
   * <pre>
   * The host is currently considered an outlier and has been ejected.
   * </pre>
   *
   * <code>bool failed_outlier_check = 2;</code>
   * @return The failedOutlierCheck.
   */
  @java.lang.Override
  public boolean getFailedOutlierCheck() {
    return failedOutlierCheck_;
  }

  public static final int FAILED_ACTIVE_DEGRADED_CHECK_FIELD_NUMBER = 4;
  private boolean failedActiveDegradedCheck_;
  /**
   * <pre>
   * The host is currently being marked as degraded through active health checking.
   * </pre>
   *
   * <code>bool failed_active_degraded_check = 4;</code>
   * @return The failedActiveDegradedCheck.
   */
  @java.lang.Override
  public boolean getFailedActiveDegradedCheck() {
    return failedActiveDegradedCheck_;
  }

  public static final int PENDING_DYNAMIC_REMOVAL_FIELD_NUMBER = 5;
  private boolean pendingDynamicRemoval_;
  /**
   * <pre>
   * The host has been removed from service discovery, but is being stabilized due to active
   * health checking.
   * </pre>
   *
   * <code>bool pending_dynamic_removal = 5;</code>
   * @return The pendingDynamicRemoval.
   */
  @java.lang.Override
  public boolean getPendingDynamicRemoval() {
    return pendingDynamicRemoval_;
  }

  public static final int PENDING_ACTIVE_HC_FIELD_NUMBER = 6;
  private boolean pendingActiveHc_;
  /**
   * <pre>
   * The host has not yet been health checked.
   * </pre>
   *
   * <code>bool pending_active_hc = 6;</code>
   * @return The pendingActiveHc.
   */
  @java.lang.Override
  public boolean getPendingActiveHc() {
    return pendingActiveHc_;
  }

  public static final int EDS_HEALTH_STATUS_FIELD_NUMBER = 3;
  private int edsHealthStatus_;
  /**
   * <pre>
   * Health status as reported by EDS. Note: only HEALTHY and UNHEALTHY are currently supported
   * here.
   * [#comment:TODO(mrice32): pipe through remaining EDS health status possibilities.]
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthStatus eds_health_status = 3;</code>
   * @return The enum numeric value on the wire for edsHealthStatus.
   */
  @java.lang.Override public int getEdsHealthStatusValue() {
    return edsHealthStatus_;
  }
  /**
   * <pre>
   * Health status as reported by EDS. Note: only HEALTHY and UNHEALTHY are currently supported
   * here.
   * [#comment:TODO(mrice32): pipe through remaining EDS health status possibilities.]
   * </pre>
   *
   * <code>.envoy.config.core.v3.HealthStatus eds_health_status = 3;</code>
   * @return The edsHealthStatus.
   */
  @java.lang.Override public io.envoyproxy.envoy.config.core.v3.HealthStatus getEdsHealthStatus() {
    @SuppressWarnings("deprecation")
    io.envoyproxy.envoy.config.core.v3.HealthStatus result = io.envoyproxy.envoy.config.core.v3.HealthStatus.valueOf(edsHealthStatus_);
    return result == null ? io.envoyproxy.envoy.config.core.v3.HealthStatus.UNRECOGNIZED : result;
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
    if (failedActiveHealthCheck_ != false) {
      output.writeBool(1, failedActiveHealthCheck_);
    }
    if (failedOutlierCheck_ != false) {
      output.writeBool(2, failedOutlierCheck_);
    }
    if (edsHealthStatus_ != io.envoyproxy.envoy.config.core.v3.HealthStatus.UNKNOWN.getNumber()) {
      output.writeEnum(3, edsHealthStatus_);
    }
    if (failedActiveDegradedCheck_ != false) {
      output.writeBool(4, failedActiveDegradedCheck_);
    }
    if (pendingDynamicRemoval_ != false) {
      output.writeBool(5, pendingDynamicRemoval_);
    }
    if (pendingActiveHc_ != false) {
      output.writeBool(6, pendingActiveHc_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (failedActiveHealthCheck_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, failedActiveHealthCheck_);
    }
    if (failedOutlierCheck_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, failedOutlierCheck_);
    }
    if (edsHealthStatus_ != io.envoyproxy.envoy.config.core.v3.HealthStatus.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, edsHealthStatus_);
    }
    if (failedActiveDegradedCheck_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, failedActiveDegradedCheck_);
    }
    if (pendingDynamicRemoval_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, pendingDynamicRemoval_);
    }
    if (pendingActiveHc_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, pendingActiveHc_);
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
    if (!(obj instanceof io.envoyproxy.envoy.admin.v3.HostHealthStatus)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.admin.v3.HostHealthStatus other = (io.envoyproxy.envoy.admin.v3.HostHealthStatus) obj;

    if (getFailedActiveHealthCheck()
        != other.getFailedActiveHealthCheck()) return false;
    if (getFailedOutlierCheck()
        != other.getFailedOutlierCheck()) return false;
    if (getFailedActiveDegradedCheck()
        != other.getFailedActiveDegradedCheck()) return false;
    if (getPendingDynamicRemoval()
        != other.getPendingDynamicRemoval()) return false;
    if (getPendingActiveHc()
        != other.getPendingActiveHc()) return false;
    if (edsHealthStatus_ != other.edsHealthStatus_) return false;
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
    hash = (37 * hash) + FAILED_ACTIVE_HEALTH_CHECK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFailedActiveHealthCheck());
    hash = (37 * hash) + FAILED_OUTLIER_CHECK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFailedOutlierCheck());
    hash = (37 * hash) + FAILED_ACTIVE_DEGRADED_CHECK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFailedActiveDegradedCheck());
    hash = (37 * hash) + PENDING_DYNAMIC_REMOVAL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPendingDynamicRemoval());
    hash = (37 * hash) + PENDING_ACTIVE_HC_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getPendingActiveHc());
    hash = (37 * hash) + EDS_HEALTH_STATUS_FIELD_NUMBER;
    hash = (53 * hash) + edsHealthStatus_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.admin.v3.HostHealthStatus parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v3.HostHealthStatus parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.HostHealthStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v3.HostHealthStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.HostHealthStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v3.HostHealthStatus parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.HostHealthStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v3.HostHealthStatus parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.HostHealthStatus parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v3.HostHealthStatus parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.HostHealthStatus parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v3.HostHealthStatus parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.admin.v3.HostHealthStatus prototype) {
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
   * Health status for a host.
   * [#next-free-field: 7]
   * </pre>
   *
   * Protobuf type {@code envoy.admin.v3.HostHealthStatus}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.admin.v3.HostHealthStatus)
      io.envoyproxy.envoy.admin.v3.HostHealthStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.admin.v3.ClustersProto.internal_static_envoy_admin_v3_HostHealthStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.admin.v3.ClustersProto.internal_static_envoy_admin_v3_HostHealthStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.admin.v3.HostHealthStatus.class, io.envoyproxy.envoy.admin.v3.HostHealthStatus.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.admin.v3.HostHealthStatus.newBuilder()
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
      failedActiveHealthCheck_ = false;

      failedOutlierCheck_ = false;

      failedActiveDegradedCheck_ = false;

      pendingDynamicRemoval_ = false;

      pendingActiveHc_ = false;

      edsHealthStatus_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.admin.v3.ClustersProto.internal_static_envoy_admin_v3_HostHealthStatus_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v3.HostHealthStatus getDefaultInstanceForType() {
      return io.envoyproxy.envoy.admin.v3.HostHealthStatus.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v3.HostHealthStatus build() {
      io.envoyproxy.envoy.admin.v3.HostHealthStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v3.HostHealthStatus buildPartial() {
      io.envoyproxy.envoy.admin.v3.HostHealthStatus result = new io.envoyproxy.envoy.admin.v3.HostHealthStatus(this);
      result.failedActiveHealthCheck_ = failedActiveHealthCheck_;
      result.failedOutlierCheck_ = failedOutlierCheck_;
      result.failedActiveDegradedCheck_ = failedActiveDegradedCheck_;
      result.pendingDynamicRemoval_ = pendingDynamicRemoval_;
      result.pendingActiveHc_ = pendingActiveHc_;
      result.edsHealthStatus_ = edsHealthStatus_;
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
      if (other instanceof io.envoyproxy.envoy.admin.v3.HostHealthStatus) {
        return mergeFrom((io.envoyproxy.envoy.admin.v3.HostHealthStatus)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.admin.v3.HostHealthStatus other) {
      if (other == io.envoyproxy.envoy.admin.v3.HostHealthStatus.getDefaultInstance()) return this;
      if (other.getFailedActiveHealthCheck() != false) {
        setFailedActiveHealthCheck(other.getFailedActiveHealthCheck());
      }
      if (other.getFailedOutlierCheck() != false) {
        setFailedOutlierCheck(other.getFailedOutlierCheck());
      }
      if (other.getFailedActiveDegradedCheck() != false) {
        setFailedActiveDegradedCheck(other.getFailedActiveDegradedCheck());
      }
      if (other.getPendingDynamicRemoval() != false) {
        setPendingDynamicRemoval(other.getPendingDynamicRemoval());
      }
      if (other.getPendingActiveHc() != false) {
        setPendingActiveHc(other.getPendingActiveHc());
      }
      if (other.edsHealthStatus_ != 0) {
        setEdsHealthStatusValue(other.getEdsHealthStatusValue());
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
      io.envoyproxy.envoy.admin.v3.HostHealthStatus parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.admin.v3.HostHealthStatus) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private boolean failedActiveHealthCheck_ ;
    /**
     * <pre>
     * The host is currently failing active health checks.
     * </pre>
     *
     * <code>bool failed_active_health_check = 1;</code>
     * @return The failedActiveHealthCheck.
     */
    @java.lang.Override
    public boolean getFailedActiveHealthCheck() {
      return failedActiveHealthCheck_;
    }
    /**
     * <pre>
     * The host is currently failing active health checks.
     * </pre>
     *
     * <code>bool failed_active_health_check = 1;</code>
     * @param value The failedActiveHealthCheck to set.
     * @return This builder for chaining.
     */
    public Builder setFailedActiveHealthCheck(boolean value) {
      
      failedActiveHealthCheck_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The host is currently failing active health checks.
     * </pre>
     *
     * <code>bool failed_active_health_check = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedActiveHealthCheck() {
      
      failedActiveHealthCheck_ = false;
      onChanged();
      return this;
    }

    private boolean failedOutlierCheck_ ;
    /**
     * <pre>
     * The host is currently considered an outlier and has been ejected.
     * </pre>
     *
     * <code>bool failed_outlier_check = 2;</code>
     * @return The failedOutlierCheck.
     */
    @java.lang.Override
    public boolean getFailedOutlierCheck() {
      return failedOutlierCheck_;
    }
    /**
     * <pre>
     * The host is currently considered an outlier and has been ejected.
     * </pre>
     *
     * <code>bool failed_outlier_check = 2;</code>
     * @param value The failedOutlierCheck to set.
     * @return This builder for chaining.
     */
    public Builder setFailedOutlierCheck(boolean value) {
      
      failedOutlierCheck_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The host is currently considered an outlier and has been ejected.
     * </pre>
     *
     * <code>bool failed_outlier_check = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedOutlierCheck() {
      
      failedOutlierCheck_ = false;
      onChanged();
      return this;
    }

    private boolean failedActiveDegradedCheck_ ;
    /**
     * <pre>
     * The host is currently being marked as degraded through active health checking.
     * </pre>
     *
     * <code>bool failed_active_degraded_check = 4;</code>
     * @return The failedActiveDegradedCheck.
     */
    @java.lang.Override
    public boolean getFailedActiveDegradedCheck() {
      return failedActiveDegradedCheck_;
    }
    /**
     * <pre>
     * The host is currently being marked as degraded through active health checking.
     * </pre>
     *
     * <code>bool failed_active_degraded_check = 4;</code>
     * @param value The failedActiveDegradedCheck to set.
     * @return This builder for chaining.
     */
    public Builder setFailedActiveDegradedCheck(boolean value) {
      
      failedActiveDegradedCheck_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The host is currently being marked as degraded through active health checking.
     * </pre>
     *
     * <code>bool failed_active_degraded_check = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearFailedActiveDegradedCheck() {
      
      failedActiveDegradedCheck_ = false;
      onChanged();
      return this;
    }

    private boolean pendingDynamicRemoval_ ;
    /**
     * <pre>
     * The host has been removed from service discovery, but is being stabilized due to active
     * health checking.
     * </pre>
     *
     * <code>bool pending_dynamic_removal = 5;</code>
     * @return The pendingDynamicRemoval.
     */
    @java.lang.Override
    public boolean getPendingDynamicRemoval() {
      return pendingDynamicRemoval_;
    }
    /**
     * <pre>
     * The host has been removed from service discovery, but is being stabilized due to active
     * health checking.
     * </pre>
     *
     * <code>bool pending_dynamic_removal = 5;</code>
     * @param value The pendingDynamicRemoval to set.
     * @return This builder for chaining.
     */
    public Builder setPendingDynamicRemoval(boolean value) {
      
      pendingDynamicRemoval_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The host has been removed from service discovery, but is being stabilized due to active
     * health checking.
     * </pre>
     *
     * <code>bool pending_dynamic_removal = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPendingDynamicRemoval() {
      
      pendingDynamicRemoval_ = false;
      onChanged();
      return this;
    }

    private boolean pendingActiveHc_ ;
    /**
     * <pre>
     * The host has not yet been health checked.
     * </pre>
     *
     * <code>bool pending_active_hc = 6;</code>
     * @return The pendingActiveHc.
     */
    @java.lang.Override
    public boolean getPendingActiveHc() {
      return pendingActiveHc_;
    }
    /**
     * <pre>
     * The host has not yet been health checked.
     * </pre>
     *
     * <code>bool pending_active_hc = 6;</code>
     * @param value The pendingActiveHc to set.
     * @return This builder for chaining.
     */
    public Builder setPendingActiveHc(boolean value) {
      
      pendingActiveHc_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The host has not yet been health checked.
     * </pre>
     *
     * <code>bool pending_active_hc = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPendingActiveHc() {
      
      pendingActiveHc_ = false;
      onChanged();
      return this;
    }

    private int edsHealthStatus_ = 0;
    /**
     * <pre>
     * Health status as reported by EDS. Note: only HEALTHY and UNHEALTHY are currently supported
     * here.
     * [#comment:TODO(mrice32): pipe through remaining EDS health status possibilities.]
     * </pre>
     *
     * <code>.envoy.config.core.v3.HealthStatus eds_health_status = 3;</code>
     * @return The enum numeric value on the wire for edsHealthStatus.
     */
    @java.lang.Override public int getEdsHealthStatusValue() {
      return edsHealthStatus_;
    }
    /**
     * <pre>
     * Health status as reported by EDS. Note: only HEALTHY and UNHEALTHY are currently supported
     * here.
     * [#comment:TODO(mrice32): pipe through remaining EDS health status possibilities.]
     * </pre>
     *
     * <code>.envoy.config.core.v3.HealthStatus eds_health_status = 3;</code>
     * @param value The enum numeric value on the wire for edsHealthStatus to set.
     * @return This builder for chaining.
     */
    public Builder setEdsHealthStatusValue(int value) {
      
      edsHealthStatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Health status as reported by EDS. Note: only HEALTHY and UNHEALTHY are currently supported
     * here.
     * [#comment:TODO(mrice32): pipe through remaining EDS health status possibilities.]
     * </pre>
     *
     * <code>.envoy.config.core.v3.HealthStatus eds_health_status = 3;</code>
     * @return The edsHealthStatus.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.config.core.v3.HealthStatus getEdsHealthStatus() {
      @SuppressWarnings("deprecation")
      io.envoyproxy.envoy.config.core.v3.HealthStatus result = io.envoyproxy.envoy.config.core.v3.HealthStatus.valueOf(edsHealthStatus_);
      return result == null ? io.envoyproxy.envoy.config.core.v3.HealthStatus.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Health status as reported by EDS. Note: only HEALTHY and UNHEALTHY are currently supported
     * here.
     * [#comment:TODO(mrice32): pipe through remaining EDS health status possibilities.]
     * </pre>
     *
     * <code>.envoy.config.core.v3.HealthStatus eds_health_status = 3;</code>
     * @param value The edsHealthStatus to set.
     * @return This builder for chaining.
     */
    public Builder setEdsHealthStatus(io.envoyproxy.envoy.config.core.v3.HealthStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      edsHealthStatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Health status as reported by EDS. Note: only HEALTHY and UNHEALTHY are currently supported
     * here.
     * [#comment:TODO(mrice32): pipe through remaining EDS health status possibilities.]
     * </pre>
     *
     * <code>.envoy.config.core.v3.HealthStatus eds_health_status = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEdsHealthStatus() {
      
      edsHealthStatus_ = 0;
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


    // @@protoc_insertion_point(builder_scope:envoy.admin.v3.HostHealthStatus)
  }

  // @@protoc_insertion_point(class_scope:envoy.admin.v3.HostHealthStatus)
  private static final io.envoyproxy.envoy.admin.v3.HostHealthStatus DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.admin.v3.HostHealthStatus();
  }

  public static io.envoyproxy.envoy.admin.v3.HostHealthStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HostHealthStatus>
      PARSER = new com.google.protobuf.AbstractParser<HostHealthStatus>() {
    @java.lang.Override
    public HostHealthStatus parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HostHealthStatus(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HostHealthStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HostHealthStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.admin.v3.HostHealthStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

