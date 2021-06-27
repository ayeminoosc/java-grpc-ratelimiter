// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/admin/v3/clusters.proto

package io.envoyproxy.envoy.admin.v3;

public interface HostStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.admin.v3.HostStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Address of this host.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address address = 1;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <pre>
   * Address of this host.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address address = 1;</code>
   * @return The address.
   */
  io.envoyproxy.envoy.config.core.v3.Address getAddress();
  /**
   * <pre>
   * Address of this host.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Address address = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.AddressOrBuilder getAddressOrBuilder();

  /**
   * <pre>
   * List of stats specific to this host.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.SimpleMetric stats = 2;</code>
   */
  java.util.List<io.envoyproxy.envoy.admin.v3.SimpleMetric> 
      getStatsList();
  /**
   * <pre>
   * List of stats specific to this host.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.SimpleMetric stats = 2;</code>
   */
  io.envoyproxy.envoy.admin.v3.SimpleMetric getStats(int index);
  /**
   * <pre>
   * List of stats specific to this host.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.SimpleMetric stats = 2;</code>
   */
  int getStatsCount();
  /**
   * <pre>
   * List of stats specific to this host.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.SimpleMetric stats = 2;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.admin.v3.SimpleMetricOrBuilder> 
      getStatsOrBuilderList();
  /**
   * <pre>
   * List of stats specific to this host.
   * </pre>
   *
   * <code>repeated .envoy.admin.v3.SimpleMetric stats = 2;</code>
   */
  io.envoyproxy.envoy.admin.v3.SimpleMetricOrBuilder getStatsOrBuilder(
      int index);

  /**
   * <pre>
   * The host's current health status.
   * </pre>
   *
   * <code>.envoy.admin.v3.HostHealthStatus health_status = 3;</code>
   * @return Whether the healthStatus field is set.
   */
  boolean hasHealthStatus();
  /**
   * <pre>
   * The host's current health status.
   * </pre>
   *
   * <code>.envoy.admin.v3.HostHealthStatus health_status = 3;</code>
   * @return The healthStatus.
   */
  io.envoyproxy.envoy.admin.v3.HostHealthStatus getHealthStatus();
  /**
   * <pre>
   * The host's current health status.
   * </pre>
   *
   * <code>.envoy.admin.v3.HostHealthStatus health_status = 3;</code>
   */
  io.envoyproxy.envoy.admin.v3.HostHealthStatusOrBuilder getHealthStatusOrBuilder();

  /**
   * <pre>
   * Request success rate for this host over the last calculated interval.
   * If
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is *false*, all errors: externally and locally generated were used in success rate
   * calculation. If
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is *true*, only externally generated errors were used in success rate calculation.
   * See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;` documentation for
   * details.
   * Note: the message will not be present if host did not have enough request volume to calculate
   * success rate or the cluster did not have enough hosts to run through success rate outlier
   * ejection.
   * </pre>
   *
   * <code>.envoy.type.v3.Percent success_rate = 4;</code>
   * @return Whether the successRate field is set.
   */
  boolean hasSuccessRate();
  /**
   * <pre>
   * Request success rate for this host over the last calculated interval.
   * If
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is *false*, all errors: externally and locally generated were used in success rate
   * calculation. If
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is *true*, only externally generated errors were used in success rate calculation.
   * See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;` documentation for
   * details.
   * Note: the message will not be present if host did not have enough request volume to calculate
   * success rate or the cluster did not have enough hosts to run through success rate outlier
   * ejection.
   * </pre>
   *
   * <code>.envoy.type.v3.Percent success_rate = 4;</code>
   * @return The successRate.
   */
  io.envoyproxy.envoy.type.v3.Percent getSuccessRate();
  /**
   * <pre>
   * Request success rate for this host over the last calculated interval.
   * If
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is *false*, all errors: externally and locally generated were used in success rate
   * calculation. If
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is *true*, only externally generated errors were used in success rate calculation.
   * See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;` documentation for
   * details.
   * Note: the message will not be present if host did not have enough request volume to calculate
   * success rate or the cluster did not have enough hosts to run through success rate outlier
   * ejection.
   * </pre>
   *
   * <code>.envoy.type.v3.Percent success_rate = 4;</code>
   */
  io.envoyproxy.envoy.type.v3.PercentOrBuilder getSuccessRateOrBuilder();

  /**
   * <pre>
   * The host's weight. If not configured, the value defaults to 1.
   * </pre>
   *
   * <code>uint32 weight = 5;</code>
   * @return The weight.
   */
  int getWeight();

  /**
   * <pre>
   * The hostname of the host, if applicable.
   * </pre>
   *
   * <code>string hostname = 6;</code>
   * @return The hostname.
   */
  java.lang.String getHostname();
  /**
   * <pre>
   * The hostname of the host, if applicable.
   * </pre>
   *
   * <code>string hostname = 6;</code>
   * @return The bytes for hostname.
   */
  com.google.protobuf.ByteString
      getHostnameBytes();

  /**
   * <pre>
   * The host's priority. If not configured, the value defaults to 0 (highest priority).
   * </pre>
   *
   * <code>uint32 priority = 7;</code>
   * @return The priority.
   */
  int getPriority();

  /**
   * <pre>
   * Request success rate for this host over the last calculated
   * interval when only locally originated errors are taken into account and externally originated
   * errors were treated as success.
   * This field should be interpreted only when
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is *true*.
   * See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;` documentation for
   * details.
   * Note: the message will not be present if host did not have enough request volume to calculate
   * success rate or the cluster did not have enough hosts to run through success rate outlier
   * ejection.
   * </pre>
   *
   * <code>.envoy.type.v3.Percent local_origin_success_rate = 8;</code>
   * @return Whether the localOriginSuccessRate field is set.
   */
  boolean hasLocalOriginSuccessRate();
  /**
   * <pre>
   * Request success rate for this host over the last calculated
   * interval when only locally originated errors are taken into account and externally originated
   * errors were treated as success.
   * This field should be interpreted only when
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is *true*.
   * See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;` documentation for
   * details.
   * Note: the message will not be present if host did not have enough request volume to calculate
   * success rate or the cluster did not have enough hosts to run through success rate outlier
   * ejection.
   * </pre>
   *
   * <code>.envoy.type.v3.Percent local_origin_success_rate = 8;</code>
   * @return The localOriginSuccessRate.
   */
  io.envoyproxy.envoy.type.v3.Percent getLocalOriginSuccessRate();
  /**
   * <pre>
   * Request success rate for this host over the last calculated
   * interval when only locally originated errors are taken into account and externally originated
   * errors were treated as success.
   * This field should be interpreted only when
   * :ref:`outlier_detection.split_external_local_origin_errors&lt;envoy_api_field_config.cluster.v3.OutlierDetection.split_external_local_origin_errors&gt;`
   * is *true*.
   * See :ref:`Cluster outlier detection &lt;arch_overview_outlier_detection&gt;` documentation for
   * details.
   * Note: the message will not be present if host did not have enough request volume to calculate
   * success rate or the cluster did not have enough hosts to run through success rate outlier
   * ejection.
   * </pre>
   *
   * <code>.envoy.type.v3.Percent local_origin_success_rate = 8;</code>
   */
  io.envoyproxy.envoy.type.v3.PercentOrBuilder getLocalOriginSuccessRateOrBuilder();

  /**
   * <pre>
   * locality of the host.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Locality locality = 9;</code>
   * @return Whether the locality field is set.
   */
  boolean hasLocality();
  /**
   * <pre>
   * locality of the host.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Locality locality = 9;</code>
   * @return The locality.
   */
  io.envoyproxy.envoy.config.core.v3.Locality getLocality();
  /**
   * <pre>
   * locality of the host.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Locality locality = 9;</code>
   */
  io.envoyproxy.envoy.config.core.v3.LocalityOrBuilder getLocalityOrBuilder();
}
