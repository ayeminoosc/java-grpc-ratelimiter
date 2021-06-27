// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/metrics/v3/stats.proto

package io.envoyproxy.envoy.config.metrics.v3;

public interface StatsdSinkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.metrics.v3.StatsdSink)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The UDP address of a running `statsd &lt;https://github.com/etsy/statsd&gt;`_
   * compliant listener. If specified, statistics will be flushed to this
   * address.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address address = 1;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <pre>
   * The UDP address of a running `statsd &lt;https://github.com/etsy/statsd&gt;`_
   * compliant listener. If specified, statistics will be flushed to this
   * address.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address address = 1;</code>
   * @return The address.
   */
  io.envoyproxy.envoy.config.core.v3.Address getAddress();
  /**
   * <pre>
   * The UDP address of a running `statsd &lt;https://github.com/etsy/statsd&gt;`_
   * compliant listener. If specified, statistics will be flushed to this
   * address.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address address = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.AddressOrBuilder getAddressOrBuilder();

  /**
   * <pre>
   * The name of a cluster that is running a TCP `statsd
   * &lt;https://github.com/etsy/statsd&gt;`_ compliant listener. If specified,
   * Envoy will connect to this cluster to flush statistics.
   * </pre>
   *
   * <code>string tcp_cluster_name = 2;</code>
   * @return Whether the tcpClusterName field is set.
   */
  boolean hasTcpClusterName();
  /**
   * <pre>
   * The name of a cluster that is running a TCP `statsd
   * &lt;https://github.com/etsy/statsd&gt;`_ compliant listener. If specified,
   * Envoy will connect to this cluster to flush statistics.
   * </pre>
   *
   * <code>string tcp_cluster_name = 2;</code>
   * @return The tcpClusterName.
   */
  java.lang.String getTcpClusterName();
  /**
   * <pre>
   * The name of a cluster that is running a TCP `statsd
   * &lt;https://github.com/etsy/statsd&gt;`_ compliant listener. If specified,
   * Envoy will connect to this cluster to flush statistics.
   * </pre>
   *
   * <code>string tcp_cluster_name = 2;</code>
   * @return The bytes for tcpClusterName.
   */
  com.google.protobuf.ByteString
      getTcpClusterNameBytes();

  /**
   * <pre>
   * Optional custom prefix for StatsdSink. If
   * specified, this will override the default prefix.
   * For example:
   * .. code-block:: json
   *   {
   *     "prefix" : "envoy-prod"
   *   }
   * will change emitted stats to
   * .. code-block:: cpp
   *   envoy-prod.test_counter:1|c
   *   envoy-prod.test_timer:5|ms
   * Note that the default prefix, "envoy", will be used if a prefix is not
   * specified.
   * Stats with default prefix:
   * .. code-block:: cpp
   *   envoy.test_counter:1|c
   *   envoy.test_timer:5|ms
   * </pre>
   *
   * <code>string prefix = 3;</code>
   * @return The prefix.
   */
  java.lang.String getPrefix();
  /**
   * <pre>
   * Optional custom prefix for StatsdSink. If
   * specified, this will override the default prefix.
   * For example:
   * .. code-block:: json
   *   {
   *     "prefix" : "envoy-prod"
   *   }
   * will change emitted stats to
   * .. code-block:: cpp
   *   envoy-prod.test_counter:1|c
   *   envoy-prod.test_timer:5|ms
   * Note that the default prefix, "envoy", will be used if a prefix is not
   * specified.
   * Stats with default prefix:
   * .. code-block:: cpp
   *   envoy.test_counter:1|c
   *   envoy.test_timer:5|ms
   * </pre>
   *
   * <code>string prefix = 3;</code>
   * @return The bytes for prefix.
   */
  com.google.protobuf.ByteString
      getPrefixBytes();

  public io.envoyproxy.envoy.config.metrics.v3.StatsdSink.StatsdSpecifierCase getStatsdSpecifierCase();
}
