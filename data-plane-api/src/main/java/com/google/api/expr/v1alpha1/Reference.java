// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1alpha1/checked.proto

package com.google.api.expr.v1alpha1;

/**
 * <pre>
 * Describes a resolved reference to a declaration.
 * </pre>
 *
 * Protobuf type {@code google.api.expr.v1alpha1.Reference}
 */
public final class Reference extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.api.expr.v1alpha1.Reference)
    ReferenceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Reference.newBuilder() to construct.
  private Reference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Reference() {
    name_ = "";
    overloadId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Reference();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Reference(
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

            name_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              overloadId_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            overloadId_.add(s);
            break;
          }
          case 34: {
            com.google.api.expr.v1alpha1.Constant.Builder subBuilder = null;
            if (value_ != null) {
              subBuilder = value_.toBuilder();
            }
            value_ = input.readMessage(com.google.api.expr.v1alpha1.Constant.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(value_);
              value_ = subBuilder.buildPartial();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        overloadId_ = overloadId_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.api.expr.v1alpha1.DeclProto.internal_static_google_api_expr_v1alpha1_Reference_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.expr.v1alpha1.DeclProto.internal_static_google_api_expr_v1alpha1_Reference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.expr.v1alpha1.Reference.class, com.google.api.expr.v1alpha1.Reference.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The fully qualified name of the declaration.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The fully qualified name of the declaration.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OVERLOAD_ID_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList overloadId_;
  /**
   * <pre>
   * For references to functions, this is a list of `Overload.overload_id`
   * values which match according to typing rules.
   * If the list has more than one element, overload resolution among the
   * presented candidates must happen at runtime because of dynamic types. The
   * type checker attempts to narrow down this list as much as possible.
   * Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
   * </pre>
   *
   * <code>repeated string overload_id = 3;</code>
   * @return A list containing the overloadId.
   */
  public com.google.protobuf.ProtocolStringList
      getOverloadIdList() {
    return overloadId_;
  }
  /**
   * <pre>
   * For references to functions, this is a list of `Overload.overload_id`
   * values which match according to typing rules.
   * If the list has more than one element, overload resolution among the
   * presented candidates must happen at runtime because of dynamic types. The
   * type checker attempts to narrow down this list as much as possible.
   * Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
   * </pre>
   *
   * <code>repeated string overload_id = 3;</code>
   * @return The count of overloadId.
   */
  public int getOverloadIdCount() {
    return overloadId_.size();
  }
  /**
   * <pre>
   * For references to functions, this is a list of `Overload.overload_id`
   * values which match according to typing rules.
   * If the list has more than one element, overload resolution among the
   * presented candidates must happen at runtime because of dynamic types. The
   * type checker attempts to narrow down this list as much as possible.
   * Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
   * </pre>
   *
   * <code>repeated string overload_id = 3;</code>
   * @param index The index of the element to return.
   * @return The overloadId at the given index.
   */
  public java.lang.String getOverloadId(int index) {
    return overloadId_.get(index);
  }
  /**
   * <pre>
   * For references to functions, this is a list of `Overload.overload_id`
   * values which match according to typing rules.
   * If the list has more than one element, overload resolution among the
   * presented candidates must happen at runtime because of dynamic types. The
   * type checker attempts to narrow down this list as much as possible.
   * Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
   * </pre>
   *
   * <code>repeated string overload_id = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the overloadId at the given index.
   */
  public com.google.protobuf.ByteString
      getOverloadIdBytes(int index) {
    return overloadId_.getByteString(index);
  }

  public static final int VALUE_FIELD_NUMBER = 4;
  private com.google.api.expr.v1alpha1.Constant value_;
  /**
   * <pre>
   * For references to constants, this may contain the value of the
   * constant if known at compile time.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Constant value = 4;</code>
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return value_ != null;
  }
  /**
   * <pre>
   * For references to constants, this may contain the value of the
   * constant if known at compile time.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Constant value = 4;</code>
   * @return The value.
   */
  @java.lang.Override
  public com.google.api.expr.v1alpha1.Constant getValue() {
    return value_ == null ? com.google.api.expr.v1alpha1.Constant.getDefaultInstance() : value_;
  }
  /**
   * <pre>
   * For references to constants, this may contain the value of the
   * constant if known at compile time.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Constant value = 4;</code>
   */
  @java.lang.Override
  public com.google.api.expr.v1alpha1.ConstantOrBuilder getValueOrBuilder() {
    return getValue();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    for (int i = 0; i < overloadId_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, overloadId_.getRaw(i));
    }
    if (value_ != null) {
      output.writeMessage(4, getValue());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < overloadId_.size(); i++) {
        dataSize += computeStringSizeNoTag(overloadId_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getOverloadIdList().size();
    }
    if (value_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getValue());
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
    if (!(obj instanceof com.google.api.expr.v1alpha1.Reference)) {
      return super.equals(obj);
    }
    com.google.api.expr.v1alpha1.Reference other = (com.google.api.expr.v1alpha1.Reference) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getOverloadIdList()
        .equals(other.getOverloadIdList())) return false;
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue()
          .equals(other.getValue())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getOverloadIdCount() > 0) {
      hash = (37 * hash) + OVERLOAD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getOverloadIdList().hashCode();
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.expr.v1alpha1.Reference parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1alpha1.Reference parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.Reference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1alpha1.Reference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.Reference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.api.expr.v1alpha1.Reference parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.Reference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1alpha1.Reference parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.Reference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1alpha1.Reference parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.api.expr.v1alpha1.Reference parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.api.expr.v1alpha1.Reference parseFrom(
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
  public static Builder newBuilder(com.google.api.expr.v1alpha1.Reference prototype) {
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
   * Describes a resolved reference to a declaration.
   * </pre>
   *
   * Protobuf type {@code google.api.expr.v1alpha1.Reference}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.api.expr.v1alpha1.Reference)
      com.google.api.expr.v1alpha1.ReferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.api.expr.v1alpha1.DeclProto.internal_static_google_api_expr_v1alpha1_Reference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.expr.v1alpha1.DeclProto.internal_static_google_api_expr_v1alpha1_Reference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.expr.v1alpha1.Reference.class, com.google.api.expr.v1alpha1.Reference.Builder.class);
    }

    // Construct using com.google.api.expr.v1alpha1.Reference.newBuilder()
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
      name_ = "";

      overloadId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      if (valueBuilder_ == null) {
        value_ = null;
      } else {
        value_ = null;
        valueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.api.expr.v1alpha1.DeclProto.internal_static_google_api_expr_v1alpha1_Reference_descriptor;
    }

    @java.lang.Override
    public com.google.api.expr.v1alpha1.Reference getDefaultInstanceForType() {
      return com.google.api.expr.v1alpha1.Reference.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.expr.v1alpha1.Reference build() {
      com.google.api.expr.v1alpha1.Reference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.expr.v1alpha1.Reference buildPartial() {
      com.google.api.expr.v1alpha1.Reference result = new com.google.api.expr.v1alpha1.Reference(this);
      int from_bitField0_ = bitField0_;
      result.name_ = name_;
      if (((bitField0_ & 0x00000001) != 0)) {
        overloadId_ = overloadId_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.overloadId_ = overloadId_;
      if (valueBuilder_ == null) {
        result.value_ = value_;
      } else {
        result.value_ = valueBuilder_.build();
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
      if (other instanceof com.google.api.expr.v1alpha1.Reference) {
        return mergeFrom((com.google.api.expr.v1alpha1.Reference)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.expr.v1alpha1.Reference other) {
      if (other == com.google.api.expr.v1alpha1.Reference.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.overloadId_.isEmpty()) {
        if (overloadId_.isEmpty()) {
          overloadId_ = other.overloadId_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureOverloadIdIsMutable();
          overloadId_.addAll(other.overloadId_);
        }
        onChanged();
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
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
      com.google.api.expr.v1alpha1.Reference parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.api.expr.v1alpha1.Reference) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The fully qualified name of the declaration.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The fully qualified name of the declaration.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The fully qualified name of the declaration.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fully qualified name of the declaration.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The fully qualified name of the declaration.
     * </pre>
     *
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList overloadId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureOverloadIdIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        overloadId_ = new com.google.protobuf.LazyStringArrayList(overloadId_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * For references to functions, this is a list of `Overload.overload_id`
     * values which match according to typing rules.
     * If the list has more than one element, overload resolution among the
     * presented candidates must happen at runtime because of dynamic types. The
     * type checker attempts to narrow down this list as much as possible.
     * Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
     * </pre>
     *
     * <code>repeated string overload_id = 3;</code>
     * @return A list containing the overloadId.
     */
    public com.google.protobuf.ProtocolStringList
        getOverloadIdList() {
      return overloadId_.getUnmodifiableView();
    }
    /**
     * <pre>
     * For references to functions, this is a list of `Overload.overload_id`
     * values which match according to typing rules.
     * If the list has more than one element, overload resolution among the
     * presented candidates must happen at runtime because of dynamic types. The
     * type checker attempts to narrow down this list as much as possible.
     * Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
     * </pre>
     *
     * <code>repeated string overload_id = 3;</code>
     * @return The count of overloadId.
     */
    public int getOverloadIdCount() {
      return overloadId_.size();
    }
    /**
     * <pre>
     * For references to functions, this is a list of `Overload.overload_id`
     * values which match according to typing rules.
     * If the list has more than one element, overload resolution among the
     * presented candidates must happen at runtime because of dynamic types. The
     * type checker attempts to narrow down this list as much as possible.
     * Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
     * </pre>
     *
     * <code>repeated string overload_id = 3;</code>
     * @param index The index of the element to return.
     * @return The overloadId at the given index.
     */
    public java.lang.String getOverloadId(int index) {
      return overloadId_.get(index);
    }
    /**
     * <pre>
     * For references to functions, this is a list of `Overload.overload_id`
     * values which match according to typing rules.
     * If the list has more than one element, overload resolution among the
     * presented candidates must happen at runtime because of dynamic types. The
     * type checker attempts to narrow down this list as much as possible.
     * Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
     * </pre>
     *
     * <code>repeated string overload_id = 3;</code>
     * @param index The index of the value to return.
     * @return The bytes of the overloadId at the given index.
     */
    public com.google.protobuf.ByteString
        getOverloadIdBytes(int index) {
      return overloadId_.getByteString(index);
    }
    /**
     * <pre>
     * For references to functions, this is a list of `Overload.overload_id`
     * values which match according to typing rules.
     * If the list has more than one element, overload resolution among the
     * presented candidates must happen at runtime because of dynamic types. The
     * type checker attempts to narrow down this list as much as possible.
     * Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
     * </pre>
     *
     * <code>repeated string overload_id = 3;</code>
     * @param index The index to set the value at.
     * @param value The overloadId to set.
     * @return This builder for chaining.
     */
    public Builder setOverloadId(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureOverloadIdIsMutable();
      overloadId_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For references to functions, this is a list of `Overload.overload_id`
     * values which match according to typing rules.
     * If the list has more than one element, overload resolution among the
     * presented candidates must happen at runtime because of dynamic types. The
     * type checker attempts to narrow down this list as much as possible.
     * Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
     * </pre>
     *
     * <code>repeated string overload_id = 3;</code>
     * @param value The overloadId to add.
     * @return This builder for chaining.
     */
    public Builder addOverloadId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureOverloadIdIsMutable();
      overloadId_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For references to functions, this is a list of `Overload.overload_id`
     * values which match according to typing rules.
     * If the list has more than one element, overload resolution among the
     * presented candidates must happen at runtime because of dynamic types. The
     * type checker attempts to narrow down this list as much as possible.
     * Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
     * </pre>
     *
     * <code>repeated string overload_id = 3;</code>
     * @param values The overloadId to add.
     * @return This builder for chaining.
     */
    public Builder addAllOverloadId(
        java.lang.Iterable<java.lang.String> values) {
      ensureOverloadIdIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, overloadId_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For references to functions, this is a list of `Overload.overload_id`
     * values which match according to typing rules.
     * If the list has more than one element, overload resolution among the
     * presented candidates must happen at runtime because of dynamic types. The
     * type checker attempts to narrow down this list as much as possible.
     * Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
     * </pre>
     *
     * <code>repeated string overload_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearOverloadId() {
      overloadId_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * For references to functions, this is a list of `Overload.overload_id`
     * values which match according to typing rules.
     * If the list has more than one element, overload resolution among the
     * presented candidates must happen at runtime because of dynamic types. The
     * type checker attempts to narrow down this list as much as possible.
     * Empty if this is not a reference to a [Decl.FunctionDecl][google.api.expr.v1alpha1.Decl.FunctionDecl].
     * </pre>
     *
     * <code>repeated string overload_id = 3;</code>
     * @param value The bytes of the overloadId to add.
     * @return This builder for chaining.
     */
    public Builder addOverloadIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureOverloadIdIsMutable();
      overloadId_.add(value);
      onChanged();
      return this;
    }

    private com.google.api.expr.v1alpha1.Constant value_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.expr.v1alpha1.Constant, com.google.api.expr.v1alpha1.Constant.Builder, com.google.api.expr.v1alpha1.ConstantOrBuilder> valueBuilder_;
    /**
     * <pre>
     * For references to constants, this may contain the value of the
     * constant if known at compile time.
     * </pre>
     *
     * <code>.google.api.expr.v1alpha1.Constant value = 4;</code>
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return valueBuilder_ != null || value_ != null;
    }
    /**
     * <pre>
     * For references to constants, this may contain the value of the
     * constant if known at compile time.
     * </pre>
     *
     * <code>.google.api.expr.v1alpha1.Constant value = 4;</code>
     * @return The value.
     */
    public com.google.api.expr.v1alpha1.Constant getValue() {
      if (valueBuilder_ == null) {
        return value_ == null ? com.google.api.expr.v1alpha1.Constant.getDefaultInstance() : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * For references to constants, this may contain the value of the
     * constant if known at compile time.
     * </pre>
     *
     * <code>.google.api.expr.v1alpha1.Constant value = 4;</code>
     */
    public Builder setValue(com.google.api.expr.v1alpha1.Constant value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
        onChanged();
      } else {
        valueBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * For references to constants, this may contain the value of the
     * constant if known at compile time.
     * </pre>
     *
     * <code>.google.api.expr.v1alpha1.Constant value = 4;</code>
     */
    public Builder setValue(
        com.google.api.expr.v1alpha1.Constant.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
        onChanged();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * For references to constants, this may contain the value of the
     * constant if known at compile time.
     * </pre>
     *
     * <code>.google.api.expr.v1alpha1.Constant value = 4;</code>
     */
    public Builder mergeValue(com.google.api.expr.v1alpha1.Constant value) {
      if (valueBuilder_ == null) {
        if (value_ != null) {
          value_ =
            com.google.api.expr.v1alpha1.Constant.newBuilder(value_).mergeFrom(value).buildPartial();
        } else {
          value_ = value;
        }
        onChanged();
      } else {
        valueBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * For references to constants, this may contain the value of the
     * constant if known at compile time.
     * </pre>
     *
     * <code>.google.api.expr.v1alpha1.Constant value = 4;</code>
     */
    public Builder clearValue() {
      if (valueBuilder_ == null) {
        value_ = null;
        onChanged();
      } else {
        value_ = null;
        valueBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * For references to constants, this may contain the value of the
     * constant if known at compile time.
     * </pre>
     *
     * <code>.google.api.expr.v1alpha1.Constant value = 4;</code>
     */
    public com.google.api.expr.v1alpha1.Constant.Builder getValueBuilder() {
      
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * For references to constants, this may contain the value of the
     * constant if known at compile time.
     * </pre>
     *
     * <code>.google.api.expr.v1alpha1.Constant value = 4;</code>
     */
    public com.google.api.expr.v1alpha1.ConstantOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null ?
            com.google.api.expr.v1alpha1.Constant.getDefaultInstance() : value_;
      }
    }
    /**
     * <pre>
     * For references to constants, this may contain the value of the
     * constant if known at compile time.
     * </pre>
     *
     * <code>.google.api.expr.v1alpha1.Constant value = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.api.expr.v1alpha1.Constant, com.google.api.expr.v1alpha1.Constant.Builder, com.google.api.expr.v1alpha1.ConstantOrBuilder> 
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.expr.v1alpha1.Constant, com.google.api.expr.v1alpha1.Constant.Builder, com.google.api.expr.v1alpha1.ConstantOrBuilder>(
                getValue(),
                getParentForChildren(),
                isClean());
        value_ = null;
      }
      return valueBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.api.expr.v1alpha1.Reference)
  }

  // @@protoc_insertion_point(class_scope:google.api.expr.v1alpha1.Reference)
  private static final com.google.api.expr.v1alpha1.Reference DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.api.expr.v1alpha1.Reference();
  }

  public static com.google.api.expr.v1alpha1.Reference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Reference>
      PARSER = new com.google.protobuf.AbstractParser<Reference>() {
    @java.lang.Override
    public Reference parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Reference(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Reference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Reference> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.expr.v1alpha1.Reference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
