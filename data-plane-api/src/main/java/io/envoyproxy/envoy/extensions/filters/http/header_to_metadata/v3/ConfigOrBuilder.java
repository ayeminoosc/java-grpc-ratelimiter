// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/header_to_metadata/v3/header_to_metadata.proto

package io.envoyproxy.envoy.extensions.filters.http.header_to_metadata.v3;

public interface ConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.header_to_metadata.v3.Config)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of rules to apply to requests.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule request_rules = 1;</code>
   */
  java.util.List<io.envoyproxy.envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule> 
      getRequestRulesList();
  /**
   * <pre>
   * The list of rules to apply to requests.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule request_rules = 1;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule getRequestRules(int index);
  /**
   * <pre>
   * The list of rules to apply to requests.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule request_rules = 1;</code>
   */
  int getRequestRulesCount();
  /**
   * <pre>
   * The list of rules to apply to requests.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule request_rules = 1;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.extensions.filters.http.header_to_metadata.v3.Config.RuleOrBuilder> 
      getRequestRulesOrBuilderList();
  /**
   * <pre>
   * The list of rules to apply to requests.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule request_rules = 1;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.header_to_metadata.v3.Config.RuleOrBuilder getRequestRulesOrBuilder(
      int index);

  /**
   * <pre>
   * The list of rules to apply to responses.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule response_rules = 2;</code>
   */
  java.util.List<io.envoyproxy.envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule> 
      getResponseRulesList();
  /**
   * <pre>
   * The list of rules to apply to responses.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule response_rules = 2;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule getResponseRules(int index);
  /**
   * <pre>
   * The list of rules to apply to responses.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule response_rules = 2;</code>
   */
  int getResponseRulesCount();
  /**
   * <pre>
   * The list of rules to apply to responses.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule response_rules = 2;</code>
   */
  java.util.List<? extends io.envoyproxy.envoy.extensions.filters.http.header_to_metadata.v3.Config.RuleOrBuilder> 
      getResponseRulesOrBuilderList();
  /**
   * <pre>
   * The list of rules to apply to responses.
   * </pre>
   *
   * <code>repeated .envoy.extensions.filters.http.header_to_metadata.v3.Config.Rule response_rules = 2;</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.header_to_metadata.v3.Config.RuleOrBuilder getResponseRulesOrBuilder(
      int index);
}