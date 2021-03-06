// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/client_ssl_auth/v3/client_ssl_auth.proto

package io.envoyproxy.envoy.extensions.filters.network.client_ssl_auth.v3;

public interface ClientSSLAuthOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.network.client_ssl_auth.v3.ClientSSLAuth)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The :ref:`cluster manager &lt;arch_overview_cluster_manager&gt;` cluster that runs
   * the authentication service. The filter will connect to the service every 60s to fetch the list
   * of principals. The service must support the expected :ref:`REST API
   * &lt;config_network_filters_client_ssl_auth_rest_api&gt;`.
   * </pre>
   *
   * <code>string auth_api_cluster = 1 [(.validate.rules) = { ... }</code>
   * @return The authApiCluster.
   */
  java.lang.String getAuthApiCluster();
  /**
   * <pre>
   * The :ref:`cluster manager &lt;arch_overview_cluster_manager&gt;` cluster that runs
   * the authentication service. The filter will connect to the service every 60s to fetch the list
   * of principals. The service must support the expected :ref:`REST API
   * &lt;config_network_filters_client_ssl_auth_rest_api&gt;`.
   * </pre>
   *
   * <code>string auth_api_cluster = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for authApiCluster.
   */
  com.google.protobuf.ByteString
      getAuthApiClusterBytes();

  /**
   * <pre>
   * The prefix to use when emitting :ref:`statistics
   * &lt;config_network_filters_client_ssl_auth_stats&gt;`.
   * </pre>
   *
   * <code>string stat_prefix = 2 [(.validate.rules) = { ... }</code>
   * @return The statPrefix.
   */
  java.lang.String getStatPrefix();
  /**
   * <pre>
   * The prefix to use when emitting :ref:`statistics
   * &lt;config_network_filters_client_ssl_auth_stats&gt;`.
   * </pre>
   *
   * <code>string stat_prefix = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for statPrefix.
   */
  com.google.protobuf.ByteString
      getStatPrefixBytes();

  /**
   * <pre>
   * Time in milliseconds between principal refreshes from the
   * authentication service. Default is 60000 (60s). The actual fetch time
   * will be this value plus a random jittered value between
   * 0-refresh_delay_ms milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration refresh_delay = 3;</code>
   * @return Whether the refreshDelay field is set.
   */
  boolean hasRefreshDelay();
  /**
   * <pre>
   * Time in milliseconds between principal refreshes from the
   * authentication service. Default is 60000 (60s). The actual fetch time
   * will be this value plus a random jittered value between
   * 0-refresh_delay_ms milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration refresh_delay = 3;</code>
   * @return The refreshDelay.
   */
  com.google.protobuf.Duration getRefreshDelay();
  /**
   * <pre>
   * Time in milliseconds between principal refreshes from the
   * authentication service. Default is 60000 (60s). The actual fetch time
   * will be this value plus a random jittered value between
   * 0-refresh_delay_ms milliseconds.
   * </pre>
   *
   * <code>.google.protobuf.Duration refresh_delay = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getRefreshDelayOrBuilder();

  /**
   * <pre>
   * An optional list of IP address and subnet masks that should be white
   * listed for access by the filter. If no list is provided, there is no
   * IP allowlist.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.CidrRange ip_white_list = 4 [(.udpa.annotations.field_migrate) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.config.core.v3.CidrRange> 
      getIpWhiteListList();
  /**
   * <pre>
   * An optional list of IP address and subnet masks that should be white
   * listed for access by the filter. If no list is provided, there is no
   * IP allowlist.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.CidrRange ip_white_list = 4 [(.udpa.annotations.field_migrate) = { ... }</code>
   */
  io.envoyproxy.envoy.config.core.v3.CidrRange getIpWhiteList(int index);
  /**
   * <pre>
   * An optional list of IP address and subnet masks that should be white
   * listed for access by the filter. If no list is provided, there is no
   * IP allowlist.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.CidrRange ip_white_list = 4 [(.udpa.annotations.field_migrate) = { ... }</code>
   */
  int getIpWhiteListCount();
  /**
   * <pre>
   * An optional list of IP address and subnet masks that should be white
   * listed for access by the filter. If no list is provided, there is no
   * IP allowlist.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.CidrRange ip_white_list = 4 [(.udpa.annotations.field_migrate) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.core.v3.CidrRangeOrBuilder> 
      getIpWhiteListOrBuilderList();
  /**
   * <pre>
   * An optional list of IP address and subnet masks that should be white
   * listed for access by the filter. If no list is provided, there is no
   * IP allowlist.
   * </pre>
   *
   * <code>repeated .envoy.config.core.v3.CidrRange ip_white_list = 4 [(.udpa.annotations.field_migrate) = { ... }</code>
   */
  io.envoyproxy.envoy.config.core.v3.CidrRangeOrBuilder getIpWhiteListOrBuilder(
      int index);
}
