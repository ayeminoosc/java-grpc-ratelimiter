// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/accesslog/v3/accesslog.proto

package io.envoyproxy.envoy.config.accesslog.v3;

/**
 * <pre>
 * Performs a logical “or” operation on the result of each individual filter.
 * Filters are evaluated sequentially and if one of them returns true, the
 * filter returns true immediately.
 * </pre>
 *
 * Protobuf type {@code envoy.config.accesslog.v3.OrFilter}
 */
public final class OrFilter extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.accesslog.v3.OrFilter)
    OrFilterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrFilter.newBuilder() to construct.
  private OrFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrFilter() {
    filters_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrFilter();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrFilter(
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
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              filters_ = new java.util.ArrayList<io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter>();
              mutable_bitField0_ |= 0x00000001;
            }
            filters_.add(
                input.readMessage(io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.parser(), extensionRegistry));
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
        filters_ = java.util.Collections.unmodifiableList(filters_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.envoyproxy.envoy.config.accesslog.v3.AccesslogProto.internal_static_envoy_config_accesslog_v3_OrFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.accesslog.v3.AccesslogProto.internal_static_envoy_config_accesslog_v3_OrFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.accesslog.v3.OrFilter.class, io.envoyproxy.envoy.config.accesslog.v3.OrFilter.Builder.class);
  }

  public static final int FILTERS_FIELD_NUMBER = 2;
  private java.util.List<io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter> filters_;
  /**
   * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter> getFiltersList() {
    return filters_;
  }
  /**
   * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilterOrBuilder> 
      getFiltersOrBuilderList() {
    return filters_;
  }
  /**
   * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public int getFiltersCount() {
    return filters_.size();
  }
  /**
   * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter getFilters(int index) {
    return filters_.get(index);
  }
  /**
   * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilterOrBuilder getFiltersOrBuilder(
      int index) {
    return filters_.get(index);
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
    for (int i = 0; i < filters_.size(); i++) {
      output.writeMessage(2, filters_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < filters_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, filters_.get(i));
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
    if (!(obj instanceof io.envoyproxy.envoy.config.accesslog.v3.OrFilter)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.accesslog.v3.OrFilter other = (io.envoyproxy.envoy.config.accesslog.v3.OrFilter) obj;

    if (!getFiltersList()
        .equals(other.getFiltersList())) return false;
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
    if (getFiltersCount() > 0) {
      hash = (37 * hash) + FILTERS_FIELD_NUMBER;
      hash = (53 * hash) + getFiltersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.accesslog.v3.OrFilter parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.OrFilter parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.OrFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.OrFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.OrFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.OrFilter parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.OrFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.OrFilter parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.OrFilter parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.OrFilter parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.OrFilter parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.accesslog.v3.OrFilter parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.accesslog.v3.OrFilter prototype) {
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
   * Performs a logical “or” operation on the result of each individual filter.
   * Filters are evaluated sequentially and if one of them returns true, the
   * filter returns true immediately.
   * </pre>
   *
   * Protobuf type {@code envoy.config.accesslog.v3.OrFilter}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.accesslog.v3.OrFilter)
      io.envoyproxy.envoy.config.accesslog.v3.OrFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.accesslog.v3.AccesslogProto.internal_static_envoy_config_accesslog_v3_OrFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.accesslog.v3.AccesslogProto.internal_static_envoy_config_accesslog_v3_OrFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.accesslog.v3.OrFilter.class, io.envoyproxy.envoy.config.accesslog.v3.OrFilter.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.accesslog.v3.OrFilter.newBuilder()
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
        getFiltersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (filtersBuilder_ == null) {
        filters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        filtersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.accesslog.v3.AccesslogProto.internal_static_envoy_config_accesslog_v3_OrFilter_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.accesslog.v3.OrFilter getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.accesslog.v3.OrFilter.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.accesslog.v3.OrFilter build() {
      io.envoyproxy.envoy.config.accesslog.v3.OrFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.accesslog.v3.OrFilter buildPartial() {
      io.envoyproxy.envoy.config.accesslog.v3.OrFilter result = new io.envoyproxy.envoy.config.accesslog.v3.OrFilter(this);
      int from_bitField0_ = bitField0_;
      if (filtersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          filters_ = java.util.Collections.unmodifiableList(filters_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.filters_ = filters_;
      } else {
        result.filters_ = filtersBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.config.accesslog.v3.OrFilter) {
        return mergeFrom((io.envoyproxy.envoy.config.accesslog.v3.OrFilter)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.accesslog.v3.OrFilter other) {
      if (other == io.envoyproxy.envoy.config.accesslog.v3.OrFilter.getDefaultInstance()) return this;
      if (filtersBuilder_ == null) {
        if (!other.filters_.isEmpty()) {
          if (filters_.isEmpty()) {
            filters_ = other.filters_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFiltersIsMutable();
            filters_.addAll(other.filters_);
          }
          onChanged();
        }
      } else {
        if (!other.filters_.isEmpty()) {
          if (filtersBuilder_.isEmpty()) {
            filtersBuilder_.dispose();
            filtersBuilder_ = null;
            filters_ = other.filters_;
            bitField0_ = (bitField0_ & ~0x00000001);
            filtersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFiltersFieldBuilder() : null;
          } else {
            filtersBuilder_.addAllMessages(other.filters_);
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
      io.envoyproxy.envoy.config.accesslog.v3.OrFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.accesslog.v3.OrFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter> filters_ =
      java.util.Collections.emptyList();
    private void ensureFiltersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        filters_ = new java.util.ArrayList<io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter>(filters_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter, io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.Builder, io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilterOrBuilder> filtersBuilder_;

    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public java.util.List<io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter> getFiltersList() {
      if (filtersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(filters_);
      } else {
        return filtersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public int getFiltersCount() {
      if (filtersBuilder_ == null) {
        return filters_.size();
      } else {
        return filtersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter getFilters(int index) {
      if (filtersBuilder_ == null) {
        return filters_.get(index);
      } else {
        return filtersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setFilters(
        int index, io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.set(index, value);
        onChanged();
      } else {
        filtersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setFilters(
        int index, io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.set(index, builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder addFilters(io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.add(value);
        onChanged();
      } else {
        filtersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder addFilters(
        int index, io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter value) {
      if (filtersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFiltersIsMutable();
        filters_.add(index, value);
        onChanged();
      } else {
        filtersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder addFilters(
        io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.add(builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder addFilters(
        int index, io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.Builder builderForValue) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.add(index, builderForValue.build());
        onChanged();
      } else {
        filtersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder addAllFilters(
        java.lang.Iterable<? extends io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter> values) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, filters_);
        onChanged();
      } else {
        filtersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearFilters() {
      if (filtersBuilder_ == null) {
        filters_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        filtersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder removeFilters(int index) {
      if (filtersBuilder_ == null) {
        ensureFiltersIsMutable();
        filters_.remove(index);
        onChanged();
      } else {
        filtersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.Builder getFiltersBuilder(
        int index) {
      return getFiltersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilterOrBuilder getFiltersOrBuilder(
        int index) {
      if (filtersBuilder_ == null) {
        return filters_.get(index);  } else {
        return filtersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public java.util.List<? extends io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilterOrBuilder> 
         getFiltersOrBuilderList() {
      if (filtersBuilder_ != null) {
        return filtersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(filters_);
      }
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.Builder addFiltersBuilder() {
      return getFiltersFieldBuilder().addBuilder(
          io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.getDefaultInstance());
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.Builder addFiltersBuilder(
        int index) {
      return getFiltersFieldBuilder().addBuilder(
          index, io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.getDefaultInstance());
    }
    /**
     * <code>repeated .envoy.config.accesslog.v3.AccessLogFilter filters = 2 [(.validate.rules) = { ... }</code>
     */
    public java.util.List<io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.Builder> 
         getFiltersBuilderList() {
      return getFiltersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter, io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.Builder, io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilterOrBuilder> 
        getFiltersFieldBuilder() {
      if (filtersBuilder_ == null) {
        filtersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter, io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilter.Builder, io.envoyproxy.envoy.config.accesslog.v3.AccessLogFilterOrBuilder>(
                filters_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        filters_ = null;
      }
      return filtersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.accesslog.v3.OrFilter)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.accesslog.v3.OrFilter)
  private static final io.envoyproxy.envoy.config.accesslog.v3.OrFilter DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.accesslog.v3.OrFilter();
  }

  public static io.envoyproxy.envoy.config.accesslog.v3.OrFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrFilter>
      PARSER = new com.google.protobuf.AbstractParser<OrFilter>() {
    @java.lang.Override
    public OrFilter parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrFilter(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.accesslog.v3.OrFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

