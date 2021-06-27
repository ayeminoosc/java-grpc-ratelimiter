// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/thrift_proxy/v3/thrift_proxy.proto

package io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3;

/**
 * <pre>
 * ThriftProtocolOptions specifies Thrift upstream protocol options. This object is used in
 * in
 * :ref:`typed_extension_protocol_options&lt;envoy_api_field_config.cluster.v3.Cluster.typed_extension_protocol_options&gt;`,
 * keyed by the name `envoy.filters.network.thrift_proxy`.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions}
 */
public final class ThriftProtocolOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions)
    ThriftProtocolOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ThriftProtocolOptions.newBuilder() to construct.
  private ThriftProtocolOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ThriftProtocolOptions() {
    transport_ = 0;
    protocol_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ThriftProtocolOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ThriftProtocolOptions(
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
            int rawValue = input.readEnum();

            transport_ = rawValue;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            protocol_ = rawValue;
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
    return io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProxyProto.internal_static_envoy_extensions_filters_network_thrift_proxy_v3_ThriftProtocolOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProxyProto.internal_static_envoy_extensions_filters_network_thrift_proxy_v3_ThriftProtocolOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions.class, io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions.Builder.class);
  }

  public static final int TRANSPORT_FIELD_NUMBER = 1;
  private int transport_;
  /**
   * <pre>
   * Supplies the type of transport that the Thrift proxy should use for upstream connections.
   * Selecting
   * :ref:`AUTO_TRANSPORT&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.TransportType.AUTO_TRANSPORT&gt;`,
   * which is the default, causes the proxy to use the same transport as the downstream connection.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.thrift_proxy.v3.TransportType transport = 1 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for transport.
   */
  @java.lang.Override public int getTransportValue() {
    return transport_;
  }
  /**
   * <pre>
   * Supplies the type of transport that the Thrift proxy should use for upstream connections.
   * Selecting
   * :ref:`AUTO_TRANSPORT&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.TransportType.AUTO_TRANSPORT&gt;`,
   * which is the default, causes the proxy to use the same transport as the downstream connection.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.thrift_proxy.v3.TransportType transport = 1 [(.validate.rules) = { ... }</code>
   * @return The transport.
   */
  @java.lang.Override public io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.TransportType getTransport() {
    @SuppressWarnings("deprecation")
    io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.TransportType result = io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.TransportType.valueOf(transport_);
    return result == null ? io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.TransportType.UNRECOGNIZED : result;
  }

  public static final int PROTOCOL_FIELD_NUMBER = 2;
  private int protocol_;
  /**
   * <pre>
   * Supplies the type of protocol that the Thrift proxy should use for upstream connections.
   * Selecting
   * :ref:`AUTO_PROTOCOL&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.ProtocolType.AUTO_PROTOCOL&gt;`,
   * which is the default, causes the proxy to use the same protocol as the downstream connection.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType protocol = 2 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for protocol.
   */
  @java.lang.Override public int getProtocolValue() {
    return protocol_;
  }
  /**
   * <pre>
   * Supplies the type of protocol that the Thrift proxy should use for upstream connections.
   * Selecting
   * :ref:`AUTO_PROTOCOL&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.ProtocolType.AUTO_PROTOCOL&gt;`,
   * which is the default, causes the proxy to use the same protocol as the downstream connection.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType protocol = 2 [(.validate.rules) = { ... }</code>
   * @return The protocol.
   */
  @java.lang.Override public io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType getProtocol() {
    @SuppressWarnings("deprecation")
    io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType result = io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType.valueOf(protocol_);
    return result == null ? io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType.UNRECOGNIZED : result;
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
    if (transport_ != io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.TransportType.AUTO_TRANSPORT.getNumber()) {
      output.writeEnum(1, transport_);
    }
    if (protocol_ != io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType.AUTO_PROTOCOL.getNumber()) {
      output.writeEnum(2, protocol_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transport_ != io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.TransportType.AUTO_TRANSPORT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, transport_);
    }
    if (protocol_ != io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType.AUTO_PROTOCOL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, protocol_);
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions other = (io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions) obj;

    if (transport_ != other.transport_) return false;
    if (protocol_ != other.protocol_) return false;
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
    hash = (37 * hash) + TRANSPORT_FIELD_NUMBER;
    hash = (53 * hash) + transport_;
    hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
    hash = (53 * hash) + protocol_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions prototype) {
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
   * ThriftProtocolOptions specifies Thrift upstream protocol options. This object is used in
   * in
   * :ref:`typed_extension_protocol_options&lt;envoy_api_field_config.cluster.v3.Cluster.typed_extension_protocol_options&gt;`,
   * keyed by the name `envoy.filters.network.thrift_proxy`.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions)
      io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProxyProto.internal_static_envoy_extensions_filters_network_thrift_proxy_v3_ThriftProtocolOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProxyProto.internal_static_envoy_extensions_filters_network_thrift_proxy_v3_ThriftProtocolOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions.class, io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions.newBuilder()
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
      transport_ = 0;

      protocol_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProxyProto.internal_static_envoy_extensions_filters_network_thrift_proxy_v3_ThriftProtocolOptions_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions build() {
      io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions buildPartial() {
      io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions result = new io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions(this);
      result.transport_ = transport_;
      result.protocol_ = protocol_;
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions other) {
      if (other == io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions.getDefaultInstance()) return this;
      if (other.transport_ != 0) {
        setTransportValue(other.getTransportValue());
      }
      if (other.protocol_ != 0) {
        setProtocolValue(other.getProtocolValue());
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
      io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int transport_ = 0;
    /**
     * <pre>
     * Supplies the type of transport that the Thrift proxy should use for upstream connections.
     * Selecting
     * :ref:`AUTO_TRANSPORT&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.TransportType.AUTO_TRANSPORT&gt;`,
     * which is the default, causes the proxy to use the same transport as the downstream connection.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.thrift_proxy.v3.TransportType transport = 1 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for transport.
     */
    @java.lang.Override public int getTransportValue() {
      return transport_;
    }
    /**
     * <pre>
     * Supplies the type of transport that the Thrift proxy should use for upstream connections.
     * Selecting
     * :ref:`AUTO_TRANSPORT&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.TransportType.AUTO_TRANSPORT&gt;`,
     * which is the default, causes the proxy to use the same transport as the downstream connection.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.thrift_proxy.v3.TransportType transport = 1 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for transport to set.
     * @return This builder for chaining.
     */
    public Builder setTransportValue(int value) {
      
      transport_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Supplies the type of transport that the Thrift proxy should use for upstream connections.
     * Selecting
     * :ref:`AUTO_TRANSPORT&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.TransportType.AUTO_TRANSPORT&gt;`,
     * which is the default, causes the proxy to use the same transport as the downstream connection.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.thrift_proxy.v3.TransportType transport = 1 [(.validate.rules) = { ... }</code>
     * @return The transport.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.TransportType getTransport() {
      @SuppressWarnings("deprecation")
      io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.TransportType result = io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.TransportType.valueOf(transport_);
      return result == null ? io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.TransportType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Supplies the type of transport that the Thrift proxy should use for upstream connections.
     * Selecting
     * :ref:`AUTO_TRANSPORT&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.TransportType.AUTO_TRANSPORT&gt;`,
     * which is the default, causes the proxy to use the same transport as the downstream connection.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.thrift_proxy.v3.TransportType transport = 1 [(.validate.rules) = { ... }</code>
     * @param value The transport to set.
     * @return This builder for chaining.
     */
    public Builder setTransport(io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.TransportType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      transport_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Supplies the type of transport that the Thrift proxy should use for upstream connections.
     * Selecting
     * :ref:`AUTO_TRANSPORT&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.TransportType.AUTO_TRANSPORT&gt;`,
     * which is the default, causes the proxy to use the same transport as the downstream connection.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.thrift_proxy.v3.TransportType transport = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearTransport() {
      
      transport_ = 0;
      onChanged();
      return this;
    }

    private int protocol_ = 0;
    /**
     * <pre>
     * Supplies the type of protocol that the Thrift proxy should use for upstream connections.
     * Selecting
     * :ref:`AUTO_PROTOCOL&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.ProtocolType.AUTO_PROTOCOL&gt;`,
     * which is the default, causes the proxy to use the same protocol as the downstream connection.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType protocol = 2 [(.validate.rules) = { ... }</code>
     * @return The enum numeric value on the wire for protocol.
     */
    @java.lang.Override public int getProtocolValue() {
      return protocol_;
    }
    /**
     * <pre>
     * Supplies the type of protocol that the Thrift proxy should use for upstream connections.
     * Selecting
     * :ref:`AUTO_PROTOCOL&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.ProtocolType.AUTO_PROTOCOL&gt;`,
     * which is the default, causes the proxy to use the same protocol as the downstream connection.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType protocol = 2 [(.validate.rules) = { ... }</code>
     * @param value The enum numeric value on the wire for protocol to set.
     * @return This builder for chaining.
     */
    public Builder setProtocolValue(int value) {
      
      protocol_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Supplies the type of protocol that the Thrift proxy should use for upstream connections.
     * Selecting
     * :ref:`AUTO_PROTOCOL&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.ProtocolType.AUTO_PROTOCOL&gt;`,
     * which is the default, causes the proxy to use the same protocol as the downstream connection.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType protocol = 2 [(.validate.rules) = { ... }</code>
     * @return The protocol.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType getProtocol() {
      @SuppressWarnings("deprecation")
      io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType result = io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType.valueOf(protocol_);
      return result == null ? io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Supplies the type of protocol that the Thrift proxy should use for upstream connections.
     * Selecting
     * :ref:`AUTO_PROTOCOL&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.ProtocolType.AUTO_PROTOCOL&gt;`,
     * which is the default, causes the proxy to use the same protocol as the downstream connection.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType protocol = 2 [(.validate.rules) = { ... }</code>
     * @param value The protocol to set.
     * @return This builder for chaining.
     */
    public Builder setProtocol(io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      protocol_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Supplies the type of protocol that the Thrift proxy should use for upstream connections.
     * Selecting
     * :ref:`AUTO_PROTOCOL&lt;envoy_api_enum_value_extensions.filters.network.thrift_proxy.v3.ProtocolType.AUTO_PROTOCOL&gt;`,
     * which is the default, causes the proxy to use the same protocol as the downstream connection.
     * </pre>
     *
     * <code>.envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType protocol = 2 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearProtocol() {
      
      protocol_ = 0;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions)
  private static final io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions();
  }

  public static io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThriftProtocolOptions>
      PARSER = new com.google.protobuf.AbstractParser<ThriftProtocolOptions>() {
    @java.lang.Override
    public ThriftProtocolOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ThriftProtocolOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ThriftProtocolOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThriftProtocolOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProtocolOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

