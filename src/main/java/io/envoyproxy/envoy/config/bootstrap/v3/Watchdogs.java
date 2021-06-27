// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/bootstrap/v3/bootstrap.proto

package io.envoyproxy.envoy.config.bootstrap.v3;

/**
 * <pre>
 * Allows you to specify different watchdog configs for different subsystems.
 * This allows finer tuned policies for the watchdog. If a subsystem is omitted
 * the default values for that system will be used.
 * </pre>
 *
 * Protobuf type {@code envoy.config.bootstrap.v3.Watchdogs}
 */
public final class Watchdogs extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.bootstrap.v3.Watchdogs)
    WatchdogsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Watchdogs.newBuilder() to construct.
  private Watchdogs(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Watchdogs() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Watchdogs();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Watchdogs(
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
            io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.Builder subBuilder = null;
            if (mainThreadWatchdog_ != null) {
              subBuilder = mainThreadWatchdog_.toBuilder();
            }
            mainThreadWatchdog_ = input.readMessage(io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(mainThreadWatchdog_);
              mainThreadWatchdog_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.Builder subBuilder = null;
            if (workerWatchdog_ != null) {
              subBuilder = workerWatchdog_.toBuilder();
            }
            workerWatchdog_ = input.readMessage(io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(workerWatchdog_);
              workerWatchdog_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.config.bootstrap.v3.BootstrapProto.internal_static_envoy_config_bootstrap_v3_Watchdogs_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.bootstrap.v3.BootstrapProto.internal_static_envoy_config_bootstrap_v3_Watchdogs_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs.class, io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs.Builder.class);
  }

  public static final int MAIN_THREAD_WATCHDOG_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.config.bootstrap.v3.Watchdog mainThreadWatchdog_;
  /**
   * <pre>
   * Watchdog for the main thread.
   * </pre>
   *
   * <code>.envoy.config.bootstrap.v3.Watchdog main_thread_watchdog = 1;</code>
   * @return Whether the mainThreadWatchdog field is set.
   */
  @java.lang.Override
  public boolean hasMainThreadWatchdog() {
    return mainThreadWatchdog_ != null;
  }
  /**
   * <pre>
   * Watchdog for the main thread.
   * </pre>
   *
   * <code>.envoy.config.bootstrap.v3.Watchdog main_thread_watchdog = 1;</code>
   * @return The mainThreadWatchdog.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.bootstrap.v3.Watchdog getMainThreadWatchdog() {
    return mainThreadWatchdog_ == null ? io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.getDefaultInstance() : mainThreadWatchdog_;
  }
  /**
   * <pre>
   * Watchdog for the main thread.
   * </pre>
   *
   * <code>.envoy.config.bootstrap.v3.Watchdog main_thread_watchdog = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.bootstrap.v3.WatchdogOrBuilder getMainThreadWatchdogOrBuilder() {
    return getMainThreadWatchdog();
  }

  public static final int WORKER_WATCHDOG_FIELD_NUMBER = 2;
  private io.envoyproxy.envoy.config.bootstrap.v3.Watchdog workerWatchdog_;
  /**
   * <pre>
   * Watchdog for the worker threads.
   * </pre>
   *
   * <code>.envoy.config.bootstrap.v3.Watchdog worker_watchdog = 2;</code>
   * @return Whether the workerWatchdog field is set.
   */
  @java.lang.Override
  public boolean hasWorkerWatchdog() {
    return workerWatchdog_ != null;
  }
  /**
   * <pre>
   * Watchdog for the worker threads.
   * </pre>
   *
   * <code>.envoy.config.bootstrap.v3.Watchdog worker_watchdog = 2;</code>
   * @return The workerWatchdog.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.bootstrap.v3.Watchdog getWorkerWatchdog() {
    return workerWatchdog_ == null ? io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.getDefaultInstance() : workerWatchdog_;
  }
  /**
   * <pre>
   * Watchdog for the worker threads.
   * </pre>
   *
   * <code>.envoy.config.bootstrap.v3.Watchdog worker_watchdog = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.bootstrap.v3.WatchdogOrBuilder getWorkerWatchdogOrBuilder() {
    return getWorkerWatchdog();
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
    if (mainThreadWatchdog_ != null) {
      output.writeMessage(1, getMainThreadWatchdog());
    }
    if (workerWatchdog_ != null) {
      output.writeMessage(2, getWorkerWatchdog());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mainThreadWatchdog_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMainThreadWatchdog());
    }
    if (workerWatchdog_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getWorkerWatchdog());
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
    if (!(obj instanceof io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs other = (io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs) obj;

    if (hasMainThreadWatchdog() != other.hasMainThreadWatchdog()) return false;
    if (hasMainThreadWatchdog()) {
      if (!getMainThreadWatchdog()
          .equals(other.getMainThreadWatchdog())) return false;
    }
    if (hasWorkerWatchdog() != other.hasWorkerWatchdog()) return false;
    if (hasWorkerWatchdog()) {
      if (!getWorkerWatchdog()
          .equals(other.getWorkerWatchdog())) return false;
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
    if (hasMainThreadWatchdog()) {
      hash = (37 * hash) + MAIN_THREAD_WATCHDOG_FIELD_NUMBER;
      hash = (53 * hash) + getMainThreadWatchdog().hashCode();
    }
    if (hasWorkerWatchdog()) {
      hash = (37 * hash) + WORKER_WATCHDOG_FIELD_NUMBER;
      hash = (53 * hash) + getWorkerWatchdog().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs prototype) {
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
   * Allows you to specify different watchdog configs for different subsystems.
   * This allows finer tuned policies for the watchdog. If a subsystem is omitted
   * the default values for that system will be used.
   * </pre>
   *
   * Protobuf type {@code envoy.config.bootstrap.v3.Watchdogs}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.bootstrap.v3.Watchdogs)
      io.envoyproxy.envoy.config.bootstrap.v3.WatchdogsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.bootstrap.v3.BootstrapProto.internal_static_envoy_config_bootstrap_v3_Watchdogs_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.bootstrap.v3.BootstrapProto.internal_static_envoy_config_bootstrap_v3_Watchdogs_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs.class, io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs.newBuilder()
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
      if (mainThreadWatchdogBuilder_ == null) {
        mainThreadWatchdog_ = null;
      } else {
        mainThreadWatchdog_ = null;
        mainThreadWatchdogBuilder_ = null;
      }
      if (workerWatchdogBuilder_ == null) {
        workerWatchdog_ = null;
      } else {
        workerWatchdog_ = null;
        workerWatchdogBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.bootstrap.v3.BootstrapProto.internal_static_envoy_config_bootstrap_v3_Watchdogs_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs build() {
      io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs buildPartial() {
      io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs result = new io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs(this);
      if (mainThreadWatchdogBuilder_ == null) {
        result.mainThreadWatchdog_ = mainThreadWatchdog_;
      } else {
        result.mainThreadWatchdog_ = mainThreadWatchdogBuilder_.build();
      }
      if (workerWatchdogBuilder_ == null) {
        result.workerWatchdog_ = workerWatchdog_;
      } else {
        result.workerWatchdog_ = workerWatchdogBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs) {
        return mergeFrom((io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs other) {
      if (other == io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs.getDefaultInstance()) return this;
      if (other.hasMainThreadWatchdog()) {
        mergeMainThreadWatchdog(other.getMainThreadWatchdog());
      }
      if (other.hasWorkerWatchdog()) {
        mergeWorkerWatchdog(other.getWorkerWatchdog());
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
      io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.envoyproxy.envoy.config.bootstrap.v3.Watchdog mainThreadWatchdog_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.bootstrap.v3.Watchdog, io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.Builder, io.envoyproxy.envoy.config.bootstrap.v3.WatchdogOrBuilder> mainThreadWatchdogBuilder_;
    /**
     * <pre>
     * Watchdog for the main thread.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog main_thread_watchdog = 1;</code>
     * @return Whether the mainThreadWatchdog field is set.
     */
    public boolean hasMainThreadWatchdog() {
      return mainThreadWatchdogBuilder_ != null || mainThreadWatchdog_ != null;
    }
    /**
     * <pre>
     * Watchdog for the main thread.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog main_thread_watchdog = 1;</code>
     * @return The mainThreadWatchdog.
     */
    public io.envoyproxy.envoy.config.bootstrap.v3.Watchdog getMainThreadWatchdog() {
      if (mainThreadWatchdogBuilder_ == null) {
        return mainThreadWatchdog_ == null ? io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.getDefaultInstance() : mainThreadWatchdog_;
      } else {
        return mainThreadWatchdogBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Watchdog for the main thread.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog main_thread_watchdog = 1;</code>
     */
    public Builder setMainThreadWatchdog(io.envoyproxy.envoy.config.bootstrap.v3.Watchdog value) {
      if (mainThreadWatchdogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mainThreadWatchdog_ = value;
        onChanged();
      } else {
        mainThreadWatchdogBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Watchdog for the main thread.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog main_thread_watchdog = 1;</code>
     */
    public Builder setMainThreadWatchdog(
        io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.Builder builderForValue) {
      if (mainThreadWatchdogBuilder_ == null) {
        mainThreadWatchdog_ = builderForValue.build();
        onChanged();
      } else {
        mainThreadWatchdogBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Watchdog for the main thread.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog main_thread_watchdog = 1;</code>
     */
    public Builder mergeMainThreadWatchdog(io.envoyproxy.envoy.config.bootstrap.v3.Watchdog value) {
      if (mainThreadWatchdogBuilder_ == null) {
        if (mainThreadWatchdog_ != null) {
          mainThreadWatchdog_ =
            io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.newBuilder(mainThreadWatchdog_).mergeFrom(value).buildPartial();
        } else {
          mainThreadWatchdog_ = value;
        }
        onChanged();
      } else {
        mainThreadWatchdogBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Watchdog for the main thread.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog main_thread_watchdog = 1;</code>
     */
    public Builder clearMainThreadWatchdog() {
      if (mainThreadWatchdogBuilder_ == null) {
        mainThreadWatchdog_ = null;
        onChanged();
      } else {
        mainThreadWatchdog_ = null;
        mainThreadWatchdogBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Watchdog for the main thread.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog main_thread_watchdog = 1;</code>
     */
    public io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.Builder getMainThreadWatchdogBuilder() {
      
      onChanged();
      return getMainThreadWatchdogFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Watchdog for the main thread.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog main_thread_watchdog = 1;</code>
     */
    public io.envoyproxy.envoy.config.bootstrap.v3.WatchdogOrBuilder getMainThreadWatchdogOrBuilder() {
      if (mainThreadWatchdogBuilder_ != null) {
        return mainThreadWatchdogBuilder_.getMessageOrBuilder();
      } else {
        return mainThreadWatchdog_ == null ?
            io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.getDefaultInstance() : mainThreadWatchdog_;
      }
    }
    /**
     * <pre>
     * Watchdog for the main thread.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog main_thread_watchdog = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.bootstrap.v3.Watchdog, io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.Builder, io.envoyproxy.envoy.config.bootstrap.v3.WatchdogOrBuilder> 
        getMainThreadWatchdogFieldBuilder() {
      if (mainThreadWatchdogBuilder_ == null) {
        mainThreadWatchdogBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.bootstrap.v3.Watchdog, io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.Builder, io.envoyproxy.envoy.config.bootstrap.v3.WatchdogOrBuilder>(
                getMainThreadWatchdog(),
                getParentForChildren(),
                isClean());
        mainThreadWatchdog_ = null;
      }
      return mainThreadWatchdogBuilder_;
    }

    private io.envoyproxy.envoy.config.bootstrap.v3.Watchdog workerWatchdog_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.bootstrap.v3.Watchdog, io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.Builder, io.envoyproxy.envoy.config.bootstrap.v3.WatchdogOrBuilder> workerWatchdogBuilder_;
    /**
     * <pre>
     * Watchdog for the worker threads.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog worker_watchdog = 2;</code>
     * @return Whether the workerWatchdog field is set.
     */
    public boolean hasWorkerWatchdog() {
      return workerWatchdogBuilder_ != null || workerWatchdog_ != null;
    }
    /**
     * <pre>
     * Watchdog for the worker threads.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog worker_watchdog = 2;</code>
     * @return The workerWatchdog.
     */
    public io.envoyproxy.envoy.config.bootstrap.v3.Watchdog getWorkerWatchdog() {
      if (workerWatchdogBuilder_ == null) {
        return workerWatchdog_ == null ? io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.getDefaultInstance() : workerWatchdog_;
      } else {
        return workerWatchdogBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Watchdog for the worker threads.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog worker_watchdog = 2;</code>
     */
    public Builder setWorkerWatchdog(io.envoyproxy.envoy.config.bootstrap.v3.Watchdog value) {
      if (workerWatchdogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        workerWatchdog_ = value;
        onChanged();
      } else {
        workerWatchdogBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Watchdog for the worker threads.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog worker_watchdog = 2;</code>
     */
    public Builder setWorkerWatchdog(
        io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.Builder builderForValue) {
      if (workerWatchdogBuilder_ == null) {
        workerWatchdog_ = builderForValue.build();
        onChanged();
      } else {
        workerWatchdogBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Watchdog for the worker threads.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog worker_watchdog = 2;</code>
     */
    public Builder mergeWorkerWatchdog(io.envoyproxy.envoy.config.bootstrap.v3.Watchdog value) {
      if (workerWatchdogBuilder_ == null) {
        if (workerWatchdog_ != null) {
          workerWatchdog_ =
            io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.newBuilder(workerWatchdog_).mergeFrom(value).buildPartial();
        } else {
          workerWatchdog_ = value;
        }
        onChanged();
      } else {
        workerWatchdogBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Watchdog for the worker threads.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog worker_watchdog = 2;</code>
     */
    public Builder clearWorkerWatchdog() {
      if (workerWatchdogBuilder_ == null) {
        workerWatchdog_ = null;
        onChanged();
      } else {
        workerWatchdog_ = null;
        workerWatchdogBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Watchdog for the worker threads.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog worker_watchdog = 2;</code>
     */
    public io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.Builder getWorkerWatchdogBuilder() {
      
      onChanged();
      return getWorkerWatchdogFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Watchdog for the worker threads.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog worker_watchdog = 2;</code>
     */
    public io.envoyproxy.envoy.config.bootstrap.v3.WatchdogOrBuilder getWorkerWatchdogOrBuilder() {
      if (workerWatchdogBuilder_ != null) {
        return workerWatchdogBuilder_.getMessageOrBuilder();
      } else {
        return workerWatchdog_ == null ?
            io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.getDefaultInstance() : workerWatchdog_;
      }
    }
    /**
     * <pre>
     * Watchdog for the worker threads.
     * </pre>
     *
     * <code>.envoy.config.bootstrap.v3.Watchdog worker_watchdog = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.bootstrap.v3.Watchdog, io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.Builder, io.envoyproxy.envoy.config.bootstrap.v3.WatchdogOrBuilder> 
        getWorkerWatchdogFieldBuilder() {
      if (workerWatchdogBuilder_ == null) {
        workerWatchdogBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.bootstrap.v3.Watchdog, io.envoyproxy.envoy.config.bootstrap.v3.Watchdog.Builder, io.envoyproxy.envoy.config.bootstrap.v3.WatchdogOrBuilder>(
                getWorkerWatchdog(),
                getParentForChildren(),
                isClean());
        workerWatchdog_ = null;
      }
      return workerWatchdogBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.bootstrap.v3.Watchdogs)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.bootstrap.v3.Watchdogs)
  private static final io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs();
  }

  public static io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Watchdogs>
      PARSER = new com.google.protobuf.AbstractParser<Watchdogs>() {
    @java.lang.Override
    public Watchdogs parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Watchdogs(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Watchdogs> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Watchdogs> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.bootstrap.v3.Watchdogs getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
