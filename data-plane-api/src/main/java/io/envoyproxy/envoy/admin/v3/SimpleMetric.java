// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v3/metrics.proto

package io.envoyproxy.envoy.admin.v3;

/**
 * <pre>
 * Proto representation of an Envoy Counter or Gauge value.
 * </pre>
 *
 * Protobuf type {@code envoy.admin.v3.SimpleMetric}
 */
public final class SimpleMetric extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.admin.v3.SimpleMetric)
    SimpleMetricOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SimpleMetric.newBuilder() to construct.
  private SimpleMetric(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SimpleMetric() {
    type_ = 0;
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SimpleMetric();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SimpleMetric(
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

            type_ = rawValue;
            break;
          }
          case 16: {

            value_ = input.readUInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
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
    return io.envoyproxy.envoy.admin.v3.MetricsProto.internal_static_envoy_admin_v3_SimpleMetric_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.admin.v3.MetricsProto.internal_static_envoy_admin_v3_SimpleMetric_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.admin.v3.SimpleMetric.class, io.envoyproxy.envoy.admin.v3.SimpleMetric.Builder.class);
  }

  /**
   * Protobuf enum {@code envoy.admin.v3.SimpleMetric.Type}
   */
  public enum Type
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>COUNTER = 0;</code>
     */
    COUNTER(0),
    /**
     * <code>GAUGE = 1;</code>
     */
    GAUGE(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>COUNTER = 0;</code>
     */
    public static final int COUNTER_VALUE = 0;
    /**
     * <code>GAUGE = 1;</code>
     */
    public static final int GAUGE_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0: return COUNTER;
        case 1: return GAUGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Type> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Type>() {
            public Type findValueByNumber(int number) {
              return Type.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return io.envoyproxy.envoy.admin.v3.SimpleMetric.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:envoy.admin.v3.SimpleMetric.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   * <pre>
   * Type of the metric represented.
   * </pre>
   *
   * <code>.envoy.admin.v3.SimpleMetric.Type type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override public int getTypeValue() {
    return type_;
  }
  /**
   * <pre>
   * Type of the metric represented.
   * </pre>
   *
   * <code>.envoy.admin.v3.SimpleMetric.Type type = 1;</code>
   * @return The type.
   */
  @java.lang.Override public io.envoyproxy.envoy.admin.v3.SimpleMetric.Type getType() {
    @SuppressWarnings("deprecation")
    io.envoyproxy.envoy.admin.v3.SimpleMetric.Type result = io.envoyproxy.envoy.admin.v3.SimpleMetric.Type.valueOf(type_);
    return result == null ? io.envoyproxy.envoy.admin.v3.SimpleMetric.Type.UNRECOGNIZED : result;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private long value_;
  /**
   * <pre>
   * Current metric value.
   * </pre>
   *
   * <code>uint64 value = 2;</code>
   * @return The value.
   */
  @java.lang.Override
  public long getValue() {
    return value_;
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Name of the metric.
   * </pre>
   *
   * <code>string name = 3;</code>
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
   * Name of the metric.
   * </pre>
   *
   * <code>string name = 3;</code>
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
    if (type_ != io.envoyproxy.envoy.admin.v3.SimpleMetric.Type.COUNTER.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (value_ != 0L) {
      output.writeUInt64(2, value_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_ != io.envoyproxy.envoy.admin.v3.SimpleMetric.Type.COUNTER.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, type_);
    }
    if (value_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, value_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
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
    if (!(obj instanceof io.envoyproxy.envoy.admin.v3.SimpleMetric)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.admin.v3.SimpleMetric other = (io.envoyproxy.envoy.admin.v3.SimpleMetric) obj;

    if (type_ != other.type_) return false;
    if (getValue()
        != other.getValue()) return false;
    if (!getName()
        .equals(other.getName())) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getValue());
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.admin.v3.SimpleMetric parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v3.SimpleMetric parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.SimpleMetric parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v3.SimpleMetric parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.SimpleMetric parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.admin.v3.SimpleMetric parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.SimpleMetric parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v3.SimpleMetric parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.SimpleMetric parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v3.SimpleMetric parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.admin.v3.SimpleMetric parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.admin.v3.SimpleMetric parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.admin.v3.SimpleMetric prototype) {
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
   * Proto representation of an Envoy Counter or Gauge value.
   * </pre>
   *
   * Protobuf type {@code envoy.admin.v3.SimpleMetric}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.admin.v3.SimpleMetric)
      io.envoyproxy.envoy.admin.v3.SimpleMetricOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.admin.v3.MetricsProto.internal_static_envoy_admin_v3_SimpleMetric_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.admin.v3.MetricsProto.internal_static_envoy_admin_v3_SimpleMetric_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.admin.v3.SimpleMetric.class, io.envoyproxy.envoy.admin.v3.SimpleMetric.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.admin.v3.SimpleMetric.newBuilder()
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
      type_ = 0;

      value_ = 0L;

      name_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.admin.v3.MetricsProto.internal_static_envoy_admin_v3_SimpleMetric_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v3.SimpleMetric getDefaultInstanceForType() {
      return io.envoyproxy.envoy.admin.v3.SimpleMetric.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v3.SimpleMetric build() {
      io.envoyproxy.envoy.admin.v3.SimpleMetric result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.admin.v3.SimpleMetric buildPartial() {
      io.envoyproxy.envoy.admin.v3.SimpleMetric result = new io.envoyproxy.envoy.admin.v3.SimpleMetric(this);
      result.type_ = type_;
      result.value_ = value_;
      result.name_ = name_;
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
      if (other instanceof io.envoyproxy.envoy.admin.v3.SimpleMetric) {
        return mergeFrom((io.envoyproxy.envoy.admin.v3.SimpleMetric)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.admin.v3.SimpleMetric other) {
      if (other == io.envoyproxy.envoy.admin.v3.SimpleMetric.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getValue() != 0L) {
        setValue(other.getValue());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
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
      io.envoyproxy.envoy.admin.v3.SimpleMetric parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.admin.v3.SimpleMetric) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     * <pre>
     * Type of the metric represented.
     * </pre>
     *
     * <code>.envoy.admin.v3.SimpleMetric.Type type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <pre>
     * Type of the metric represented.
     * </pre>
     *
     * <code>.envoy.admin.v3.SimpleMetric.Type type = 1;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the metric represented.
     * </pre>
     *
     * <code>.envoy.admin.v3.SimpleMetric.Type type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.admin.v3.SimpleMetric.Type getType() {
      @SuppressWarnings("deprecation")
      io.envoyproxy.envoy.admin.v3.SimpleMetric.Type result = io.envoyproxy.envoy.admin.v3.SimpleMetric.Type.valueOf(type_);
      return result == null ? io.envoyproxy.envoy.admin.v3.SimpleMetric.Type.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * Type of the metric represented.
     * </pre>
     *
     * <code>.envoy.admin.v3.SimpleMetric.Type type = 1;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(io.envoyproxy.envoy.admin.v3.SimpleMetric.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Type of the metric represented.
     * </pre>
     *
     * <code>.envoy.admin.v3.SimpleMetric.Type type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = 0;
      onChanged();
      return this;
    }

    private long value_ ;
    /**
     * <pre>
     * Current metric value.
     * </pre>
     *
     * <code>uint64 value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public long getValue() {
      return value_;
    }
    /**
     * <pre>
     * Current metric value.
     * </pre>
     *
     * <code>uint64 value = 2;</code>
     * @param value The value to set.
     * @return This builder for chaining.
     */
    public Builder setValue(long value) {
      
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Current metric value.
     * </pre>
     *
     * <code>uint64 value = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearValue() {
      
      value_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Name of the metric.
     * </pre>
     *
     * <code>string name = 3;</code>
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
     * Name of the metric.
     * </pre>
     *
     * <code>string name = 3;</code>
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
     * Name of the metric.
     * </pre>
     *
     * <code>string name = 3;</code>
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
     * Name of the metric.
     * </pre>
     *
     * <code>string name = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the metric.
     * </pre>
     *
     * <code>string name = 3;</code>
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


    // @@protoc_insertion_point(builder_scope:envoy.admin.v3.SimpleMetric)
  }

  // @@protoc_insertion_point(class_scope:envoy.admin.v3.SimpleMetric)
  private static final io.envoyproxy.envoy.admin.v3.SimpleMetric DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.admin.v3.SimpleMetric();
  }

  public static io.envoyproxy.envoy.admin.v3.SimpleMetric getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SimpleMetric>
      PARSER = new com.google.protobuf.AbstractParser<SimpleMetric>() {
    @java.lang.Override
    public SimpleMetric parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SimpleMetric(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SimpleMetric> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SimpleMetric> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.admin.v3.SimpleMetric getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
