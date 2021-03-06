// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/common/dynamic_forward_proxy/v3/dns_cache.proto

package io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3;

/**
 * <pre>
 * Configuration of circuit breakers for resolver.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers}
 */
public final class DnsCacheCircuitBreakers extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers)
    DnsCacheCircuitBreakersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DnsCacheCircuitBreakers.newBuilder() to construct.
  private DnsCacheCircuitBreakers(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DnsCacheCircuitBreakers() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DnsCacheCircuitBreakers();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DnsCacheCircuitBreakers(
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
            com.google.protobuf.UInt32Value.Builder subBuilder = null;
            if (maxPendingRequests_ != null) {
              subBuilder = maxPendingRequests_.toBuilder();
            }
            maxPendingRequests_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(maxPendingRequests_);
              maxPendingRequests_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheProto.internal_static_envoy_extensions_common_dynamic_forward_proxy_v3_DnsCacheCircuitBreakers_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheProto.internal_static_envoy_extensions_common_dynamic_forward_proxy_v3_DnsCacheCircuitBreakers_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers.class, io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers.Builder.class);
  }

  public static final int MAX_PENDING_REQUESTS_FIELD_NUMBER = 1;
  private com.google.protobuf.UInt32Value maxPendingRequests_;
  /**
   * <pre>
   * The maximum number of pending requests that Envoy will allow to the
   * resolver. If not specified, the default is 1024.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_pending_requests = 1;</code>
   * @return Whether the maxPendingRequests field is set.
   */
  @java.lang.Override
  public boolean hasMaxPendingRequests() {
    return maxPendingRequests_ != null;
  }
  /**
   * <pre>
   * The maximum number of pending requests that Envoy will allow to the
   * resolver. If not specified, the default is 1024.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_pending_requests = 1;</code>
   * @return The maxPendingRequests.
   */
  @java.lang.Override
  public com.google.protobuf.UInt32Value getMaxPendingRequests() {
    return maxPendingRequests_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : maxPendingRequests_;
  }
  /**
   * <pre>
   * The maximum number of pending requests that Envoy will allow to the
   * resolver. If not specified, the default is 1024.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value max_pending_requests = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.UInt32ValueOrBuilder getMaxPendingRequestsOrBuilder() {
    return getMaxPendingRequests();
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
    if (maxPendingRequests_ != null) {
      output.writeMessage(1, getMaxPendingRequests());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxPendingRequests_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMaxPendingRequests());
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers other = (io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers) obj;

    if (hasMaxPendingRequests() != other.hasMaxPendingRequests()) return false;
    if (hasMaxPendingRequests()) {
      if (!getMaxPendingRequests()
          .equals(other.getMaxPendingRequests())) return false;
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
    if (hasMaxPendingRequests()) {
      hash = (37 * hash) + MAX_PENDING_REQUESTS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxPendingRequests().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers prototype) {
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
   * Configuration of circuit breakers for resolver.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers)
      io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheProto.internal_static_envoy_extensions_common_dynamic_forward_proxy_v3_DnsCacheCircuitBreakers_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheProto.internal_static_envoy_extensions_common_dynamic_forward_proxy_v3_DnsCacheCircuitBreakers_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers.class, io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers.newBuilder()
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
      if (maxPendingRequestsBuilder_ == null) {
        maxPendingRequests_ = null;
      } else {
        maxPendingRequests_ = null;
        maxPendingRequestsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheProto.internal_static_envoy_extensions_common_dynamic_forward_proxy_v3_DnsCacheCircuitBreakers_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers build() {
      io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers buildPartial() {
      io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers result = new io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers(this);
      if (maxPendingRequestsBuilder_ == null) {
        result.maxPendingRequests_ = maxPendingRequests_;
      } else {
        result.maxPendingRequests_ = maxPendingRequestsBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers) {
        return mergeFrom((io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers other) {
      if (other == io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers.getDefaultInstance()) return this;
      if (other.hasMaxPendingRequests()) {
        mergeMaxPendingRequests(other.getMaxPendingRequests());
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
      io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.UInt32Value maxPendingRequests_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> maxPendingRequestsBuilder_;
    /**
     * <pre>
     * The maximum number of pending requests that Envoy will allow to the
     * resolver. If not specified, the default is 1024.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_pending_requests = 1;</code>
     * @return Whether the maxPendingRequests field is set.
     */
    public boolean hasMaxPendingRequests() {
      return maxPendingRequestsBuilder_ != null || maxPendingRequests_ != null;
    }
    /**
     * <pre>
     * The maximum number of pending requests that Envoy will allow to the
     * resolver. If not specified, the default is 1024.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_pending_requests = 1;</code>
     * @return The maxPendingRequests.
     */
    public com.google.protobuf.UInt32Value getMaxPendingRequests() {
      if (maxPendingRequestsBuilder_ == null) {
        return maxPendingRequests_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : maxPendingRequests_;
      } else {
        return maxPendingRequestsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The maximum number of pending requests that Envoy will allow to the
     * resolver. If not specified, the default is 1024.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_pending_requests = 1;</code>
     */
    public Builder setMaxPendingRequests(com.google.protobuf.UInt32Value value) {
      if (maxPendingRequestsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        maxPendingRequests_ = value;
        onChanged();
      } else {
        maxPendingRequestsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The maximum number of pending requests that Envoy will allow to the
     * resolver. If not specified, the default is 1024.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_pending_requests = 1;</code>
     */
    public Builder setMaxPendingRequests(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      if (maxPendingRequestsBuilder_ == null) {
        maxPendingRequests_ = builderForValue.build();
        onChanged();
      } else {
        maxPendingRequestsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The maximum number of pending requests that Envoy will allow to the
     * resolver. If not specified, the default is 1024.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_pending_requests = 1;</code>
     */
    public Builder mergeMaxPendingRequests(com.google.protobuf.UInt32Value value) {
      if (maxPendingRequestsBuilder_ == null) {
        if (maxPendingRequests_ != null) {
          maxPendingRequests_ =
            com.google.protobuf.UInt32Value.newBuilder(maxPendingRequests_).mergeFrom(value).buildPartial();
        } else {
          maxPendingRequests_ = value;
        }
        onChanged();
      } else {
        maxPendingRequestsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The maximum number of pending requests that Envoy will allow to the
     * resolver. If not specified, the default is 1024.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_pending_requests = 1;</code>
     */
    public Builder clearMaxPendingRequests() {
      if (maxPendingRequestsBuilder_ == null) {
        maxPendingRequests_ = null;
        onChanged();
      } else {
        maxPendingRequests_ = null;
        maxPendingRequestsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The maximum number of pending requests that Envoy will allow to the
     * resolver. If not specified, the default is 1024.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_pending_requests = 1;</code>
     */
    public com.google.protobuf.UInt32Value.Builder getMaxPendingRequestsBuilder() {
      
      onChanged();
      return getMaxPendingRequestsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The maximum number of pending requests that Envoy will allow to the
     * resolver. If not specified, the default is 1024.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_pending_requests = 1;</code>
     */
    public com.google.protobuf.UInt32ValueOrBuilder getMaxPendingRequestsOrBuilder() {
      if (maxPendingRequestsBuilder_ != null) {
        return maxPendingRequestsBuilder_.getMessageOrBuilder();
      } else {
        return maxPendingRequests_ == null ?
            com.google.protobuf.UInt32Value.getDefaultInstance() : maxPendingRequests_;
      }
    }
    /**
     * <pre>
     * The maximum number of pending requests that Envoy will allow to the
     * resolver. If not specified, the default is 1024.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value max_pending_requests = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> 
        getMaxPendingRequestsFieldBuilder() {
      if (maxPendingRequestsBuilder_ == null) {
        maxPendingRequestsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder>(
                getMaxPendingRequests(),
                getParentForChildren(),
                isClean());
        maxPendingRequests_ = null;
      }
      return maxPendingRequestsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers)
  private static final io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers();
  }

  public static io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DnsCacheCircuitBreakers>
      PARSER = new com.google.protobuf.AbstractParser<DnsCacheCircuitBreakers>() {
    @java.lang.Override
    public DnsCacheCircuitBreakers parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DnsCacheCircuitBreakers(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DnsCacheCircuitBreakers> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DnsCacheCircuitBreakers> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheCircuitBreakers getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

