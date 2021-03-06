// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/http/ext_authz/v3/ext_authz.proto

package io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3;

public interface ExtAuthzPerRouteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.ext_authz.v3.ExtAuthzPerRoute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Disable the ext auth filter for this particular vhost or route.
   * If disabled is specified in multiple per-filter-configs, the most specific one will be used.
   * </pre>
   *
   * <code>bool disabled = 1 [(.validate.rules) = { ... }</code>
   * @return Whether the disabled field is set.
   */
  boolean hasDisabled();
  /**
   * <pre>
   * Disable the ext auth filter for this particular vhost or route.
   * If disabled is specified in multiple per-filter-configs, the most specific one will be used.
   * </pre>
   *
   * <code>bool disabled = 1 [(.validate.rules) = { ... }</code>
   * @return The disabled.
   */
  boolean getDisabled();

  /**
   * <pre>
   * Check request settings for this route.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.CheckSettings check_settings = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the checkSettings field is set.
   */
  boolean hasCheckSettings();
  /**
   * <pre>
   * Check request settings for this route.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.CheckSettings check_settings = 2 [(.validate.rules) = { ... }</code>
   * @return The checkSettings.
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3.CheckSettings getCheckSettings();
  /**
   * <pre>
   * Check request settings for this route.
   * </pre>
   *
   * <code>.envoy.extensions.filters.http.ext_authz.v3.CheckSettings check_settings = 2 [(.validate.rules) = { ... }</code>
   */
  io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3.CheckSettingsOrBuilder getCheckSettingsOrBuilder();

  public io.envoyproxy.envoy.extensions.filters.http.ext_authz.v3.ExtAuthzPerRoute.OverrideCase getOverrideCase();
}
