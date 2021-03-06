// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/auth/v3/external_auth.proto

package io.envoyproxy.envoy.service.auth.v3;

public interface CheckResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.auth.v3.CheckResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Status `OK` allows the request. Any other status indicates the request should be denied.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Status `OK` allows the request. Any other status indicates the request should be denied.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   * <pre>
   * Status `OK` allows the request. Any other status indicates the request should be denied.
   * </pre>
   *
   * <code>.google.rpc.Status status = 1;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * Supplies http attributes for a denied response.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.DeniedHttpResponse denied_response = 2;</code>
   * @return Whether the deniedResponse field is set.
   */
  boolean hasDeniedResponse();
  /**
   * <pre>
   * Supplies http attributes for a denied response.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.DeniedHttpResponse denied_response = 2;</code>
   * @return The deniedResponse.
   */
  io.envoyproxy.envoy.service.auth.v3.DeniedHttpResponse getDeniedResponse();
  /**
   * <pre>
   * Supplies http attributes for a denied response.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.DeniedHttpResponse denied_response = 2;</code>
   */
  io.envoyproxy.envoy.service.auth.v3.DeniedHttpResponseOrBuilder getDeniedResponseOrBuilder();

  /**
   * <pre>
   * Supplies http attributes for an ok response.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.OkHttpResponse ok_response = 3;</code>
   * @return Whether the okResponse field is set.
   */
  boolean hasOkResponse();
  /**
   * <pre>
   * Supplies http attributes for an ok response.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.OkHttpResponse ok_response = 3;</code>
   * @return The okResponse.
   */
  io.envoyproxy.envoy.service.auth.v3.OkHttpResponse getOkResponse();
  /**
   * <pre>
   * Supplies http attributes for an ok response.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.OkHttpResponse ok_response = 3;</code>
   */
  io.envoyproxy.envoy.service.auth.v3.OkHttpResponseOrBuilder getOkResponseOrBuilder();

  /**
   * <pre>
   * Optional response metadata that will be emitted as dynamic metadata to be consumed by the next
   * filter. This metadata lives in a namespace specified by the canonical name of extension filter
   * that requires it:
   * - :ref:`envoy.filters.http.ext_authz &lt;config_http_filters_ext_authz_dynamic_metadata&gt;` for HTTP filter.
   * - :ref:`envoy.filters.network.ext_authz &lt;config_network_filters_ext_authz_dynamic_metadata&gt;` for network filter.
   * </pre>
   *
   * <code>.google.protobuf.Struct dynamic_metadata = 4;</code>
   * @return Whether the dynamicMetadata field is set.
   */
  boolean hasDynamicMetadata();
  /**
   * <pre>
   * Optional response metadata that will be emitted as dynamic metadata to be consumed by the next
   * filter. This metadata lives in a namespace specified by the canonical name of extension filter
   * that requires it:
   * - :ref:`envoy.filters.http.ext_authz &lt;config_http_filters_ext_authz_dynamic_metadata&gt;` for HTTP filter.
   * - :ref:`envoy.filters.network.ext_authz &lt;config_network_filters_ext_authz_dynamic_metadata&gt;` for network filter.
   * </pre>
   *
   * <code>.google.protobuf.Struct dynamic_metadata = 4;</code>
   * @return The dynamicMetadata.
   */
  com.google.protobuf.Struct getDynamicMetadata();
  /**
   * <pre>
   * Optional response metadata that will be emitted as dynamic metadata to be consumed by the next
   * filter. This metadata lives in a namespace specified by the canonical name of extension filter
   * that requires it:
   * - :ref:`envoy.filters.http.ext_authz &lt;config_http_filters_ext_authz_dynamic_metadata&gt;` for HTTP filter.
   * - :ref:`envoy.filters.network.ext_authz &lt;config_network_filters_ext_authz_dynamic_metadata&gt;` for network filter.
   * </pre>
   *
   * <code>.google.protobuf.Struct dynamic_metadata = 4;</code>
   */
  com.google.protobuf.StructOrBuilder getDynamicMetadataOrBuilder();

  public io.envoyproxy.envoy.service.auth.v3.CheckResponse.HttpResponseCase getHttpResponseCase();
}
