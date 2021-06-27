// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/dubbo_proxy/v3/dubbo_proxy.proto

package io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3;

public interface DubboProxyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.network.dubbo_proxy.v3.DubboProxy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The human readable prefix to use when emitting statistics.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The statPrefix.
   */
  java.lang.String getStatPrefix();
  /**
   * <pre>
   * The human readable prefix to use when emitting statistics.
   * </pre>
   *
   * <code>string stat_prefix = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for statPrefix.
   */
  com.google.protobuf.ByteString
      getStatPrefixBytes();

  /**
   * <pre>
   * Configure the protocol used.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.ProtocolType protocol_type = 2 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for protocolType.
   */
  int getProtocolTypeValue();
  /**
   * <pre>
   * Configure the protocol used.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.ProtocolType protocol_type = 2 [(.validate.rules) = { ... }</code>
   * @return The protocolType.
   */
  io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.ProtocolType getProtocolType();

  /**
   * <pre>
   * Configure the serialization protocol used.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.SerializationType serialization_type = 3 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for serializationType.
   */
  int getSerializationTypeValue();
  /**
   * <pre>
   * Configure the serialization protocol used.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.dubbo_proxy.v3.SerializationType serialization_type = 3 [(.validate.rules) = { ... }</code>
   * @return The serializationType.
   */
  io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.SerializationType getSerializationType();

  /**
   * <pre>
   * The route table for the connection manager is static and is specified in this property.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
   */
  java.util.List<io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration> 
      getRouteConfigList();
  /**
   * <pre>
   * The route table for the connection manager is static and is specified in this property.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration getRouteConfig(int index);
  /**
   * <pre>
   * The route table for the connection manager is static and is specified in this property.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
   */
  int getRouteConfigCount();
  /**
   * <pre>
   * The route table for the connection manager is static and is specified in this property.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfigurationOrBuilder> 
      getRouteConfigOrBuilderList();
  /**
   * <pre>
   * The route table for the connection manager is static and is specified in this property.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfiguration route_config = 4;</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.RouteConfigurationOrBuilder getRouteConfigOrBuilder(
      int index);

  /**
   * <pre>
   * A list of individual Dubbo filters that make up the filter chain for requests made to the
   * Dubbo proxy. Order matters as the filters are processed sequentially. For backwards
   * compatibility, if no dubbo_filters are specified, a default Dubbo router filter
   * (`envoy.filters.dubbo.router`) is used.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.DubboFilter dubbo_filters = 5;</code>
   */
  java.util.List<io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.DubboFilter> 
      getDubboFiltersList();
  /**
   * <pre>
   * A list of individual Dubbo filters that make up the filter chain for requests made to the
   * Dubbo proxy. Order matters as the filters are processed sequentially. For backwards
   * compatibility, if no dubbo_filters are specified, a default Dubbo router filter
   * (`envoy.filters.dubbo.router`) is used.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.DubboFilter dubbo_filters = 5;</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.DubboFilter getDubboFilters(int index);
  /**
   * <pre>
   * A list of individual Dubbo filters that make up the filter chain for requests made to the
   * Dubbo proxy. Order matters as the filters are processed sequentially. For backwards
   * compatibility, if no dubbo_filters are specified, a default Dubbo router filter
   * (`envoy.filters.dubbo.router`) is used.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.DubboFilter dubbo_filters = 5;</code>
   */
  int getDubboFiltersCount();
  /**
   * <pre>
   * A list of individual Dubbo filters that make up the filter chain for requests made to the
   * Dubbo proxy. Order matters as the filters are processed sequentially. For backwards
   * compatibility, if no dubbo_filters are specified, a default Dubbo router filter
   * (`envoy.filters.dubbo.router`) is used.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.DubboFilter dubbo_filters = 5;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.DubboFilterOrBuilder> 
      getDubboFiltersOrBuilderList();
  /**
   * <pre>
   * A list of individual Dubbo filters that make up the filter chain for requests made to the
   * Dubbo proxy. Order matters as the filters are processed sequentially. For backwards
   * compatibility, if no dubbo_filters are specified, a default Dubbo router filter
   * (`envoy.filters.dubbo.router`) is used.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.network.dubbo_proxy.v3.DubboFilter dubbo_filters = 5;</code>
   */
  io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.DubboFilterOrBuilder getDubboFiltersOrBuilder(
      int index);
}
