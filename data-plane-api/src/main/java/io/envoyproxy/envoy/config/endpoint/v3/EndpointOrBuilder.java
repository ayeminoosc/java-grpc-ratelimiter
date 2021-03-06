// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/endpoint/v3/endpoint_components.proto

package io.envoyproxy.envoy.config.endpoint.v3;

public interface EndpointOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.endpoint.v3.Endpoint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The upstream host address.
   * .. attention::
   *   The form of host address depends on the given cluster type. For STATIC or EDS,
   *   it is expected to be a direct IP address (or something resolvable by the
   *   specified :ref:`resolver &lt;envoy_api_field_config.core.v3.SocketAddress.resolver_name&gt;`
   *   in the Address). For LOGICAL or STRICT DNS, it is expected to be hostname,
   *   and will be resolved via DNS.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address address = 1;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <pre>
   * The upstream host address.
   * .. attention::
   *   The form of host address depends on the given cluster type. For STATIC or EDS,
   *   it is expected to be a direct IP address (or something resolvable by the
   *   specified :ref:`resolver &lt;envoy_api_field_config.core.v3.SocketAddress.resolver_name&gt;`
   *   in the Address). For LOGICAL or STRICT DNS, it is expected to be hostname,
   *   and will be resolved via DNS.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address address = 1;</code>
   * @return The address.
   */
  io.envoyproxy.envoy.config.core.v3.Address getAddress();
  /**
   * <pre>
   * The upstream host address.
   * .. attention::
   *   The form of host address depends on the given cluster type. For STATIC or EDS,
   *   it is expected to be a direct IP address (or something resolvable by the
   *   specified :ref:`resolver &lt;envoy_api_field_config.core.v3.SocketAddress.resolver_name&gt;`
   *   in the Address). For LOGICAL or STRICT DNS, it is expected to be hostname,
   *   and will be resolved via DNS.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address address = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.AddressOrBuilder getAddressOrBuilder();

  /**
   * <pre>
   * The optional health check configuration is used as configuration for the
   * health checker to contact the health checked host.
   * .. attention::
   *   This takes into effect only for upstream clusters with
   *   :ref:`active health checking &lt;arch_overview_health_checking&gt;` enabled.
   * </pre>
   *
   * <code>.envoy.config.endpoint.v3.Endpoint.HealthCheckConfig health_check_config = 2;</code>
   * @return Whether the healthCheckConfig field is set.
   */
  boolean hasHealthCheckConfig();
  /**
   * <pre>
   * The optional health check configuration is used as configuration for the
   * health checker to contact the health checked host.
   * .. attention::
   *   This takes into effect only for upstream clusters with
   *   :ref:`active health checking &lt;arch_overview_health_checking&gt;` enabled.
   * </pre>
   *
   * <code>.envoy.config.endpoint.v3.Endpoint.HealthCheckConfig health_check_config = 2;</code>
   * @return The healthCheckConfig.
   */
  io.envoyproxy.envoy.config.endpoint.v3.Endpoint.HealthCheckConfig getHealthCheckConfig();
  /**
   * <pre>
   * The optional health check configuration is used as configuration for the
   * health checker to contact the health checked host.
   * .. attention::
   *   This takes into effect only for upstream clusters with
   *   :ref:`active health checking &lt;arch_overview_health_checking&gt;` enabled.
   * </pre>
   *
   * <code>.envoy.config.endpoint.v3.Endpoint.HealthCheckConfig health_check_config = 2;</code>
   */
  io.envoyproxy.envoy.config.endpoint.v3.Endpoint.HealthCheckConfigOrBuilder getHealthCheckConfigOrBuilder();

  /**
   * <pre>
   * The hostname associated with this endpoint. This hostname is not used for routing or address
   * resolution. If provided, it will be associated with the endpoint, and can be used for features
   * that require a hostname, like
   * :ref:`auto_host_rewrite &lt;envoy_api_field_config.route.v3.RouteAction.auto_host_rewrite&gt;`.
   * </pre>
   *
   * <code>string hostname = 3;</code>
   * @return The hostname.
   */
  java.lang.String getHostname();
  /**
   * <pre>
   * The hostname associated with this endpoint. This hostname is not used for routing or address
   * resolution. If provided, it will be associated with the endpoint, and can be used for features
   * that require a hostname, like
   * :ref:`auto_host_rewrite &lt;envoy_api_field_config.route.v3.RouteAction.auto_host_rewrite&gt;`.
   * </pre>
   *
   * <code>string hostname = 3;</code>
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString
      getHostnameBytes();
}
