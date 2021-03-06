// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/health/v3/hds.proto

package io.envoyproxy.envoy.service.health.v3;

/**
 * Protobuf type {@code envoy.service.health.v3.HealthCheckRequest}
 */
public final class HealthCheckRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.service.health.v3.HealthCheckRequest)
    HealthCheckRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HealthCheckRequest.newBuilder() to construct.
  private HealthCheckRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HealthCheckRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HealthCheckRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private HealthCheckRequest(
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
            io.envoyproxy.envoy.config.core.v3.Node.Builder subBuilder = null;
            if (node_ != null) {
              subBuilder = node_.toBuilder();
            }
            node_ = input.readMessage(io.envoyproxy.envoy.config.core.v3.Node.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(node_);
              node_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.envoyproxy.envoy.service.health.v3.Capability.Builder subBuilder = null;
            if (capability_ != null) {
              subBuilder = capability_.toBuilder();
            }
            capability_ = input.readMessage(io.envoyproxy.envoy.service.health.v3.Capability.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(capability_);
              capability_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.service.health.v3.HdsProto.internal_static_envoy_service_health_v3_HealthCheckRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.service.health.v3.HdsProto.internal_static_envoy_service_health_v3_HealthCheckRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.service.health.v3.HealthCheckRequest.class, io.envoyproxy.envoy.service.health.v3.HealthCheckRequest.Builder.class);
  }

  public static final int NODE_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.config.core.v3.Node node_;
  /**
   * <code>.envoy.config.core.v3.Node node = 1;</code>
   * @return Whether the node field is set.
   */
  @java.lang.Override
  public boolean hasNode() {
    return node_ != null;
  }
  /**
   * <code>.envoy.config.core.v3.Node node = 1;</code>
   * @return The node.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.Node getNode() {
    return node_ == null ? io.envoyproxy.envoy.config.core.v3.Node.getDefaultInstance() : node_;
  }
  /**
   * <code>.envoy.config.core.v3.Node node = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.NodeOrBuilder getNodeOrBuilder() {
    return getNode();
  }

  public static final int CAPABILITY_FIELD_NUMBER = 2;
  private io.envoyproxy.envoy.service.health.v3.Capability capability_;
  /**
   * <code>.envoy.service.health.v3.Capability capability = 2;</code>
   * @return Whether the capability field is set.
   */
  @java.lang.Override
  public boolean hasCapability() {
    return capability_ != null;
  }
  /**
   * <code>.envoy.service.health.v3.Capability capability = 2;</code>
   * @return The capability.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.service.health.v3.Capability getCapability() {
    return capability_ == null ? io.envoyproxy.envoy.service.health.v3.Capability.getDefaultInstance() : capability_;
  }
  /**
   * <code>.envoy.service.health.v3.Capability capability = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.service.health.v3.CapabilityOrBuilder getCapabilityOrBuilder() {
    return getCapability();
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
    if (node_ != null) {
      output.writeMessage(1, getNode());
    }
    if (capability_ != null) {
      output.writeMessage(2, getCapability());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (node_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNode());
    }
    if (capability_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCapability());
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
    if (!(obj instanceof io.envoyproxy.envoy.service.health.v3.HealthCheckRequest)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.service.health.v3.HealthCheckRequest other = (io.envoyproxy.envoy.service.health.v3.HealthCheckRequest) obj;

    if (hasNode() != other.hasNode()) return false;
    if (hasNode()) {
      if (!getNode()
          .equals(other.getNode())) return false;
    }
    if (hasCapability() != other.hasCapability()) return false;
    if (hasCapability()) {
      if (!getCapability()
          .equals(other.getCapability())) return false;
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
    if (hasNode()) {
      hash = (37 * hash) + NODE_FIELD_NUMBER;
      hash = (53 * hash) + getNode().hashCode();
    }
    if (hasCapability()) {
      hash = (37 * hash) + CAPABILITY_FIELD_NUMBER;
      hash = (53 * hash) + getCapability().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.service.health.v3.HealthCheckRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.health.v3.HealthCheckRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.health.v3.HealthCheckRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.health.v3.HealthCheckRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.health.v3.HealthCheckRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.service.health.v3.HealthCheckRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.health.v3.HealthCheckRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.health.v3.HealthCheckRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.health.v3.HealthCheckRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.health.v3.HealthCheckRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.service.health.v3.HealthCheckRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.service.health.v3.HealthCheckRequest parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.service.health.v3.HealthCheckRequest prototype) {
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
   * Protobuf type {@code envoy.service.health.v3.HealthCheckRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.service.health.v3.HealthCheckRequest)
      io.envoyproxy.envoy.service.health.v3.HealthCheckRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.service.health.v3.HdsProto.internal_static_envoy_service_health_v3_HealthCheckRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.service.health.v3.HdsProto.internal_static_envoy_service_health_v3_HealthCheckRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.service.health.v3.HealthCheckRequest.class, io.envoyproxy.envoy.service.health.v3.HealthCheckRequest.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.service.health.v3.HealthCheckRequest.newBuilder()
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
      if (nodeBuilder_ == null) {
        node_ = null;
      } else {
        node_ = null;
        nodeBuilder_ = null;
      }
      if (capabilityBuilder_ == null) {
        capability_ = null;
      } else {
        capability_ = null;
        capabilityBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.service.health.v3.HdsProto.internal_static_envoy_service_health_v3_HealthCheckRequest_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.health.v3.HealthCheckRequest getDefaultInstanceForType() {
      return io.envoyproxy.envoy.service.health.v3.HealthCheckRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.health.v3.HealthCheckRequest build() {
      io.envoyproxy.envoy.service.health.v3.HealthCheckRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.service.health.v3.HealthCheckRequest buildPartial() {
      io.envoyproxy.envoy.service.health.v3.HealthCheckRequest result = new io.envoyproxy.envoy.service.health.v3.HealthCheckRequest(this);
      if (nodeBuilder_ == null) {
        result.node_ = node_;
      } else {
        result.node_ = nodeBuilder_.build();
      }
      if (capabilityBuilder_ == null) {
        result.capability_ = capability_;
      } else {
        result.capability_ = capabilityBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.service.health.v3.HealthCheckRequest) {
        return mergeFrom((io.envoyproxy.envoy.service.health.v3.HealthCheckRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.service.health.v3.HealthCheckRequest other) {
      if (other == io.envoyproxy.envoy.service.health.v3.HealthCheckRequest.getDefaultInstance()) return this;
      if (other.hasNode()) {
        mergeNode(other.getNode());
      }
      if (other.hasCapability()) {
        mergeCapability(other.getCapability());
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
      io.envoyproxy.envoy.service.health.v3.HealthCheckRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.service.health.v3.HealthCheckRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.envoyproxy.envoy.config.core.v3.Node node_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.Node, io.envoyproxy.envoy.config.core.v3.Node.Builder, io.envoyproxy.envoy.config.core.v3.NodeOrBuilder> nodeBuilder_;
    /**
     * <code>.envoy.config.core.v3.Node node = 1;</code>
     * @return Whether the node field is set.
     */
    public boolean hasNode() {
      return nodeBuilder_ != null || node_ != null;
    }
    /**
     * <code>.envoy.config.core.v3.Node node = 1;</code>
     * @return The node.
     */
    public io.envoyproxy.envoy.config.core.v3.Node getNode() {
      if (nodeBuilder_ == null) {
        return node_ == null ? io.envoyproxy.envoy.config.core.v3.Node.getDefaultInstance() : node_;
      } else {
        return nodeBuilder_.getMessage();
      }
    }
    /**
     * <code>.envoy.config.core.v3.Node node = 1;</code>
     */
    public Builder setNode(io.envoyproxy.envoy.config.core.v3.Node value) {
      if (nodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        node_ = value;
        onChanged();
      } else {
        nodeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.envoy.config.core.v3.Node node = 1;</code>
     */
    public Builder setNode(
        io.envoyproxy.envoy.config.core.v3.Node.Builder builderForValue) {
      if (nodeBuilder_ == null) {
        node_ = builderForValue.build();
        onChanged();
      } else {
        nodeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.envoy.config.core.v3.Node node = 1;</code>
     */
    public Builder mergeNode(io.envoyproxy.envoy.config.core.v3.Node value) {
      if (nodeBuilder_ == null) {
        if (node_ != null) {
          node_ =
            io.envoyproxy.envoy.config.core.v3.Node.newBuilder(node_).mergeFrom(value).buildPartial();
        } else {
          node_ = value;
        }
        onChanged();
      } else {
        nodeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.envoy.config.core.v3.Node node = 1;</code>
     */
    public Builder clearNode() {
      if (nodeBuilder_ == null) {
        node_ = null;
        onChanged();
      } else {
        node_ = null;
        nodeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.envoy.config.core.v3.Node node = 1;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.Node.Builder getNodeBuilder() {
      
      onChanged();
      return getNodeFieldBuilder().getBuilder();
    }
    /**
     * <code>.envoy.config.core.v3.Node node = 1;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.NodeOrBuilder getNodeOrBuilder() {
      if (nodeBuilder_ != null) {
        return nodeBuilder_.getMessageOrBuilder();
      } else {
        return node_ == null ?
            io.envoyproxy.envoy.config.core.v3.Node.getDefaultInstance() : node_;
      }
    }
    /**
     * <code>.envoy.config.core.v3.Node node = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.Node, io.envoyproxy.envoy.config.core.v3.Node.Builder, io.envoyproxy.envoy.config.core.v3.NodeOrBuilder> 
        getNodeFieldBuilder() {
      if (nodeBuilder_ == null) {
        nodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.Node, io.envoyproxy.envoy.config.core.v3.Node.Builder, io.envoyproxy.envoy.config.core.v3.NodeOrBuilder>(
                getNode(),
                getParentForChildren(),
                isClean());
        node_ = null;
      }
      return nodeBuilder_;
    }

    private io.envoyproxy.envoy.service.health.v3.Capability capability_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.service.health.v3.Capability, io.envoyproxy.envoy.service.health.v3.Capability.Builder, io.envoyproxy.envoy.service.health.v3.CapabilityOrBuilder> capabilityBuilder_;
    /**
     * <code>.envoy.service.health.v3.Capability capability = 2;</code>
     * @return Whether the capability field is set.
     */
    public boolean hasCapability() {
      return capabilityBuilder_ != null || capability_ != null;
    }
    /**
     * <code>.envoy.service.health.v3.Capability capability = 2;</code>
     * @return The capability.
     */
    public io.envoyproxy.envoy.service.health.v3.Capability getCapability() {
      if (capabilityBuilder_ == null) {
        return capability_ == null ? io.envoyproxy.envoy.service.health.v3.Capability.getDefaultInstance() : capability_;
      } else {
        return capabilityBuilder_.getMessage();
      }
    }
    /**
     * <code>.envoy.service.health.v3.Capability capability = 2;</code>
     */
    public Builder setCapability(io.envoyproxy.envoy.service.health.v3.Capability value) {
      if (capabilityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        capability_ = value;
        onChanged();
      } else {
        capabilityBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.envoy.service.health.v3.Capability capability = 2;</code>
     */
    public Builder setCapability(
        io.envoyproxy.envoy.service.health.v3.Capability.Builder builderForValue) {
      if (capabilityBuilder_ == null) {
        capability_ = builderForValue.build();
        onChanged();
      } else {
        capabilityBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.envoy.service.health.v3.Capability capability = 2;</code>
     */
    public Builder mergeCapability(io.envoyproxy.envoy.service.health.v3.Capability value) {
      if (capabilityBuilder_ == null) {
        if (capability_ != null) {
          capability_ =
            io.envoyproxy.envoy.service.health.v3.Capability.newBuilder(capability_).mergeFrom(value).buildPartial();
        } else {
          capability_ = value;
        }
        onChanged();
      } else {
        capabilityBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.envoy.service.health.v3.Capability capability = 2;</code>
     */
    public Builder clearCapability() {
      if (capabilityBuilder_ == null) {
        capability_ = null;
        onChanged();
      } else {
        capability_ = null;
        capabilityBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.envoy.service.health.v3.Capability capability = 2;</code>
     */
    public io.envoyproxy.envoy.service.health.v3.Capability.Builder getCapabilityBuilder() {
      
      onChanged();
      return getCapabilityFieldBuilder().getBuilder();
    }
    /**
     * <code>.envoy.service.health.v3.Capability capability = 2;</code>
     */
    public io.envoyproxy.envoy.service.health.v3.CapabilityOrBuilder getCapabilityOrBuilder() {
      if (capabilityBuilder_ != null) {
        return capabilityBuilder_.getMessageOrBuilder();
      } else {
        return capability_ == null ?
            io.envoyproxy.envoy.service.health.v3.Capability.getDefaultInstance() : capability_;
      }
    }
    /**
     * <code>.envoy.service.health.v3.Capability capability = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.service.health.v3.Capability, io.envoyproxy.envoy.service.health.v3.Capability.Builder, io.envoyproxy.envoy.service.health.v3.CapabilityOrBuilder> 
        getCapabilityFieldBuilder() {
      if (capabilityBuilder_ == null) {
        capabilityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.service.health.v3.Capability, io.envoyproxy.envoy.service.health.v3.Capability.Builder, io.envoyproxy.envoy.service.health.v3.CapabilityOrBuilder>(
                getCapability(),
                getParentForChildren(),
                isClean());
        capability_ = null;
      }
      return capabilityBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.service.health.v3.HealthCheckRequest)
  }

  // @@protoc_insertion_point(class_scope:envoy.service.health.v3.HealthCheckRequest)
  private static final io.envoyproxy.envoy.service.health.v3.HealthCheckRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.service.health.v3.HealthCheckRequest();
  }

  public static io.envoyproxy.envoy.service.health.v3.HealthCheckRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HealthCheckRequest>
      PARSER = new com.google.protobuf.AbstractParser<HealthCheckRequest>() {
    @java.lang.Override
    public HealthCheckRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new HealthCheckRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HealthCheckRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HealthCheckRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.service.health.v3.HealthCheckRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

