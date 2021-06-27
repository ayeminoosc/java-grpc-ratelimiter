// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/buffer/v3/buffer.proto

package io.envoyproxy.envoy.extensions.filters.http.buffer.v3;

public interface BufferPerRouteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.buffer.v3.BufferPerRoute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Disable the buffer filter for this particular vhost or route.
   * </pre>
   *
   * <code>bool disabled = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the disabled field is set.
   */
  boolean hasDisabled();
  /**
   * <pre>
   * Disable the buffer filter for this particular vhost or route.
   * </pre>
   *
   * <code>bool disabled = 1 [(.validate.rules) = { ... }</code>
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   * <pre>
   * Override the global configuration of the filter with this new config.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.buffer.v3.Buffer buffer = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the buffer field is set.
   */
  boolean hasBuffer();
  /**
   * <pre>
   * Override the global configuration of the filter with this new config.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.buffer.v3.Buffer buffer = 2 [(.validate.rules) = { ... }</code>
   * @return The buffer.
   */
  io.envoyproxy.envoy.extensions.filters.http.buffer.v3.Buffer getBuffer();
  /**
   * <pre>
   * Override the global configuration of the filter with this new config.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.buffer.v3.Buffer buffer = 2 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.buffer.v3.BufferOrBuilder getBufferOrBuilder();

  public io.envoyproxy.envoy.extensions.filters.http.buffer.v3.BufferPerRoute.OverrideCase getOverrideCase();
}