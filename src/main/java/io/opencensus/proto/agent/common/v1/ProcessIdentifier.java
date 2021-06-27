// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opencensus/proto/agent/common/v1/common.proto

package io.opencensus.proto.agent.common.v1;

/**
 * <pre>
 * Identifier that uniquely identifies a process within a VM/container.
 * </pre>
 *
 * Protobuf type {@code opencensus.proto.agent.common.v1.ProcessIdentifier}
 */
public final class ProcessIdentifier extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opencensus.proto.agent.common.v1.ProcessIdentifier)
    ProcessIdentifierOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProcessIdentifier.newBuilder() to construct.
  private ProcessIdentifier(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProcessIdentifier() {
    hostName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProcessIdentifier();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProcessIdentifier(
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
            java.lang.String s = input.readStringRequireUtf8();

            hostName_ = s;
            break;
          }
          case 16: {

            pid_ = input.readUInt32();
            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (startTimestamp_ != null) {
              subBuilder = startTimestamp_.toBuilder();
            }
            startTimestamp_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(startTimestamp_);
              startTimestamp_ = subBuilder.buildPartial();
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
    return io.opencensus.proto.agent.common.v1.CommonProto.internal_static_opencensus_proto_agent_common_v1_ProcessIdentifier_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opencensus.proto.agent.common.v1.CommonProto.internal_static_opencensus_proto_agent_common_v1_ProcessIdentifier_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opencensus.proto.agent.common.v1.ProcessIdentifier.class, io.opencensus.proto.agent.common.v1.ProcessIdentifier.Builder.class);
  }

  public static final int HOST_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object hostName_;
  /**
   * <pre>
   * The host name. Usually refers to the machine/container name.
   * For example: os.Hostname() in Go, socket.gethostname() in Python.
   * </pre>
   *
   * <code>string host_name = 1;</code>
   * @return The hostName.
   */
  @java.lang.Override
  public java.lang.String getHostName() {
    java.lang.Object ref = hostName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hostName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The host name. Usually refers to the machine/container name.
   * For example: os.Hostname() in Go, socket.gethostname() in Python.
   * </pre>
   *
   * <code>string host_name = 1;</code>
   * @return The bytes for hostName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHostNameBytes() {
    java.lang.Object ref = hostName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hostName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PID_FIELD_NUMBER = 2;
  private int pid_;
  /**
   * <pre>
   * Process id.
   * </pre>
   *
   * <code>uint32 pid = 2;</code>
   * @return The pid.
   */
  @java.lang.Override
  public int getPid() {
    return pid_;
  }

  public static final int START_TIMESTAMP_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp startTimestamp_;
  /**
   * <pre>
   * Start time of this ProcessIdentifier. Represented in epoch time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_timestamp = 3;</code>
   * @return Whether the startTimestamp field is set.
   */
  @java.lang.Override
  public boolean hasStartTimestamp() {
    return startTimestamp_ != null;
  }
  /**
   * <pre>
   * Start time of this ProcessIdentifier. Represented in epoch time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_timestamp = 3;</code>
   * @return The startTimestamp.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getStartTimestamp() {
    return startTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTimestamp_;
  }
  /**
   * <pre>
   * Start time of this ProcessIdentifier. Represented in epoch time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_timestamp = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getStartTimestampOrBuilder() {
    return getStartTimestamp();
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
    if (!getHostNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, hostName_);
    }
    if (pid_ != 0) {
      output.writeUInt32(2, pid_);
    }
    if (startTimestamp_ != null) {
      output.writeMessage(3, getStartTimestamp());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getHostNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, hostName_);
    }
    if (pid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, pid_);
    }
    if (startTimestamp_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getStartTimestamp());
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
    if (!(obj instanceof io.opencensus.proto.agent.common.v1.ProcessIdentifier)) {
      return super.equals(obj);
    }
    io.opencensus.proto.agent.common.v1.ProcessIdentifier other = (io.opencensus.proto.agent.common.v1.ProcessIdentifier) obj;

    if (!getHostName()
        .equals(other.getHostName())) return false;
    if (getPid()
        != other.getPid()) return false;
    if (hasStartTimestamp() != other.hasStartTimestamp()) return false;
    if (hasStartTimestamp()) {
      if (!getStartTimestamp()
          .equals(other.getStartTimestamp())) return false;
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
    hash = (37 * hash) + HOST_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getHostName().hashCode();
    hash = (37 * hash) + PID_FIELD_NUMBER;
    hash = (53 * hash) + getPid();
    if (hasStartTimestamp()) {
      hash = (37 * hash) + START_TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getStartTimestamp().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opencensus.proto.agent.common.v1.ProcessIdentifier parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencensus.proto.agent.common.v1.ProcessIdentifier parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencensus.proto.agent.common.v1.ProcessIdentifier parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencensus.proto.agent.common.v1.ProcessIdentifier parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencensus.proto.agent.common.v1.ProcessIdentifier parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opencensus.proto.agent.common.v1.ProcessIdentifier parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opencensus.proto.agent.common.v1.ProcessIdentifier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencensus.proto.agent.common.v1.ProcessIdentifier parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencensus.proto.agent.common.v1.ProcessIdentifier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opencensus.proto.agent.common.v1.ProcessIdentifier parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opencensus.proto.agent.common.v1.ProcessIdentifier parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opencensus.proto.agent.common.v1.ProcessIdentifier parseFrom(
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
  public static Builder newBuilder(io.opencensus.proto.agent.common.v1.ProcessIdentifier prototype) {
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
   * Identifier that uniquely identifies a process within a VM/container.
   * </pre>
   *
   * Protobuf type {@code opencensus.proto.agent.common.v1.ProcessIdentifier}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opencensus.proto.agent.common.v1.ProcessIdentifier)
      io.opencensus.proto.agent.common.v1.ProcessIdentifierOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opencensus.proto.agent.common.v1.CommonProto.internal_static_opencensus_proto_agent_common_v1_ProcessIdentifier_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opencensus.proto.agent.common.v1.CommonProto.internal_static_opencensus_proto_agent_common_v1_ProcessIdentifier_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opencensus.proto.agent.common.v1.ProcessIdentifier.class, io.opencensus.proto.agent.common.v1.ProcessIdentifier.Builder.class);
    }

    // Construct using io.opencensus.proto.agent.common.v1.ProcessIdentifier.newBuilder()
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
      hostName_ = "";

      pid_ = 0;

      if (startTimestampBuilder_ == null) {
        startTimestamp_ = null;
      } else {
        startTimestamp_ = null;
        startTimestampBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opencensus.proto.agent.common.v1.CommonProto.internal_static_opencensus_proto_agent_common_v1_ProcessIdentifier_descriptor;
    }

    @java.lang.Override
    public io.opencensus.proto.agent.common.v1.ProcessIdentifier getDefaultInstanceForType() {
      return io.opencensus.proto.agent.common.v1.ProcessIdentifier.getDefaultInstance();
    }

    @java.lang.Override
    public io.opencensus.proto.agent.common.v1.ProcessIdentifier build() {
      io.opencensus.proto.agent.common.v1.ProcessIdentifier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opencensus.proto.agent.common.v1.ProcessIdentifier buildPartial() {
      io.opencensus.proto.agent.common.v1.ProcessIdentifier result = new io.opencensus.proto.agent.common.v1.ProcessIdentifier(this);
      result.hostName_ = hostName_;
      result.pid_ = pid_;
      if (startTimestampBuilder_ == null) {
        result.startTimestamp_ = startTimestamp_;
      } else {
        result.startTimestamp_ = startTimestampBuilder_.build();
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
      if (other instanceof io.opencensus.proto.agent.common.v1.ProcessIdentifier) {
        return mergeFrom((io.opencensus.proto.agent.common.v1.ProcessIdentifier)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opencensus.proto.agent.common.v1.ProcessIdentifier other) {
      if (other == io.opencensus.proto.agent.common.v1.ProcessIdentifier.getDefaultInstance()) return this;
      if (!other.getHostName().isEmpty()) {
        hostName_ = other.hostName_;
        onChanged();
      }
      if (other.getPid() != 0) {
        setPid(other.getPid());
      }
      if (other.hasStartTimestamp()) {
        mergeStartTimestamp(other.getStartTimestamp());
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
      io.opencensus.proto.agent.common.v1.ProcessIdentifier parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opencensus.proto.agent.common.v1.ProcessIdentifier) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object hostName_ = "";
    /**
     * <pre>
     * The host name. Usually refers to the machine/container name.
     * For example: os.Hostname() in Go, socket.gethostname() in Python.
     * </pre>
     *
     * <code>string host_name = 1;</code>
     * @return The hostName.
     */
    public java.lang.String getHostName() {
      java.lang.Object ref = hostName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hostName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The host name. Usually refers to the machine/container name.
     * For example: os.Hostname() in Go, socket.gethostname() in Python.
     * </pre>
     *
     * <code>string host_name = 1;</code>
     * @return The bytes for hostName.
     */
    public com.google.protobuf.ByteString
        getHostNameBytes() {
      java.lang.Object ref = hostName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hostName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The host name. Usually refers to the machine/container name.
     * For example: os.Hostname() in Go, socket.gethostname() in Python.
     * </pre>
     *
     * <code>string host_name = 1;</code>
     * @param value The hostName to set.
     * @return This builder for chaining.
     */
    public Builder setHostName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      hostName_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The host name. Usually refers to the machine/container name.
     * For example: os.Hostname() in Go, socket.gethostname() in Python.
     * </pre>
     *
     * <code>string host_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHostName() {
      
      hostName_ = getDefaultInstance().getHostName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The host name. Usually refers to the machine/container name.
     * For example: os.Hostname() in Go, socket.gethostname() in Python.
     * </pre>
     *
     * <code>string host_name = 1;</code>
     * @param value The bytes for hostName to set.
     * @return This builder for chaining.
     */
    public Builder setHostNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      hostName_ = value;
      onChanged();
      return this;
    }

    private int pid_ ;
    /**
     * <pre>
     * Process id.
     * </pre>
     *
     * <code>uint32 pid = 2;</code>
     * @return The pid.
     */
    @java.lang.Override
    public int getPid() {
      return pid_;
    }
    /**
     * <pre>
     * Process id.
     * </pre>
     *
     * <code>uint32 pid = 2;</code>
     * @param value The pid to set.
     * @return This builder for chaining.
     */
    public Builder setPid(int value) {
      
      pid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Process id.
     * </pre>
     *
     * <code>uint32 pid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPid() {
      
      pid_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp startTimestamp_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> startTimestampBuilder_;
    /**
     * <pre>
     * Start time of this ProcessIdentifier. Represented in epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_timestamp = 3;</code>
     * @return Whether the startTimestamp field is set.
     */
    public boolean hasStartTimestamp() {
      return startTimestampBuilder_ != null || startTimestamp_ != null;
    }
    /**
     * <pre>
     * Start time of this ProcessIdentifier. Represented in epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_timestamp = 3;</code>
     * @return The startTimestamp.
     */
    public com.google.protobuf.Timestamp getStartTimestamp() {
      if (startTimestampBuilder_ == null) {
        return startTimestamp_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : startTimestamp_;
      } else {
        return startTimestampBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Start time of this ProcessIdentifier. Represented in epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_timestamp = 3;</code>
     */
    public Builder setStartTimestamp(com.google.protobuf.Timestamp value) {
      if (startTimestampBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        startTimestamp_ = value;
        onChanged();
      } else {
        startTimestampBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Start time of this ProcessIdentifier. Represented in epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_timestamp = 3;</code>
     */
    public Builder setStartTimestamp(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (startTimestampBuilder_ == null) {
        startTimestamp_ = builderForValue.build();
        onChanged();
      } else {
        startTimestampBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Start time of this ProcessIdentifier. Represented in epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_timestamp = 3;</code>
     */
    public Builder mergeStartTimestamp(com.google.protobuf.Timestamp value) {
      if (startTimestampBuilder_ == null) {
        if (startTimestamp_ != null) {
          startTimestamp_ =
            com.google.protobuf.Timestamp.newBuilder(startTimestamp_).mergeFrom(value).buildPartial();
        } else {
          startTimestamp_ = value;
        }
        onChanged();
      } else {
        startTimestampBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Start time of this ProcessIdentifier. Represented in epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_timestamp = 3;</code>
     */
    public Builder clearStartTimestamp() {
      if (startTimestampBuilder_ == null) {
        startTimestamp_ = null;
        onChanged();
      } else {
        startTimestamp_ = null;
        startTimestampBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Start time of this ProcessIdentifier. Represented in epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_timestamp = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getStartTimestampBuilder() {
      
      onChanged();
      return getStartTimestampFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Start time of this ProcessIdentifier. Represented in epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_timestamp = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getStartTimestampOrBuilder() {
      if (startTimestampBuilder_ != null) {
        return startTimestampBuilder_.getMessageOrBuilder();
      } else {
        return startTimestamp_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : startTimestamp_;
      }
    }
    /**
     * <pre>
     * Start time of this ProcessIdentifier. Represented in epoch time.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp start_timestamp = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getStartTimestampFieldBuilder() {
      if (startTimestampBuilder_ == null) {
        startTimestampBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getStartTimestamp(),
                getParentForChildren(),
                isClean());
        startTimestamp_ = null;
      }
      return startTimestampBuilder_;
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


    // @@protoc_insertion_point(builder_scope:opencensus.proto.agent.common.v1.ProcessIdentifier)
  }

  // @@protoc_insertion_point(class_scope:opencensus.proto.agent.common.v1.ProcessIdentifier)
  private static final io.opencensus.proto.agent.common.v1.ProcessIdentifier DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opencensus.proto.agent.common.v1.ProcessIdentifier();
  }

  public static io.opencensus.proto.agent.common.v1.ProcessIdentifier getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProcessIdentifier>
      PARSER = new com.google.protobuf.AbstractParser<ProcessIdentifier>() {
    @java.lang.Override
    public ProcessIdentifier parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProcessIdentifier(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProcessIdentifier> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProcessIdentifier> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opencensus.proto.agent.common.v1.ProcessIdentifier getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

