// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/common/ratelimit/v3/ratelimit.proto

package io.envoyproxy.envoy.extensions.common.ratelimit.v3;

public interface RateLimitDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.common.ratelimit.v3.RateLimitDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Descriptor entries.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.Entry entries = 1 [(.validate.rules) = { ... }</code>
   */
  java.util.List<io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.Entry> 
      getEntriesList();
  /**
   * <pre>
   * Descriptor entries.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.Entry entries = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.Entry getEntries(int index);
  /**
   * <pre>
   * Descriptor entries.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.Entry entries = 1 [(.validate.rules) = { ... }</code>
   */
  int getEntriesCount();
  /**
   * <pre>
   * Descriptor entries.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.Entry entries = 1 [(.validate.rules) = { ... }</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.EntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <pre>
   * Descriptor entries.
   * </pre>
   *
   * <code>repeated .envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.Entry entries = 1 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.EntryOrBuilder getEntriesOrBuilder(
      int index);

  /**
   * <pre>
   * Optional rate limit override to supply to the ratelimit service.
   * </pre>
   *
   * <code>.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.RateLimitOverride limit = 2;</code>
   * @return Whether the limit field is set.
   */
  boolean hasLimit();
  /**
   * <pre>
   * Optional rate limit override to supply to the ratelimit service.
   * </pre>
   *
   * <code>.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.RateLimitOverride limit = 2;</code>
   * @return The limit.
   */
  io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.RateLimitOverride getLimit();
  /**
   * <pre>
   * Optional rate limit override to supply to the ratelimit service.
   * </pre>
   *
   * <code>.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.RateLimitOverride limit = 2;</code>
   */
  io.envoyproxy.envoy.extensions.common.ratelimit.v3.RateLimitDescriptor.RateLimitOverrideOrBuilder getLimitOrBuilder();
}
