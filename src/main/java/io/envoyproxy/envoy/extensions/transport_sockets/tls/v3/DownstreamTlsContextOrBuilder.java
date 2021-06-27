// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/transport_sockets/tls/v3/tls.proto

package io.envoyproxy.envoy.extensions.transport_sockets.tls.v3;

public interface DownstreamTlsContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Common TLS context settings.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext common_tls_context = 1;</code>
   * @return Whether the commonTlsContext field is set.
   */
  boolean hasCommonTlsContext();
  /**
   * <pre>
   * Common TLS context settings.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext common_tls_context = 1;</code>
   * @return The commonTlsContext.
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext getCommonTlsContext();
  /**
   * <pre>
   * Common TLS context settings.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.CommonTlsContext common_tls_context = 1;</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.CommonTlsContextOrBuilder getCommonTlsContextOrBuilder();

  /**
   * <pre>
   * If specified, Envoy will reject connections without a valid client
   * certificate.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue require_client_certificate = 2;</code>
   * @return Whether the requireClientCertificate field is set.
   */
  boolean hasRequireClientCertificate();
  /**
   * <pre>
   * If specified, Envoy will reject connections without a valid client
   * certificate.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue require_client_certificate = 2;</code>
   * @return The requireClientCertificate.
   */
  com.google.protobuf.BoolValue getRequireClientCertificate();
  /**
   * <pre>
   * If specified, Envoy will reject connections without a valid client
   * certificate.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue require_client_certificate = 2;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getRequireClientCertificateOrBuilder();

  /**
   * <pre>
   * If specified, Envoy will reject connections without a valid and matching SNI.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.google.protobuf.BoolValue require_sni = 3;</code>
   * @return Whether the requireSni field is set.
   */
  boolean hasRequireSni();
  /**
   * <pre>
   * If specified, Envoy will reject connections without a valid and matching SNI.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.google.protobuf.BoolValue require_sni = 3;</code>
   * @return The requireSni.
   */
  com.google.protobuf.BoolValue getRequireSni();
  /**
   * <pre>
   * If specified, Envoy will reject connections without a valid and matching SNI.
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.google.protobuf.BoolValue require_sni = 3;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getRequireSniOrBuilder();

  /**
   * <pre>
   * TLS session ticket key settings.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.TlsSessionTicketKeys session_ticket_keys = 4;</code>
   * @return Whether the sessionTicketKeys field is set.
   */
  boolean hasSessionTicketKeys();
  /**
   * <pre>
   * TLS session ticket key settings.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.TlsSessionTicketKeys session_ticket_keys = 4;</code>
   * @return The sessionTicketKeys.
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsSessionTicketKeys getSessionTicketKeys();
  /**
   * <pre>
   * TLS session ticket key settings.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.TlsSessionTicketKeys session_ticket_keys = 4;</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.TlsSessionTicketKeysOrBuilder getSessionTicketKeysOrBuilder();

  /**
   * <pre>
   * Config for fetching TLS session ticket keys via SDS API.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig session_ticket_keys_sds_secret_config = 5;</code>
   * @return Whether the sessionTicketKeysSdsSecretConfig field is set.
   */
  boolean hasSessionTicketKeysSdsSecretConfig();
  /**
   * <pre>
   * Config for fetching TLS session ticket keys via SDS API.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig session_ticket_keys_sds_secret_config = 5;</code>
   * @return The sessionTicketKeysSdsSecretConfig.
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig getSessionTicketKeysSdsSecretConfig();
  /**
   * <pre>
   * Config for fetching TLS session ticket keys via SDS API.
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfig session_ticket_keys_sds_secret_config = 5;</code>
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.SdsSecretConfigOrBuilder getSessionTicketKeysSdsSecretConfigOrBuilder();

  /**
   * <pre>
   * Config for controlling stateless TLS session resumption: setting this to true will cause the TLS
   * server to not issue TLS session tickets for the purposes of stateless TLS session resumption.
   * If set to false, the TLS server will issue TLS session tickets and encrypt/decrypt them using
   * the keys specified through either :ref:`session_ticket_keys &lt;envoy_api_field_extensions.transport_sockets.tls.v3.DownstreamTlsContext.session_ticket_keys&gt;`
   * or :ref:`session_ticket_keys_sds_secret_config &lt;envoy_api_field_extensions.transport_sockets.tls.v3.DownstreamTlsContext.session_ticket_keys_sds_secret_config&gt;`.
   * If this config is set to false and no keys are explicitly configured, the TLS server will issue
   * TLS session tickets and encrypt/decrypt them using an internally-generated and managed key, with the
   * implication that sessions cannot be resumed across hot restarts or on different hosts.
   * </pre>
   *
   * <code>bool disable_stateless_session_resumption = 7;</code>
   * @return Whether the disableStatelessSessionResumption field is set.
   */
  boolean hasDisableStatelessSessionResumption();
  /**
   * <pre>
   * Config for controlling stateless TLS session resumption: setting this to true will cause the TLS
   * server to not issue TLS session tickets for the purposes of stateless TLS session resumption.
   * If set to false, the TLS server will issue TLS session tickets and encrypt/decrypt them using
   * the keys specified through either :ref:`session_ticket_keys &lt;envoy_api_field_extensions.transport_sockets.tls.v3.DownstreamTlsContext.session_ticket_keys&gt;`
   * or :ref:`session_ticket_keys_sds_secret_config &lt;envoy_api_field_extensions.transport_sockets.tls.v3.DownstreamTlsContext.session_ticket_keys_sds_secret_config&gt;`.
   * If this config is set to false and no keys are explicitly configured, the TLS server will issue
   * TLS session tickets and encrypt/decrypt them using an internally-generated and managed key, with the
   * implication that sessions cannot be resumed across hot restarts or on different hosts.
   * </pre>
   *
   * <code>bool disable_stateless_session_resumption = 7;</code>
   * @return The disableStatelessSessionResumption.
   */
  boolean getDisableStatelessSessionResumption();

  /**
   * <pre>
   * If specified, session_timeout will change maximum lifetime (in seconds) of TLS session
   * Currently this value is used as a hint to `TLS session ticket lifetime (for TLSv1.2)
   * &lt;https://tools.ietf.org/html/rfc5077#section-5.6&gt;`
   * only seconds could be specified (fractional seconds are going to be ignored).
   * </pre>
   *
   * <code>.google.protobuf.Duration session_timeout = 6 [(.validate.rules) = { ... }</code>
   * @return Whether the sessionTimeout field is set.
   */
  boolean hasSessionTimeout();
  /**
   * <pre>
   * If specified, session_timeout will change maximum lifetime (in seconds) of TLS session
   * Currently this value is used as a hint to `TLS session ticket lifetime (for TLSv1.2)
   * &lt;https://tools.ietf.org/html/rfc5077#section-5.6&gt;`
   * only seconds could be specified (fractional seconds are going to be ignored).
   * </pre>
   *
   * <code>.google.protobuf.Duration session_timeout = 6 [(.validate.rules) = { ... }</code>
   * @return The sessionTimeout.
   */
  com.google.protobuf.Duration getSessionTimeout();
  /**
   * <pre>
   * If specified, session_timeout will change maximum lifetime (in seconds) of TLS session
   * Currently this value is used as a hint to `TLS session ticket lifetime (for TLSv1.2)
   * &lt;https://tools.ietf.org/html/rfc5077#section-5.6&gt;`
   * only seconds could be specified (fractional seconds are going to be ignored).
   * </pre>
   *
   * <code>.google.protobuf.Duration session_timeout = 6 [(.validate.rules) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getSessionTimeoutOrBuilder();

  /**
   * <pre>
   * Config for whether to use certificates if they do not have
   * an accompanying OCSP response or if the response expires at runtime.
   * Defaults to LENIENT_STAPLING
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.OcspStaplePolicy ocsp_staple_policy = 8 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for ocspStaplePolicy.
   */
  int getOcspStaplePolicyValue();
  /**
   * <pre>
   * Config for whether to use certificates if they do not have
   * an accompanying OCSP response or if the response expires at runtime.
   * Defaults to LENIENT_STAPLING
   * </pre>
   *
   * <code>.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.OcspStaplePolicy ocsp_staple_policy = 8 [(.validate.rules) = { ... }</code>
   * @return The ocspStaplePolicy.
   */
  io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.OcspStaplePolicy getOcspStaplePolicy();

  public io.envoyproxy.envoy.extensions.transport_sockets.tls.v3.DownstreamTlsContext.SessionTicketKeysTypeCase getSessionTicketKeysTypeCase();
}
