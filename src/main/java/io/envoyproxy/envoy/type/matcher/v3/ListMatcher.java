// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/matcher/v3/value.proto

package io.envoyproxy.envoy.type.matcher.v3;

/**
 * <pre>
 * Specifies the way to match a list value.
 * </pre>
 *
 * Protobuf type {@code envoy.type.matcher.v3.ListMatcher}
 */
public final class ListMatcher extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.type.matcher.v3.ListMatcher)
    ListMatcherOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListMatcher.newBuilder() to construct.
  private ListMatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListMatcher() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListMatcher();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListMatcher(
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
            io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.Builder subBuilder = null;
            if (matchPatternCase_ == 1) {
              subBuilder = ((io.envoyproxy.envoy.type.matcher.v3.ValueMatcher) matchPattern_).toBuilder();
            }
            matchPattern_ =
                input.readMessage(io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.envoyproxy.envoy.type.matcher.v3.ValueMatcher) matchPattern_);
              matchPattern_ = subBuilder.buildPartial();
            }
            matchPatternCase_ = 1;
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
    return io.envoyproxy.envoy.type.matcher.v3.ValueProto.internal_static_envoy_type_matcher_v3_ListMatcher_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.type.matcher.v3.ValueProto.internal_static_envoy_type_matcher_v3_ListMatcher_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.type.matcher.v3.ListMatcher.class, io.envoyproxy.envoy.type.matcher.v3.ListMatcher.Builder.class);
  }

  private int matchPatternCase_ = 0;
  private java.lang.Object matchPattern_;
  public enum MatchPatternCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ONE_OF(1),
    MATCHPATTERN_NOT_SET(0);
    private final int value;
    private MatchPatternCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MatchPatternCase valueOf(int value) {
      return forNumber(value);
    }

    public static MatchPatternCase forNumber(int value) {
      switch (value) {
        case 1: return ONE_OF;
        case 0: return MATCHPATTERN_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public MatchPatternCase
  getMatchPatternCase() {
    return MatchPatternCase.forNumber(
        matchPatternCase_);
  }

  public static final int ONE_OF_FIELD_NUMBER = 1;
  /**
   * <pre>
   * If specified, at least one of the values in the list must match the value specified.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
   * @return Whether the oneOf field is set.
   */
  @java.lang.Override
  public boolean hasOneOf() {
    return matchPatternCase_ == 1;
  }
  /**
   * <pre>
   * If specified, at least one of the values in the list must match the value specified.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
   * @return The oneOf.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.matcher.v3.ValueMatcher getOneOf() {
    if (matchPatternCase_ == 1) {
       return (io.envoyproxy.envoy.type.matcher.v3.ValueMatcher) matchPattern_;
    }
    return io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.getDefaultInstance();
  }
  /**
   * <pre>
   * If specified, at least one of the values in the list must match the value specified.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.matcher.v3.ValueMatcherOrBuilder getOneOfOrBuilder() {
    if (matchPatternCase_ == 1) {
       return (io.envoyproxy.envoy.type.matcher.v3.ValueMatcher) matchPattern_;
    }
    return io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.getDefaultInstance();
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
    if (matchPatternCase_ == 1) {
      output.writeMessage(1, (io.envoyproxy.envoy.type.matcher.v3.ValueMatcher) matchPattern_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (matchPatternCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (io.envoyproxy.envoy.type.matcher.v3.ValueMatcher) matchPattern_);
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
    if (!(obj instanceof io.envoyproxy.envoy.type.matcher.v3.ListMatcher)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.type.matcher.v3.ListMatcher other = (io.envoyproxy.envoy.type.matcher.v3.ListMatcher) obj;

    if (!getMatchPatternCase().equals(other.getMatchPatternCase())) return false;
    switch (matchPatternCase_) {
      case 1:
        if (!getOneOf()
            .equals(other.getOneOf())) return false;
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
    switch (matchPatternCase_) {
      case 1:
        hash = (37 * hash) + ONE_OF_FIELD_NUMBER;
        hash = (53 * hash) + getOneOf().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.type.matcher.v3.ListMatcher parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.ListMatcher parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.ListMatcher parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.ListMatcher parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.ListMatcher parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.ListMatcher parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.ListMatcher parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.ListMatcher parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.ListMatcher parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.ListMatcher parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.ListMatcher parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.type.matcher.v3.ListMatcher parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.type.matcher.v3.ListMatcher prototype) {
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
   * Specifies the way to match a list value.
   * </pre>
   *
   * Protobuf type {@code envoy.type.matcher.v3.ListMatcher}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.type.matcher.v3.ListMatcher)
      io.envoyproxy.envoy.type.matcher.v3.ListMatcherOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.type.matcher.v3.ValueProto.internal_static_envoy_type_matcher_v3_ListMatcher_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.type.matcher.v3.ValueProto.internal_static_envoy_type_matcher_v3_ListMatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.type.matcher.v3.ListMatcher.class, io.envoyproxy.envoy.type.matcher.v3.ListMatcher.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.type.matcher.v3.ListMatcher.newBuilder()
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
      matchPatternCase_ = 0;
      matchPattern_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.type.matcher.v3.ValueProto.internal_static_envoy_type_matcher_v3_ListMatcher_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.v3.ListMatcher getDefaultInstanceForType() {
      return io.envoyproxy.envoy.type.matcher.v3.ListMatcher.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.v3.ListMatcher build() {
      io.envoyproxy.envoy.type.matcher.v3.ListMatcher result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.v3.ListMatcher buildPartial() {
      io.envoyproxy.envoy.type.matcher.v3.ListMatcher result = new io.envoyproxy.envoy.type.matcher.v3.ListMatcher(this);
      if (matchPatternCase_ == 1) {
        if (oneOfBuilder_ == null) {
          result.matchPattern_ = matchPattern_;
        } else {
          result.matchPattern_ = oneOfBuilder_.build();
        }
      }
      result.matchPatternCase_ = matchPatternCase_;
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
      if (other instanceof io.envoyproxy.envoy.type.matcher.v3.ListMatcher) {
        return mergeFrom((io.envoyproxy.envoy.type.matcher.v3.ListMatcher)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.type.matcher.v3.ListMatcher other) {
      if (other == io.envoyproxy.envoy.type.matcher.v3.ListMatcher.getDefaultInstance()) return this;
      switch (other.getMatchPatternCase()) {
        case ONE_OF: {
          mergeOneOf(other.getOneOf());
          break;
        }
        case MATCHPATTERN_NOT_SET: {
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
      io.envoyproxy.envoy.type.matcher.v3.ListMatcher parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.type.matcher.v3.ListMatcher) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int matchPatternCase_ = 0;
    private java.lang.Object matchPattern_;
    public MatchPatternCase
        getMatchPatternCase() {
      return MatchPatternCase.forNumber(
          matchPatternCase_);
    }

    public Builder clearMatchPattern() {
      matchPatternCase_ = 0;
      matchPattern_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.matcher.v3.ValueMatcher, io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.Builder, io.envoyproxy.envoy.type.matcher.v3.ValueMatcherOrBuilder> oneOfBuilder_;
    /**
     * <pre>
     * If specified, at least one of the values in the list must match the value specified.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
     * @return Whether the oneOf field is set.
     */
    @java.lang.Override
    public boolean hasOneOf() {
      return matchPatternCase_ == 1;
    }
    /**
     * <pre>
     * If specified, at least one of the values in the list must match the value specified.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
     * @return The oneOf.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.v3.ValueMatcher getOneOf() {
      if (oneOfBuilder_ == null) {
        if (matchPatternCase_ == 1) {
          return (io.envoyproxy.envoy.type.matcher.v3.ValueMatcher) matchPattern_;
        }
        return io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.getDefaultInstance();
      } else {
        if (matchPatternCase_ == 1) {
          return oneOfBuilder_.getMessage();
        }
        return io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If specified, at least one of the values in the list must match the value specified.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
     */
    public Builder setOneOf(io.envoyproxy.envoy.type.matcher.v3.ValueMatcher value) {
      if (oneOfBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        matchPattern_ = value;
        onChanged();
      } else {
        oneOfBuilder_.setMessage(value);
      }
      matchPatternCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * If specified, at least one of the values in the list must match the value specified.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
     */
    public Builder setOneOf(
        io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.Builder builderForValue) {
      if (oneOfBuilder_ == null) {
        matchPattern_ = builderForValue.build();
        onChanged();
      } else {
        oneOfBuilder_.setMessage(builderForValue.build());
      }
      matchPatternCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * If specified, at least one of the values in the list must match the value specified.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
     */
    public Builder mergeOneOf(io.envoyproxy.envoy.type.matcher.v3.ValueMatcher value) {
      if (oneOfBuilder_ == null) {
        if (matchPatternCase_ == 1 &&
            matchPattern_ != io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.getDefaultInstance()) {
          matchPattern_ = io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.newBuilder((io.envoyproxy.envoy.type.matcher.v3.ValueMatcher) matchPattern_)
              .mergeFrom(value).buildPartial();
        } else {
          matchPattern_ = value;
        }
        onChanged();
      } else {
        if (matchPatternCase_ == 1) {
          oneOfBuilder_.mergeFrom(value);
        }
        oneOfBuilder_.setMessage(value);
      }
      matchPatternCase_ = 1;
      return this;
    }
    /**
     * <pre>
     * If specified, at least one of the values in the list must match the value specified.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
     */
    public Builder clearOneOf() {
      if (oneOfBuilder_ == null) {
        if (matchPatternCase_ == 1) {
          matchPatternCase_ = 0;
          matchPattern_ = null;
          onChanged();
        }
      } else {
        if (matchPatternCase_ == 1) {
          matchPatternCase_ = 0;
          matchPattern_ = null;
        }
        oneOfBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * If specified, at least one of the values in the list must match the value specified.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
     */
    public io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.Builder getOneOfBuilder() {
      return getOneOfFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * If specified, at least one of the values in the list must match the value specified.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
     */
    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.v3.ValueMatcherOrBuilder getOneOfOrBuilder() {
      if ((matchPatternCase_ == 1) && (oneOfBuilder_ != null)) {
        return oneOfBuilder_.getMessageOrBuilder();
      } else {
        if (matchPatternCase_ == 1) {
          return (io.envoyproxy.envoy.type.matcher.v3.ValueMatcher) matchPattern_;
        }
        return io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * If specified, at least one of the values in the list must match the value specified.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.matcher.v3.ValueMatcher, io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.Builder, io.envoyproxy.envoy.type.matcher.v3.ValueMatcherOrBuilder> 
        getOneOfFieldBuilder() {
      if (oneOfBuilder_ == null) {
        if (!(matchPatternCase_ == 1)) {
          matchPattern_ = io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.getDefaultInstance();
        }
        oneOfBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.type.matcher.v3.ValueMatcher, io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.Builder, io.envoyproxy.envoy.type.matcher.v3.ValueMatcherOrBuilder>(
                (io.envoyproxy.envoy.type.matcher.v3.ValueMatcher) matchPattern_,
                getParentForChildren(),
                isClean());
        matchPattern_ = null;
      }
      matchPatternCase_ = 1;
      onChanged();;
      return oneOfBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.type.matcher.v3.ListMatcher)
  }

  // @@protoc_insertion_point(class_scope:envoy.type.matcher.v3.ListMatcher)
  private static final io.envoyproxy.envoy.type.matcher.v3.ListMatcher DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.type.matcher.v3.ListMatcher();
  }

  public static io.envoyproxy.envoy.type.matcher.v3.ListMatcher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListMatcher>
      PARSER = new com.google.protobuf.AbstractParser<ListMatcher>() {
    @java.lang.Override
    public ListMatcher parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListMatcher(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListMatcher> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListMatcher> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.type.matcher.v3.ListMatcher getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

