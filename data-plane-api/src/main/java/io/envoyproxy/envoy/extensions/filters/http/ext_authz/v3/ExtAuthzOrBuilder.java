// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/ext_authz/v3/ext_authz.proto

package io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3;

public interface ExtAuthzOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.ext_authz.v3.ExtAuthz)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * gRPC service configuration (default timeout: 200ms).
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService grpc_service = 1;</code>
   * @return Whether the grpcService field is set.
   */
  boolean hasGrpcService();
  /**
   * <pre>
   * gRPC service configuration (default timeout: 200ms).
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService grpc_service = 1;</code>
   * @return The grpcService.
   */
  io.envoyproxy.envoy.config.core.v3.GrpcService getGrpcService();
  /**
   * <pre>
   * gRPC service configuration (default timeout: 200ms).
   * </pre>
   *
   * <code>.envoy.config.core.v3.GrpcService grpc_service = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.GrpcServiceOrBuilder getGrpcServiceOrBuilder();

  /**
   * <pre>
   * HTTP service configuration (default timeout: 200ms).
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.HttpService http_service = 3;</code>
   * @return Whether the httpService field is set.
   */
  boolean hasHttpService();
  /**
   * <pre>
   * HTTP service configuration (default timeout: 200ms).
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.HttpService http_service = 3;</code>
   * @return The httpService.
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3.HttpService getHttpService();
  /**
   * <pre>
   * HTTP service configuration (default timeout: 200ms).
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.HttpService http_service = 3;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3.HttpServiceOrBuilder getHttpServiceOrBuilder();

  /**
   * <pre>
   * API version for ext_authz transport protocol. This describes the ext_authz gRPC endpoint and
   * version of messages used on the wire.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 12 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for transportApiVersion.
   */
  int getTransportApiVersionValue();
  /**
   * <pre>
   * API version for ext_authz transport protocol. This describes the ext_authz gRPC endpoint and
   * version of messages used on the wire.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 12 [(.validate.rules) = { ... }</code>
   * @return The transportApiVersion.
   */
  io.envoyproxy.envoy.config.core.v3.ApiVersion getTransportApiVersion();

  /**
   * <pre>
   *  Changes filter's behaviour on errors:
   *  1. When set to true, the filter will *accept* client request even if the communication with
   *  the authorization service has failed, or if the authorization service has returned a HTTP 5xx
   *  error.
   *  2. When set to false, ext-authz will *reject* client requests and return a *Forbidden*
   *  response if the communication with the authorization service has failed, or if the
   *  authorization service has returned a HTTP 5xx error.
   * Note that errors can be *always* tracked in the :ref:`stats
   * &lt;config_http_filters_ext_authz_stats&gt;`.
   * </pre>
   *
   * <code>bool failure_mode_allow = 2;</code>
   * @return The failureModeAllow.
   */
  boolean getFailureModeAllow();

  /**
   * <pre>
   * Enables filter to buffer the client request body and send it within the authorization request.
   * A ``x-envoy-auth-partial-body: false|true`` metadata header will be added to the authorization
   * request message indicating if the body data is partial.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.BufferSettings with_request_body = 5;</code>
   * @return Whether the withRequestBody field is set.
   */
  boolean hasWithRequestBody();
  /**
   * <pre>
   * Enables filter to buffer the client request body and send it within the authorization request.
   * A ``x-envoy-auth-partial-body: false|true`` metadata header will be added to the authorization
   * request message indicating if the body data is partial.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.BufferSettings with_request_body = 5;</code>
   * @return The withRequestBody.
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3.BufferSettings getWithRequestBody();
  /**
   * <pre>
   * Enables filter to buffer the client request body and send it within the authorization request.
   * A ``x-envoy-auth-partial-body: false|true`` metadata header will be added to the authorization
   * request message indicating if the body data is partial.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.BufferSettings with_request_body = 5;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3.BufferSettingsOrBuilder getWithRequestBodyOrBuilder();

  /**
   * <pre>
   * Clears route cache in order to allow the external authorization service to correctly affect
   * routing decisions. Filter clears all cached routes when:
   * 1. The field is set to *true*.
   * 2. The status returned from the authorization service is a HTTP 200 or gRPC 0.
   * 3. At least one *authorization response header* is added to the client request, or is used for
   * altering another client request header.
   * </pre>
   *
   * <code>bool clear_route_cache = 6;</code>
   * @return The clearRouteCache.
   */
  boolean getClearRouteCache();

  /**
   * <pre>
   * Sets the HTTP status that is returned to the client when there is a network error between the
   * filter and the authorization server. The default status is HTTP 403 Forbidden.
   * </pre>
   *
   * <code>.envoy.type.v3.HttpStatus status_on_error = 7;</code>
   * @return Whether the statusOnError field is set.
   */
  boolean hasStatusOnError();
  /**
   * <pre>
   * Sets the HTTP status that is returned to the client when there is a network error between the
   * filter and the authorization server. The default status is HTTP 403 Forbidden.
   * </pre>
   *
   * <code>.envoy.type.v3.HttpStatus status_on_error = 7;</code>
   * @return The statusOnError.
   */
  io.envoyproxy.envoy.type.v3.HttpStatus getStatusOnError();
  /**
   * <pre>
   * Sets the HTTP status that is returned to the client when there is a network error between the
   * filter and the authorization server. The default status is HTTP 403 Forbidden.
   * </pre>
   *
   * <code>.envoy.type.v3.HttpStatus status_on_error = 7;</code>
   */
  io.envoyproxy.envoy.type.v3.HttpStatusOrBuilder getStatusOnErrorOrBuilder();

  /**
   * <pre>
   * Specifies a list of metadata namespaces whose values, if present, will be passed to the
   * ext_authz service as an opaque *protobuf::Struct*.
   * For example, if the *jwt_authn* filter is used and :ref:`payload_in_metadata
   * &lt;envoy_api_field_extensions.filters.http.jwt_authn.v3.JwtProvider.payload_in_metadata&gt;` is set,
   * then the following will pass the jwt payload to the authorization server.
   * .. code-block:: yaml
   *    metadata_context_namespaces:
   *    - envoy.filters.http.jwt_authn
   * </pre>
   *
   * <code>repeated string metadata_context_namespaces = 8;</code>
   * @return A list containing the metadataContextNamespaces.
   */
  java.util.List<java.lang.String>
      getMetadataContextNamespacesList();
  /**
   * <pre>
   * Specifies a list of metadata namespaces whose values, if present, will be passed to the
   * ext_authz service as an opaque *protobuf::Struct*.
   * For example, if the *jwt_authn* filter is used and :ref:`payload_in_metadata
   * &lt;envoy_api_field_extensions.filters.http.jwt_authn.v3.JwtProvider.payload_in_metadata&gt;` is set,
   * then the following will pass the jwt payload to the authorization server.
   * .. code-block:: yaml
   *    metadata_context_namespaces:
   *    - envoy.filters.http.jwt_authn
   * </pre>
   *
   * <code>repeated string metadata_context_namespaces = 8;</code>
   * @return The count of metadataContextNamespaces.
   */
  int getMetadataContextNamespacesCount();
  /**
   * <pre>
   * Specifies a list of metadata namespaces whose values, if present, will be passed to the
   * ext_authz service as an opaque *protobuf::Struct*.
   * For example, if the *jwt_authn* filter is used and :ref:`payload_in_metadata
   * &lt;envoy_api_field_extensions.filters.http.jwt_authn.v3.JwtProvider.payload_in_metadata&gt;` is set,
   * then the following will pass the jwt payload to the authorization server.
   * .. code-block:: yaml
   *    metadata_context_namespaces:
   *    - envoy.filters.http.jwt_authn
   * </pre>
   *
   * <code>repeated string metadata_context_namespaces = 8;</code>
   * @param index The index of the element to return.
   * @return The metadataContextNamespaces at the given index.
   */
  java.lang.String getMetadataContextNamespaces(int index);
  /**
   * <pre>
   * Specifies a list of metadata namespaces whose values, if present, will be passed to the
   * ext_authz service as an opaque *protobuf::Struct*.
   * For example, if the *jwt_authn* filter is used and :ref:`payload_in_metadata
   * &lt;envoy_api_field_extensions.filters.http.jwt_authn.v3.JwtProvider.payload_in_metadata&gt;` is set,
   * then the following will pass the jwt payload to the authorization server.
   * .. code-block:: yaml
   *    metadata_context_namespaces:
   *    - envoy.filters.http.jwt_authn
   * </pre>
   *
   * <code>repeated string metadata_context_namespaces = 8;</code>
   * @param index The index of the value to return.
   * @return The bytes of the metadataContextNamespaces at the given index.
   */
  com.google.protobuf.ByteString
      getMetadataContextNamespacesBytes(int index);

  /**
   * <pre>
   * Specifies if the filter is enabled.
   * If :ref:`runtime_key &lt;envoy_api_field_config.core.v3.RuntimeFractionalPercent.runtime_key&gt;` is specified,
   * Envoy will lookup the runtime key to get the percentage of requests to filter.
   * If this field is not specified, the filter will be enabled for all requests.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFractionalPercent filter_enabled = 9;</code>
   * @return Whether the filterEnabled field is set.
   */
  boolean hasFilterEnabled();
  /**
   * <pre>
   * Specifies if the filter is enabled.
   * If :ref:`runtime_key &lt;envoy_api_field_config.core.v3.RuntimeFractionalPercent.runtime_key&gt;` is specified,
   * Envoy will lookup the runtime key to get the percentage of requests to filter.
   * If this field is not specified, the filter will be enabled for all requests.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFractionalPercent filter_enabled = 9;</code>
   * @return The filterEnabled.
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent getFilterEnabled();
  /**
   * <pre>
   * Specifies if the filter is enabled.
   * If :ref:`runtime_key &lt;envoy_api_field_config.core.v3.RuntimeFractionalPercent.runtime_key&gt;` is specified,
   * Envoy will lookup the runtime key to get the percentage of requests to filter.
   * If this field is not specified, the filter will be enabled for all requests.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFractionalPercent filter_enabled = 9;</code>
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercentOrBuilder getFilterEnabledOrBuilder();

  /**
   * <pre>
   * Specifies if the filter is enabled with metadata matcher.
   * If this field is not specified, the filter will be enabled for all requests.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.MetadataMatcher filter_enabled_metadata = 14;</code>
   * @return Whether the filterEnabledMetadata field is set.
   */
  boolean hasFilterEnabledMetadata();
  /**
   * <pre>
   * Specifies if the filter is enabled with metadata matcher.
   * If this field is not specified, the filter will be enabled for all requests.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.MetadataMatcher filter_enabled_metadata = 14;</code>
   * @return The filterEnabledMetadata.
   */
  io.envoyproxy.envoy.type.matcher.v3.MetadataMatcher getFilterEnabledMetadata();
  /**
   * <pre>
   * Specifies if the filter is enabled with metadata matcher.
   * If this field is not specified, the filter will be enabled for all requests.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.MetadataMatcher filter_enabled_metadata = 14;</code>
   */
  io.envoyproxy.envoy.type.matcher.v3.MetadataMatcherOrBuilder getFilterEnabledMetadataOrBuilder();

  /**
   * <pre>
   * Specifies whether to deny the requests, when the filter is disabled.
   * If :ref:`runtime_key &lt;envoy_api_field_config.core.v3.RuntimeFeatureFlag.runtime_key&gt;` is specified,
   * Envoy will lookup the runtime key to determine whether to deny request for
   * filter protected path at filter disabling. If filter is disabled in
   * typed_per_filter_config for the path, requests will not be denied.
   * If this field is not specified, all requests will be allowed when disabled.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFeatureFlag deny_at_disable = 11;</code>
   * @return Whether the denyAtDisable field is set.
   */
  boolean hasDenyAtDisable();
  /**
   * <pre>
   * Specifies whether to deny the requests, when the filter is disabled.
   * If :ref:`runtime_key &lt;envoy_api_field_config.core.v3.RuntimeFeatureFlag.runtime_key&gt;` is specified,
   * Envoy will lookup the runtime key to determine whether to deny request for
   * filter protected path at filter disabling. If filter is disabled in
   * typed_per_filter_config for the path, requests will not be denied.
   * If this field is not specified, all requests will be allowed when disabled.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFeatureFlag deny_at_disable = 11;</code>
   * @return The denyAtDisable.
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFeatureFlag getDenyAtDisable();
  /**
   * <pre>
   * Specifies whether to deny the requests, when the filter is disabled.
   * If :ref:`runtime_key &lt;envoy_api_field_config.core.v3.RuntimeFeatureFlag.runtime_key&gt;` is specified,
   * Envoy will lookup the runtime key to determine whether to deny request for
   * filter protected path at filter disabling. If filter is disabled in
   * typed_per_filter_config for the path, requests will not be denied.
   * If this field is not specified, all requests will be allowed when disabled.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFeatureFlag deny_at_disable = 11;</code>
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFeatureFlagOrBuilder getDenyAtDisableOrBuilder();

  /**
   * <pre>
   * Specifies if the peer certificate is sent to the external service.
   * When this field is true, Envoy will include the peer X.509 certificate, if available, in the
   * :ref:`certificate&lt;envoy_api_field_service.auth.v3.AttributeContext.Peer.certificate&gt;`.
   * </pre>
   *
   * <code>bool include_peer_certificate = 10;</code>
   * @return The includePeerCertificate.
   */
  boolean getIncludePeerCertificate();

  /**
   * <pre>
   * Optional additional prefix to use when emitting statistics. This allows to distinguish
   * emitted statistics between configured *ext_authz* filters in an HTTP filter chain. For example:
   * .. code-block:: yaml
   *   http_filters:
   *     - name: envoy.filters.http.ext_authz
   *       typed_config:
   *         "&#64;type": type.googleapis.com/envoy.extensions.filters.http.ext_authz.v3.ExtAuthz
   *         stat_prefix: waf # This emits ext_authz.waf.ok, ext_authz.waf.denied, etc.
   *     - name: envoy.filters.http.ext_authz
   *       typed_config:
   *         "&#64;type": type.googleapis.com/envoy.extensions.filters.http.ext_authz.v3.ExtAuthz
   *         stat_prefix: blocker # This emits ext_authz.blocker.ok, ext_authz.blocker.denied, etc.
   * </pre>
   *
   * <code>string stat_prefix = 13;</code>
   * @return The statPrefix.
   */
  java.lang.String getStatPrefix();
  /**
   * <pre>
   * Optional additional prefix to use when emitting statistics. This allows to distinguish
   * emitted statistics between configured *ext_authz* filters in an HTTP filter chain. For example:
   * .. code-block:: yaml
   *   http_filters:
   *     - name: envoy.filters.http.ext_authz
   *       typed_config:
   *         "&#64;type": type.googleapis.com/envoy.extensions.filters.http.ext_authz.v3.ExtAuthz
   *         stat_prefix: waf # This emits ext_authz.waf.ok, ext_authz.waf.denied, etc.
   *     - name: envoy.filters.http.ext_authz
   *       typed_config:
   *         "&#64;type": type.googleapis.com/envoy.extensions.filters.http.ext_authz.v3.ExtAuthz
   *         stat_prefix: blocker # This emits ext_authz.blocker.ok, ext_authz.blocker.denied, etc.
   * </pre>
   *
   * <code>string stat_prefix = 13;</code>
   * @return The bytes for statPrefix.
   */
  com.google.protobuf.ByteString
      getStatPrefixBytes();

  public io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3.ExtAuthz.ServicesCase getServicesCase();
}