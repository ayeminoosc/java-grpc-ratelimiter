// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/lua/v3/lua.proto

package io.envoyproxy.envoy.extensions.filters.http.lua.v3;

/**
 * Protobuf type {@code envoy.extensions.filters.http.lua.v3.Lua}
 */
public final class Lua extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.http.lua.v3.Lua)
    LuaOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Lua.newBuilder() to construct.
  private Lua(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Lua() {
    inlineCode_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Lua();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Lua(
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
            java.lang.String s = input.readStringRequireUtf8();

            inlineCode_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              sourceCodes_ = com.google.protobuf.MapField.newMapField(
                  SourceCodesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource>
            sourceCodes__ = input.readMessage(
                SourceCodesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            sourceCodes_.getMutableMap().put(
                sourceCodes__.getKey(), sourceCodes__.getValue());
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
    return io.envoyproxy.envoy.extensions.filters.http.lua.v3.LuaProto.internal_static_envoy_extensions_filters_http_lua_v3_Lua_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetSourceCodes();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.http.lua.v3.LuaProto.internal_static_envoy_extensions_filters_http_lua_v3_Lua_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua.class, io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua.Builder.class);
  }

  public static final int INLINE_CODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object inlineCode_;
  /**
   * <pre>
   * The Lua code that Envoy will execute. This can be a very small script that
   * further loads code from disk if desired. Note that if JSON configuration is used, the code must
   * be properly escaped. YAML configuration may be easier to read since YAML supports multi-line
   * strings so complex scripts can be easily expressed inline in the configuration.
   * </pre>
   *
   * <code>string inline_code = 1 [(.validate.rules) = { ... }</code>
   * @return The inlineCode.
   */
  @java.lang.Override
  public java.lang.String getInlineCode() {
    java.lang.Object ref = inlineCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inlineCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The Lua code that Envoy will execute. This can be a very small script that
   * further loads code from disk if desired. Note that if JSON configuration is used, the code must
   * be properly escaped. YAML configuration may be easier to read since YAML supports multi-line
   * strings so complex scripts can be easily expressed inline in the configuration.
   * </pre>
   *
   * <code>string inline_code = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for inlineCode.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getInlineCodeBytes() {
    java.lang.Object ref = inlineCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      inlineCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_CODES_FIELD_NUMBER = 2;
  private static final class SourceCodesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource>newDefaultInstance(
                io.envoyproxy.envoy.extensions.filters.http.lua.v3.LuaProto.internal_static_envoy_extensions_filters_http_lua_v3_Lua_SourceCodesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.envoyproxy.envoy.config.core.v3.DataSource.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource> sourceCodes_;
  private com.google.protobuf.MapField<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource>
  internalGetSourceCodes() {
    if (sourceCodes_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          SourceCodesDefaultEntryHolder.defaultEntry);
    }
    return sourceCodes_;
  }

  public int getSourceCodesCount() {
    return internalGetSourceCodes().getMap().size();
  }
  /**
   * <pre>
   * Map of named Lua source codes that can be referenced in :ref:`LuaPerRoute
   * &lt;envoy_v3_api_msg_extensions.filters.http.lua.v3.LuaPerRoute&gt;`. The Lua source codes can be
   * loaded from inline string or local files.
   * Example:
   * .. code-block:: yaml
   *   source_codes:
   *     hello.lua:
   *       inline_string: |
   *         function envoy_on_response(response_handle)
   *           -- Do something.
   *         end
   *     world.lua:
   *       filename: /etc/lua/world.lua
   * </pre>
   *
   * <code>map&lt;string, .envoy.config.core.v3.DataSource&gt; source_codes = 2;</code>
   */

  @java.lang.Override
  public boolean containsSourceCodes(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetSourceCodes().getMap().containsKey(key);
  }
  /**
   * Use {@link #getSourceCodesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource> getSourceCodes() {
    return getSourceCodesMap();
  }
  /**
   * <pre>
   * Map of named Lua source codes that can be referenced in :ref:`LuaPerRoute
   * &lt;envoy_v3_api_msg_extensions.filters.http.lua.v3.LuaPerRoute&gt;`. The Lua source codes can be
   * loaded from inline string or local files.
   * Example:
   * .. code-block:: yaml
   *   source_codes:
   *     hello.lua:
   *       inline_string: |
   *         function envoy_on_response(response_handle)
   *           -- Do something.
   *         end
   *     world.lua:
   *       filename: /etc/lua/world.lua
   * </pre>
   *
   * <code>map&lt;string, .envoy.config.core.v3.DataSource&gt; source_codes = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource> getSourceCodesMap() {
    return internalGetSourceCodes().getMap();
  }
  /**
   * <pre>
   * Map of named Lua source codes that can be referenced in :ref:`LuaPerRoute
   * &lt;envoy_v3_api_msg_extensions.filters.http.lua.v3.LuaPerRoute&gt;`. The Lua source codes can be
   * loaded from inline string or local files.
   * Example:
   * .. code-block:: yaml
   *   source_codes:
   *     hello.lua:
   *       inline_string: |
   *         function envoy_on_response(response_handle)
   *           -- Do something.
   *         end
   *     world.lua:
   *       filename: /etc/lua/world.lua
   * </pre>
   *
   * <code>map&lt;string, .envoy.config.core.v3.DataSource&gt; source_codes = 2;</code>
   */
  @java.lang.Override

  public io.envoyproxy.envoy.config.core.v3.DataSource getSourceCodesOrDefault(
      java.lang.String key,
      io.envoyproxy.envoy.config.core.v3.DataSource defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource> map =
        internalGetSourceCodes().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Map of named Lua source codes that can be referenced in :ref:`LuaPerRoute
   * &lt;envoy_v3_api_msg_extensions.filters.http.lua.v3.LuaPerRoute&gt;`. The Lua source codes can be
   * loaded from inline string or local files.
   * Example:
   * .. code-block:: yaml
   *   source_codes:
   *     hello.lua:
   *       inline_string: |
   *         function envoy_on_response(response_handle)
   *           -- Do something.
   *         end
   *     world.lua:
   *       filename: /etc/lua/world.lua
   * </pre>
   *
   * <code>map&lt;string, .envoy.config.core.v3.DataSource&gt; source_codes = 2;</code>
   */
  @java.lang.Override

  public io.envoyproxy.envoy.config.core.v3.DataSource getSourceCodesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource> map =
        internalGetSourceCodes().getMap();
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
    if (!getInlineCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inlineCode_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetSourceCodes(),
        SourceCodesDefaultEntryHolder.defaultEntry,
        2);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getInlineCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inlineCode_);
    }
    for (java.util.Map.Entry<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource> entry
         : internalGetSourceCodes().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource>
      sourceCodes__ = SourceCodesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, sourceCodes__);
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua other = (io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua) obj;

    if (!getInlineCode()
        .equals(other.getInlineCode())) return false;
    if (!internalGetSourceCodes().equals(
        other.internalGetSourceCodes())) return false;
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
    hash = (37 * hash) + INLINE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getInlineCode().hashCode();
    if (!internalGetSourceCodes().getMap().isEmpty()) {
      hash = (37 * hash) + SOURCE_CODES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetSourceCodes().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua prototype) {
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
   * Protobuf type {@code envoy.extensions.filters.http.lua.v3.Lua}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.http.lua.v3.Lua)
      io.envoyproxy.envoy.extensions.filters.http.lua.v3.LuaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.http.lua.v3.LuaProto.internal_static_envoy_extensions_filters_http_lua_v3_Lua_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetSourceCodes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableSourceCodes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.http.lua.v3.LuaProto.internal_static_envoy_extensions_filters_http_lua_v3_Lua_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua.class, io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua.newBuilder()
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
      inlineCode_ = "";

      internalGetMutableSourceCodes().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.http.lua.v3.LuaProto.internal_static_envoy_extensions_filters_http_lua_v3_Lua_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua build() {
      io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua buildPartial() {
      io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua result = new io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua(this);
      int from_bitField0_ = bitField0_;
      result.inlineCode_ = inlineCode_;
      result.sourceCodes_ = internalGetSourceCodes();
      result.sourceCodes_.makeImmutable();
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua other) {
      if (other == io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua.getDefaultInstance()) return this;
      if (!other.getInlineCode().isEmpty()) {
        inlineCode_ = other.inlineCode_;
        onChanged();
      }
      internalGetMutableSourceCodes().mergeFrom(
          other.internalGetSourceCodes());
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
      io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object inlineCode_ = "";
    /**
     * <pre>
     * The Lua code that Envoy will execute. This can be a very small script that
     * further loads code from disk if desired. Note that if JSON configuration is used, the code must
     * be properly escaped. YAML configuration may be easier to read since YAML supports multi-line
     * strings so complex scripts can be easily expressed inline in the configuration.
     * </pre>
     *
     * <code>string inline_code = 1 [(.validate.rules) = { ... }</code>
     * @return The inlineCode.
     */
    public java.lang.String getInlineCode() {
      java.lang.Object ref = inlineCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inlineCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The Lua code that Envoy will execute. This can be a very small script that
     * further loads code from disk if desired. Note that if JSON configuration is used, the code must
     * be properly escaped. YAML configuration may be easier to read since YAML supports multi-line
     * strings so complex scripts can be easily expressed inline in the configuration.
     * </pre>
     *
     * <code>string inline_code = 1 [(.validate.rules) = { ... }</code>
     * @return The bytes for inlineCode.
     */
    public com.google.protobuf.ByteString
        getInlineCodeBytes() {
      java.lang.Object ref = inlineCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        inlineCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The Lua code that Envoy will execute. This can be a very small script that
     * further loads code from disk if desired. Note that if JSON configuration is used, the code must
     * be properly escaped. YAML configuration may be easier to read since YAML supports multi-line
     * strings so complex scripts can be easily expressed inline in the configuration.
     * </pre>
     *
     * <code>string inline_code = 1 [(.validate.rules) = { ... }</code>
     * @param value The inlineCode to set.
     * @return This builder for chaining.
     */
    public Builder setInlineCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      inlineCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Lua code that Envoy will execute. This can be a very small script that
     * further loads code from disk if desired. Note that if JSON configuration is used, the code must
     * be properly escaped. YAML configuration may be easier to read since YAML supports multi-line
     * strings so complex scripts can be easily expressed inline in the configuration.
     * </pre>
     *
     * <code>string inline_code = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearInlineCode() {
      
      inlineCode_ = getDefaultInstance().getInlineCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The Lua code that Envoy will execute. This can be a very small script that
     * further loads code from disk if desired. Note that if JSON configuration is used, the code must
     * be properly escaped. YAML configuration may be easier to read since YAML supports multi-line
     * strings so complex scripts can be easily expressed inline in the configuration.
     * </pre>
     *
     * <code>string inline_code = 1 [(.validate.rules) = { ... }</code>
     * @param value The bytes for inlineCode to set.
     * @return This builder for chaining.
     */
    public Builder setInlineCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      inlineCode_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource> sourceCodes_;
    private com.google.protobuf.MapField<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource>
    internalGetSourceCodes() {
      if (sourceCodes_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SourceCodesDefaultEntryHolder.defaultEntry);
      }
      return sourceCodes_;
    }
    private com.google.protobuf.MapField<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource>
    internalGetMutableSourceCodes() {
      onChanged();;
      if (sourceCodes_ == null) {
        sourceCodes_ = com.google.protobuf.MapField.newMapField(
            SourceCodesDefaultEntryHolder.defaultEntry);
      }
      if (!sourceCodes_.isMutable()) {
        sourceCodes_ = sourceCodes_.copy();
      }
      return sourceCodes_;
    }

    public int getSourceCodesCount() {
      return internalGetSourceCodes().getMap().size();
    }
    /**
     * <pre>
     * Map of named Lua source codes that can be referenced in :ref:`LuaPerRoute
     * &lt;envoy_v3_api_msg_extensions.filters.http.lua.v3.LuaPerRoute&gt;`. The Lua source codes can be
     * loaded from inline string or local files.
     * Example:
     * .. code-block:: yaml
     *   source_codes:
     *     hello.lua:
     *       inline_string: |
     *         function envoy_on_response(response_handle)
     *           -- Do something.
     *         end
     *     world.lua:
     *       filename: /etc/lua/world.lua
     * </pre>
     *
     * <code>map&lt;string, .envoy.config.core.v3.DataSource&gt; source_codes = 2;</code>
     */

    @java.lang.Override
    public boolean containsSourceCodes(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetSourceCodes().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSourceCodesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource> getSourceCodes() {
      return getSourceCodesMap();
    }
    /**
     * <pre>
     * Map of named Lua source codes that can be referenced in :ref:`LuaPerRoute
     * &lt;envoy_v3_api_msg_extensions.filters.http.lua.v3.LuaPerRoute&gt;`. The Lua source codes can be
     * loaded from inline string or local files.
     * Example:
     * .. code-block:: yaml
     *   source_codes:
     *     hello.lua:
     *       inline_string: |
     *         function envoy_on_response(response_handle)
     *           -- Do something.
     *         end
     *     world.lua:
     *       filename: /etc/lua/world.lua
     * </pre>
     *
     * <code>map&lt;string, .envoy.config.core.v3.DataSource&gt; source_codes = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource> getSourceCodesMap() {
      return internalGetSourceCodes().getMap();
    }
    /**
     * <pre>
     * Map of named Lua source codes that can be referenced in :ref:`LuaPerRoute
     * &lt;envoy_v3_api_msg_extensions.filters.http.lua.v3.LuaPerRoute&gt;`. The Lua source codes can be
     * loaded from inline string or local files.
     * Example:
     * .. code-block:: yaml
     *   source_codes:
     *     hello.lua:
     *       inline_string: |
     *         function envoy_on_response(response_handle)
     *           -- Do something.
     *         end
     *     world.lua:
     *       filename: /etc/lua/world.lua
     * </pre>
     *
     * <code>map&lt;string, .envoy.config.core.v3.DataSource&gt; source_codes = 2;</code>
     */
    @java.lang.Override

    public io.envoyproxy.envoy.config.core.v3.DataSource getSourceCodesOrDefault(
        java.lang.String key,
        io.envoyproxy.envoy.config.core.v3.DataSource defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource> map =
          internalGetSourceCodes().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Map of named Lua source codes that can be referenced in :ref:`LuaPerRoute
     * &lt;envoy_v3_api_msg_extensions.filters.http.lua.v3.LuaPerRoute&gt;`. The Lua source codes can be
     * loaded from inline string or local files.
     * Example:
     * .. code-block:: yaml
     *   source_codes:
     *     hello.lua:
     *       inline_string: |
     *         function envoy_on_response(response_handle)
     *           -- Do something.
     *         end
     *     world.lua:
     *       filename: /etc/lua/world.lua
     * </pre>
     *
     * <code>map&lt;string, .envoy.config.core.v3.DataSource&gt; source_codes = 2;</code>
     */
    @java.lang.Override

    public io.envoyproxy.envoy.config.core.v3.DataSource getSourceCodesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource> map =
          internalGetSourceCodes().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearSourceCodes() {
      internalGetMutableSourceCodes().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Map of named Lua source codes that can be referenced in :ref:`LuaPerRoute
     * &lt;envoy_v3_api_msg_extensions.filters.http.lua.v3.LuaPerRoute&gt;`. The Lua source codes can be
     * loaded from inline string or local files.
     * Example:
     * .. code-block:: yaml
     *   source_codes:
     *     hello.lua:
     *       inline_string: |
     *         function envoy_on_response(response_handle)
     *           -- Do something.
     *         end
     *     world.lua:
     *       filename: /etc/lua/world.lua
     * </pre>
     *
     * <code>map&lt;string, .envoy.config.core.v3.DataSource&gt; source_codes = 2;</code>
     */

    public Builder removeSourceCodes(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableSourceCodes().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource>
    getMutableSourceCodes() {
      return internalGetMutableSourceCodes().getMutableMap();
    }
    /**
     * <pre>
     * Map of named Lua source codes that can be referenced in :ref:`LuaPerRoute
     * &lt;envoy_v3_api_msg_extensions.filters.http.lua.v3.LuaPerRoute&gt;`. The Lua source codes can be
     * loaded from inline string or local files.
     * Example:
     * .. code-block:: yaml
     *   source_codes:
     *     hello.lua:
     *       inline_string: |
     *         function envoy_on_response(response_handle)
     *           -- Do something.
     *         end
     *     world.lua:
     *       filename: /etc/lua/world.lua
     * </pre>
     *
     * <code>map&lt;string, .envoy.config.core.v3.DataSource&gt; source_codes = 2;</code>
     */
    public Builder putSourceCodes(
        java.lang.String key,
        io.envoyproxy.envoy.config.core.v3.DataSource value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableSourceCodes().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Map of named Lua source codes that can be referenced in :ref:`LuaPerRoute
     * &lt;envoy_v3_api_msg_extensions.filters.http.lua.v3.LuaPerRoute&gt;`. The Lua source codes can be
     * loaded from inline string or local files.
     * Example:
     * .. code-block:: yaml
     *   source_codes:
     *     hello.lua:
     *       inline_string: |
     *         function envoy_on_response(response_handle)
     *           -- Do something.
     *         end
     *     world.lua:
     *       filename: /etc/lua/world.lua
     * </pre>
     *
     * <code>map&lt;string, .envoy.config.core.v3.DataSource&gt; source_codes = 2;</code>
     */

    public Builder putAllSourceCodes(
        java.util.Map<java.lang.String, io.envoyproxy.envoy.config.core.v3.DataSource> values) {
      internalGetMutableSourceCodes().getMutableMap()
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.http.lua.v3.Lua)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.lua.v3.Lua)
  private static final io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua();
  }

  public static io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Lua>
      PARSER = new com.google.protobuf.AbstractParser<Lua>() {
    @java.lang.Override
    public Lua parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Lua(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Lua> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Lua> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.http.lua.v3.Lua getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

