// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/core/v3/address.proto

package io.envoyproxy.envoy.config.core.v3;

public interface AddressOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.core.v3.Address)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.envoy.config.core.v3.SocketAddress socket_address = 1;</code>
   * @return Whether the socketAddress field is set.
   */
  boolean hasSocketAddress();
  /**
   * <code>.envoy.config.core.v3.SocketAddress socket_address = 1;</code>
   * @return The socketAddress.
   */
  io.envoyproxy.envoy.config.core.v3.SocketAddress getSocketAddress();
  /**
   * <code>.envoy.config.core.v3.SocketAddress socket_address = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.SocketAddressOrBuilder getSocketAddressOrBuilder();

  /**
   * <code>.envoy.config.core.v3.Pipe pipe = 2;</code>
   * @return Whether the pipe field is set.
   */
  boolean hasPipe();
  /**
   * <code>.envoy.config.core.v3.Pipe pipe = 2;</code>
   * @return The pipe.
   */
  io.envoyproxy.envoy.config.core.v3.Pipe getPipe();
  /**
   * <code>.envoy.config.core.v3.Pipe pipe = 2;</code>
   */
  io.envoyproxy.envoy.config.core.v3.PipeOrBuilder getPipeOrBuilder();

  /**
   * <pre>
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.config.core.v3.EnvoyInternalAddress envoy_internal_address = 3;</code>
   * @return Whether the envoyInternalAddress field is set.
   */
  boolean hasEnvoyInternalAddress();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.config.core.v3.EnvoyInternalAddress envoy_internal_address = 3;</code>
   * @return The envoyInternalAddress.
   */
  io.envoyproxy.envoy.config.core.v3.EnvoyInternalAddress getEnvoyInternalAddress();
  /**
   * <pre>
   * [#not-implemented-hide:]
   * </pre>
   *
   * <code>.envoy.config.core.v3.EnvoyInternalAddress envoy_internal_address = 3;</code>
   */
  io.envoyproxy.envoy.config.core.v3.EnvoyInternalAddressOrBuilder getEnvoyInternalAddressOrBuilder();

  public io.envoyproxy.envoy.config.core.v3.Address.AddressCase getAddressCase();
}
