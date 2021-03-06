// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/rbac/v3/rbac.proto

package io.envoyproxy.envoy.extensions.filters.network.rbac.v3;

public interface RBACOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.network.rbac.v3.RBAC)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Specify the RBAC rules to be applied globally.
   * If absent, no enforcing RBAC policy will be applied.
   * </pre>
   *
   * <code>.envoy.config.rbac.v3.RBAC rules = 1;</code>
   * @return Whether the rules field is set.
   */
  boolean hasRules();
  /**
   * <pre>
   * Specify the RBAC rules to be applied globally.
   * If absent, no enforcing RBAC policy will be applied.
   * </pre>
   *
   * <code>.envoy.config.rbac.v3.RBAC rules = 1;</code>
   * @return The rules.
   */
  io.envoyproxy.envoy.config.rbac.v3.RBAC getRules();
  /**
   * <pre>
   * Specify the RBAC rules to be applied globally.
   * If absent, no enforcing RBAC policy will be applied.
   * </pre>
   *
   * <code>.envoy.config.rbac.v3.RBAC rules = 1;</code>
   */
  io.envoyproxy.envoy.config.rbac.v3.RBACOrBuilder getRulesOrBuilder();

  /**
   * <pre>
   * Shadow rules are not enforced by the filter but will emit stats and logs
   * and can be used for rule testing.
   * If absent, no shadow RBAC policy will be applied.
   * </pre>
   *
   * <code>.envoy.config.rbac.v3.RBAC shadow_rules = 2;</code>
   * @return Whether the shadowRules field is set.
   */
  boolean hasShadowRules();
  /**
   * <pre>
   * Shadow rules are not enforced by the filter but will emit stats and logs
   * and can be used for rule testing.
   * If absent, no shadow RBAC policy will be applied.
   * </pre>
   *
   * <code>.envoy.config.rbac.v3.RBAC shadow_rules = 2;</code>
   * @return The shadowRules.
   */
  io.envoyproxy.envoy.config.rbac.v3.RBAC getShadowRules();
  /**
   * <pre>
   * Shadow rules are not enforced by the filter but will emit stats and logs
   * and can be used for rule testing.
   * If absent, no shadow RBAC policy will be applied.
   * </pre>
   *
   * <code>.envoy.config.rbac.v3.RBAC shadow_rules = 2;</code>
   */
  io.envoyproxy.envoy.config.rbac.v3.RBACOrBuilder getShadowRulesOrBuilder();

  /**
   * <pre>
   * The prefix to use when emitting statistics.
   * </pre>
   *
   * <code>string stat_prefix = 3 [(.validate.rules) = { ... }</code>
   * @return The statPrefix.
   */
  java.lang.String getStatPrefix();
  /**
   * <pre>
   * The prefix to use when emitting statistics.
   * </pre>
   *
   * <code>string stat_prefix = 3 [(.validate.rules) = { ... }</code>
   * @return The bytes for statPrefix.
   */
  com.google.protobuf.ByteString
      getStatPrefixBytes();

  /**
   * <pre>
   * RBAC enforcement strategy. By default RBAC will be enforced only once
   * when the first byte of data arrives from the downstream. When used in
   * conjunction with filters that emit dynamic metadata after decoding
   * every payload (e.g., Mongo, MySQL, Kafka) set the enforcement type to
   * CONTINUOUS to enforce RBAC policies on every message boundary.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.rbac.v3.RBAC.EnforcementType enforcement_type = 4;</code>
   * @return The enum numeric value on the wire for enforcementType.
   */
  int getEnforcementTypeValue();
  /**
   * <pre>
   * RBAC enforcement strategy. By default RBAC will be enforced only once
   * when the first byte of data arrives from the downstream. When used in
   * conjunction with filters that emit dynamic metadata after decoding
   * every payload (e.g., Mongo, MySQL, Kafka) set the enforcement type to
   * CONTINUOUS to enforce RBAC policies on every message boundary.
   * </pre>
   *
   * <code>.envoy.extensions.filters.network.rbac.v3.RBAC.EnforcementType enforcement_type = 4;</code>
   * @return The enforcementType.
   */
  io.envoyproxy.envoy.extensions.filters.network.rbac.v3.RBAC.EnforcementType getEnforcementType();
}
