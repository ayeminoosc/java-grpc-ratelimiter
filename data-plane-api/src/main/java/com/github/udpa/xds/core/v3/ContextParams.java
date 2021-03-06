// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xds/core/v3/context_params.proto

package com.github.udpa.xds.core.v3;

/**
 * <pre>
 * Additional parameters that can be used to select resource variants. These include any
 * global context parameters, per-resource type client feature capabilities and per-resource
 * type functional attributes. All per-resource type attributes will be `xds.resource.`
 * prefixed and some of these are documented below:
 * `xds.resource.listening_address`: The value is "IP:port" (e.g. "10.1.1.3:8080") which is
 *   the listening address of a Listener. Used in a Listener resource query.
 * </pre>
 *
 * Protobuf type {@code xds.core.v3.ContextParams}
 */
public final class ContextParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:xds.core.v3.ContextParams)
    ContextParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ContextParams.newBuilder() to construct.
  private ContextParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ContextParams() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ContextParams();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ContextParams(
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
              params_ = com.google.protobuf.MapField.newMapField(
                  ParamsDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            params__ = input.readMessage(
                ParamsDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            params_.getMutableMap().put(
                params__.getKey(), params__.getValue());
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
    return com.github.udpa.xds.core.v3.ContextParamsProto.internal_static_xds_core_v3_ContextParams_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetParams();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.udpa.xds.core.v3.ContextParamsProto.internal_static_xds_core_v3_ContextParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.udpa.xds.core.v3.ContextParams.class, com.github.udpa.xds.core.v3.ContextParams.Builder.class);
  }

  public static final int PARAMS_FIELD_NUMBER = 1;
  private static final class ParamsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.github.udpa.xds.core.v3.ContextParamsProto.internal_static_xds_core_v3_ContextParams_ParamsEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> params_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetParams() {
    if (params_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ParamsDefaultEntryHolder.defaultEntry);
    }
    return params_;
  }

  public int getParamsCount() {
    return internalGetParams().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; params = 1;</code>
   */

  @java.lang.Override
  public boolean containsParams(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetParams().getMap().containsKey(key);
  }
  /**
   * Use {@link #getParamsMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getParams() {
    return getParamsMap();
  }
  /**
   * <code>map&lt;string, string&gt; params = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getParamsMap() {
    return internalGetParams().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; params = 1;</code>
   */
  @java.lang.Override

  public java.lang.String getParamsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetParams().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; params = 1;</code>
   */
  @java.lang.Override

  public java.lang.String getParamsOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetParams().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetParams(),
        ParamsDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetParams().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      params__ = ParamsDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, params__);
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
    if (!(obj instanceof com.github.udpa.xds.core.v3.ContextParams)) {
      return super.equals(obj);
    }
    com.github.udpa.xds.core.v3.ContextParams other = (com.github.udpa.xds.core.v3.ContextParams) obj;

    if (!internalGetParams().equals(
        other.internalGetParams())) return false;
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
    if (!internalGetParams().getMap().isEmpty()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetParams().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.udpa.xds.core.v3.ContextParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.udpa.xds.core.v3.ContextParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.udpa.xds.core.v3.ContextParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.udpa.xds.core.v3.ContextParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.udpa.xds.core.v3.ContextParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.udpa.xds.core.v3.ContextParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.udpa.xds.core.v3.ContextParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.udpa.xds.core.v3.ContextParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.udpa.xds.core.v3.ContextParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.udpa.xds.core.v3.ContextParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.udpa.xds.core.v3.ContextParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.udpa.xds.core.v3.ContextParams parseFrom(
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
  public static Builder newBuilder(com.github.udpa.xds.core.v3.ContextParams prototype) {
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
   * Additional parameters that can be used to select resource variants. These include any
   * global context parameters, per-resource type client feature capabilities and per-resource
   * type functional attributes. All per-resource type attributes will be `xds.resource.`
   * prefixed and some of these are documented below:
   * `xds.resource.listening_address`: The value is "IP:port" (e.g. "10.1.1.3:8080") which is
   *   the listening address of a Listener. Used in a Listener resource query.
   * </pre>
   *
   * Protobuf type {@code xds.core.v3.ContextParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:xds.core.v3.ContextParams)
      com.github.udpa.xds.core.v3.ContextParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.udpa.xds.core.v3.ContextParamsProto.internal_static_xds_core_v3_ContextParams_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableParams();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.udpa.xds.core.v3.ContextParamsProto.internal_static_xds_core_v3_ContextParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.udpa.xds.core.v3.ContextParams.class, com.github.udpa.xds.core.v3.ContextParams.Builder.class);
    }

    // Construct using com.github.udpa.xds.core.v3.ContextParams.newBuilder()
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
      internalGetMutableParams().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.udpa.xds.core.v3.ContextParamsProto.internal_static_xds_core_v3_ContextParams_descriptor;
    }

    @java.lang.Override
    public com.github.udpa.xds.core.v3.ContextParams getDefaultInstanceForType() {
      return com.github.udpa.xds.core.v3.ContextParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.udpa.xds.core.v3.ContextParams build() {
      com.github.udpa.xds.core.v3.ContextParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.udpa.xds.core.v3.ContextParams buildPartial() {
      com.github.udpa.xds.core.v3.ContextParams result = new com.github.udpa.xds.core.v3.ContextParams(this);
      int from_bitField0_ = bitField0_;
      result.params_ = internalGetParams();
      result.params_.makeImmutable();
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
      if (other instanceof com.github.udpa.xds.core.v3.ContextParams) {
        return mergeFrom((com.github.udpa.xds.core.v3.ContextParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.udpa.xds.core.v3.ContextParams other) {
      if (other == com.github.udpa.xds.core.v3.ContextParams.getDefaultInstance()) return this;
      internalGetMutableParams().mergeFrom(
          other.internalGetParams());
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
      com.github.udpa.xds.core.v3.ContextParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.udpa.xds.core.v3.ContextParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> params_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetParams() {
      if (params_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ParamsDefaultEntryHolder.defaultEntry);
      }
      return params_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableParams() {
      onChanged();;
      if (params_ == null) {
        params_ = com.google.protobuf.MapField.newMapField(
            ParamsDefaultEntryHolder.defaultEntry);
      }
      if (!params_.isMutable()) {
        params_ = params_.copy();
      }
      return params_;
    }

    public int getParamsCount() {
      return internalGetParams().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; params = 1;</code>
     */

    @java.lang.Override
    public boolean containsParams(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetParams().getMap().containsKey(key);
    }
    /**
     * Use {@link #getParamsMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getParams() {
      return getParamsMap();
    }
    /**
     * <code>map&lt;string, string&gt; params = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getParamsMap() {
      return internalGetParams().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; params = 1;</code>
     */
    @java.lang.Override

    public java.lang.String getParamsOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetParams().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; params = 1;</code>
     */
    @java.lang.Override

    public java.lang.String getParamsOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetParams().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearParams() {
      internalGetMutableParams().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; params = 1;</code>
     */

    public Builder removeParams(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableParams().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableParams() {
      return internalGetMutableParams().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; params = 1;</code>
     */
    public Builder putParams(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableParams().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; params = 1;</code>
     */

    public Builder putAllParams(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableParams().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:xds.core.v3.ContextParams)
  }

  // @@protoc_insertion_point(class_scope:xds.core.v3.ContextParams)
  private static final com.github.udpa.xds.core.v3.ContextParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.udpa.xds.core.v3.ContextParams();
  }

  public static com.github.udpa.xds.core.v3.ContextParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ContextParams>
      PARSER = new com.google.protobuf.AbstractParser<ContextParams>() {
    @java.lang.Override
    public ContextParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ContextParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ContextParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ContextParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.udpa.xds.core.v3.ContextParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

