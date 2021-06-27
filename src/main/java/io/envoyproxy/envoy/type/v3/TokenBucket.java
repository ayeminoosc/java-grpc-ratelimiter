// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/v3/token_bucket.proto

package io.envoyproxy.envoy.type.v3;

/**
 * <pre>
 * Configures a token bucket, typically used for rate limiting.
 * </pre>
 *
 * Protobuf type {@code envoy.type.v3.TokenBucket}
 */
public final class TokenBucket extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.type.v3.TokenBucket)
    TokenBucketOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TokenBucket.newBuilder() to construct.
  private TokenBucket(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TokenBucket() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TokenBucket();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TokenBucket(
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

            maxTokens_ = input.readUInt32();
            break;
          }
          case 18: {
            com.google.protobuf.UInt32Value.Builder subBuilder = null;
            if (tokensPerFill_ != null) {
              subBuilder = tokensPerFill_.toBuilder();
            }
            tokensPerFill_ = input.readMessage(com.google.protobuf.UInt32Value.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(tokensPerFill_);
              tokensPerFill_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (fillInterval_ != null) {
              subBuilder = fillInterval_.toBuilder();
            }
            fillInterval_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(fillInterval_);
              fillInterval_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.type.v3.TokenBucketProto.internal_static_envoy_type_v3_TokenBucket_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.type.v3.TokenBucketProto.internal_static_envoy_type_v3_TokenBucket_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.type.v3.TokenBucket.class, io.envoyproxy.envoy.type.v3.TokenBucket.Builder.class);
  }

  public static final int MAX_TOKENS_FIELD_NUMBER = 1;
  private int maxTokens_;
  /**
   * <pre>
   * The maximum tokens that the bucket can hold. This is also the number of tokens that the bucket
   * initially contains.
   * </pre>
   *
   * <code>uint32 max_tokens = 1 [(.validate.rules) = { ... }</code>
   * @return The maxTokens.
   */
  @java.lang.Override
  public int getMaxTokens() {
    return maxTokens_;
  }

  public static final int TOKENS_PER_FILL_FIELD_NUMBER = 2;
  private com.google.protobuf.UInt32Value tokensPerFill_;
  /**
   * <pre>
   * The number of tokens added to the bucket during each fill interval. If not specified, defaults
   * to a single token.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value tokens_per_fill = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the tokensPerFill field is set.
   */
  @java.lang.Override
  public boolean hasTokensPerFill() {
    return tokensPerFill_ != null;
  }
  /**
   * <pre>
   * The number of tokens added to the bucket during each fill interval. If not specified, defaults
   * to a single token.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value tokens_per_fill = 2 [(.validate.rules) = { ... }</code>
   * @return The tokensPerFill.
   */
  @java.lang.Override
  public com.google.protobuf.UInt32Value getTokensPerFill() {
    return tokensPerFill_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : tokensPerFill_;
  }
  /**
   * <pre>
   * The number of tokens added to the bucket during each fill interval. If not specified, defaults
   * to a single token.
   * </pre>
   *
   * <code>.google.protobuf.UInt32Value tokens_per_fill = 2 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.UInt32ValueOrBuilder getTokensPerFillOrBuilder() {
    return getTokensPerFill();
  }

  public static final int FILL_INTERVAL_FIELD_NUMBER = 3;
  private com.google.protobuf.Duration fillInterval_;
  /**
   * <pre>
   * The fill interval that tokens are added to the bucket. During each fill interval
   * `tokens_per_fill` are added to the bucket. The bucket will never contain more than
   * `max_tokens` tokens.
   * </pre>
   *
   * <code>.google.protobuf.Duration fill_interval = 3 [(.validate.rules) = { ... }</code>
   * @return Whether the fillInterval field is set.
   */
  @java.lang.Override
  public boolean hasFillInterval() {
    return fillInterval_ != null;
  }
  /**
   * <pre>
   * The fill interval that tokens are added to the bucket. During each fill interval
   * `tokens_per_fill` are added to the bucket. The bucket will never contain more than
   * `max_tokens` tokens.
   * </pre>
   *
   * <code>.google.protobuf.Duration fill_interval = 3 [(.validate.rules) = { ... }</code>
   * @return The fillInterval.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getFillInterval() {
    return fillInterval_ == null ? com.google.protobuf.Duration.getDefaultInstance() : fillInterval_;
  }
  /**
   * <pre>
   * The fill interval that tokens are added to the bucket. During each fill interval
   * `tokens_per_fill` are added to the bucket. The bucket will never contain more than
   * `max_tokens` tokens.
   * </pre>
   *
   * <code>.google.protobuf.Duration fill_interval = 3 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getFillIntervalOrBuilder() {
    return getFillInterval();
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
    if (maxTokens_ != 0) {
      output.writeUInt32(1, maxTokens_);
    }
    if (tokensPerFill_ != null) {
      output.writeMessage(2, getTokensPerFill());
    }
    if (fillInterval_ != null) {
      output.writeMessage(3, getFillInterval());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (maxTokens_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, maxTokens_);
    }
    if (tokensPerFill_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTokensPerFill());
    }
    if (fillInterval_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getFillInterval());
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
    if (!(obj instanceof io.envoyproxy.envoy.type.v3.TokenBucket)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.type.v3.TokenBucket other = (io.envoyproxy.envoy.type.v3.TokenBucket) obj;

    if (getMaxTokens()
        != other.getMaxTokens()) return false;
    if (hasTokensPerFill() != other.hasTokensPerFill()) return false;
    if (hasTokensPerFill()) {
      if (!getTokensPerFill()
          .equals(other.getTokensPerFill())) return false;
    }
    if (hasFillInterval() != other.hasFillInterval()) return false;
    if (hasFillInterval()) {
      if (!getFillInterval()
          .equals(other.getFillInterval())) return false;
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
    hash = (37 * hash) + MAX_TOKENS_FIELD_NUMBER;
    hash = (53 * hash) + getMaxTokens();
    if (hasTokensPerFill()) {
      hash = (37 * hash) + TOKENS_PER_FILL_FIELD_NUMBER;
      hash = (53 * hash) + getTokensPerFill().hashCode();
    }
    if (hasFillInterval()) {
      hash = (37 * hash) + FILL_INTERVAL_FIELD_NUMBER;
      hash = (53 * hash) + getFillInterval().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.type.v3.TokenBucket parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.v3.TokenBucket parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.TokenBucket parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.v3.TokenBucket parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.TokenBucket parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.v3.TokenBucket parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.TokenBucket parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.v3.TokenBucket parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.TokenBucket parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.v3.TokenBucket parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.v3.TokenBucket parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.v3.TokenBucket parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.type.v3.TokenBucket prototype) {
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
   * Configures a token bucket, typically used for rate limiting.
   * </pre>
   *
   * Protobuf type {@code envoy.type.v3.TokenBucket}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.type.v3.TokenBucket)
      io.envoyproxy.envoy.type.v3.TokenBucketOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.type.v3.TokenBucketProto.internal_static_envoy_type_v3_TokenBucket_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.type.v3.TokenBucketProto.internal_static_envoy_type_v3_TokenBucket_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.type.v3.TokenBucket.class, io.envoyproxy.envoy.type.v3.TokenBucket.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.type.v3.TokenBucket.newBuilder()
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
      maxTokens_ = 0;

      if (tokensPerFillBuilder_ == null) {
        tokensPerFill_ = null;
      } else {
        tokensPerFill_ = null;
        tokensPerFillBuilder_ = null;
      }
      if (fillIntervalBuilder_ == null) {
        fillInterval_ = null;
      } else {
        fillInterval_ = null;
        fillIntervalBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.type.v3.TokenBucketProto.internal_static_envoy_type_v3_TokenBucket_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.v3.TokenBucket getDefaultInstanceForType() {
      return io.envoyproxy.envoy.type.v3.TokenBucket.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.v3.TokenBucket build() {
      io.envoyproxy.envoy.type.v3.TokenBucket result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.v3.TokenBucket buildPartial() {
      io.envoyproxy.envoy.type.v3.TokenBucket result = new io.envoyproxy.envoy.type.v3.TokenBucket(this);
      result.maxTokens_ = maxTokens_;
      if (tokensPerFillBuilder_ == null) {
        result.tokensPerFill_ = tokensPerFill_;
      } else {
        result.tokensPerFill_ = tokensPerFillBuilder_.build();
      }
      if (fillIntervalBuilder_ == null) {
        result.fillInterval_ = fillInterval_;
      } else {
        result.fillInterval_ = fillIntervalBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.type.v3.TokenBucket) {
        return mergeFrom((io.envoyproxy.envoy.type.v3.TokenBucket)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.type.v3.TokenBucket other) {
      if (other == io.envoyproxy.envoy.type.v3.TokenBucket.getDefaultInstance()) return this;
      if (other.getMaxTokens() != 0) {
        setMaxTokens(other.getMaxTokens());
      }
      if (other.hasTokensPerFill()) {
        mergeTokensPerFill(other.getTokensPerFill());
      }
      if (other.hasFillInterval()) {
        mergeFillInterval(other.getFillInterval());
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
      io.envoyproxy.envoy.type.v3.TokenBucket parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.type.v3.TokenBucket) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int maxTokens_ ;
    /**
     * <pre>
     * The maximum tokens that the bucket can hold. This is also the number of tokens that the bucket
     * initially contains.
     * </pre>
     *
     * <code>uint32 max_tokens = 1 [(.validate.rules) = { ... }</code>
     * @return The maxTokens.
     */
    @java.lang.Override
    public int getMaxTokens() {
      return maxTokens_;
    }
    /**
     * <pre>
     * The maximum tokens that the bucket can hold. This is also the number of tokens that the bucket
     * initially contains.
     * </pre>
     *
     * <code>uint32 max_tokens = 1 [(.validate.rules) = { ... }</code>
     * @param value The maxTokens to set.
     * @return This builder for chaining.
     */
    public Builder setMaxTokens(int value) {
      
      maxTokens_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The maximum tokens that the bucket can hold. This is also the number of tokens that the bucket
     * initially contains.
     * </pre>
     *
     * <code>uint32 max_tokens = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxTokens() {
      
      maxTokens_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.UInt32Value tokensPerFill_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> tokensPerFillBuilder_;
    /**
     * <pre>
     * The number of tokens added to the bucket during each fill interval. If not specified, defaults
     * to a single token.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value tokens_per_fill = 2 [(.validate.rules) = { ... }</code>
     * @return Whether the tokensPerFill field is set.
     */
    public boolean hasTokensPerFill() {
      return tokensPerFillBuilder_ != null || tokensPerFill_ != null;
    }
    /**
     * <pre>
     * The number of tokens added to the bucket during each fill interval. If not specified, defaults
     * to a single token.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value tokens_per_fill = 2 [(.validate.rules) = { ... }</code>
     * @return The tokensPerFill.
     */
    public com.google.protobuf.UInt32Value getTokensPerFill() {
      if (tokensPerFillBuilder_ == null) {
        return tokensPerFill_ == null ? com.google.protobuf.UInt32Value.getDefaultInstance() : tokensPerFill_;
      } else {
        return tokensPerFillBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The number of tokens added to the bucket during each fill interval. If not specified, defaults
     * to a single token.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value tokens_per_fill = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setTokensPerFill(com.google.protobuf.UInt32Value value) {
      if (tokensPerFillBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tokensPerFill_ = value;
        onChanged();
      } else {
        tokensPerFillBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The number of tokens added to the bucket during each fill interval. If not specified, defaults
     * to a single token.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value tokens_per_fill = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setTokensPerFill(
        com.google.protobuf.UInt32Value.Builder builderForValue) {
      if (tokensPerFillBuilder_ == null) {
        tokensPerFill_ = builderForValue.build();
        onChanged();
      } else {
        tokensPerFillBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The number of tokens added to the bucket during each fill interval. If not specified, defaults
     * to a single token.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value tokens_per_fill = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeTokensPerFill(com.google.protobuf.UInt32Value value) {
      if (tokensPerFillBuilder_ == null) {
        if (tokensPerFill_ != null) {
          tokensPerFill_ =
            com.google.protobuf.UInt32Value.newBuilder(tokensPerFill_).mergeFrom(value).buildPartial();
        } else {
          tokensPerFill_ = value;
        }
        onChanged();
      } else {
        tokensPerFillBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The number of tokens added to the bucket during each fill interval. If not specified, defaults
     * to a single token.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value tokens_per_fill = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearTokensPerFill() {
      if (tokensPerFillBuilder_ == null) {
        tokensPerFill_ = null;
        onChanged();
      } else {
        tokensPerFill_ = null;
        tokensPerFillBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The number of tokens added to the bucket during each fill interval. If not specified, defaults
     * to a single token.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value tokens_per_fill = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.UInt32Value.Builder getTokensPerFillBuilder() {
      
      onChanged();
      return getTokensPerFillFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The number of tokens added to the bucket during each fill interval. If not specified, defaults
     * to a single token.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value tokens_per_fill = 2 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.UInt32ValueOrBuilder getTokensPerFillOrBuilder() {
      if (tokensPerFillBuilder_ != null) {
        return tokensPerFillBuilder_.getMessageOrBuilder();
      } else {
        return tokensPerFill_ == null ?
            com.google.protobuf.UInt32Value.getDefaultInstance() : tokensPerFill_;
      }
    }
    /**
     * <pre>
     * The number of tokens added to the bucket during each fill interval. If not specified, defaults
     * to a single token.
     * </pre>
     *
     * <code>.google.protobuf.UInt32Value tokens_per_fill = 2 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder> 
        getTokensPerFillFieldBuilder() {
      if (tokensPerFillBuilder_ == null) {
        tokensPerFillBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.UInt32Value, com.google.protobuf.UInt32Value.Builder, com.google.protobuf.UInt32ValueOrBuilder>(
                getTokensPerFill(),
                getParentForChildren(),
                isClean());
        tokensPerFill_ = null;
      }
      return tokensPerFillBuilder_;
    }

    private com.google.protobuf.Duration fillInterval_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> fillIntervalBuilder_;
    /**
     * <pre>
     * The fill interval that tokens are added to the bucket. During each fill interval
     * `tokens_per_fill` are added to the bucket. The bucket will never contain more than
     * `max_tokens` tokens.
     * </pre>
     *
     * <code>.google.protobuf.Duration fill_interval = 3 [(.validate.rules) = { ... }</code>
     * @return Whether the fillInterval field is set.
     */
    public boolean hasFillInterval() {
      return fillIntervalBuilder_ != null || fillInterval_ != null;
    }
    /**
     * <pre>
     * The fill interval that tokens are added to the bucket. During each fill interval
     * `tokens_per_fill` are added to the bucket. The bucket will never contain more than
     * `max_tokens` tokens.
     * </pre>
     *
     * <code>.google.protobuf.Duration fill_interval = 3 [(.validate.rules) = { ... }</code>
     * @return The fillInterval.
     */
    public com.google.protobuf.Duration getFillInterval() {
      if (fillIntervalBuilder_ == null) {
        return fillInterval_ == null ? com.google.protobuf.Duration.getDefaultInstance() : fillInterval_;
      } else {
        return fillIntervalBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The fill interval that tokens are added to the bucket. During each fill interval
     * `tokens_per_fill` are added to the bucket. The bucket will never contain more than
     * `max_tokens` tokens.
     * </pre>
     *
     * <code>.google.protobuf.Duration fill_interval = 3 [(.validate.rules) = { ... }</code>
     */
    public Builder setFillInterval(com.google.protobuf.Duration value) {
      if (fillIntervalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        fillInterval_ = value;
        onChanged();
      } else {
        fillIntervalBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The fill interval that tokens are added to the bucket. During each fill interval
     * `tokens_per_fill` are added to the bucket. The bucket will never contain more than
     * `max_tokens` tokens.
     * </pre>
     *
     * <code>.google.protobuf.Duration fill_interval = 3 [(.validate.rules) = { ... }</code>
     */
    public Builder setFillInterval(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (fillIntervalBuilder_ == null) {
        fillInterval_ = builderForValue.build();
        onChanged();
      } else {
        fillIntervalBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The fill interval that tokens are added to the bucket. During each fill interval
     * `tokens_per_fill` are added to the bucket. The bucket will never contain more than
     * `max_tokens` tokens.
     * </pre>
     *
     * <code>.google.protobuf.Duration fill_interval = 3 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeFillInterval(com.google.protobuf.Duration value) {
      if (fillIntervalBuilder_ == null) {
        if (fillInterval_ != null) {
          fillInterval_ =
            com.google.protobuf.Duration.newBuilder(fillInterval_).mergeFrom(value).buildPartial();
        } else {
          fillInterval_ = value;
        }
        onChanged();
      } else {
        fillIntervalBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The fill interval that tokens are added to the bucket. During each fill interval
     * `tokens_per_fill` are added to the bucket. The bucket will never contain more than
     * `max_tokens` tokens.
     * </pre>
     *
     * <code>.google.protobuf.Duration fill_interval = 3 [(.validate.rules) = { ... }</code>
     */
    public Builder clearFillInterval() {
      if (fillIntervalBuilder_ == null) {
        fillInterval_ = null;
        onChanged();
      } else {
        fillInterval_ = null;
        fillIntervalBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The fill interval that tokens are added to the bucket. During each fill interval
     * `tokens_per_fill` are added to the bucket. The bucket will never contain more than
     * `max_tokens` tokens.
     * </pre>
     *
     * <code>.google.protobuf.Duration fill_interval = 3 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.Duration.Builder getFillIntervalBuilder() {
      
      onChanged();
      return getFillIntervalFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The fill interval that tokens are added to the bucket. During each fill interval
     * `tokens_per_fill` are added to the bucket. The bucket will never contain more than
     * `max_tokens` tokens.
     * </pre>
     *
     * <code>.google.protobuf.Duration fill_interval = 3 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.DurationOrBuilder getFillIntervalOrBuilder() {
      if (fillIntervalBuilder_ != null) {
        return fillIntervalBuilder_.getMessageOrBuilder();
      } else {
        return fillInterval_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : fillInterval_;
      }
    }
    /**
     * <pre>
     * The fill interval that tokens are added to the bucket. During each fill interval
     * `tokens_per_fill` are added to the bucket. The bucket will never contain more than
     * `max_tokens` tokens.
     * </pre>
     *
     * <code>.google.protobuf.Duration fill_interval = 3 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getFillIntervalFieldBuilder() {
      if (fillIntervalBuilder_ == null) {
        fillIntervalBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getFillInterval(),
                getParentForChildren(),
                isClean());
        fillInterval_ = null;
      }
      return fillIntervalBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.type.v3.TokenBucket)
  }

  // @@protoc_insertion_point(class_scope:envoy.type.v3.TokenBucket)
  private static final io.envoyproxy.envoy.type.v3.TokenBucket DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.type.v3.TokenBucket();
  }

  public static io.envoyproxy.envoy.type.v3.TokenBucket getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TokenBucket>
      PARSER = new com.google.protobuf.AbstractParser<TokenBucket>() {
    @java.lang.Override
    public TokenBucket parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TokenBucket(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TokenBucket> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TokenBucket> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.type.v3.TokenBucket getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

