// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/health/v3/hds.proto

package io.envoyproxy.envoy.service.health.v3;

/**
 * Protobuf type {@code envoy.service.health.v3.LocalityEndpoints}
 */
public final class LocalityEndpoints extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.service.health.v3.LocalityEndpoints)
    LocalityEndpointsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LocalityEndpoints.newBuilder() to construct.
  private LocalityEndpoints(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LocalityEndpoints() {
    endpoints_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LocalityEndpoints();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LocalityEndpoints(
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
            io.envoyproxy.envoy.config.core.v3.Locality.Builder subBuilder = null;
            if (locality_ != null) {
              subBuilder = locality_.toBuilder();
            }
            locality_ = input.readMessage(io.envoyproxy.envoy.config.core.v3.Locality.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(locality_);
              locality_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              endpoints_ = new java.util.ArrayList<io.envoyproxy.envoy.config.endpoint.v3.Endpoint>();
              mutable_bitField0_ |= 0x00000001;
            }
            endpoints_.add(
                input.readMessage(io.envoyproxy.envoy.config.endpoint.v3.Endpoint.parser(), extensionRegistry));
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
        endpoints_ = java.util.Collections.unmodifiableList(endpoints_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.service.health.v3.HdsProto.internal_static_envoy_service_health_v3_LocalityEndpoints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.service.health.v3.HdsProto.internal_static_envoy_service_health_v3_LocalityEndpoints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.service.health.v3.LocalityEndpoints.class, io.envoyproxy.envoy.service.health.v3.LocalityEndpoints.Builder.class);
  }

  public static final int LOCALITY_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.config.core.v3.Locality locality_;
  /**
   * <code>.envoy.config.core.v3.Locality locality = 1;</code>
   * @return Whether the locality field is set.
   */
  @java.lang.Override
  public boolean hasLocality() {
    return locality_ != null;
  }
  /**
   * <code>.envoy.config.core.v3.Locality locality = 1;</code>
   * @return The locality.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.Locality getLocality() {
    return locality_ == null ? io.envoyproxy.envoy.config.core.v3.Locality.getDefaultInstance() : locality_;
  }
  /**
   * <code>.envoy.config.core.v3.Locality locality = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.LocalityOrBuilder getLocalityOrBuilder() {
    return getLocality();
  }

  public static final int ENDPOINTS_FIELD_NUMBER = 2;
  private java.util.List<io.envoyproxy.envoy.config.endpoint.v3.Endpoint> endpoints_;
  /**
   * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
   */
  @java.lang.Override
  public java.util.List<io.envoyproxy.envoy.config.endpoint.v3.Endpoint> getEndpointsList() {
    return endpoints_;
  }
  /**
   * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.envoyproxy.envoy.config.endpoint.v3.EndpointOrBuilder> 
      getEndpointsOrBuilderList() {
    return endpoints_;
  }
  /**
   * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
   */
  @java.lang.Override
  public int getEndpointsCount() {
    return endpoints_.size();
  }
  /**
   * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.endpoint.v3.Endpoint getEndpoints(int index) {
    return endpoints_.get(index);
  }
  /**
   * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.endpoint.v3.EndpointOrBuilder getEndpointsOrBuilder(
      int index) {
    return endpoints_.get(index);
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
    if (locality_ != null) {
      output.writeMessage(1, getLocality());
    }
    for (int i = 0; i < endpoints_.size(); i++) {
      output.writeMessage(2, endpoints_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (locality_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getLocality());
    }
    for (int i = 0; i < endpoints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, endpoints_.get(i));
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
    if (!(obj instanceof io.envoyproxy.envoy.service.health.v3.LocalityEndpoints)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.service.health.v3.LocalityEndpoints other = (io.envoyproxy.envoy.service.health.v3.LocalityEndpoints) obj;

    if (hasLocality() != other.hasLocality()) return false;
    if (hasLocality()) {
      if (!getLocality()
          .equals(other.getLocality())) return false;
    }
    if (!getEndpointsList()
        .equals(other.getEndpointsList())) return false;
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
    if (hasLocality()) {
      hash = (37 * hash) + LOCALITY_FIELD_NUMBER;
      hash = (53 * hash) + getLocality().hashCode();
    }
    if (getEndpointsCount() > 0) {
      hash = (37 * hash) + ENDPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + getEndpointsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.service.health.v3.LocalityEndpoints parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.health.v3.LocalityEndpoints parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.health.v3.LocalityEndpoints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.health.v3.LocalityEndpoints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.health.v3.LocalityEndpoints parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.health.v3.LocalityEndpoints parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.health.v3.LocalityEndpoints parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.health.v3.LocalityEndpoints parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.health.v3.LocalityEndpoints parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.health.v3.LocalityEndpoints parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.health.v3.LocalityEndpoints parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.health.v3.LocalityEndpoints parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.service.health.v3.LocalityEndpoints prototype) {
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
   * Protobuf type {@code envoy.service.health.v3.LocalityEndpoints}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.service.health.v3.LocalityEndpoints)
      io.envoyproxy.envoy.service.health.v3.LocalityEndpointsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.service.health.v3.HdsProto.internal_static_envoy_service_health_v3_LocalityEndpoints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.service.health.v3.HdsProto.internal_static_envoy_service_health_v3_LocalityEndpoints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.service.health.v3.LocalityEndpoints.class, io.envoyproxy.envoy.service.health.v3.LocalityEndpoints.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.service.health.v3.LocalityEndpoints.newBuilder()
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
        getEndpointsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (localityBuilder_ == null) {
        locality_ = null;
      } else {
        locality_ = null;
        localityBuilder_ = null;
      }
      if (endpointsBuilder_ == null) {
        endpoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        endpointsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.service.health.v3.HdsProto.internal_static_envoy_service_health_v3_LocalityEndpoints_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.health.v3.LocalityEndpoints getDefaultInstanceForType() {
      return io.envoyproxy.envoy.service.health.v3.LocalityEndpoints.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.health.v3.LocalityEndpoints build() {
      io.envoyproxy.envoy.service.health.v3.LocalityEndpoints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.health.v3.LocalityEndpoints buildPartial() {
      io.envoyproxy.envoy.service.health.v3.LocalityEndpoints result = new io.envoyproxy.envoy.service.health.v3.LocalityEndpoints(this);
      int from_bitField0_ = bitField0_;
      if (localityBuilder_ == null) {
        result.locality_ = locality_;
      } else {
        result.locality_ = localityBuilder_.build();
      }
      if (endpointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          endpoints_ = java.util.Collections.unmodifiableList(endpoints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.endpoints_ = endpoints_;
      } else {
        result.endpoints_ = endpointsBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.service.health.v3.LocalityEndpoints) {
        return mergeFrom((io.envoyproxy.envoy.service.health.v3.LocalityEndpoints)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.service.health.v3.LocalityEndpoints other) {
      if (other == io.envoyproxy.envoy.service.health.v3.LocalityEndpoints.getDefaultInstance()) return this;
      if (other.hasLocality()) {
        mergeLocality(other.getLocality());
      }
      if (endpointsBuilder_ == null) {
        if (!other.endpoints_.isEmpty()) {
          if (endpoints_.isEmpty()) {
            endpoints_ = other.endpoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEndpointsIsMutable();
            endpoints_.addAll(other.endpoints_);
          }
          onChanged();
        }
      } else {
        if (!other.endpoints_.isEmpty()) {
          if (endpointsBuilder_.isEmpty()) {
            endpointsBuilder_.dispose();
            endpointsBuilder_ = null;
            endpoints_ = other.endpoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            endpointsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEndpointsFieldBuilder() : null;
          } else {
            endpointsBuilder_.addAllMessages(other.endpoints_);
          }
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
      io.envoyproxy.envoy.service.health.v3.LocalityEndpoints parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.service.health.v3.LocalityEndpoints) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private io.envoyproxy.envoy.config.core.v3.Locality locality_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.Locality, io.envoyproxy.envoy.config.core.v3.Locality.Builder, io.envoyproxy.envoy.config.core.v3.LocalityOrBuilder> localityBuilder_;
    /**
     * <code>.envoy.config.core.v3.Locality locality = 1;</code>
     * @return Whether the locality field is set.
     */
    public boolean hasLocality() {
      return localityBuilder_ != null || locality_ != null;
    }
    /**
     * <code>.envoy.config.core.v3.Locality locality = 1;</code>
     * @return The locality.
     */
    public io.envoyproxy.envoy.config.core.v3.Locality getLocality() {
      if (localityBuilder_ == null) {
        return locality_ == null ? io.envoyproxy.envoy.config.core.v3.Locality.getDefaultInstance() : locality_;
      } else {
        return localityBuilder_.getMessage();
      }
    }
    /**
     * <code>.envoy.config.core.v3.Locality locality = 1;</code>
     */
    public Builder setLocality(io.envoyproxy.envoy.config.core.v3.Locality value) {
      if (localityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        locality_ = value;
        onChanged();
      } else {
        localityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.envoy.config.core.v3.Locality locality = 1;</code>
     */
    public Builder setLocality(
        io.envoyproxy.envoy.config.core.v3.Locality.Builder builderForValue) {
      if (localityBuilder_ == null) {
        locality_ = builderForValue.build();
        onChanged();
      } else {
        localityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.envoy.config.core.v3.Locality locality = 1;</code>
     */
    public Builder mergeLocality(io.envoyproxy.envoy.config.core.v3.Locality value) {
      if (localityBuilder_ == null) {
        if (locality_ != null) {
          locality_ =
            io.envoyproxy.envoy.config.core.v3.Locality.newBuilder(locality_).mergeFrom(value).buildPartial();
        } else {
          locality_ = value;
        }
        onChanged();
      } else {
        localityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.envoy.config.core.v3.Locality locality = 1;</code>
     */
    public Builder clearLocality() {
      if (localityBuilder_ == null) {
        locality_ = null;
        onChanged();
      } else {
        locality_ = null;
        localityBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.envoy.config.core.v3.Locality locality = 1;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.Locality.Builder getLocalityBuilder() {
      
      onChanged();
      return getLocalityFieldBuilder().getBuilder();
    }
    /**
     * <code>.envoy.config.core.v3.Locality locality = 1;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.LocalityOrBuilder getLocalityOrBuilder() {
      if (localityBuilder_ != null) {
        return localityBuilder_.getMessageOrBuilder();
      } else {
        return locality_ == null ?
            io.envoyproxy.envoy.config.core.v3.Locality.getDefaultInstance() : locality_;
      }
    }
    /**
     * <code>.envoy.config.core.v3.Locality locality = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.Locality, io.envoyproxy.envoy.config.core.v3.Locality.Builder, io.envoyproxy.envoy.config.core.v3.LocalityOrBuilder> 
        getLocalityFieldBuilder() {
      if (localityBuilder_ == null) {
        localityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.Locality, io.envoyproxy.envoy.config.core.v3.Locality.Builder, io.envoyproxy.envoy.config.core.v3.LocalityOrBuilder>(
                getLocality(),
                getParentForChildren(),
                isClean());
        locality_ = null;
      }
      return localityBuilder_;
    }

    private java.util.List<io.envoyproxy.envoy.config.endpoint.v3.Endpoint> endpoints_ =
      java.util.Collections.emptyList();
    private void ensureEndpointsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        endpoints_ = new java.util.ArrayList<io.envoyproxy.envoy.config.endpoint.v3.Endpoint>(endpoints_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.config.endpoint.v3.Endpoint, io.envoyproxy.envoy.config.endpoint.v3.Endpoint.Builder, io.envoyproxy.envoy.config.endpoint.v3.EndpointOrBuilder> endpointsBuilder_;

    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public java.util.List<io.envoyproxy.envoy.config.endpoint.v3.Endpoint> getEndpointsList() {
      if (endpointsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(endpoints_);
      } else {
        return endpointsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public int getEndpointsCount() {
      if (endpointsBuilder_ == null) {
        return endpoints_.size();
      } else {
        return endpointsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public io.envoyproxy.envoy.config.endpoint.v3.Endpoint getEndpoints(int index) {
      if (endpointsBuilder_ == null) {
        return endpoints_.get(index);
      } else {
        return endpointsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public Builder setEndpoints(
        int index, io.envoyproxy.envoy.config.endpoint.v3.Endpoint value) {
      if (endpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEndpointsIsMutable();
        endpoints_.set(index, value);
        onChanged();
      } else {
        endpointsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public Builder setEndpoints(
        int index, io.envoyproxy.envoy.config.endpoint.v3.Endpoint.Builder builderForValue) {
      if (endpointsBuilder_ == null) {
        ensureEndpointsIsMutable();
        endpoints_.set(index, builderForValue.build());
        onChanged();
      } else {
        endpointsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public Builder addEndpoints(io.envoyproxy.envoy.config.endpoint.v3.Endpoint value) {
      if (endpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEndpointsIsMutable();
        endpoints_.add(value);
        onChanged();
      } else {
        endpointsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public Builder addEndpoints(
        int index, io.envoyproxy.envoy.config.endpoint.v3.Endpoint value) {
      if (endpointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEndpointsIsMutable();
        endpoints_.add(index, value);
        onChanged();
      } else {
        endpointsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public Builder addEndpoints(
        io.envoyproxy.envoy.config.endpoint.v3.Endpoint.Builder builderForValue) {
      if (endpointsBuilder_ == null) {
        ensureEndpointsIsMutable();
        endpoints_.add(builderForValue.build());
        onChanged();
      } else {
        endpointsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public Builder addEndpoints(
        int index, io.envoyproxy.envoy.config.endpoint.v3.Endpoint.Builder builderForValue) {
      if (endpointsBuilder_ == null) {
        ensureEndpointsIsMutable();
        endpoints_.add(index, builderForValue.build());
        onChanged();
      } else {
        endpointsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public Builder addAllEndpoints(
        java.lang.Iterable<? extends io.envoyproxy.envoy.config.endpoint.v3.Endpoint> values) {
      if (endpointsBuilder_ == null) {
        ensureEndpointsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, endpoints_);
        onChanged();
      } else {
        endpointsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public Builder clearEndpoints() {
      if (endpointsBuilder_ == null) {
        endpoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        endpointsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public Builder removeEndpoints(int index) {
      if (endpointsBuilder_ == null) {
        ensureEndpointsIsMutable();
        endpoints_.remove(index);
        onChanged();
      } else {
        endpointsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public io.envoyproxy.envoy.config.endpoint.v3.Endpoint.Builder getEndpointsBuilder(
        int index) {
      return getEndpointsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public io.envoyproxy.envoy.config.endpoint.v3.EndpointOrBuilder getEndpointsOrBuilder(
        int index) {
      if (endpointsBuilder_ == null) {
        return endpoints_.get(index);  } else {
        return endpointsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public java.util.List<? extends io.envoyproxy.envoy.config.endpoint.v3.EndpointOrBuilder> 
         getEndpointsOrBuilderList() {
      if (endpointsBuilder_ != null) {
        return endpointsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(endpoints_);
      }
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public io.envoyproxy.envoy.config.endpoint.v3.Endpoint.Builder addEndpointsBuilder() {
      return getEndpointsFieldBuilder().addBuilder(
          io.envoyproxy.envoy.config.endpoint.v3.Endpoint.getDefaultInstance());
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public io.envoyproxy.envoy.config.endpoint.v3.Endpoint.Builder addEndpointsBuilder(
        int index) {
      return getEndpointsFieldBuilder().addBuilder(
          index, io.envoyproxy.envoy.config.endpoint.v3.Endpoint.getDefaultInstance());
    }
    /**
     * <code>repeated .envoy.config.endpoint.v3.Endpoint endpoints = 2;</code>
     */
    public java.util.List<io.envoyproxy.envoy.config.endpoint.v3.Endpoint.Builder> 
         getEndpointsBuilderList() {
      return getEndpointsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.config.endpoint.v3.Endpoint, io.envoyproxy.envoy.config.endpoint.v3.Endpoint.Builder, io.envoyproxy.envoy.config.endpoint.v3.EndpointOrBuilder> 
        getEndpointsFieldBuilder() {
      if (endpointsBuilder_ == null) {
        endpointsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.envoyproxy.envoy.config.endpoint.v3.Endpoint, io.envoyproxy.envoy.config.endpoint.v3.Endpoint.Builder, io.envoyproxy.envoy.config.endpoint.v3.EndpointOrBuilder>(
                endpoints_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        endpoints_ = null;
      }
      return endpointsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.service.health.v3.LocalityEndpoints)
  }

  // @@protoc_insertion_point(class_scope:envoy.service.health.v3.LocalityEndpoints)
  private static final io.envoyproxy.envoy.service.health.v3.LocalityEndpoints DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.service.health.v3.LocalityEndpoints();
  }

  public static io.envoyproxy.envoy.service.health.v3.LocalityEndpoints getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LocalityEndpoints>
      PARSER = new com.google.protobuf.AbstractParser<LocalityEndpoints>() {
    @java.lang.Override
    public LocalityEndpoints parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LocalityEndpoints(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LocalityEndpoints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LocalityEndpoints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.service.health.v3.LocalityEndpoints getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

