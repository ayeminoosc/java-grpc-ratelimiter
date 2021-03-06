// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/thrift_proxy/v3/route.proto

package io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3;

public interface RouteActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.network.thrift_proxy.v3.RouteAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates a single upstream cluster to which the request should be routed
   * to.
   * </pre>
   *
   * <code>string cluster = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the cluster field is set.
   */
  boolean hasCluster();
  /**
   * <pre>
   * Indicates a single upstream cluster to which the request should be routed
   * to.
   * </pre>
   *
   * <code>string cluster = 1 [(.validate.rules) = { ... }</code>
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   * <pre>
   * Indicates a single upstream cluster to which the request should be routed
   * to.
   * </pre>
   *
   * <code>string cluster = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString
      getClusterBytes();

  /**
   * <pre>
   * Multiple upstream clusters can be specified for a given route. The
   * request is routed to one of the upstream clusters based on weights
   * assigned to each cluster.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.thrift_proxy.v3.WeightedCluster weighted_clusters = 2;</code>
   * @return Whether the weightedClusters field is set.
   */
  boolean hasWeightedClusters();
  /**
   * <pre>
   * Multiple upstream clusters can be specified for a given route. The
   * request is routed to one of the upstream clusters based on weights
   * assigned to each cluster.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.thrift_proxy.v3.WeightedCluster weighted_clusters = 2;</code>
   * @return The weightedClusters.
   */
  io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.WeightedCluster getWeightedClusters();
  /**
   * <pre>
   * Multiple upstream clusters can be specified for a given route. The
   * request is routed to one of the upstream clusters based on weights
   * assigned to each cluster.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.thrift_proxy.v3.WeightedCluster weighted_clusters = 2;</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.WeightedClusterOrBuilder getWeightedClustersOrBuilder();

  /**
   * <pre>
   * Envoy will determine the cluster to route to by reading the value of the
   * Thrift header named by cluster_header from the request headers. If the
   * header is not found or the referenced cluster does not exist Envoy will
   * respond with an unknown method exception or an internal error exception,
   * respectively.
   * </pre>
   *
   * <code>string cluster_header = 6 [(.validate.rules) = { ... }</code>
   * @return Whether the clusterHeader field is set.
   */
  boolean hasClusterHeader();
  /**
   * <pre>
   * Envoy will determine the cluster to route to by reading the value of the
   * Thrift header named by cluster_header from the request headers. If the
   * header is not found or the referenced cluster does not exist Envoy will
   * respond with an unknown method exception or an internal error exception,
   * respectively.
   * </pre>
   *
   * <code>string cluster_header = 6 [(.validate.rules) = { ... }</code>
   * @return The clusterHeader.
   */
  java.lang.String getClusterHeader();
  /**
   * <pre>
   * Envoy will determine the cluster to route to by reading the value of the
   * Thrift header named by cluster_header from the request headers. If the
   * header is not found or the referenced cluster does not exist Envoy will
   * respond with an unknown method exception or an internal error exception,
   * respectively.
   * </pre>
   *
   * <code>string cluster_header = 6 [(.validate.rules) = { ... }</code>
   * @return The bytes for clusterHeader.
   */
  com.google.protobuf.ByteString
      getClusterHeaderBytes();

  /**
   * <pre>
   * Optional endpoint metadata match criteria used by the subset load balancer. Only endpoints in
   * the upstream cluster with metadata matching what is set in this field will be considered.
   * Note that this will be merged with what's provided in :ref:`WeightedCluster.metadata_match
   * &lt;envoy_api_field_extensions.filters.network.thrift_proxy.v3.WeightedCluster.ClusterWeight.metadata_match&gt;`,
   * with values there taking precedence. Keys and values should be provided under the "envoy.lb"
   * metadata key.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata_match = 3;</code>
   * @return Whether the metadataMatch field is set.
   */
  boolean hasMetadataMatch();
  /**
   * <pre>
   * Optional endpoint metadata match criteria used by the subset load balancer. Only endpoints in
   * the upstream cluster with metadata matching what is set in this field will be considered.
   * Note that this will be merged with what's provided in :ref:`WeightedCluster.metadata_match
   * &lt;envoy_api_field_extensions.filters.network.thrift_proxy.v3.WeightedCluster.ClusterWeight.metadata_match&gt;`,
   * with values there taking precedence. Keys and values should be provided under the "envoy.lb"
   * metadata key.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata_match = 3;</code>
   * @return The metadataMatch.
   */
  io.envoyproxy.envoy.config.core.v3.Metadata getMetadataMatch();
  /**
   * <pre>
   * Optional endpoint metadata match criteria used by the subset load balancer. Only endpoints in
   * the upstream cluster with metadata matching what is set in this field will be considered.
   * Note that this will be merged with what's provided in :ref:`WeightedCluster.metadata_match
   * &lt;envoy_api_field_extensions.filters.network.thrift_proxy.v3.WeightedCluster.ClusterWeight.metadata_match&gt;`,
   * with values there taking precedence. Keys and values should be provided under the "envoy.lb"
   * metadata key.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata_match = 3;</code>
   */
  io.envoyproxy.envoy.config.core.v3.MetadataOrBuilder getMetadataMatchOrBuilder();

  /**
   * <pre>
   * Specifies a set of rate limit configurations that could be applied to the route.
   * N.B. Thrift service or method name matching can be achieved by specifying a RequestHeaders
   * action with the header name ":method-name".
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.RateLimit rate_limits = 4;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.route.v3.RateLimit> 
      getRateLimitsList();
  /**
   * <pre>
   * Specifies a set of rate limit configurations that could be applied to the route.
   * N.B. Thrift service or method name matching can be achieved by specifying a RequestHeaders
   * action with the header name ":method-name".
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.RateLimit rate_limits = 4;</code>
   */
  io.envoyproxy.envoy.config.route.v3.RateLimit getRateLimits(int index);
  /**
   * <pre>
   * Specifies a set of rate limit configurations that could be applied to the route.
   * N.B. Thrift service or method name matching can be achieved by specifying a RequestHeaders
   * action with the header name ":method-name".
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.RateLimit rate_limits = 4;</code>
   */
  int getRateLimitsCount();
  /**
   * <pre>
   * Specifies a set of rate limit configurations that could be applied to the route.
   * N.B. Thrift service or method name matching can be achieved by specifying a RequestHeaders
   * action with the header name ":method-name".
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.RateLimit rate_limits = 4;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.route.v3.RateLimitOrBuilder> 
      getRateLimitsOrBuilderList();
  /**
   * <pre>
   * Specifies a set of rate limit configurations that could be applied to the route.
   * N.B. Thrift service or method name matching can be achieved by specifying a RequestHeaders
   * action with the header name ":method-name".
   * </pre>
   *
   * <code>repeated .envoy.config.route.v3.RateLimit rate_limits = 4;</code>
   */
  io.envoyproxy.envoy.config.route.v3.RateLimitOrBuilder getRateLimitsOrBuilder(
      int index);

  /**
   * <pre>
   * Strip the service prefix from the method name, if there's a prefix. For
   * example, the method call Service:method would end up being just method.
   * </pre>
   *
   * <code>bool strip_service_name = 5;</code>
   * @return The stripServiceName.
   */
  boolean getStripServiceName();

  public io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.RouteAction.ClusterSpecifierCase getClusterSpecifierCase();
}
