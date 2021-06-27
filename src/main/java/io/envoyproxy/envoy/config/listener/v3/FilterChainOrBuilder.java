// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/listener/v3/listener_components.proto

package io.envoyproxy.envoy.config.listener.v3;

public interface FilterChainOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.listener.v3.FilterChain)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The criteria to use when matching a connection to this filter chain.
   * </pre>
   *
   * <code>.envoy.config.listener.v3.FilterChainMatch filter_chain_match = 1;</code>
   * @return Whether the filterChainMatch field is set.
   */
  boolean hasFilterChainMatch();
  /**
   * <pre>
   * The criteria to use when matching a connection to this filter chain.
   * </pre>
   *
   * <code>.envoy.config.listener.v3.FilterChainMatch filter_chain_match = 1;</code>
   * @return The filterChainMatch.
   */
  io.envoyproxy.envoy.config.listener.v3.FilterChainMatch getFilterChainMatch();
  /**
   * <pre>
   * The criteria to use when matching a connection to this filter chain.
   * </pre>
   *
   * <code>.envoy.config.listener.v3.FilterChainMatch filter_chain_match = 1;</code>
   */
  io.envoyproxy.envoy.config.listener.v3.FilterChainMatchOrBuilder getFilterChainMatchOrBuilder();

  /**
   * <pre>
   * A list of individual network filters that make up the filter chain for
   * connections established with the listener. Order matters as the filters are
   * processed sequentially as connection events happen. Note: If the filter
   * list is empty, the connection will close by default.
   * </pre>
   *
   * <code>repeated .envoy.config.listener.v3.Filter filters = 3;</code>
   */
  java.util.List<io.envoyproxy.envoy.config.listener.v3.Filter> 
      getFiltersList();
  /**
   * <pre>
   * A list of individual network filters that make up the filter chain for
   * connections established with the listener. Order matters as the filters are
   * processed sequentially as connection events happen. Note: If the filter
   * list is empty, the connection will close by default.
   * </pre>
   *
   * <code>repeated .envoy.config.listener.v3.Filter filters = 3;</code>
   */
  io.envoyproxy.envoy.config.listener.v3.Filter getFilters(int index);
  /**
   * <pre>
   * A list of individual network filters that make up the filter chain for
   * connections established with the listener. Order matters as the filters are
   * processed sequentially as connection events happen. Note: If the filter
   * list is empty, the connection will close by default.
   * </pre>
   *
   * <code>repeated .envoy.config.listener.v3.Filter filters = 3;</code>
   */
  int getFiltersCount();
  /**
   * <pre>
   * A list of individual network filters that make up the filter chain for
   * connections established with the listener. Order matters as the filters are
   * processed sequentially as connection events happen. Note: If the filter
   * list is empty, the connection will close by default.
   * </pre>
   *
   * <code>repeated .envoy.config.listener.v3.Filter filters = 3;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.config.listener.v3.FilterOrBuilder> 
      getFiltersOrBuilderList();
  /**
   * <pre>
   * A list of individual network filters that make up the filter chain for
   * connections established with the listener. Order matters as the filters are
   * processed sequentially as connection events happen. Note: If the filter
   * list is empty, the connection will close by default.
   * </pre>
   *
   * <code>repeated .envoy.config.listener.v3.Filter filters = 3;</code>
   */
  io.envoyproxy.envoy.config.listener.v3.FilterOrBuilder getFiltersOrBuilder(
      int index);

  /**
   * <pre>
   * Whether the listener should expect a PROXY protocol V1 header on new
   * connections. If this option is enabled, the listener will assume that that
   * remote address of the connection is the one specified in the header. Some
   * load balancers including the AWS ELB support this option. If the option is
   * absent or set to false, Envoy will use the physical peer address of the
   * connection as the remote address.
   * This field is deprecated. Add a
   * :ref:`PROXY protocol listener filter &lt;config_listener_filters_proxy_protocol&gt;`
   * explicitly instead.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue use_proxy_proto = 4 [deprecated = true];</code>
   * @return Whether the useProxyProto field is set.
   */
  @java.lang.Deprecated boolean hasUseProxyProto();
  /**
   * <pre>
   * Whether the listener should expect a PROXY protocol V1 header on new
   * connections. If this option is enabled, the listener will assume that that
   * remote address of the connection is the one specified in the header. Some
   * load balancers including the AWS ELB support this option. If the option is
   * absent or set to false, Envoy will use the physical peer address of the
   * connection as the remote address.
   * This field is deprecated. Add a
   * :ref:`PROXY protocol listener filter &lt;config_listener_filters_proxy_protocol&gt;`
   * explicitly instead.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue use_proxy_proto = 4 [deprecated = true];</code>
   * @return The useProxyProto.
   */
  @java.lang.Deprecated com.google.protobuf.BoolValue getUseProxyProto();
  /**
   * <pre>
   * Whether the listener should expect a PROXY protocol V1 header on new
   * connections. If this option is enabled, the listener will assume that that
   * remote address of the connection is the one specified in the header. Some
   * load balancers including the AWS ELB support this option. If the option is
   * absent or set to false, Envoy will use the physical peer address of the
   * connection as the remote address.
   * This field is deprecated. Add a
   * :ref:`PROXY protocol listener filter &lt;config_listener_filters_proxy_protocol&gt;`
   * explicitly instead.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue use_proxy_proto = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.BoolValueOrBuilder getUseProxyProtoOrBuilder();

  /**
   * <pre>
   * [#not-implemented-hide:] filter chain metadata.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata = 5;</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * [#not-implemented-hide:] filter chain metadata.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata = 5;</code>
   * @return The metadata.
   */
  io.envoyproxy.envoy.config.core.v3.Metadata getMetadata();
  /**
   * <pre>
   * [#not-implemented-hide:] filter chain metadata.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata = 5;</code>
   */
  io.envoyproxy.envoy.config.core.v3.MetadataOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Optional custom transport socket implementation to use for downstream connections.
   * To setup TLS, set a transport socket with name `tls` and
   * :ref:`DownstreamTlsContext &lt;envoy_api_msg_extensions.transport_sockets.tls.v3.DownstreamTlsContext&gt;` in the `typed_config`.
   * If no transport socket configuration is specified, new connections
   * will be set up with plaintext.
   * </pre>
   *
   * <code>.envoy.config.core.v3.TransportSocket transport_socket = 6;</code>
   * @return Whether the transportSocket field is set.
   */
  boolean hasTransportSocket();
  /**
   * <pre>
   * Optional custom transport socket implementation to use for downstream connections.
   * To setup TLS, set a transport socket with name `tls` and
   * :ref:`DownstreamTlsContext &lt;envoy_api_msg_extensions.transport_sockets.tls.v3.DownstreamTlsContext&gt;` in the `typed_config`.
   * If no transport socket configuration is specified, new connections
   * will be set up with plaintext.
   * </pre>
   *
   * <code>.envoy.config.core.v3.TransportSocket transport_socket = 6;</code>
   * @return The transportSocket.
   */
  io.envoyproxy.envoy.config.core.v3.TransportSocket getTransportSocket();
  /**
   * <pre>
   * Optional custom transport socket implementation to use for downstream connections.
   * To setup TLS, set a transport socket with name `tls` and
   * :ref:`DownstreamTlsContext &lt;envoy_api_msg_extensions.transport_sockets.tls.v3.DownstreamTlsContext&gt;` in the `typed_config`.
   * If no transport socket configuration is specified, new connections
   * will be set up with plaintext.
   * </pre>
   *
   * <code>.envoy.config.core.v3.TransportSocket transport_socket = 6;</code>
   */
  io.envoyproxy.envoy.config.core.v3.TransportSocketOrBuilder getTransportSocketOrBuilder();

  /**
   * <pre>
   * If present and nonzero, the amount of time to allow incoming connections to complete any
   * transport socket negotiations. If this expires before the transport reports connection
   * establishment, the connection is summarily closed.
   * </pre>
   *
   * <code>.google.protobuf.Duration transport_socket_connect_timeout = 9;</code>
   * @return Whether the transportSocketConnectTimeout field is set.
   */
  boolean hasTransportSocketConnectTimeout();
  /**
   * <pre>
   * If present and nonzero, the amount of time to allow incoming connections to complete any
   * transport socket negotiations. If this expires before the transport reports connection
   * establishment, the connection is summarily closed.
   * </pre>
   *
   * <code>.google.protobuf.Duration transport_socket_connect_timeout = 9;</code>
   * @return The transportSocketConnectTimeout.
   */
  com.google.protobuf.Duration getTransportSocketConnectTimeout();
  /**
   * <pre>
   * If present and nonzero, the amount of time to allow incoming connections to complete any
   * transport socket negotiations. If this expires before the transport reports connection
   * establishment, the connection is summarily closed.
   * </pre>
   *
   * <code>.google.protobuf.Duration transport_socket_connect_timeout = 9;</code>
   */
  com.google.protobuf.DurationOrBuilder getTransportSocketConnectTimeoutOrBuilder();

  /**
   * <pre>
   * [#not-implemented-hide:] The unique name (or empty) by which this filter chain is known. If no
   * name is provided, Envoy will allocate an internal UUID for the filter chain. If the filter
   * chain is to be dynamically updated or removed via FCDS a unique name must be provided.
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * [#not-implemented-hide:] The unique name (or empty) by which this filter chain is known. If no
   * name is provided, Envoy will allocate an internal UUID for the filter chain. If the filter
   * chain is to be dynamically updated or removed via FCDS a unique name must be provided.
   * </pre>
   *
   * <code>string name = 7;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * [#not-implemented-hide:] The configuration to specify whether the filter chain will be built on-demand.
   * If this field is not empty, the filter chain will be built on-demand.
   * Otherwise, the filter chain will be built normally and block listener warming.
   * </pre>
   *
   * <code>.envoy.config.listener.v3.FilterChain.OnDemandConfiguration on_demand_configuration = 8;</code>
   * @return Whether the onDemandConfiguration field is set.
   */
  boolean hasOnDemandConfiguration();
  /**
   * <pre>
   * [#not-implemented-hide:] The configuration to specify whether the filter chain will be built on-demand.
   * If this field is not empty, the filter chain will be built on-demand.
   * Otherwise, the filter chain will be built normally and block listener warming.
   * </pre>
   *
   * <code>.envoy.config.listener.v3.FilterChain.OnDemandConfiguration on_demand_configuration = 8;</code>
   * @return The onDemandConfiguration.
   */
  io.envoyproxy.envoy.config.listener.v3.FilterChain.OnDemandConfiguration getOnDemandConfiguration();
  /**
   * <pre>
   * [#not-implemented-hide:] The configuration to specify whether the filter chain will be built on-demand.
   * If this field is not empty, the filter chain will be built on-demand.
   * Otherwise, the filter chain will be built normally and block listener warming.
   * </pre>
   *
   * <code>.envoy.config.listener.v3.FilterChain.OnDemandConfiguration on_demand_configuration = 8;</code>
   */
  io.envoyproxy.envoy.config.listener.v3.FilterChain.OnDemandConfigurationOrBuilder getOnDemandConfigurationOrBuilder();
}
