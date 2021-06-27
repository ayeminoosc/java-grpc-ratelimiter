// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/config_source.proto

package io.envoyproxy.envoy.config.core.v3;

public interface SelfConfigSourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.core.v3.SelfConfigSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * API version for xDS transport protocol. This describes the xDS gRPC/REST
   * endpoint and version of [Delta]DiscoveryRequest/Response used on the wire.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 1 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for transportApiVersion.
   */
  int getTransportApiVersionValue();
  /**
   * <pre>
   * API version for xDS transport protocol. This describes the xDS gRPC/REST
   * endpoint and version of [Delta]DiscoveryRequest/Response used on the wire.
   * </pre>
   *
   * <code>.envoy.config.core.v3.ApiVersion transport_api_version = 1 [(.validate.rules) = { ... }</code>
   * @return The transportApiVersion.
   */
  io.envoyproxy.envoy.config.core.v3.ApiVersion getTransportApiVersion();
}