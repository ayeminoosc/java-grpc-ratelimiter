// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/dynamic_forward_proxy/v3/dynamic_forward_proxy.proto

package io.envoyproxy.envoy.extensions.filters.http.dynamic_forward_proxy.v3;

public interface FilterConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.dynamic_forward_proxy.v3.FilterConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The DNS cache configuration that the filter will attach to. Note this configuration must
   * match that of associated :ref:`dynamic forward proxy cluster configuration
   * &lt;envoy_api_field_extensions.clusters.dynamic_forward_proxy.v3.ClusterConfig.dns_cache_config&gt;`.
   * </pre>
   *
   * <code>.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig dns_cache_config = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the dnsCacheConfig field is set.
   */
  boolean hasDnsCacheConfig();
  /**
   * <pre>
   * The DNS cache configuration that the filter will attach to. Note this configuration must
   * match that of associated :ref:`dynamic forward proxy cluster configuration
   * &lt;envoy_api_field_extensions.clusters.dynamic_forward_proxy.v3.ClusterConfig.dns_cache_config&gt;`.
   * </pre>
   *
   * <code>.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig dns_cache_config = 1 [(.validate.rules) = { ... }</code>
   * @return The dnsCacheConfig.
   */
  io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig getDnsCacheConfig();
  /**
   * <pre>
   * The DNS cache configuration that the filter will attach to. Note this configuration must
   * match that of associated :ref:`dynamic forward proxy cluster configuration
   * &lt;envoy_api_field_extensions.clusters.dynamic_forward_proxy.v3.ClusterConfig.dns_cache_config&gt;`.
   * </pre>
   *
   * <code>.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfig dns_cache_config = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.common.dynamic_forward_proxy.v3.DnsCacheConfigOrBuilder getDnsCacheConfigOrBuilder();
}
