// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/route/v3/route_components.proto

package io.envoyproxy.envoy.config.route.v3;

/**
 * Protobuf type {@code envoy.config.route.v3.DirectResponseAction}
 */
public final class DirectResponseAction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.config.route.v3.DirectResponseAction)
    DirectResponseActionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DirectResponseAction.newBuilder() to construct.
  private DirectResponseAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DirectResponseAction() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DirectResponseAction();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DirectResponseAction(
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

            status_ = input.readUInt32();
            break;
          }
          case 18: {
            io.envoyproxy.envoy.config.core.v3.DataSource.Builder subBuilder = null;
            if (body_ != null) {
              subBuilder = body_.toBuilder();
            }
            body_ = input.readMessage(io.envoyproxy.envoy.config.core.v3.DataSource.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(body_);
              body_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.internal_static_envoy_config_route_v3_DirectResponseAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.internal_static_envoy_config_route_v3_DirectResponseAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.config.route.v3.DirectResponseAction.class, io.envoyproxy.envoy.config.route.v3.DirectResponseAction.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <pre>
   * Specifies the HTTP response status to be returned.
   * </pre>
   *
   * <code>uint32 status = 1 [(.validate.rules) = { ... }</code>
   * @return The status.
   */
  @java.lang.Override
  public int getStatus() {
    return status_;
  }

  public static final int BODY_FIELD_NUMBER = 2;
  private io.envoyproxy.envoy.config.core.v3.DataSource body_;
  /**
   * <pre>
   * Specifies the content of the response body. If this setting is omitted,
   * no body is included in the generated response.
   * .. note::
   *   Headers can be specified using *response_headers_to_add* in the enclosing
   *   :ref:`envoy_api_msg_config.route.v3.Route`, :ref:`envoy_api_msg_config.route.v3.RouteConfiguration` or
   *   :ref:`envoy_api_msg_config.route.v3.VirtualHost`.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource body = 2;</code>
   * @return Whether the body field is set.
   */
  @java.lang.Override
  public boolean hasBody() {
    return body_ != null;
  }
  /**
   * <pre>
   * Specifies the content of the response body. If this setting is omitted,
   * no body is included in the generated response.
   * .. note::
   *   Headers can be specified using *response_headers_to_add* in the enclosing
   *   :ref:`envoy_api_msg_config.route.v3.Route`, :ref:`envoy_api_msg_config.route.v3.RouteConfiguration` or
   *   :ref:`envoy_api_msg_config.route.v3.VirtualHost`.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource body = 2;</code>
   * @return The body.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.DataSource getBody() {
    return body_ == null ? io.envoyproxy.envoy.config.core.v3.DataSource.getDefaultInstance() : body_;
  }
  /**
   * <pre>
   * Specifies the content of the response body. If this setting is omitted,
   * no body is included in the generated response.
   * .. note::
   *   Headers can be specified using *response_headers_to_add* in the enclosing
   *   :ref:`envoy_api_msg_config.route.v3.Route`, :ref:`envoy_api_msg_config.route.v3.RouteConfiguration` or
   *   :ref:`envoy_api_msg_config.route.v3.VirtualHost`.
   * </pre>
   *
   * <code>.envoy.config.core.v3.DataSource body = 2;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder getBodyOrBuilder() {
    return getBody();
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
    if (status_ != 0) {
      output.writeUInt32(1, status_);
    }
    if (body_ != null) {
      output.writeMessage(2, getBody());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, status_);
    }
    if (body_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getBody());
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
    if (!(obj instanceof io.envoyproxy.envoy.config.route.v3.DirectResponseAction)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.config.route.v3.DirectResponseAction other = (io.envoyproxy.envoy.config.route.v3.DirectResponseAction) obj;

    if (getStatus()
        != other.getStatus()) return false;
    if (hasBody() != other.hasBody()) return false;
    if (hasBody()) {
      if (!getBody()
          .equals(other.getBody())) return false;
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    if (hasBody()) {
      hash = (37 * hash) + BODY_FIELD_NUMBER;
      hash = (53 * hash) + getBody().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.config.route.v3.DirectResponseAction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.route.v3.DirectResponseAction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.route.v3.DirectResponseAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.route.v3.DirectResponseAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.route.v3.DirectResponseAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.config.route.v3.DirectResponseAction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.route.v3.DirectResponseAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.route.v3.DirectResponseAction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.route.v3.DirectResponseAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.route.v3.DirectResponseAction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.config.route.v3.DirectResponseAction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.config.route.v3.DirectResponseAction parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.config.route.v3.DirectResponseAction prototype) {
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
   * Protobuf type {@code envoy.config.route.v3.DirectResponseAction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.config.route.v3.DirectResponseAction)
      io.envoyproxy.envoy.config.route.v3.DirectResponseActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.internal_static_envoy_config_route_v3_DirectResponseAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.internal_static_envoy_config_route_v3_DirectResponseAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.config.route.v3.DirectResponseAction.class, io.envoyproxy.envoy.config.route.v3.DirectResponseAction.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.config.route.v3.DirectResponseAction.newBuilder()
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
      status_ = 0;

      if (bodyBuilder_ == null) {
        body_ = null;
      } else {
        body_ = null;
        bodyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.config.route.v3.RouteComponentsProto.internal_static_envoy_config_route_v3_DirectResponseAction_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.route.v3.DirectResponseAction getDefaultInstanceForType() {
      return io.envoyproxy.envoy.config.route.v3.DirectResponseAction.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.route.v3.DirectResponseAction build() {
      io.envoyproxy.envoy.config.route.v3.DirectResponseAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.config.route.v3.DirectResponseAction buildPartial() {
      io.envoyproxy.envoy.config.route.v3.DirectResponseAction result = new io.envoyproxy.envoy.config.route.v3.DirectResponseAction(this);
      result.status_ = status_;
      if (bodyBuilder_ == null) {
        result.body_ = body_;
      } else {
        result.body_ = bodyBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.config.route.v3.DirectResponseAction) {
        return mergeFrom((io.envoyproxy.envoy.config.route.v3.DirectResponseAction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.config.route.v3.DirectResponseAction other) {
      if (other == io.envoyproxy.envoy.config.route.v3.DirectResponseAction.getDefaultInstance()) return this;
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (other.hasBody()) {
        mergeBody(other.getBody());
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
      io.envoyproxy.envoy.config.route.v3.DirectResponseAction parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.config.route.v3.DirectResponseAction) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ ;
    /**
     * <pre>
     * Specifies the HTTP response status to be returned.
     * </pre>
     *
     * <code>uint32 status = 1 [(.validate.rules) = { ... }</code>
     * @return The status.
     */
    @java.lang.Override
    public int getStatus() {
      return status_;
    }
    /**
     * <pre>
     * Specifies the HTTP response status to be returned.
     * </pre>
     *
     * <code>uint32 status = 1 [(.validate.rules) = { ... }</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Specifies the HTTP response status to be returned.
     * </pre>
     *
     * <code>uint32 status = 1 [(.validate.rules) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private io.envoyproxy.envoy.config.core.v3.DataSource body_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.DataSource, io.envoyproxy.envoy.config.core.v3.DataSource.Builder, io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder> bodyBuilder_;
    /**
     * <pre>
     * Specifies the content of the response body. If this setting is omitted,
     * no body is included in the generated response.
     * .. note::
     *   Headers can be specified using *response_headers_to_add* in the enclosing
     *   :ref:`envoy_api_msg_config.route.v3.Route`, :ref:`envoy_api_msg_config.route.v3.RouteConfiguration` or
     *   :ref:`envoy_api_msg_config.route.v3.VirtualHost`.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource body = 2;</code>
     * @return Whether the body field is set.
     */
    public boolean hasBody() {
      return bodyBuilder_ != null || body_ != null;
    }
    /**
     * <pre>
     * Specifies the content of the response body. If this setting is omitted,
     * no body is included in the generated response.
     * .. note::
     *   Headers can be specified using *response_headers_to_add* in the enclosing
     *   :ref:`envoy_api_msg_config.route.v3.Route`, :ref:`envoy_api_msg_config.route.v3.RouteConfiguration` or
     *   :ref:`envoy_api_msg_config.route.v3.VirtualHost`.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource body = 2;</code>
     * @return The body.
     */
    public io.envoyproxy.envoy.config.core.v3.DataSource getBody() {
      if (bodyBuilder_ == null) {
        return body_ == null ? io.envoyproxy.envoy.config.core.v3.DataSource.getDefaultInstance() : body_;
      } else {
        return bodyBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Specifies the content of the response body. If this setting is omitted,
     * no body is included in the generated response.
     * .. note::
     *   Headers can be specified using *response_headers_to_add* in the enclosing
     *   :ref:`envoy_api_msg_config.route.v3.Route`, :ref:`envoy_api_msg_config.route.v3.RouteConfiguration` or
     *   :ref:`envoy_api_msg_config.route.v3.VirtualHost`.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource body = 2;</code>
     */
    public Builder setBody(io.envoyproxy.envoy.config.core.v3.DataSource value) {
      if (bodyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        body_ = value;
        onChanged();
      } else {
        bodyBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the content of the response body. If this setting is omitted,
     * no body is included in the generated response.
     * .. note::
     *   Headers can be specified using *response_headers_to_add* in the enclosing
     *   :ref:`envoy_api_msg_config.route.v3.Route`, :ref:`envoy_api_msg_config.route.v3.RouteConfiguration` or
     *   :ref:`envoy_api_msg_config.route.v3.VirtualHost`.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource body = 2;</code>
     */
    public Builder setBody(
        io.envoyproxy.envoy.config.core.v3.DataSource.Builder builderForValue) {
      if (bodyBuilder_ == null) {
        body_ = builderForValue.build();
        onChanged();
      } else {
        bodyBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the content of the response body. If this setting is omitted,
     * no body is included in the generated response.
     * .. note::
     *   Headers can be specified using *response_headers_to_add* in the enclosing
     *   :ref:`envoy_api_msg_config.route.v3.Route`, :ref:`envoy_api_msg_config.route.v3.RouteConfiguration` or
     *   :ref:`envoy_api_msg_config.route.v3.VirtualHost`.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource body = 2;</code>
     */
    public Builder mergeBody(io.envoyproxy.envoy.config.core.v3.DataSource value) {
      if (bodyBuilder_ == null) {
        if (body_ != null) {
          body_ =
            io.envoyproxy.envoy.config.core.v3.DataSource.newBuilder(body_).mergeFrom(value).buildPartial();
        } else {
          body_ = value;
        }
        onChanged();
      } else {
        bodyBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the content of the response body. If this setting is omitted,
     * no body is included in the generated response.
     * .. note::
     *   Headers can be specified using *response_headers_to_add* in the enclosing
     *   :ref:`envoy_api_msg_config.route.v3.Route`, :ref:`envoy_api_msg_config.route.v3.RouteConfiguration` or
     *   :ref:`envoy_api_msg_config.route.v3.VirtualHost`.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource body = 2;</code>
     */
    public Builder clearBody() {
      if (bodyBuilder_ == null) {
        body_ = null;
        onChanged();
      } else {
        body_ = null;
        bodyBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Specifies the content of the response body. If this setting is omitted,
     * no body is included in the generated response.
     * .. note::
     *   Headers can be specified using *response_headers_to_add* in the enclosing
     *   :ref:`envoy_api_msg_config.route.v3.Route`, :ref:`envoy_api_msg_config.route.v3.RouteConfiguration` or
     *   :ref:`envoy_api_msg_config.route.v3.VirtualHost`.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource body = 2;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.DataSource.Builder getBodyBuilder() {
      
      onChanged();
      return getBodyFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Specifies the content of the response body. If this setting is omitted,
     * no body is included in the generated response.
     * .. note::
     *   Headers can be specified using *response_headers_to_add* in the enclosing
     *   :ref:`envoy_api_msg_config.route.v3.Route`, :ref:`envoy_api_msg_config.route.v3.RouteConfiguration` or
     *   :ref:`envoy_api_msg_config.route.v3.VirtualHost`.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource body = 2;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder getBodyOrBuilder() {
      if (bodyBuilder_ != null) {
        return bodyBuilder_.getMessageOrBuilder();
      } else {
        return body_ == null ?
            io.envoyproxy.envoy.config.core.v3.DataSource.getDefaultInstance() : body_;
      }
    }
    /**
     * <pre>
     * Specifies the content of the response body. If this setting is omitted,
     * no body is included in the generated response.
     * .. note::
     *   Headers can be specified using *response_headers_to_add* in the enclosing
     *   :ref:`envoy_api_msg_config.route.v3.Route`, :ref:`envoy_api_msg_config.route.v3.RouteConfiguration` or
     *   :ref:`envoy_api_msg_config.route.v3.VirtualHost`.
     * </pre>
     *
     * <code>.envoy.config.core.v3.DataSource body = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.DataSource, io.envoyproxy.envoy.config.core.v3.DataSource.Builder, io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder> 
        getBodyFieldBuilder() {
      if (bodyBuilder_ == null) {
        bodyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.DataSource, io.envoyproxy.envoy.config.core.v3.DataSource.Builder, io.envoyproxy.envoy.config.core.v3.DataSourceOrBuilder>(
                getBody(),
                getParentForChildren(),
                isClean());
        body_ = null;
      }
      return bodyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.config.route.v3.DirectResponseAction)
  }

  // @@protoc_insertion_point(class_scope:envoy.config.route.v3.DirectResponseAction)
  private static final io.envoyproxy.envoy.config.route.v3.DirectResponseAction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.config.route.v3.DirectResponseAction();
  }

  public static io.envoyproxy.envoy.config.route.v3.DirectResponseAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DirectResponseAction>
      PARSER = new com.google.protobuf.AbstractParser<DirectResponseAction>() {
    @java.lang.Override
    public DirectResponseAction parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DirectResponseAction(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DirectResponseAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DirectResponseAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.config.route.v3.DirectResponseAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
