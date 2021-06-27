// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/data/tap/v3/transport.proto

package io.envoyproxy.envoy.data.tap.v3;

/**
 * <pre>
 * A streamed socket trace segment. Multiple segments make up a full trace.
 * </pre>
 *
 * Protobuf type {@code envoy.data.tap.v3.SocketStreamedTraceSegment}
 */
public final class SocketStreamedTraceSegment extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.data.tap.v3.SocketStreamedTraceSegment)
    SocketStreamedTraceSegmentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SocketStreamedTraceSegment.newBuilder() to construct.
  private SocketStreamedTraceSegment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SocketStreamedTraceSegment() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SocketStreamedTraceSegment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SocketStreamedTraceSegment(
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

            traceId_ = input.readUInt64();
            break;
          }
          case 18: {
            io.envoyproxy.envoy.data.tap.v3.Connection.Builder subBuilder = null;
            if (messagePieceCase_ == 2) {
              subBuilder = ((io.envoyproxy.envoy.data.tap.v3.Connection) messagePiece_).toBuilder();
            }
            messagePiece_ =
                input.readMessage(io.envoyproxy.envoy.data.tap.v3.Connection.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.envoyproxy.envoy.data.tap.v3.Connection) messagePiece_);
              messagePiece_ = subBuilder.buildPartial();
            }
            messagePieceCase_ = 2;
            break;
          }
          case 26: {
            io.envoyproxy.envoy.data.tap.v3.SocketEvent.Builder subBuilder = null;
            if (messagePieceCase_ == 3) {
              subBuilder = ((io.envoyproxy.envoy.data.tap.v3.SocketEvent) messagePiece_).toBuilder();
            }
            messagePiece_ =
                input.readMessage(io.envoyproxy.envoy.data.tap.v3.SocketEvent.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.envoyproxy.envoy.data.tap.v3.SocketEvent) messagePiece_);
              messagePiece_ = subBuilder.buildPartial();
            }
            messagePieceCase_ = 3;
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
    return io.envoyproxy.envoy.data.tap.v3.TransportProto.internal_static_envoy_data_tap_v3_SocketStreamedTraceSegment_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.data.tap.v3.TransportProto.internal_static_envoy_data_tap_v3_SocketStreamedTraceSegment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment.class, io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment.Builder.class);
  }

  private int messagePieceCase_ = 0;
  private java.lang.Object messagePiece_;
  public enum MessagePieceCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CONNECTION(2),
    EVENT(3),
    MESSAGEPIECE_NOT_SET(0);
    private final int value;
    private MessagePieceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MessagePieceCase valueOf(int value) {
      return forNumber(value);
    }

    public static MessagePieceCase forNumber(int value) {
      switch (value) {
        case 2: return CONNECTION;
        case 3: return EVENT;
        case 0: return MESSAGEPIECE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public MessagePieceCase
  getMessagePieceCase() {
    return MessagePieceCase.forNumber(
        messagePieceCase_);
  }

  public static final int TRACE_ID_FIELD_NUMBER = 1;
  private long traceId_;
  /**
   * <pre>
   * Trace ID unique to the originating Envoy only. Trace IDs can repeat and should not be used
   * for long term stable uniqueness. Matches connection IDs used in Envoy logs.
   * </pre>
   *
   * <code>uint64 trace_id = 1;</code>
   * @return The traceId.
   */
  @java.lang.Override
  public long getTraceId() {
    return traceId_;
  }

  public static final int CONNECTION_FIELD_NUMBER = 2;
  /**
   * <pre>
   * Connection properties.
   * </pre>
   *
   * <code>.envoy.data.tap.v3.Connection connection = 2;</code>
   * @return Whether the connection field is set.
   */
  @java.lang.Override
  public boolean hasConnection() {
    return messagePieceCase_ == 2;
  }
  /**
   * <pre>
   * Connection properties.
   * </pre>
   *
   * <code>.envoy.data.tap.v3.Connection connection = 2;</code>
   * @return The connection.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.data.tap.v3.Connection getConnection() {
    if (messagePieceCase_ == 2) {
       return (io.envoyproxy.envoy.data.tap.v3.Connection) messagePiece_;
    }
    return io.envoyproxy.envoy.data.tap.v3.Connection.getDefaultInstance();
  }
  /**
   * <pre>
   * Connection properties.
   * </pre>
   *
   * <code>.envoy.data.tap.v3.Connection connection = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.data.tap.v3.ConnectionOrBuilder getConnectionOrBuilder() {
    if (messagePieceCase_ == 2) {
       return (io.envoyproxy.envoy.data.tap.v3.Connection) messagePiece_;
    }
    return io.envoyproxy.envoy.data.tap.v3.Connection.getDefaultInstance();
  }

  public static final int EVENT_FIELD_NUMBER = 3;
  /**
   * <pre>
   * Socket event.
   * </pre>
   *
   * <code>.envoy.data.tap.v3.SocketEvent event = 3;</code>
   * @return Whether the event field is set.
   */
  @java.lang.Override
  public boolean hasEvent() {
    return messagePieceCase_ == 3;
  }
  /**
   * <pre>
   * Socket event.
   * </pre>
   *
   * <code>.envoy.data.tap.v3.SocketEvent event = 3;</code>
   * @return The event.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.data.tap.v3.SocketEvent getEvent() {
    if (messagePieceCase_ == 3) {
       return (io.envoyproxy.envoy.data.tap.v3.SocketEvent) messagePiece_;
    }
    return io.envoyproxy.envoy.data.tap.v3.SocketEvent.getDefaultInstance();
  }
  /**
   * <pre>
   * Socket event.
   * </pre>
   *
   * <code>.envoy.data.tap.v3.SocketEvent event = 3;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.data.tap.v3.SocketEventOrBuilder getEventOrBuilder() {
    if (messagePieceCase_ == 3) {
       return (io.envoyproxy.envoy.data.tap.v3.SocketEvent) messagePiece_;
    }
    return io.envoyproxy.envoy.data.tap.v3.SocketEvent.getDefaultInstance();
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
    if (traceId_ != 0L) {
      output.writeUInt64(1, traceId_);
    }
    if (messagePieceCase_ == 2) {
      output.writeMessage(2, (io.envoyproxy.envoy.data.tap.v3.Connection) messagePiece_);
    }
    if (messagePieceCase_ == 3) {
      output.writeMessage(3, (io.envoyproxy.envoy.data.tap.v3.SocketEvent) messagePiece_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (traceId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, traceId_);
    }
    if (messagePieceCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (io.envoyproxy.envoy.data.tap.v3.Connection) messagePiece_);
    }
    if (messagePieceCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (io.envoyproxy.envoy.data.tap.v3.SocketEvent) messagePiece_);
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
    if (!(obj instanceof io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment other = (io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment) obj;

    if (getTraceId()
        != other.getTraceId()) return false;
    if (!getMessagePieceCase().equals(other.getMessagePieceCase())) return false;
    switch (messagePieceCase_) {
      case 2:
        if (!getConnection()
            .equals(other.getConnection())) return false;
        break;
      case 3:
        if (!getEvent()
            .equals(other.getEvent())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + TRACE_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTraceId());
    switch (messagePieceCase_) {
      case 2:
        hash = (37 * hash) + CONNECTION_FIELD_NUMBER;
        hash = (53 * hash) + getConnection().hashCode();
        break;
      case 3:
        hash = (37 * hash) + EVENT_FIELD_NUMBER;
        hash = (53 * hash) + getEvent().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment prototype) {
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
   * A streamed socket trace segment. Multiple segments make up a full trace.
   * </pre>
   *
   * Protobuf type {@code envoy.data.tap.v3.SocketStreamedTraceSegment}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.data.tap.v3.SocketStreamedTraceSegment)
      io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.data.tap.v3.TransportProto.internal_static_envoy_data_tap_v3_SocketStreamedTraceSegment_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.data.tap.v3.TransportProto.internal_static_envoy_data_tap_v3_SocketStreamedTraceSegment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment.class, io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment.newBuilder()
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
      traceId_ = 0L;

      messagePieceCase_ = 0;
      messagePiece_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.data.tap.v3.TransportProto.internal_static_envoy_data_tap_v3_SocketStreamedTraceSegment_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment getDefaultInstanceForType() {
      return io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment build() {
      io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment buildPartial() {
      io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment result = new io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment(this);
      result.traceId_ = traceId_;
      if (messagePieceCase_ == 2) {
        if (connectionBuilder_ == null) {
          result.messagePiece_ = messagePiece_;
        } else {
          result.messagePiece_ = connectionBuilder_.build();
        }
      }
      if (messagePieceCase_ == 3) {
        if (eventBuilder_ == null) {
          result.messagePiece_ = messagePiece_;
        } else {
          result.messagePiece_ = eventBuilder_.build();
        }
      }
      result.messagePieceCase_ = messagePieceCase_;
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
      if (other instanceof io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment) {
        return mergeFrom((io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment other) {
      if (other == io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment.getDefaultInstance()) return this;
      if (other.getTraceId() != 0L) {
        setTraceId(other.getTraceId());
      }
      switch (other.getMessagePieceCase()) {
        case CONNECTION: {
          mergeConnection(other.getConnection());
          break;
        }
        case EVENT: {
          mergeEvent(other.getEvent());
          break;
        }
        case MESSAGEPIECE_NOT_SET: {
          break;
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
      io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int messagePieceCase_ = 0;
    private java.lang.Object messagePiece_;
    public MessagePieceCase
        getMessagePieceCase() {
      return MessagePieceCase.forNumber(
          messagePieceCase_);
    }

    public Builder clearMessagePiece() {
      messagePieceCase_ = 0;
      messagePiece_ = null;
      onChanged();
      return this;
    }


    private long traceId_ ;
    /**
     * <pre>
     * Trace ID unique to the originating Envoy only. Trace IDs can repeat and should not be used
     * for long term stable uniqueness. Matches connection IDs used in Envoy logs.
     * </pre>
     *
     * <code>uint64 trace_id = 1;</code>
     * @return The traceId.
     */
    @java.lang.Override
    public long getTraceId() {
      return traceId_;
    }
    /**
     * <pre>
     * Trace ID unique to the originating Envoy only. Trace IDs can repeat and should not be used
     * for long term stable uniqueness. Matches connection IDs used in Envoy logs.
     * </pre>
     *
     * <code>uint64 trace_id = 1;</code>
     * @param value The traceId to set.
     * @return This builder for chaining.
     */
    public Builder setTraceId(long value) {
      
      traceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Trace ID unique to the originating Envoy only. Trace IDs can repeat and should not be used
     * for long term stable uniqueness. Matches connection IDs used in Envoy logs.
     * </pre>
     *
     * <code>uint64 trace_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTraceId() {
      
      traceId_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.data.tap.v3.Connection, io.envoyproxy.envoy.data.tap.v3.Connection.Builder, io.envoyproxy.envoy.data.tap.v3.ConnectionOrBuilder> connectionBuilder_;
    /**
     * <pre>
     * Connection properties.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.Connection connection = 2;</code>
     * @return Whether the connection field is set.
     */
    @java.lang.Override
    public boolean hasConnection() {
      return messagePieceCase_ == 2;
    }
    /**
     * <pre>
     * Connection properties.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.Connection connection = 2;</code>
     * @return The connection.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.data.tap.v3.Connection getConnection() {
      if (connectionBuilder_ == null) {
        if (messagePieceCase_ == 2) {
          return (io.envoyproxy.envoy.data.tap.v3.Connection) messagePiece_;
        }
        return io.envoyproxy.envoy.data.tap.v3.Connection.getDefaultInstance();
      } else {
        if (messagePieceCase_ == 2) {
          return connectionBuilder_.getMessage();
        }
        return io.envoyproxy.envoy.data.tap.v3.Connection.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Connection properties.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.Connection connection = 2;</code>
     */
    public Builder setConnection(io.envoyproxy.envoy.data.tap.v3.Connection value) {
      if (connectionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        messagePiece_ = value;
        onChanged();
      } else {
        connectionBuilder_.setMessage(value);
      }
      messagePieceCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Connection properties.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.Connection connection = 2;</code>
     */
    public Builder setConnection(
        io.envoyproxy.envoy.data.tap.v3.Connection.Builder builderForValue) {
      if (connectionBuilder_ == null) {
        messagePiece_ = builderForValue.build();
        onChanged();
      } else {
        connectionBuilder_.setMessage(builderForValue.build());
      }
      messagePieceCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Connection properties.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.Connection connection = 2;</code>
     */
    public Builder mergeConnection(io.envoyproxy.envoy.data.tap.v3.Connection value) {
      if (connectionBuilder_ == null) {
        if (messagePieceCase_ == 2 &&
            messagePiece_ != io.envoyproxy.envoy.data.tap.v3.Connection.getDefaultInstance()) {
          messagePiece_ = io.envoyproxy.envoy.data.tap.v3.Connection.newBuilder((io.envoyproxy.envoy.data.tap.v3.Connection) messagePiece_)
              .mergeFrom(value).buildPartial();
        } else {
          messagePiece_ = value;
        }
        onChanged();
      } else {
        if (messagePieceCase_ == 2) {
          connectionBuilder_.mergeFrom(value);
        }
        connectionBuilder_.setMessage(value);
      }
      messagePieceCase_ = 2;
      return this;
    }
    /**
     * <pre>
     * Connection properties.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.Connection connection = 2;</code>
     */
    public Builder clearConnection() {
      if (connectionBuilder_ == null) {
        if (messagePieceCase_ == 2) {
          messagePieceCase_ = 0;
          messagePiece_ = null;
          onChanged();
        }
      } else {
        if (messagePieceCase_ == 2) {
          messagePieceCase_ = 0;
          messagePiece_ = null;
        }
        connectionBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Connection properties.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.Connection connection = 2;</code>
     */
    public io.envoyproxy.envoy.data.tap.v3.Connection.Builder getConnectionBuilder() {
      return getConnectionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Connection properties.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.Connection connection = 2;</code>
     */
    @java.lang.Override
    public io.envoyproxy.envoy.data.tap.v3.ConnectionOrBuilder getConnectionOrBuilder() {
      if ((messagePieceCase_ == 2) && (connectionBuilder_ != null)) {
        return connectionBuilder_.getMessageOrBuilder();
      } else {
        if (messagePieceCase_ == 2) {
          return (io.envoyproxy.envoy.data.tap.v3.Connection) messagePiece_;
        }
        return io.envoyproxy.envoy.data.tap.v3.Connection.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Connection properties.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.Connection connection = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.data.tap.v3.Connection, io.envoyproxy.envoy.data.tap.v3.Connection.Builder, io.envoyproxy.envoy.data.tap.v3.ConnectionOrBuilder> 
        getConnectionFieldBuilder() {
      if (connectionBuilder_ == null) {
        if (!(messagePieceCase_ == 2)) {
          messagePiece_ = io.envoyproxy.envoy.data.tap.v3.Connection.getDefaultInstance();
        }
        connectionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.data.tap.v3.Connection, io.envoyproxy.envoy.data.tap.v3.Connection.Builder, io.envoyproxy.envoy.data.tap.v3.ConnectionOrBuilder>(
                (io.envoyproxy.envoy.data.tap.v3.Connection) messagePiece_,
                getParentForChildren(),
                isClean());
        messagePiece_ = null;
      }
      messagePieceCase_ = 2;
      onChanged();;
      return connectionBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.data.tap.v3.SocketEvent, io.envoyproxy.envoy.data.tap.v3.SocketEvent.Builder, io.envoyproxy.envoy.data.tap.v3.SocketEventOrBuilder> eventBuilder_;
    /**
     * <pre>
     * Socket event.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.SocketEvent event = 3;</code>
     * @return Whether the event field is set.
     */
    @java.lang.Override
    public boolean hasEvent() {
      return messagePieceCase_ == 3;
    }
    /**
     * <pre>
     * Socket event.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.SocketEvent event = 3;</code>
     * @return The event.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.data.tap.v3.SocketEvent getEvent() {
      if (eventBuilder_ == null) {
        if (messagePieceCase_ == 3) {
          return (io.envoyproxy.envoy.data.tap.v3.SocketEvent) messagePiece_;
        }
        return io.envoyproxy.envoy.data.tap.v3.SocketEvent.getDefaultInstance();
      } else {
        if (messagePieceCase_ == 3) {
          return eventBuilder_.getMessage();
        }
        return io.envoyproxy.envoy.data.tap.v3.SocketEvent.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Socket event.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.SocketEvent event = 3;</code>
     */
    public Builder setEvent(io.envoyproxy.envoy.data.tap.v3.SocketEvent value) {
      if (eventBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        messagePiece_ = value;
        onChanged();
      } else {
        eventBuilder_.setMessage(value);
      }
      messagePieceCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Socket event.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.SocketEvent event = 3;</code>
     */
    public Builder setEvent(
        io.envoyproxy.envoy.data.tap.v3.SocketEvent.Builder builderForValue) {
      if (eventBuilder_ == null) {
        messagePiece_ = builderForValue.build();
        onChanged();
      } else {
        eventBuilder_.setMessage(builderForValue.build());
      }
      messagePieceCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Socket event.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.SocketEvent event = 3;</code>
     */
    public Builder mergeEvent(io.envoyproxy.envoy.data.tap.v3.SocketEvent value) {
      if (eventBuilder_ == null) {
        if (messagePieceCase_ == 3 &&
            messagePiece_ != io.envoyproxy.envoy.data.tap.v3.SocketEvent.getDefaultInstance()) {
          messagePiece_ = io.envoyproxy.envoy.data.tap.v3.SocketEvent.newBuilder((io.envoyproxy.envoy.data.tap.v3.SocketEvent) messagePiece_)
              .mergeFrom(value).buildPartial();
        } else {
          messagePiece_ = value;
        }
        onChanged();
      } else {
        if (messagePieceCase_ == 3) {
          eventBuilder_.mergeFrom(value);
        }
        eventBuilder_.setMessage(value);
      }
      messagePieceCase_ = 3;
      return this;
    }
    /**
     * <pre>
     * Socket event.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.SocketEvent event = 3;</code>
     */
    public Builder clearEvent() {
      if (eventBuilder_ == null) {
        if (messagePieceCase_ == 3) {
          messagePieceCase_ = 0;
          messagePiece_ = null;
          onChanged();
        }
      } else {
        if (messagePieceCase_ == 3) {
          messagePieceCase_ = 0;
          messagePiece_ = null;
        }
        eventBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Socket event.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.SocketEvent event = 3;</code>
     */
    public io.envoyproxy.envoy.data.tap.v3.SocketEvent.Builder getEventBuilder() {
      return getEventFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Socket event.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.SocketEvent event = 3;</code>
     */
    @java.lang.Override
    public io.envoyproxy.envoy.data.tap.v3.SocketEventOrBuilder getEventOrBuilder() {
      if ((messagePieceCase_ == 3) && (eventBuilder_ != null)) {
        return eventBuilder_.getMessageOrBuilder();
      } else {
        if (messagePieceCase_ == 3) {
          return (io.envoyproxy.envoy.data.tap.v3.SocketEvent) messagePiece_;
        }
        return io.envoyproxy.envoy.data.tap.v3.SocketEvent.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Socket event.
     * </pre>
     *
     * <code>.envoy.data.tap.v3.SocketEvent event = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.data.tap.v3.SocketEvent, io.envoyproxy.envoy.data.tap.v3.SocketEvent.Builder, io.envoyproxy.envoy.data.tap.v3.SocketEventOrBuilder> 
        getEventFieldBuilder() {
      if (eventBuilder_ == null) {
        if (!(messagePieceCase_ == 3)) {
          messagePiece_ = io.envoyproxy.envoy.data.tap.v3.SocketEvent.getDefaultInstance();
        }
        eventBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.data.tap.v3.SocketEvent, io.envoyproxy.envoy.data.tap.v3.SocketEvent.Builder, io.envoyproxy.envoy.data.tap.v3.SocketEventOrBuilder>(
                (io.envoyproxy.envoy.data.tap.v3.SocketEvent) messagePiece_,
                getParentForChildren(),
                isClean());
        messagePiece_ = null;
      }
      messagePieceCase_ = 3;
      onChanged();;
      return eventBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.data.tap.v3.SocketStreamedTraceSegment)
  }

  // @@protoc_insertion_point(class_scope:envoy.data.tap.v3.SocketStreamedTraceSegment)
  private static final io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment();
  }

  public static io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SocketStreamedTraceSegment>
      PARSER = new com.google.protobuf.AbstractParser<SocketStreamedTraceSegment>() {
    @java.lang.Override
    public SocketStreamedTraceSegment parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SocketStreamedTraceSegment(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SocketStreamedTraceSegment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SocketStreamedTraceSegment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.data.tap.v3.SocketStreamedTraceSegment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

