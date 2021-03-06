// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/data/tap/v3/transport.proto

package io.envoyproxy.envoy.data.tap.v3;

/**
 * <pre>
 * Connection properties.
 * </pre>
 *
 * Protobuf type {@code envoy.data.tap.v3.Connection}
 */
public final class Connection extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.data.tap.v3.Connection)
    ConnectionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Connection.newBuilder() to construct.
  private Connection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Connection() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Connection();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Connection(
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
          case 18: {
            io.envoyproxy.envoy.config.core.v3.Address.Builder subBuilder = null;
            if (localAddress_ != null) {
              subBuilder = localAddress_.toBuilder();
            }
            localAddress_ = input.readMessage(io.envoyproxy.envoy.config.core.v3.Address.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(localAddress_);
              localAddress_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            io.envoyproxy.envoy.config.core.v3.Address.Builder subBuilder = null;
            if (remoteAddress_ != null) {
              subBuilder = remoteAddress_.toBuilder();
            }
            remoteAddress_ = input.readMessage(io.envoyproxy.envoy.config.core.v3.Address.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(remoteAddress_);
              remoteAddress_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.data.tap.v3.TransportProto.internal_static_envoy_data_tap_v3_Connection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.data.tap.v3.TransportProto.internal_static_envoy_data_tap_v3_Connection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.data.tap.v3.Connection.class, io.envoyproxy.envoy.data.tap.v3.Connection.Builder.class);
  }

  public static final int LOCAL_ADDRESS_FIELD_NUMBER = 2;
  private io.envoyproxy.envoy.config.core.v3.Address localAddress_;
  /**
   * <pre>
   * Local address.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address local_address = 2;</code>
   * @return Whether the localAddress field is set.
   */
  @java.lang.Override
  public boolean hasLocalAddress() {
    return localAddress_ != null;
  }
  /**
   * <pre>
   * Local address.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address local_address = 2;</code>
   * @return The localAddress.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.Address getLocalAddress() {
    return localAddress_ == null ? io.envoyproxy.envoy.config.core.v3.Address.getDefaultInstance() : localAddress_;
  }
  /**
   * <pre>
   * Local address.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address local_address = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.AddressOrBuilder getLocalAddressOrBuilder() {
    return getLocalAddress();
  }

  public static final int REMOTE_ADDRESS_FIELD_NUMBER = 3;
  private io.envoyproxy.envoy.config.core.v3.Address remoteAddress_;
  /**
   * <pre>
   * Remote address.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address remote_address = 3;</code>
   * @return Whether the remoteAddress field is set.
   */
  @java.lang.Override
  public boolean hasRemoteAddress() {
    return remoteAddress_ != null;
  }
  /**
   * <pre>
   * Remote address.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address remote_address = 3;</code>
   * @return The remoteAddress.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.Address getRemoteAddress() {
    return remoteAddress_ == null ? io.envoyproxy.envoy.config.core.v3.Address.getDefaultInstance() : remoteAddress_;
  }
  /**
   * <pre>
   * Remote address.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address remote_address = 3;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.AddressOrBuilder getRemoteAddressOrBuilder() {
    return getRemoteAddress();
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
    if (localAddress_ != null) {
      output.writeMessage(2, getLocalAddress());
    }
    if (remoteAddress_ != null) {
      output.writeMessage(3, getRemoteAddress());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (localAddress_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getLocalAddress());
    }
    if (remoteAddress_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getRemoteAddress());
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
    if (!(obj instanceof io.envoyproxy.envoy.data.tap.v3.Connection)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.data.tap.v3.Connection other = (io.envoyproxy.envoy.data.tap.v3.Connection) obj;

    if (hasLocalAddress() != other.hasLocalAddress()) return false;
    if (hasLocalAddress()) {
      if (!getLocalAddress()
          .equals(other.getLocalAddress())) return false;
    }
    if (hasRemoteAddress() != other.hasRemoteAddress()) return false;
    if (hasRemoteAddress()) {
      if (!getRemoteAddress()
          .equals(other.getRemoteAddress())) return false;
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
    if (hasLocalAddress()) {
      hash = (37 * hash) + LOCAL_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getLocalAddress().hashCode();
    }
    if (hasRemoteAddress()) {
      hash = (37 * hash) + REMOTE_ADDRESS_FIELD_NUMBER;
      hash = (53 * hash) + getRemoteAddress().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.data.tap.v3.Connection parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.tap.v3.Connection parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.tap.v3.Connection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.tap.v3.Connection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.tap.v3.Connection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.tap.v3.Connection parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.tap.v3.Connection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.tap.v3.Connection parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.tap.v3.Connection parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.tap.v3.Connection parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.tap.v3.Connection parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.tap.v3.Connection parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.data.tap.v3.Connection prototype) {
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
   * Connection properties.
   * </pre>
   *
   * Protobuf type {@code envoy.data.tap.v3.Connection}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.data.tap.v3.Connection)
      io.envoyproxy.envoy.data.tap.v3.ConnectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.data.tap.v3.TransportProto.internal_static_envoy_data_tap_v3_Connection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.data.tap.v3.TransportProto.internal_static_envoy_data_tap_v3_Connection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.data.tap.v3.Connection.class, io.envoyproxy.envoy.data.tap.v3.Connection.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.data.tap.v3.Connection.newBuilder()
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
      if (localAddressBuilder_ == null) {
        localAddress_ = null;
      } else {
        localAddress_ = null;
        localAddressBuilder_ = null;
      }
      if (remoteAddressBuilder_ == null) {
        remoteAddress_ = null;
      } else {
        remoteAddress_ = null;
        remoteAddressBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.data.tap.v3.TransportProto.internal_static_envoy_data_tap_v3_Connection_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.tap.v3.Connection getDefaultInstanceForType() {
      return io.envoyproxy.envoy.data.tap.v3.Connection.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.tap.v3.Connection build() {
      io.envoyproxy.envoy.data.tap.v3.Connection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.tap.v3.Connection buildPartial() {
      io.envoyproxy.envoy.data.tap.v3.Connection result = new io.envoyproxy.envoy.data.tap.v3.Connection(this);
      if (localAddressBuilder_ == null) {
        result.localAddress_ = localAddress_;
      } else {
        result.localAddress_ = localAddressBuilder_.build();
      }
      if (remoteAddressBuilder_ == null) {
        result.remoteAddress_ = remoteAddress_;
      } else {
        result.remoteAddress_ = remoteAddressBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.data.tap.v3.Connection) {
        return mergeFrom((io.envoyproxy.envoy.data.tap.v3.Connection)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.data.tap.v3.Connection other) {
      if (other == io.envoyproxy.envoy.data.tap.v3.Connection.getDefaultInstance()) return this;
      if (other.hasLocalAddress()) {
        mergeLocalAddress(other.getLocalAddress());
      }
      if (other.hasRemoteAddress()) {
        mergeRemoteAddress(other.getRemoteAddress());
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
      io.envoyproxy.envoy.data.tap.v3.Connection parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.data.tap.v3.Connection) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.envoyproxy.envoy.config.core.v3.Address localAddress_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.Address, io.envoyproxy.envoy.config.core.v3.Address.Builder, io.envoyproxy.envoy.config.core.v3.AddressOrBuilder> localAddressBuilder_;
    /**
     * <pre>
     * Local address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address local_address = 2;</code>
     * @return Whether the localAddress field is set.
     */
    public boolean hasLocalAddress() {
      return localAddressBuilder_ != null || localAddress_ != null;
    }
    /**
     * <pre>
     * Local address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address local_address = 2;</code>
     * @return The localAddress.
     */
    public io.envoyproxy.envoy.config.core.v3.Address getLocalAddress() {
      if (localAddressBuilder_ == null) {
        return localAddress_ == null ? io.envoyproxy.envoy.config.core.v3.Address.getDefaultInstance() : localAddress_;
      } else {
        return localAddressBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Local address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address local_address = 2;</code>
     */
    public Builder setLocalAddress(io.envoyproxy.envoy.config.core.v3.Address value) {
      if (localAddressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        localAddress_ = value;
        onChanged();
      } else {
        localAddressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Local address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address local_address = 2;</code>
     */
    public Builder setLocalAddress(
        io.envoyproxy.envoy.config.core.v3.Address.Builder builderForValue) {
      if (localAddressBuilder_ == null) {
        localAddress_ = builderForValue.build();
        onChanged();
      } else {
        localAddressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Local address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address local_address = 2;</code>
     */
    public Builder mergeLocalAddress(io.envoyproxy.envoy.config.core.v3.Address value) {
      if (localAddressBuilder_ == null) {
        if (localAddress_ != null) {
          localAddress_ =
            io.envoyproxy.envoy.config.core.v3.Address.newBuilder(localAddress_).mergeFrom(value).buildPartial();
        } else {
          localAddress_ = value;
        }
        onChanged();
      } else {
        localAddressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Local address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address local_address = 2;</code>
     */
    public Builder clearLocalAddress() {
      if (localAddressBuilder_ == null) {
        localAddress_ = null;
        onChanged();
      } else {
        localAddress_ = null;
        localAddressBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Local address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address local_address = 2;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.Address.Builder getLocalAddressBuilder() {
      
      onChanged();
      return getLocalAddressFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Local address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address local_address = 2;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.AddressOrBuilder getLocalAddressOrBuilder() {
      if (localAddressBuilder_ != null) {
        return localAddressBuilder_.getMessageOrBuilder();
      } else {
        return localAddress_ == null ?
            io.envoyproxy.envoy.config.core.v3.Address.getDefaultInstance() : localAddress_;
      }
    }
    /**
     * <pre>
     * Local address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address local_address = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.Address, io.envoyproxy.envoy.config.core.v3.Address.Builder, io.envoyproxy.envoy.config.core.v3.AddressOrBuilder> 
        getLocalAddressFieldBuilder() {
      if (localAddressBuilder_ == null) {
        localAddressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.Address, io.envoyproxy.envoy.config.core.v3.Address.Builder, io.envoyproxy.envoy.config.core.v3.AddressOrBuilder>(
                getLocalAddress(),
                getParentForChildren(),
                isClean());
        localAddress_ = null;
      }
      return localAddressBuilder_;
    }

    private io.envoyproxy.envoy.config.core.v3.Address remoteAddress_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.Address, io.envoyproxy.envoy.config.core.v3.Address.Builder, io.envoyproxy.envoy.config.core.v3.AddressOrBuilder> remoteAddressBuilder_;
    /**
     * <pre>
     * Remote address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address remote_address = 3;</code>
     * @return Whether the remoteAddress field is set.
     */
    public boolean hasRemoteAddress() {
      return remoteAddressBuilder_ != null || remoteAddress_ != null;
    }
    /**
     * <pre>
     * Remote address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address remote_address = 3;</code>
     * @return The remoteAddress.
     */
    public io.envoyproxy.envoy.config.core.v3.Address getRemoteAddress() {
      if (remoteAddressBuilder_ == null) {
        return remoteAddress_ == null ? io.envoyproxy.envoy.config.core.v3.Address.getDefaultInstance() : remoteAddress_;
      } else {
        return remoteAddressBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Remote address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address remote_address = 3;</code>
     */
    public Builder setRemoteAddress(io.envoyproxy.envoy.config.core.v3.Address value) {
      if (remoteAddressBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        remoteAddress_ = value;
        onChanged();
      } else {
        remoteAddressBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Remote address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address remote_address = 3;</code>
     */
    public Builder setRemoteAddress(
        io.envoyproxy.envoy.config.core.v3.Address.Builder builderForValue) {
      if (remoteAddressBuilder_ == null) {
        remoteAddress_ = builderForValue.build();
        onChanged();
      } else {
        remoteAddressBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Remote address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address remote_address = 3;</code>
     */
    public Builder mergeRemoteAddress(io.envoyproxy.envoy.config.core.v3.Address value) {
      if (remoteAddressBuilder_ == null) {
        if (remoteAddress_ != null) {
          remoteAddress_ =
            io.envoyproxy.envoy.config.core.v3.Address.newBuilder(remoteAddress_).mergeFrom(value).buildPartial();
        } else {
          remoteAddress_ = value;
        }
        onChanged();
      } else {
        remoteAddressBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Remote address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address remote_address = 3;</code>
     */
    public Builder clearRemoteAddress() {
      if (remoteAddressBuilder_ == null) {
        remoteAddress_ = null;
        onChanged();
      } else {
        remoteAddress_ = null;
        remoteAddressBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Remote address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address remote_address = 3;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.Address.Builder getRemoteAddressBuilder() {
      
      onChanged();
      return getRemoteAddressFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Remote address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address remote_address = 3;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.AddressOrBuilder getRemoteAddressOrBuilder() {
      if (remoteAddressBuilder_ != null) {
        return remoteAddressBuilder_.getMessageOrBuilder();
      } else {
        return remoteAddress_ == null ?
            io.envoyproxy.envoy.config.core.v3.Address.getDefaultInstance() : remoteAddress_;
      }
    }
    /**
     * <pre>
     * Remote address.
     * </pre>
     *
     * <code>.envoy.config.core.v3.Address remote_address = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.Address, io.envoyproxy.envoy.config.core.v3.Address.Builder, io.envoyproxy.envoy.config.core.v3.AddressOrBuilder> 
        getRemoteAddressFieldBuilder() {
      if (remoteAddressBuilder_ == null) {
        remoteAddressBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.Address, io.envoyproxy.envoy.config.core.v3.Address.Builder, io.envoyproxy.envoy.config.core.v3.AddressOrBuilder>(
                getRemoteAddress(),
                getParentForChildren(),
                isClean());
        remoteAddress_ = null;
      }
      return remoteAddressBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.data.tap.v3.Connection)
  }

  // @@protoc_insertion_point(class_scope:envoy.data.tap.v3.Connection)
  private static final io.envoyproxy.envoy.data.tap.v3.Connection DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.data.tap.v3.Connection();
  }

  public static io.envoyproxy.envoy.data.tap.v3.Connection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Connection>
      PARSER = new com.google.protobuf.AbstractParser<Connection>() {
    @java.lang.Override
    public Connection parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Connection(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Connection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Connection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.data.tap.v3.Connection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

