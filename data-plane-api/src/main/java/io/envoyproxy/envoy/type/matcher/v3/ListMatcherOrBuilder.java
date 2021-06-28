// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/matcher/v3/value.proto

package io.envoyproxy.envoy.type.matcher.v3;

public interface ListMatcherOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.type.matcher.v3.ListMatcher)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If specified, at least one of the values in the list must match the value specified.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
   * @return Whether the oneOf field is set.
   */
  boolean hasOneOf();
  /**
   * <pre>
   * If specified, at least one of the values in the list must match the value specified.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
   * @return The oneOf.
   */
  io.envoyproxy.envoy.type.matcher.v3.ValueMatcher getOneOf();
  /**
   * <pre>
   * If specified, at least one of the values in the list must match the value specified.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ValueMatcher one_of = 1;</code>
   */
  io.envoyproxy.envoy.type.matcher.v3.ValueMatcherOrBuilder getOneOfOrBuilder();

  public io.envoyproxy.envoy.type.matcher.v3.ListMatcher.MatchPatternCase getMatchPatternCase();
}