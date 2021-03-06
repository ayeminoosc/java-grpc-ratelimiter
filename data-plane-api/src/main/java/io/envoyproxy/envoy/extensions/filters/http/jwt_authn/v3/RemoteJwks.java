// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/jwt_authn/v3/config.proto

package io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3;

/**
 * <pre>
 * This message specifies how to fetch JWKS from remote and how to cache it.
 * </pre>
 *
 * Protobuf type {@code envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks}
 */
public final class RemoteJwks extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks)
    RemoteJwksOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RemoteJwks.newBuilder() to construct.
  private RemoteJwks(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RemoteJwks() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RemoteJwks();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RemoteJwks(
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
            io.envoyproxy.envoy.config.core.v3.HttpUri.Builder subBuilder = null;
            if (httpUri_ != null) {
              subBuilder = httpUri_.toBuilder();
            }
            httpUri_ = input.readMessage(io.envoyproxy.envoy.config.core.v3.HttpUri.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(httpUri_);
              httpUri_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.Duration.Builder subBuilder = null;
            if (cacheDuration_ != null) {
              subBuilder = cacheDuration_.toBuilder();
            }
            cacheDuration_ = input.readMessage(com.google.protobuf.Duration.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(cacheDuration_);
              cacheDuration_ = subBuilder.buildPartial();
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
    return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_RemoteJwks_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_RemoteJwks_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks.class, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks.Builder.class);
  }

  public static final int HTTP_URI_FIELD_NUMBER = 1;
  private io.envoyproxy.envoy.config.core.v3.HttpUri httpUri_;
  /**
   * <pre>
   * The HTTP URI to fetch the JWKS. For example:
   * .. code-block:: yaml
   *    http_uri:
   *      uri: https://www.googleapis.com/oauth2/v1/certs
   *      cluster: jwt.www.googleapis.com|443
   *      timeout: 1s
   * </pre>
   *
   * <code>.envoy.config.core.v3.HttpUri http_uri = 1;</code>
   * @return Whether the httpUri field is set.
   */
  @java.lang.Override
  public boolean hasHttpUri() {
    return httpUri_ != null;
  }
  /**
   * <pre>
   * The HTTP URI to fetch the JWKS. For example:
   * .. code-block:: yaml
   *    http_uri:
   *      uri: https://www.googleapis.com/oauth2/v1/certs
   *      cluster: jwt.www.googleapis.com|443
   *      timeout: 1s
   * </pre>
   *
   * <code>.envoy.config.core.v3.HttpUri http_uri = 1;</code>
   * @return The httpUri.
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.HttpUri getHttpUri() {
    return httpUri_ == null ? io.envoyproxy.envoy.config.core.v3.HttpUri.getDefaultInstance() : httpUri_;
  }
  /**
   * <pre>
   * The HTTP URI to fetch the JWKS. For example:
   * .. code-block:: yaml
   *    http_uri:
   *      uri: https://www.googleapis.com/oauth2/v1/certs
   *      cluster: jwt.www.googleapis.com|443
   *      timeout: 1s
   * </pre>
   *
   * <code>.envoy.config.core.v3.HttpUri http_uri = 1;</code>
   */
  @java.lang.Override
  public io.envoyproxy.envoy.config.core.v3.HttpUriOrBuilder getHttpUriOrBuilder() {
    return getHttpUri();
  }

  public static final int CACHE_DURATION_FIELD_NUMBER = 2;
  private com.google.protobuf.Duration cacheDuration_;
  /**
   * <pre>
   * Duration after which the cached JWKS should be expired. If not specified, default cache
   * duration is 5 minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration cache_duration = 2;</code>
   * @return Whether the cacheDuration field is set.
   */
  @java.lang.Override
  public boolean hasCacheDuration() {
    return cacheDuration_ != null;
  }
  /**
   * <pre>
   * Duration after which the cached JWKS should be expired. If not specified, default cache
   * duration is 5 minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration cache_duration = 2;</code>
   * @return The cacheDuration.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getCacheDuration() {
    return cacheDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : cacheDuration_;
  }
  /**
   * <pre>
   * Duration after which the cached JWKS should be expired. If not specified, default cache
   * duration is 5 minutes.
   * </pre>
   *
   * <code>.google.protobuf.Duration cache_duration = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getCacheDurationOrBuilder() {
    return getCacheDuration();
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
    if (httpUri_ != null) {
      output.writeMessage(1, getHttpUri());
    }
    if (cacheDuration_ != null) {
      output.writeMessage(2, getCacheDuration());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (httpUri_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHttpUri());
    }
    if (cacheDuration_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getCacheDuration());
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
    if (!(obj instanceof io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks)) {
      return super.equals(obj);
    }
    io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks other = (io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks) obj;

    if (hasHttpUri() != other.hasHttpUri()) return false;
    if (hasHttpUri()) {
      if (!getHttpUri()
          .equals(other.getHttpUri())) return false;
    }
    if (hasCacheDuration() != other.hasCacheDuration()) return false;
    if (hasCacheDuration()) {
      if (!getCacheDuration()
          .equals(other.getCacheDuration())) return false;
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
    if (hasHttpUri()) {
      hash = (37 * hash) + HTTP_URI_FIELD_NUMBER;
      hash = (53 * hash) + getHttpUri().hashCode();
    }
    if (hasCacheDuration()) {
      hash = (37 * hash) + CACHE_DURATION_FIELD_NUMBER;
      hash = (53 * hash) + getCacheDuration().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks parseFrom(
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
  public static Builder newBuilder(io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks prototype) {
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
   * This message specifies how to fetch JWKS from remote and how to cache it.
   * </pre>
   *
   * Protobuf type {@code envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks)
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwksOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_RemoteJwks_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_RemoteJwks_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks.class, io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks.Builder.class);
    }

    // Construct using io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks.newBuilder()
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
      if (httpUriBuilder_ == null) {
        httpUri_ = null;
      } else {
        httpUri_ = null;
        httpUriBuilder_ = null;
      }
      if (cacheDurationBuilder_ == null) {
        cacheDuration_ = null;
      } else {
        cacheDuration_ = null;
        cacheDurationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.ConfigProto.internal_static_envoy_extensions_filters_http_jwt_authn_v3_RemoteJwks_descriptor;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks getDefaultInstanceForType() {
      return io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks.getDefaultInstance();
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks build() {
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks buildPartial() {
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks result = new io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks(this);
      if (httpUriBuilder_ == null) {
        result.httpUri_ = httpUri_;
      } else {
        result.httpUri_ = httpUriBuilder_.build();
      }
      if (cacheDurationBuilder_ == null) {
        result.cacheDuration_ = cacheDuration_;
      } else {
        result.cacheDuration_ = cacheDurationBuilder_.build();
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
      if (other instanceof io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks) {
        return mergeFrom((io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks other) {
      if (other == io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks.getDefaultInstance()) return this;
      if (other.hasHttpUri()) {
        mergeHttpUri(other.getHttpUri());
      }
      if (other.hasCacheDuration()) {
        mergeCacheDuration(other.getCacheDuration());
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
      io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.envoyproxy.envoy.config.core.v3.HttpUri httpUri_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.HttpUri, io.envoyproxy.envoy.config.core.v3.HttpUri.Builder, io.envoyproxy.envoy.config.core.v3.HttpUriOrBuilder> httpUriBuilder_;
    /**
     * <pre>
     * The HTTP URI to fetch the JWKS. For example:
     * .. code-block:: yaml
     *    http_uri:
     *      uri: https://www.googleapis.com/oauth2/v1/certs
     *      cluster: jwt.www.googleapis.com|443
     *      timeout: 1s
     * </pre>
     *
     * <code>.envoy.config.core.v3.HttpUri http_uri = 1;</code>
     * @return Whether the httpUri field is set.
     */
    public boolean hasHttpUri() {
      return httpUriBuilder_ != null || httpUri_ != null;
    }
    /**
     * <pre>
     * The HTTP URI to fetch the JWKS. For example:
     * .. code-block:: yaml
     *    http_uri:
     *      uri: https://www.googleapis.com/oauth2/v1/certs
     *      cluster: jwt.www.googleapis.com|443
     *      timeout: 1s
     * </pre>
     *
     * <code>.envoy.config.core.v3.HttpUri http_uri = 1;</code>
     * @return The httpUri.
     */
    public io.envoyproxy.envoy.config.core.v3.HttpUri getHttpUri() {
      if (httpUriBuilder_ == null) {
        return httpUri_ == null ? io.envoyproxy.envoy.config.core.v3.HttpUri.getDefaultInstance() : httpUri_;
      } else {
        return httpUriBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * The HTTP URI to fetch the JWKS. For example:
     * .. code-block:: yaml
     *    http_uri:
     *      uri: https://www.googleapis.com/oauth2/v1/certs
     *      cluster: jwt.www.googleapis.com|443
     *      timeout: 1s
     * </pre>
     *
     * <code>.envoy.config.core.v3.HttpUri http_uri = 1;</code>
     */
    public Builder setHttpUri(io.envoyproxy.envoy.config.core.v3.HttpUri value) {
      if (httpUriBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        httpUri_ = value;
        onChanged();
      } else {
        httpUriBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The HTTP URI to fetch the JWKS. For example:
     * .. code-block:: yaml
     *    http_uri:
     *      uri: https://www.googleapis.com/oauth2/v1/certs
     *      cluster: jwt.www.googleapis.com|443
     *      timeout: 1s
     * </pre>
     *
     * <code>.envoy.config.core.v3.HttpUri http_uri = 1;</code>
     */
    public Builder setHttpUri(
        io.envoyproxy.envoy.config.core.v3.HttpUri.Builder builderForValue) {
      if (httpUriBuilder_ == null) {
        httpUri_ = builderForValue.build();
        onChanged();
      } else {
        httpUriBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The HTTP URI to fetch the JWKS. For example:
     * .. code-block:: yaml
     *    http_uri:
     *      uri: https://www.googleapis.com/oauth2/v1/certs
     *      cluster: jwt.www.googleapis.com|443
     *      timeout: 1s
     * </pre>
     *
     * <code>.envoy.config.core.v3.HttpUri http_uri = 1;</code>
     */
    public Builder mergeHttpUri(io.envoyproxy.envoy.config.core.v3.HttpUri value) {
      if (httpUriBuilder_ == null) {
        if (httpUri_ != null) {
          httpUri_ =
            io.envoyproxy.envoy.config.core.v3.HttpUri.newBuilder(httpUri_).mergeFrom(value).buildPartial();
        } else {
          httpUri_ = value;
        }
        onChanged();
      } else {
        httpUriBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The HTTP URI to fetch the JWKS. For example:
     * .. code-block:: yaml
     *    http_uri:
     *      uri: https://www.googleapis.com/oauth2/v1/certs
     *      cluster: jwt.www.googleapis.com|443
     *      timeout: 1s
     * </pre>
     *
     * <code>.envoy.config.core.v3.HttpUri http_uri = 1;</code>
     */
    public Builder clearHttpUri() {
      if (httpUriBuilder_ == null) {
        httpUri_ = null;
        onChanged();
      } else {
        httpUri_ = null;
        httpUriBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The HTTP URI to fetch the JWKS. For example:
     * .. code-block:: yaml
     *    http_uri:
     *      uri: https://www.googleapis.com/oauth2/v1/certs
     *      cluster: jwt.www.googleapis.com|443
     *      timeout: 1s
     * </pre>
     *
     * <code>.envoy.config.core.v3.HttpUri http_uri = 1;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.HttpUri.Builder getHttpUriBuilder() {
      
      onChanged();
      return getHttpUriFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The HTTP URI to fetch the JWKS. For example:
     * .. code-block:: yaml
     *    http_uri:
     *      uri: https://www.googleapis.com/oauth2/v1/certs
     *      cluster: jwt.www.googleapis.com|443
     *      timeout: 1s
     * </pre>
     *
     * <code>.envoy.config.core.v3.HttpUri http_uri = 1;</code>
     */
    public io.envoyproxy.envoy.config.core.v3.HttpUriOrBuilder getHttpUriOrBuilder() {
      if (httpUriBuilder_ != null) {
        return httpUriBuilder_.getMessageOrBuilder();
      } else {
        return httpUri_ == null ?
            io.envoyproxy.envoy.config.core.v3.HttpUri.getDefaultInstance() : httpUri_;
      }
    }
    /**
     * <pre>
     * The HTTP URI to fetch the JWKS. For example:
     * .. code-block:: yaml
     *    http_uri:
     *      uri: https://www.googleapis.com/oauth2/v1/certs
     *      cluster: jwt.www.googleapis.com|443
     *      timeout: 1s
     * </pre>
     *
     * <code>.envoy.config.core.v3.HttpUri http_uri = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.envoyproxy.envoy.config.core.v3.HttpUri, io.envoyproxy.envoy.config.core.v3.HttpUri.Builder, io.envoyproxy.envoy.config.core.v3.HttpUriOrBuilder> 
        getHttpUriFieldBuilder() {
      if (httpUriBuilder_ == null) {
        httpUriBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.envoyproxy.envoy.config.core.v3.HttpUri, io.envoyproxy.envoy.config.core.v3.HttpUri.Builder, io.envoyproxy.envoy.config.core.v3.HttpUriOrBuilder>(
                getHttpUri(),
                getParentForChildren(),
                isClean());
        httpUri_ = null;
      }
      return httpUriBuilder_;
    }

    private com.google.protobuf.Duration cacheDuration_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> cacheDurationBuilder_;
    /**
     * <pre>
     * Duration after which the cached JWKS should be expired. If not specified, default cache
     * duration is 5 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cache_duration = 2;</code>
     * @return Whether the cacheDuration field is set.
     */
    public boolean hasCacheDuration() {
      return cacheDurationBuilder_ != null || cacheDuration_ != null;
    }
    /**
     * <pre>
     * Duration after which the cached JWKS should be expired. If not specified, default cache
     * duration is 5 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cache_duration = 2;</code>
     * @return The cacheDuration.
     */
    public com.google.protobuf.Duration getCacheDuration() {
      if (cacheDurationBuilder_ == null) {
        return cacheDuration_ == null ? com.google.protobuf.Duration.getDefaultInstance() : cacheDuration_;
      } else {
        return cacheDurationBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Duration after which the cached JWKS should be expired. If not specified, default cache
     * duration is 5 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cache_duration = 2;</code>
     */
    public Builder setCacheDuration(com.google.protobuf.Duration value) {
      if (cacheDurationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cacheDuration_ = value;
        onChanged();
      } else {
        cacheDurationBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Duration after which the cached JWKS should be expired. If not specified, default cache
     * duration is 5 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cache_duration = 2;</code>
     */
    public Builder setCacheDuration(
        com.google.protobuf.Duration.Builder builderForValue) {
      if (cacheDurationBuilder_ == null) {
        cacheDuration_ = builderForValue.build();
        onChanged();
      } else {
        cacheDurationBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Duration after which the cached JWKS should be expired. If not specified, default cache
     * duration is 5 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cache_duration = 2;</code>
     */
    public Builder mergeCacheDuration(com.google.protobuf.Duration value) {
      if (cacheDurationBuilder_ == null) {
        if (cacheDuration_ != null) {
          cacheDuration_ =
            com.google.protobuf.Duration.newBuilder(cacheDuration_).mergeFrom(value).buildPartial();
        } else {
          cacheDuration_ = value;
        }
        onChanged();
      } else {
        cacheDurationBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Duration after which the cached JWKS should be expired. If not specified, default cache
     * duration is 5 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cache_duration = 2;</code>
     */
    public Builder clearCacheDuration() {
      if (cacheDurationBuilder_ == null) {
        cacheDuration_ = null;
        onChanged();
      } else {
        cacheDuration_ = null;
        cacheDurationBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Duration after which the cached JWKS should be expired. If not specified, default cache
     * duration is 5 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cache_duration = 2;</code>
     */
    public com.google.protobuf.Duration.Builder getCacheDurationBuilder() {
      
      onChanged();
      return getCacheDurationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Duration after which the cached JWKS should be expired. If not specified, default cache
     * duration is 5 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cache_duration = 2;</code>
     */
    public com.google.protobuf.DurationOrBuilder getCacheDurationOrBuilder() {
      if (cacheDurationBuilder_ != null) {
        return cacheDurationBuilder_.getMessageOrBuilder();
      } else {
        return cacheDuration_ == null ?
            com.google.protobuf.Duration.getDefaultInstance() : cacheDuration_;
      }
    }
    /**
     * <pre>
     * Duration after which the cached JWKS should be expired. If not specified, default cache
     * duration is 5 minutes.
     * </pre>
     *
     * <code>.google.protobuf.Duration cache_duration = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder> 
        getCacheDurationFieldBuilder() {
      if (cacheDurationBuilder_ == null) {
        cacheDurationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration, com.google.protobuf.Duration.Builder, com.google.protobuf.DurationOrBuilder>(
                getCacheDuration(),
                getParentForChildren(),
                isClean());
        cacheDuration_ = null;
      }
      return cacheDurationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks)
  private static final io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks();
  }

  public static io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RemoteJwks>
      PARSER = new com.google.protobuf.AbstractParser<RemoteJwks>() {
    @java.lang.Override
    public RemoteJwks parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RemoteJwks(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RemoteJwks> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RemoteJwks> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.envoyproxy.envoy.extensions.filters.http.jwt_authn.v3.RemoteJwks getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

