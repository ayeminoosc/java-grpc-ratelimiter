// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/accesslog/v3/accesslog.proto

package io.envoyproxy.envoy.config.accesslog.v3;

public interface MetadataFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.accesslog.v3.MetadataFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Matcher to check metadata for specified value. For example, to match on the
   * access_log_hint metadata, set the filter to "envoy.common" and the path to
   * "access_log_hint", and the value to "true".
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.MetadataMatcher matcher = 1;</code>
   * @return Whether the matcher field is set.
   */
  boolean hasMatcher();
  /**
   * <pre>
   * Matcher to check metadata for specified value. For example, to match on the
   * access_log_hint metadata, set the filter to "envoy.common" and the path to
   * "access_log_hint", and the value to "true".
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.MetadataMatcher matcher = 1;</code>
   * @return The matcher.
   */
  io.envoyproxy.envoy.type.matcher.v3.MetadataMatcher getMatcher();
  /**
   * <pre>
   * Matcher to check metadata for specified value. For example, to match on the
   * access_log_hint metadata, set the filter to "envoy.common" and the path to
   * "access_log_hint", and the value to "true".
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.MetadataMatcher matcher = 1;</code>
   */
  io.envoyproxy.envoy.type.matcher.v3.MetadataMatcherOrBuilder getMatcherOrBuilder();

  /**
   * <pre>
   * Default result if the key does not exist in dynamic metadata: if unset or
   * true, then log; if false, then don't log.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue match_if_key_not_found = 2;</code>
   * @return Whether the matchIfKeyNotFound field is set.
   */
  boolean hasMatchIfKeyNotFound();
  /**
   * <pre>
   * Default result if the key does not exist in dynamic metadata: if unset or
   * true, then log; if false, then don't log.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue match_if_key_not_found = 2;</code>
   * @return The matchIfKeyNotFound.
   */
  com.google.protobuf.BoolValue getMatchIfKeyNotFound();
  /**
   * <pre>
   * Default result if the key does not exist in dynamic metadata: if unset or
   * true, then log; if false, then don't log.
   * </pre>
   *
   * <code>.google.protobuf.BoolValue match_if_key_not_found = 2;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getMatchIfKeyNotFoundOrBuilder();
}
