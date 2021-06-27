// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/type/matcher/v3/value.proto

package io.envoyproxy.envoy.type.matcher.v3;

public interface ValueMatcherOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.type.matcher.v3.ValueMatcher)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a NullValue.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ValueMatcher.NullMatch null_match = 1;</code>
   * @return Whether the nullMatch field is set.
   */
  boolean hasNullMatch();
  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a NullValue.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ValueMatcher.NullMatch null_match = 1;</code>
   * @return The nullMatch.
   */
  io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.NullMatch getNullMatch();
  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a NullValue.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ValueMatcher.NullMatch null_match = 1;</code>
   */
  io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.NullMatchOrBuilder getNullMatchOrBuilder();

  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a double value and is
   * matched to this field.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.DoubleMatcher double_match = 2;</code>
   * @return Whether the doubleMatch field is set.
   */
  boolean hasDoubleMatch();
  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a double value and is
   * matched to this field.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.DoubleMatcher double_match = 2;</code>
   * @return The doubleMatch.
   */
  io.envoyproxy.envoy.type.matcher.v3.DoubleMatcher getDoubleMatch();
  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a double value and is
   * matched to this field.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.DoubleMatcher double_match = 2;</code>
   */
  io.envoyproxy.envoy.type.matcher.v3.DoubleMatcherOrBuilder getDoubleMatchOrBuilder();

  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a string value and is
   * matched to this field.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.StringMatcher string_match = 3;</code>
   * @return Whether the stringMatch field is set.
   */
  boolean hasStringMatch();
  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a string value and is
   * matched to this field.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.StringMatcher string_match = 3;</code>
   * @return The stringMatch.
   */
  io.envoyproxy.envoy.type.matcher.v3.StringMatcher getStringMatch();
  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a string value and is
   * matched to this field.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.StringMatcher string_match = 3;</code>
   */
  io.envoyproxy.envoy.type.matcher.v3.StringMatcherOrBuilder getStringMatchOrBuilder();

  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a bool value and is equal
   * to this field.
   * </pre>
   *
   * <code>bool bool_match = 4;</code>
   * @return Whether the boolMatch field is set.
   */
  boolean hasBoolMatch();
  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a bool value and is equal
   * to this field.
   * </pre>
   *
   * <code>bool bool_match = 4;</code>
   * @return The boolMatch.
   */
  boolean getBoolMatch();

  /**
   * <pre>
   * If specified, value match will be performed based on whether the path is referring to a
   * valid primitive value in the metadata. If the path is referring to a non-primitive value,
   * the result is always not matched.
   * </pre>
   *
   * <code>bool present_match = 5;</code>
   * @return Whether the presentMatch field is set.
   */
  boolean hasPresentMatch();
  /**
   * <pre>
   * If specified, value match will be performed based on whether the path is referring to a
   * valid primitive value in the metadata. If the path is referring to a non-primitive value,
   * the result is always not matched.
   * </pre>
   *
   * <code>bool present_match = 5;</code>
   * @return The presentMatch.
   */
  boolean getPresentMatch();

  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a list value and
   * is matched to this field.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ListMatcher list_match = 6;</code>
   * @return Whether the listMatch field is set.
   */
  boolean hasListMatch();
  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a list value and
   * is matched to this field.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ListMatcher list_match = 6;</code>
   * @return The listMatch.
   */
  io.envoyproxy.envoy.type.matcher.v3.ListMatcher getListMatch();
  /**
   * <pre>
   * If specified, a match occurs if and only if the target value is a list value and
   * is matched to this field.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.ListMatcher list_match = 6;</code>
   */
  io.envoyproxy.envoy.type.matcher.v3.ListMatcherOrBuilder getListMatchOrBuilder();

  public io.envoyproxy.envoy.type.matcher.v3.ValueMatcher.MatchPatternCase getMatchPatternCase();
}
