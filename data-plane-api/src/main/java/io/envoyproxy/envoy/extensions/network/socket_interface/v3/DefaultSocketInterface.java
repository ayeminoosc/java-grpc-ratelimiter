// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/network/socket_interface/v3/default_socket_interface.proto

package io.envoyproxy.envoy.extensions.network.socket_interface.v3;

/**
 * <pre>
 * Configuration for default socket interface that relies on OS dependent syscall to create
 * sockets.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.network.socket_interface.v3.DefaultSocketInterface}
 */
public final class DefaultSocketInterface extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.network.socket_interface.v3.DefaultSocketInterface)
    DefaultSocketInterfaceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DefaultSocketInterface.newBuilder() to construct.
  private DefaultSocketInterface(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DefaultSocketInterface() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DefaultSocketInterface();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DefaultSocketInterface(
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
    return io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterfaceProto.internal_static_envoy_extensions_network_socket_interface_v3_DefaultSocketInterface_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterfaceProto.internal_static_envoy_extensions_network_socket_interface_v3_DefaultSocketInterface_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface.class, io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface.Builder.class);
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
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface other = (io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface) obj;

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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface prototype) {
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
   * Configuration for default socket interface that relies on OS dependent syscall to create
   * sockets.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.network.socket_interface.v3.DefaultSocketInterface}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.network.socket_interface.v3.DefaultSocketInterface)
      io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterfaceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterfaceProto.internal_static_envoy_extensions_network_socket_interface_v3_DefaultSocketInterface_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterfaceProto.internal_static_envoy_extensions_network_socket_interface_v3_DefaultSocketInterface_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface.class, io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterfaceProto.internal_static_envoy_extensions_network_socket_interface_v3_DefaultSocketInterface_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface build() {
      io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface buildPartial() {
      io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface result = new io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface(this);
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
      if (other instanceof io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface) {
        return mergeFrom((io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface other) {
      if (other == io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface.getDefaultInstance()) return this;
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
      io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.network.socket_interface.v3.DefaultSocketInterface)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.network.socket_interface.v3.DefaultSocketInterface)
  private static final io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface();
  }

  public static io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DefaultSocketInterface>
      PARSER = new com.google.protobuf.AbstractParser<DefaultSocketInterface>() {
    @java.lang.Override
    public DefaultSocketInterface parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DefaultSocketInterface(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DefaultSocketInterface> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DefaultSocketInterface> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.network.socket_interface.v3.DefaultSocketInterface getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

