// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/http_connection_manager/v3/http_connection_manager.proto

package io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3;

/**
 * <pre>
 * This message is used to work around the limitations with 'oneof' and repeated fields.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList}
 */
public final class ScopedRouteConfigurationsList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList)
    ScopedRouteConfigurationsListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ScopedRouteConfigurationsList.newBuilder() to construct.
  private ScopedRouteConfigurationsList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ScopedRouteConfigurationsList() {
    scopedRouteConfigurations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ScopedRouteConfigurationsList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ScopedRouteConfigurationsList(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              scopedRouteConfigurations_ = new java.util.ArrayList<io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration>();
              mutable_bitField0_ |= 0x00000001;
            }
            scopedRouteConfigurations_.add(
                input.readMessage(io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration.parser(), extensionRegistry));
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
        scopedRouteConfigurations_ = java.util.Collections.unmodifiableList(scopedRouteConfigurations_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManagerProto.internal_static_envoy_extensions_filters_network_http_connection_manager_v3_ScopedRouteConfigurationsList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManagerProto.internal_static_envoy_extensions_filters_network_http_connection_manager_v3_ScopedRouteConfigurationsList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList.class, io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList.Builder.class);
  }

  public static final int SCOPED_ROUTE_CONFIGURATIONS_FIELD_NUMBER = 1;
  private java.util.List<io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration> scopedRouteConfigurations_;
  /**
   * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration> getScopedRouteConfigurationsList() {
    return scopedRouteConfigurations_;
  }
  /**
   * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.envoyproxy.envoy.config.route.v3.ScopedRouteConfigurationOrBuilder> 
      getScopedRouteConfigurationsOrBuilderList() {
    return scopedRouteConfigurations_;
  }
  /**
   * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public int getScopedRouteConfigurationsCount() {
    return scopedRouteConfigurations_.size();
  }
  /**
   * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration getScopedRouteConfigurations(int index) {
    return scopedRouteConfigurations_.get(index);
  }
  /**
   * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.route.v3.ScopedRouteConfigurationOrBuilder getScopedRouteConfigurationsOrBuilder(
      int index) {
    return scopedRouteConfigurations_.get(index);
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
    for (int i = 0; i < scopedRouteConfigurations_.size(); i++) {
      output.writeMessage(1, scopedRouteConfigurations_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < scopedRouteConfigurations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, scopedRouteConfigurations_.get(i));
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList other = (io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList) obj;

    if (!getScopedRouteConfigurationsList()
        .equals(other.getScopedRouteConfigurationsList())) return false;
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
    if (getScopedRouteConfigurationsCount() > 0) {
      hash = (37 * hash) + SCOPED_ROUTE_CONFIGURATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getScopedRouteConfigurationsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList prototype) {
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
   * This message is used to work around the limitations with 'oneof' and repeated fields.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList)
      io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManagerProto.internal_static_envoy_extensions_filters_network_http_connection_manager_v3_ScopedRouteConfigurationsList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManagerProto.internal_static_envoy_extensions_filters_network_http_connection_manager_v3_ScopedRouteConfigurationsList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList.class, io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList.newBuilder()
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
        getScopedRouteConfigurationsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (scopedRouteConfigurationsBuilder_ == null) {
        scopedRouteConfigurations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        scopedRouteConfigurationsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.HttpConnectionManagerProto.internal_static_envoy_extensions_filters_network_http_connection_manager_v3_ScopedRouteConfigurationsList_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList build() {
      io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList buildPartial() {
      io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList result = new io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList(this);
      int from_bitField0_ = bitField0_;
      if (scopedRouteConfigurationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          scopedRouteConfigurations_ = java.util.Collections.unmodifiableList(scopedRouteConfigurations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.scopedRouteConfigurations_ = scopedRouteConfigurations_;
      } else {
        result.scopedRouteConfigurations_ = scopedRouteConfigurationsBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList other) {
      if (other == io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList.getDefaultInstance()) return this;
      if (scopedRouteConfigurationsBuilder_ == null) {
        if (!other.scopedRouteConfigurations_.isEmpty()) {
          if (scopedRouteConfigurations_.isEmpty()) {
            scopedRouteConfigurations_ = other.scopedRouteConfigurations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureScopedRouteConfigurationsIsMutable();
            scopedRouteConfigurations_.addAll(other.scopedRouteConfigurations_);
          }
          onChanged();
        }
      } else {
        if (!other.scopedRouteConfigurations_.isEmpty()) {
          if (scopedRouteConfigurationsBuilder_.isEmpty()) {
            scopedRouteConfigurationsBuilder_.dispose();
            scopedRouteConfigurationsBuilder_ = null;
            scopedRouteConfigurations_ = other.scopedRouteConfigurations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            scopedRouteConfigurationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getScopedRouteConfigurationsFieldBuilder() : null;
          } else {
            scopedRouteConfigurationsBuilder_.addAllMessages(other.scopedRouteConfigurations_);
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
      io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration> scopedRouteConfigurations_ =
      java.util.Collections.emptyList();
    private void ensureScopedRouteConfigurationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        scopedRouteConfigurations_ = new java.util.ArrayList<io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration>(scopedRouteConfigurations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration, io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration.Builder, io.envoyproxy.envoy.config.route.v3.ScopedRouteConfigurationOrBuilder> scopedRouteConfigurationsBuilder_;

    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public java.util.List<io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration> getScopedRouteConfigurationsList() {
      if (scopedRouteConfigurationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(scopedRouteConfigurations_);
      } else {
        return scopedRouteConfigurationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public int getScopedRouteConfigurationsCount() {
      if (scopedRouteConfigurationsBuilder_ == null) {
        return scopedRouteConfigurations_.size();
      } else {
        return scopedRouteConfigurationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration getScopedRouteConfigurations(int index) {
      if (scopedRouteConfigurationsBuilder_ == null) {
        return scopedRouteConfigurations_.get(index);
      } else {
        return scopedRouteConfigurationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setScopedRouteConfigurations(
        int index, io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration value) {
      if (scopedRouteConfigurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScopedRouteConfigurationsIsMutable();
        scopedRouteConfigurations_.set(index, value);
        onChanged();
      } else {
        scopedRouteConfigurationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setScopedRouteConfigurations(
        int index, io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration.Builder builderForValue) {
      if (scopedRouteConfigurationsBuilder_ == null) {
        ensureScopedRouteConfigurationsIsMutable();
        scopedRouteConfigurations_.set(index, builderForValue.build());
        onChanged();
      } else {
        scopedRouteConfigurationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addScopedRouteConfigurations(io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration value) {
      if (scopedRouteConfigurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScopedRouteConfigurationsIsMutable();
        scopedRouteConfigurations_.add(value);
        onChanged();
      } else {
        scopedRouteConfigurationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addScopedRouteConfigurations(
        int index, io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration value) {
      if (scopedRouteConfigurationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureScopedRouteConfigurationsIsMutable();
        scopedRouteConfigurations_.add(index, value);
        onChanged();
      } else {
        scopedRouteConfigurationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addScopedRouteConfigurations(
        io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration.Builder builderForValue) {
      if (scopedRouteConfigurationsBuilder_ == null) {
        ensureScopedRouteConfigurationsIsMutable();
        scopedRouteConfigurations_.add(builderForValue.build());
        onChanged();
      } else {
        scopedRouteConfigurationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addScopedRouteConfigurations(
        int index, io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration.Builder builderForValue) {
      if (scopedRouteConfigurationsBuilder_ == null) {
        ensureScopedRouteConfigurationsIsMutable();
        scopedRouteConfigurations_.add(index, builderForValue.build());
        onChanged();
      } else {
        scopedRouteConfigurationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder addAllScopedRouteConfigurations(
        java.lang.Iterable<? extends io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration> values) {
      if (scopedRouteConfigurationsBuilder_ == null) {
        ensureScopedRouteConfigurationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, scopedRouteConfigurations_);
        onChanged();
      } else {
        scopedRouteConfigurationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearScopedRouteConfigurations() {
      if (scopedRouteConfigurationsBuilder_ == null) {
        scopedRouteConfigurations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        scopedRouteConfigurationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder removeScopedRouteConfigurations(int index) {
      if (scopedRouteConfigurationsBuilder_ == null) {
        ensureScopedRouteConfigurationsIsMutable();
        scopedRouteConfigurations_.remove(index);
        onChanged();
      } else {
        scopedRouteConfigurationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration.Builder getScopedRouteConfigurationsBuilder(
        int index) {
      return getScopedRouteConfigurationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.route.v3.ScopedRouteConfigurationOrBuilder getScopedRouteConfigurationsOrBuilder(
        int index) {
      if (scopedRouteConfigurationsBuilder_ == null) {
        return scopedRouteConfigurations_.get(index);  } else {
        return scopedRouteConfigurationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public java.util.List<? extends io.envoyproxy.envoy.config.route.v3.ScopedRouteConfigurationOrBuilder> 
         getScopedRouteConfigurationsOrBuilderList() {
      if (scopedRouteConfigurationsBuilder_ != null) {
        return scopedRouteConfigurationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(scopedRouteConfigurations_);
      }
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration.Builder addScopedRouteConfigurationsBuilder() {
      return getScopedRouteConfigurationsFieldBuilder().addBuilder(
          io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration.getDefaultInstance());
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration.Builder addScopedRouteConfigurationsBuilder(
        int index) {
      return getScopedRouteConfigurationsFieldBuilder().addBuilder(
          index, io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration.getDefaultInstance());
    }
    /**
     * <code>repeated .envoy.config.route.v3.ScopedRouteConfiguration scoped_route_configurations = 1 [(.validate.rules) = { ... }</code>
     */
    public java.util.List<io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration.Builder> 
         getScopedRouteConfigurationsBuilderList() {
      return getScopedRouteConfigurationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration, io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration.Builder, io.envoyproxy.envoy.config.route.v3.ScopedRouteConfigurationOrBuilder> 
        getScopedRouteConfigurationsFieldBuilder() {
      if (scopedRouteConfigurationsBuilder_ == null) {
        scopedRouteConfigurationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration, io.envoyproxy.envoy.config.route.v3.ScopedRouteConfiguration.Builder, io.envoyproxy.envoy.config.route.v3.ScopedRouteConfigurationOrBuilder>(
                scopedRouteConfigurations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        scopedRouteConfigurations_ = null;
      }
      return scopedRouteConfigurationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList)
  private static final io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList();
  }

  public static io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScopedRouteConfigurationsList>
      PARSER = new com.google.protobuf.AbstractParser<ScopedRouteConfigurationsList>() {
    @java.lang.Override
    public ScopedRouteConfigurationsList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ScopedRouteConfigurationsList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ScopedRouteConfigurationsList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScopedRouteConfigurationsList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.network.http_connection_manager.v3.ScopedRouteConfigurationsList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
