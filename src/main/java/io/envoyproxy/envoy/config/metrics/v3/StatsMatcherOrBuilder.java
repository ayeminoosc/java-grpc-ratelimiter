// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/metrics/v3/stats.proto

package io.envoyproxy.envoy.config.metrics.v3;

public interface StatsMatcherOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.metrics.v3.StatsMatcher)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If `reject_all` is true, then all stats are disabled. If `reject_all` is false, then all
   * stats are enabled.
   * </pre>
   *
   * <code>bool reject_all = 1;</code>
   * @return Whether the rejectAll field is set.
   */
  boolean hasRejectAll();
  /**
   * <pre>
   * If `reject_all` is true, then all stats are disabled. If `reject_all` is false, then all
   * stats are enabled.
   * </pre>
   *
   * <code>bool reject_all = 1;</code>
   * @return The rejectAll.
   */
  boolean getRejectAll();

  /**
   * <pre>
   * Exclusive match. All stats are enabled except for those matching one of the supplied
   * StringMatcher protos.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ListStringMatcher exclusion_list = 2;</code>
   * @return Whether the exclusionList field is set.
   */
  boolean hasExclusionList();
  /**
   * <pre>
   * Exclusive match. All stats are enabled except for those matching one of the supplied
   * StringMatcher protos.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ListStringMatcher exclusion_list = 2;</code>
   * @return The exclusionList.
   */
  io.envoyproxy.envoy.type.matcher.v3.ListStringMatcher getExclusionList();
  /**
   * <pre>
   * Exclusive match. All stats are enabled except for those matching one of the supplied
   * StringMatcher protos.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ListStringMatcher exclusion_list = 2;</code>
   */
  io.envoyproxy.envoy.type.matcher.v3.ListStringMatcherOrBuilder getExclusionListOrBuilder();

  /**
   * <pre>
   * Inclusive match. No stats are enabled except for those matching one of the supplied
   * StringMatcher protos.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ListStringMatcher inclusion_list = 3;</code>
   * @return Whether the inclusionList field is set.
   */
  boolean hasInclusionList();
  /**
   * <pre>
   * Inclusive match. No stats are enabled except for those matching one of the supplied
   * StringMatcher protos.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ListStringMatcher inclusion_list = 3;</code>
   * @return The inclusionList.
   */
  io.envoyproxy.envoy.type.matcher.v3.ListStringMatcher getInclusionList();
  /**
   * <pre>
   * Inclusive match. No stats are enabled except for those matching one of the supplied
   * StringMatcher protos.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ListStringMatcher inclusion_list = 3;</code>
   */
  io.envoyproxy.envoy.type.matcher.v3.ListStringMatcherOrBuilder getInclusionListOrBuilder();

  public io.envoyproxy.envoy.config.metrics.v3.StatsMatcher.StatsMatcherCase getStatsMatcherCase();
}