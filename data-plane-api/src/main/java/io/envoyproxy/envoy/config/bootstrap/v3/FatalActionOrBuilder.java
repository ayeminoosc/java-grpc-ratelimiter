// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/bootstrap/v3/bootstrap.proto

package io.envoyproxy.envoy.config.bootstrap.v3;

public interface FatalActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.bootstrap.v3.FatalAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Extension specific configuration for the action. It's expected to conform
   * to the ``Envoy::Server::Configuration::FatalAction`` interface.
   * </pre>
   *
   * <code>.envoy.config.core.v3.TypedExtensionConfig config = 1;</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <pre>
   * Extension specific configuration for the action. It's expected to conform
   * to the ``Envoy::Server::Configuration::FatalAction`` interface.
   * </pre>
   *
   * <code>.envoy.config.core.v3.TypedExtensionConfig config = 1;</code>
   * @return The config.
   */
  io.envoyproxy.envoy.config.core.v3.TypedExtensionConfig getConfig();
  /**
   * <pre>
   * Extension specific configuration for the action. It's expected to conform
   * to the ``Envoy::Server::Configuration::FatalAction`` interface.
   * </pre>
   *
   * <code>.envoy.config.core.v3.TypedExtensionConfig config = 1;</code>
   */
  io.envoyproxy.envoy.config.core.v3.TypedExtensionConfigOrBuilder getConfigOrBuilder();
}
