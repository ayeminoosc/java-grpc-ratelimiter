// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/route/v3/route_components.proto

package io.envoyproxy.envoy.config.route.v3;

/**
 * <pre>
 * Query parameter matching treats the query string of a request's :path header
 * as an ampersand-separated list of keys and/or key=value elements.
 * [#next-free-field: 7]
 * </pre>
 *
 * Protobuf type {@code envoy.config.route.v3.QueryParameterMatcher}
 */
public final class QueryParameterMatcher extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.route.v3.QueryParameterMatcher)
    QueryParameterMatcherOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryParameterMatcher.newBuilder() to construct.
  private QueryParameterMatcher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryParameterMatcher() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryParameterMatcher();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private QueryParameterMatcher(
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

            name_ = s;
            break;
          }
          case 42: {
            io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder subBuilder = null;
            if (queryParameterMatchSpecifierCase_ == 5) {
              subBuilder = ((io.envoyproxy.envoy.type.matcher.v3.StringMatcher) queryParameterMatchSpecifier_).toBuilder();
            }
            queryParameterMatchSpecifier_ =
                input.readMessage(io.envoyproxy.envoy.type.matcher.v3.StringMatcher.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.envoyproxy.envoy.type.matcher.v3.StringMatcher) queryParameterMatchSpecifier_);
              queryParameterMatchSpecifier_ = subBuilder.buildPartial();
            }
            queryParameterMatchSpecifierCase_ = 5;
            break;
          }
          case 48: {
            queryParameterMatchSpecifierCase_ = 6;
            queryParameterMatchSpecifier_ = input.readBool();
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
    return io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.internal_static_envoy_config_route_v3_QueryParameterMatcher_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.internal_static_envoy_config_route_v3_QueryParameterMatcher_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher.class, io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher.Builder.class);
  }

  private int queryParameterMatchSpecifierCase_ = 0;
  private java.lang.Object queryParameterMatchSpecifier_;
  public enum QueryParameterMatchSpecifierCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    STRING_MATCH(5),
    PRESENT_MATCH(6),
    QUERYPARAMETERMATCHSPECIFIER_NOT_SET(0);
    private final int value;
    private QueryParameterMatchSpecifierCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static QueryParameterMatchSpecifierCase valueOf(int value) {
      return forNumber(value);
    }

    public static QueryParameterMatchSpecifierCase forNumber(int value) {
      switch (value) {
        case 5: return STRING_MATCH;
        case 6: return PRESENT_MATCH;
        case 0: return QUERYPARAMETERMATCHSPECIFIER_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public QueryParameterMatchSpecifierCase
  getQueryParameterMatchSpecifierCase() {
    return QueryParameterMatchSpecifierCase.forNumber(
        queryParameterMatchSpecifierCase_);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Specifies the name of a key that must be present in the requested
   * *path*'s query string.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
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
   * Specifies the name of a key that must be present in the requested
   * *path*'s query string.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
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

  public static final int STRING_MATCH_FIELD_NUMBER = 5;
  /**
   * <pre>
   * Specifies whether a query parameter value should match against a string.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.StringMatcher string_match = 5 [(.validate.rules) = { ... }</code>
   * @return Whether the stringMatch field is set.
   */
  @java.lang.Override
  public boolean hasStringMatch() {
    return queryParameterMatchSpecifierCase_ == 5;
  }
  /**
   * <pre>
   * Specifies whether a query parameter value should match against a string.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.StringMatcher string_match = 5 [(.validate.rules) = { ... }</code>
   * @return The stringMatch.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.matcher.v3.StringMatcher getStringMatch() {
    if (queryParameterMatchSpecifierCase_ == 5) {
       return (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) queryParameterMatchSpecifier_;
    }
    return io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance();
  }
  /**
   * <pre>
   * Specifies whether a query parameter value should match against a string.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.StringMatcher string_match = 5 [(.validate.rules) = { ... }</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder getStringMatchOrBuilder() {
    if (queryParameterMatchSpecifierCase_ == 5) {
       return (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) queryParameterMatchSpecifier_;
    }
    return io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance();
  }

  public static final int PRESENT_MATCH_FIELD_NUMBER = 6;
  /**
   * <pre>
   * Specifies whether a query parameter should be present.
   * </pre>
   *
   * <code>bool present_match = 6;</code>
   * @return Whether the presentMatch field is set.
   */
  @java.lang.Override
  public boolean hasPresentMatch() {
    return queryParameterMatchSpecifierCase_ == 6;
  }
  /**
   * <pre>
   * Specifies whether a query parameter should be present.
   * </pre>
   *
   * <code>bool present_match = 6;</code>
   * @return The presentMatch.
   */
  @java.lang.Override
  public boolean getPresentMatch() {
    if (queryParameterMatchSpecifierCase_ == 6) {
      return (java.lang.Boolean) queryParameterMatchSpecifier_;
    }
    return false;
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
    if (queryParameterMatchSpecifierCase_ == 5) {
      output.writeMessage(5, (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) queryParameterMatchSpecifier_);
    }
    if (queryParameterMatchSpecifierCase_ == 6) {
      output.writeBool(
          6, (boolean)((java.lang.Boolean) queryParameterMatchSpecifier_));
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
    if (queryParameterMatchSpecifierCase_ == 5) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) queryParameterMatchSpecifier_);
    }
    if (queryParameterMatchSpecifierCase_ == 6) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(
            6, (boolean)((java.lang.Boolean) queryParameterMatchSpecifier_));
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
    if (!(obj instanceof io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher other = (io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!getQueryParameterMatchSpecifierCase().equals(other.getQueryParameterMatchSpecifierCase())) return false;
    switch (queryParameterMatchSpecifierCase_) {
      case 5:
        if (!getStringMatch()
            .equals(other.getStringMatch())) return false;
        break;
      case 6:
        if (getPresentMatch()
            != other.getPresentMatch()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    switch (queryParameterMatchSpecifierCase_) {
      case 5:
        hash = (37 * hash) + STRING_MATCH_FIELD_NUMBER;
        hash = (53 * hash) + getStringMatch().hashCode();
        break;
      case 6:
        hash = (37 * hash) + PRESENT_MATCH_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
            getPresentMatch());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher prototype) {
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
   * Query parameter matching treats the query string of a request's :path header
   * as an ampersand-separated list of keys and/or key=value elements.
   * [#next-free-field: 7]
   * </pre>
   *
   * Protobuf type {@code envoy.config.route.v3.QueryParameterMatcher}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.route.v3.QueryParameterMatcher)
      io.envoyproxy.envoy.config.route.v3.QueryParameterMatcherOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.internal_static_envoy_config_route_v3_QueryParameterMatcher_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.internal_static_envoy_config_route_v3_QueryParameterMatcher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher.class, io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher.newBuilder()
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

      queryParameterMatchSpecifierCase_ = 0;
      queryParameterMatchSpecifier_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.internal_static_envoy_config_route_v3_QueryParameterMatcher_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher build() {
      io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher buildPartial() {
      io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher result = new io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher(this);
      result.name_ = name_;
      if (queryParameterMatchSpecifierCase_ == 5) {
        if (stringMatchBuilder_ == null) {
          result.queryParameterMatchSpecifier_ = queryParameterMatchSpecifier_;
        } else {
          result.queryParameterMatchSpecifier_ = stringMatchBuilder_.build();
        }
      }
      if (queryParameterMatchSpecifierCase_ == 6) {
        result.queryParameterMatchSpecifier_ = queryParameterMatchSpecifier_;
      }
      result.queryParameterMatchSpecifierCase_ = queryParameterMatchSpecifierCase_;
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
      if (other instanceof io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher) {
        return mergeFrom((io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher other) {
      if (other == io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      switch (other.getQueryParameterMatchSpecifierCase()) {
        case STRING_MATCH: {
          mergeStringMatch(other.getStringMatch());
          break;
        }
        case PRESENT_MATCH: {
          setPresentMatch(other.getPresentMatch());
          break;
        }
        case QUERYPARAMETERMATCHSPECIFIER_NOT_SET: {
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
      io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int queryParameterMatchSpecifierCase_ = 0;
    private java.lang.Object queryParameterMatchSpecifier_;
    public QueryParameterMatchSpecifierCase
        getQueryParameterMatchSpecifierCase() {
      return QueryParameterMatchSpecifierCase.forNumber(
          queryParameterMatchSpecifierCase_);
    }

    public Builder clearQueryParameterMatchSpecifier() {
      queryParameterMatchSpecifierCase_ = 0;
      queryParameterMatchSpecifier_ = null;
      onChanged();
      return this;
    }


    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Specifies the name of a key that must be present in the requested
     * *path*'s query string.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
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
     * Specifies the name of a key that must be present in the requested
     * *path*'s query string.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
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
     * Specifies the name of a key that must be present in the requested
     * *path*'s query string.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
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
     * Specifies the name of a key that must be present in the requested
     * *path*'s query string.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the name of a key that must be present in the requested
     * *path*'s query string.
     * </pre>
     *
     * <code>string name = 1 [(.validate.rules) = { ... }</code>
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

    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.matcher.v3.StringMatcher, io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder, io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder> stringMatchBuilder_;
    /**
     * <pre>
     * Specifies whether a query parameter value should match against a string.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher string_match = 5 [(.validate.rules) = { ... }</code>
     * @return Whether the stringMatch field is set.
     */
    @java.lang.Override
    public boolean hasStringMatch() {
      return queryParameterMatchSpecifierCase_ == 5;
    }
    /**
     * <pre>
     * Specifies whether a query parameter value should match against a string.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher string_match = 5 [(.validate.rules) = { ... }</code>
     * @return The stringMatch.
     */
    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.v3.StringMatcher getStringMatch() {
      if (stringMatchBuilder_ == null) {
        if (queryParameterMatchSpecifierCase_ == 5) {
          return (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) queryParameterMatchSpecifier_;
        }
        return io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance();
      } else {
        if (queryParameterMatchSpecifierCase_ == 5) {
          return stringMatchBuilder_.getMessage();
        }
        return io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Specifies whether a query parameter value should match against a string.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher string_match = 5 [(.validate.rules) = { ... }</code>
     */
    public Builder setStringMatch(io.envoyproxy.envoy.type.matcher.v3.StringMatcher value) {
      if (stringMatchBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        queryParameterMatchSpecifier_ = value;
        onChanged();
      } else {
        stringMatchBuilder_.setMessage(value);
      }
      queryParameterMatchSpecifierCase_ = 5;
      return this;
    }
    /**
     * <pre>
     * Specifies whether a query parameter value should match against a string.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher string_match = 5 [(.validate.rules) = { ... }</code>
     */
    public Builder setStringMatch(
        io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder builderForValue) {
      if (stringMatchBuilder_ == null) {
        queryParameterMatchSpecifier_ = builderForValue.build();
        onChanged();
      } else {
        stringMatchBuilder_.setMessage(builderForValue.build());
      }
      queryParameterMatchSpecifierCase_ = 5;
      return this;
    }
    /**
     * <pre>
     * Specifies whether a query parameter value should match against a string.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher string_match = 5 [(.validate.rules) = { ... }</code>
     */
    public Builder mergeStringMatch(io.envoyproxy.envoy.type.matcher.v3.StringMatcher value) {
      if (stringMatchBuilder_ == null) {
        if (queryParameterMatchSpecifierCase_ == 5 &&
            queryParameterMatchSpecifier_ != io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance()) {
          queryParameterMatchSpecifier_ = io.envoyproxy.envoy.type.matcher.v3.StringMatcher.newBuilder((io.envoyproxy.envoy.type.matcher.v3.StringMatcher) queryParameterMatchSpecifier_)
              .mergeFrom(value).buildPartial();
        } else {
          queryParameterMatchSpecifier_ = value;
        }
        onChanged();
      } else {
        if (queryParameterMatchSpecifierCase_ == 5) {
          stringMatchBuilder_.mergeFrom(value);
        }
        stringMatchBuilder_.setMessage(value);
      }
      queryParameterMatchSpecifierCase_ = 5;
      return this;
    }
    /**
     * <pre>
     * Specifies whether a query parameter value should match against a string.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher string_match = 5 [(.validate.rules) = { ... }</code>
     */
    public Builder clearStringMatch() {
      if (stringMatchBuilder_ == null) {
        if (queryParameterMatchSpecifierCase_ == 5) {
          queryParameterMatchSpecifierCase_ = 0;
          queryParameterMatchSpecifier_ = null;
          onChanged();
        }
      } else {
        if (queryParameterMatchSpecifierCase_ == 5) {
          queryParameterMatchSpecifierCase_ = 0;
          queryParameterMatchSpecifier_ = null;
        }
        stringMatchBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Specifies whether a query parameter value should match against a string.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher string_match = 5 [(.validate.rules) = { ... }</code>
     */
    public io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder getStringMatchBuilder() {
      return getStringMatchFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies whether a query parameter value should match against a string.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher string_match = 5 [(.validate.rules) = { ... }</code>
     */
    @java.lang.Override
    public io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder getStringMatchOrBuilder() {
      if ((queryParameterMatchSpecifierCase_ == 5) && (stringMatchBuilder_ != null)) {
        return stringMatchBuilder_.getMessageOrBuilder();
      } else {
        if (queryParameterMatchSpecifierCase_ == 5) {
          return (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) queryParameterMatchSpecifier_;
        }
        return io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance();
      }
    }
    /**
     * <pre>
     * Specifies whether a query parameter value should match against a string.
     * </pre>
     *
     * <code>.envoy.type.matcher.v3.StringMatcher string_match = 5 [(.validate.rules) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.type.matcher.v3.StringMatcher, io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder, io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder> 
        getStringMatchFieldBuilder() {
      if (stringMatchBuilder_ == null) {
        if (!(queryParameterMatchSpecifierCase_ == 5)) {
          queryParameterMatchSpecifier_ = io.envoyproxy.envoy.type.matcher.v3.StringMatcher.getDefaultInstance();
        }
        stringMatchBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.type.matcher.v3.StringMatcher, io.envoyproxy.envoy.type.matcher.v3.StringMatcher.Builder, io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder>(
                (io.envoyproxy.envoy.type.matcher.v3.StringMatcher) queryParameterMatchSpecifier_,
                getParentForChildren(),
                isClean());
        queryParameterMatchSpecifier_ = null;
      }
      queryParameterMatchSpecifierCase_ = 5;
      onChanged();;
      return stringMatchBuilder_;
    }

    /**
     * <pre>
     * Specifies whether a query parameter should be present.
     * </pre>
     *
     * <code>bool present_match = 6;</code>
     * @return Whether the presentMatch field is set.
     */
    public boolean hasPresentMatch() {
      return queryParameterMatchSpecifierCase_ == 6;
    }
    /**
     * <pre>
     * Specifies whether a query parameter should be present.
     * </pre>
     *
     * <code>bool present_match = 6;</code>
     * @return The presentMatch.
     */
    public boolean getPresentMatch() {
      if (queryParameterMatchSpecifierCase_ == 6) {
        return (java.lang.Boolean) queryParameterMatchSpecifier_;
      }
      return false;
    }
    /**
     * <pre>
     * Specifies whether a query parameter should be present.
     * </pre>
     *
     * <code>bool present_match = 6;</code>
     * @param value The presentMatch to set.
     * @return This builder for chaining.
     */
    public Builder setPresentMatch(boolean value) {
      queryParameterMatchSpecifierCase_ = 6;
      queryParameterMatchSpecifier_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies whether a query parameter should be present.
     * </pre>
     *
     * <code>bool present_match = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearPresentMatch() {
      if (queryParameterMatchSpecifierCase_ == 6) {
        queryParameterMatchSpecifierCase_ = 0;
        queryParameterMatchSpecifier_ = null;
        onChanged();
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


    // @@protoc_insertion_point(builder_scope:envoy.config.route.v3.QueryParameterMatcher)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.route.v3.QueryParameterMatcher)
  private static final io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher();
  }

  public static io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryParameterMatcher>
      PARSER = new com.google.protobuf.AbstractParser<QueryParameterMatcher>() {
    @java.lang.Override
    public QueryParameterMatcher parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new QueryParameterMatcher(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<QueryParameterMatcher> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryParameterMatcher> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.route.v3.QueryParameterMatcher getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

