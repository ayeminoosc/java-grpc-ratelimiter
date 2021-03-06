// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/tap/v3/common.proto

package io.envoyproxy.envoy.config.tap.v3;

public interface TapConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.tap.v3.TapConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The match configuration. If the configuration matches the data source being tapped, a tap will
   * occur, with the result written to the configured output.
   * Exactly one of :ref:`match &lt;envoy_api_field_config.tap.v3.TapConfig.match&gt;` and
   * :ref:`match_config &lt;envoy_api_field_config.tap.v3.TapConfig.match_config&gt;` must be set. If both
   * are set, the :ref:`match &lt;envoy_api_field_config.tap.v3.TapConfig.match&gt;` will be used.
   * </pre>
   *
   * <code>.envoy.config.tap.v3.MatchPredicate match_config = 1 [deprecated = true];</code>
   * @return Whether the matchConfig field is set.
   */
  @java.lang.Deprecated boolean hasMatchConfig();
  /**
   * <pre>
   * The match configuration. If the configuration matches the data source being tapped, a tap will
   * occur, with the result written to the configured output.
   * Exactly one of :ref:`match &lt;envoy_api_field_config.tap.v3.TapConfig.match&gt;` and
   * :ref:`match_config &lt;envoy_api_field_config.tap.v3.TapConfig.match_config&gt;` must be set. If both
   * are set, the :ref:`match &lt;envoy_api_field_config.tap.v3.TapConfig.match&gt;` will be used.
   * </pre>
   *
   * <code>.envoy.config.tap.v3.MatchPredicate match_config = 1 [deprecated = true];</code>
   * @return The matchConfig.
   */
  @java.lang.Deprecated io.envoyproxy.envoy.config.tap.v3.MatchPredicate getMatchConfig();
  /**
   * <pre>
   * The match configuration. If the configuration matches the data source being tapped, a tap will
   * occur, with the result written to the configured output.
   * Exactly one of :ref:`match &lt;envoy_api_field_config.tap.v3.TapConfig.match&gt;` and
   * :ref:`match_config &lt;envoy_api_field_config.tap.v3.TapConfig.match_config&gt;` must be set. If both
   * are set, the :ref:`match &lt;envoy_api_field_config.tap.v3.TapConfig.match&gt;` will be used.
   * </pre>
   *
   * <code>.envoy.config.tap.v3.MatchPredicate match_config = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated io.envoyproxy.envoy.config.tap.v3.MatchPredicateOrBuilder getMatchConfigOrBuilder();

  /**
   * <pre>
   * The match configuration. If the configuration matches the data source being tapped, a tap will
   * occur, with the result written to the configured output.
   * Exactly one of :ref:`match &lt;envoy_api_field_config.tap.v3.TapConfig.match&gt;` and
   * :ref:`match_config &lt;envoy_api_field_config.tap.v3.TapConfig.match_config&gt;` must be set. If both
   * are set, the :ref:`match &lt;envoy_api_field_config.tap.v3.TapConfig.match&gt;` will be used.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.MatchPredicate match = 4;</code>
   * @return Whether the match field is set.
   */
  boolean hasMatch();
  /**
   * <pre>
   * The match configuration. If the configuration matches the data source being tapped, a tap will
   * occur, with the result written to the configured output.
   * Exactly one of :ref:`match &lt;envoy_api_field_config.tap.v3.TapConfig.match&gt;` and
   * :ref:`match_config &lt;envoy_api_field_config.tap.v3.TapConfig.match_config&gt;` must be set. If both
   * are set, the :ref:`match &lt;envoy_api_field_config.tap.v3.TapConfig.match&gt;` will be used.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.MatchPredicate match = 4;</code>
   * @return The match.
   */
  io.envoyproxy.envoy.config.common.matcher.v3.MatchPredicate getMatch();
  /**
   * <pre>
   * The match configuration. If the configuration matches the data source being tapped, a tap will
   * occur, with the result written to the configured output.
   * Exactly one of :ref:`match &lt;envoy_api_field_config.tap.v3.TapConfig.match&gt;` and
   * :ref:`match_config &lt;envoy_api_field_config.tap.v3.TapConfig.match_config&gt;` must be set. If both
   * are set, the :ref:`match &lt;envoy_api_field_config.tap.v3.TapConfig.match&gt;` will be used.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.MatchPredicate match = 4;</code>
   */
  io.envoyproxy.envoy.config.common.matcher.v3.MatchPredicateOrBuilder getMatchOrBuilder();

  /**
   * <pre>
   * The tap output configuration. If a match configuration matches a data source being tapped,
   * a tap will occur and the data will be written to the configured output.
   * </pre>
   *
   * <code>.envoy.config.tap.v3.OutputConfig output_config = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the outputConfig field is set.
   */
  boolean hasOutputConfig();
  /**
   * <pre>
   * The tap output configuration. If a match configuration matches a data source being tapped,
   * a tap will occur and the data will be written to the configured output.
   * </pre>
   *
   * <code>.envoy.config.tap.v3.OutputConfig output_config = 2 [(.validate.rules) = { ... }</code>
   * @return The outputConfig.
   */
  io.envoyproxy.envoy.config.tap.v3.OutputConfig getOutputConfig();
  /**
   * <pre>
   * The tap output configuration. If a match configuration matches a data source being tapped,
   * a tap will occur and the data will be written to the configured output.
   * </pre>
   *
   * <code>.envoy.config.tap.v3.OutputConfig output_config = 2 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.config.tap.v3.OutputConfigOrBuilder getOutputConfigOrBuilder();

  /**
   * <pre>
   * [#not-implemented-hide:] Specify if Tap matching is enabled. The % of requests&#92;connections for
   * which the tap matching is enabled. When not enabled, the request&#92;connection will not be
   * recorded.
   * .. note::
   *   This field defaults to 100/:ref:`HUNDRED
   *   &lt;envoy_api_enum_type.v3.FractionalPercent.DenominatorType&gt;`.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFractionalPercent tap_enabled = 3;</code>
   * @return Whether the tapEnabled field is set.
   */
  boolean hasTapEnabled();
  /**
   * <pre>
   * [#not-implemented-hide:] Specify if Tap matching is enabled. The % of requests&#92;connections for
   * which the tap matching is enabled. When not enabled, the request&#92;connection will not be
   * recorded.
   * .. note::
   *   This field defaults to 100/:ref:`HUNDRED
   *   &lt;envoy_api_enum_type.v3.FractionalPercent.DenominatorType&gt;`.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFractionalPercent tap_enabled = 3;</code>
   * @return The tapEnabled.
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercent getTapEnabled();
  /**
   * <pre>
   * [#not-implemented-hide:] Specify if Tap matching is enabled. The % of requests&#92;connections for
   * which the tap matching is enabled. When not enabled, the request&#92;connection will not be
   * recorded.
   * .. note::
   *   This field defaults to 100/:ref:`HUNDRED
   *   &lt;envoy_api_enum_type.v3.FractionalPercent.DenominatorType&gt;`.
   * </pre>
   *
   * <code>.envoy.config.core.v3.RuntimeFractionalPercent tap_enabled = 3;</code>
   */
  io.envoyproxy.envoy.config.core.v3.RuntimeFractionalPercentOrBuilder getTapEnabledOrBuilder();
}
