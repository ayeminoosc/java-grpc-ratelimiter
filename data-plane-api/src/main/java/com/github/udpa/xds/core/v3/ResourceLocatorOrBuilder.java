// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: xds/core/v3/resource_locator.proto

package com.github.udpa.xds.core.v3;

public interface ResourceLocatorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:xds.core.v3.ResourceLocator)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * URI scheme.
   * </pre>
   *
   * <code>.xds.core.v3.ResourceLocator.Scheme scheme = 1 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for scheme.
   */
  int getSchemeValue();
  /**
   * <pre>
   * URI scheme.
   * </pre>
   *
   * <code>.xds.core.v3.ResourceLocator.Scheme scheme = 1 [(.validate.rules) = { ... }</code>
   * @return The scheme.
   */
  com.github.udpa.xds.core.v3.ResourceLocator.Scheme getScheme();

  /**
   * <pre>
   * Opaque identifier for the resource. Any '/' will not be escaped during URI
   * encoding and will form part of the URI path. This may end
   * with ‘*’ for glob collection references.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Opaque identifier for the resource. Any '/' will not be escaped during URI
   * encoding and will form part of the URI path. This may end
   * with ‘*’ for glob collection references.
   * </pre>
   *
   * <code>string id = 2;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Logical authority for resource (not necessarily transport network address).
   * Authorities are opaque in the xDS API, data-plane load balancers will map
   * them to concrete network transports such as an xDS management server, e.g.
   * via envoy.config.core.v3.ConfigSource.
   * </pre>
   *
   * <code>string authority = 3;</code>
   * @return The authority.
   */
  java.lang.String getAuthority();
  /**
   * <pre>
   * Logical authority for resource (not necessarily transport network address).
   * Authorities are opaque in the xDS API, data-plane load balancers will map
   * them to concrete network transports such as an xDS management server, e.g.
   * via envoy.config.core.v3.ConfigSource.
   * </pre>
   *
   * <code>string authority = 3;</code>
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString
      getAuthorityBytes();

  /**
   * <pre>
   * Fully qualified resource type (as in type URL without types.googleapis.com/
   * prefix).
   * </pre>
   *
   * <code>string resource_type = 4 [(.validate.rules) = { ... }</code>
   * @return The resourceType.
   */
  java.lang.String getResourceType();
  /**
   * <pre>
   * Fully qualified resource type (as in type URL without types.googleapis.com/
   * prefix).
   * </pre>
   *
   * <code>string resource_type = 4 [(.validate.rules) = { ... }</code>
   * @return The bytes for resourceType.
   */
  com.google.protobuf.ByteString
      getResourceTypeBytes();

  /**
   * <pre>
   * Additional parameters that can be used to select resource variants.
   * Matches must be exact, i.e. all context parameters must match exactly and
   * there must be no additional context parameters set on the matched
   * resource.
   * </pre>
   *
   * <code>.xds.core.v3.ContextParams exact_context = 5;</code>
   * @return Whether the exactContext field is set.
   */
  boolean hasExactContext();
  /**
   * <pre>
   * Additional parameters that can be used to select resource variants.
   * Matches must be exact, i.e. all context parameters must match exactly and
   * there must be no additional context parameters set on the matched
   * resource.
   * </pre>
   *
   * <code>.xds.core.v3.ContextParams exact_context = 5;</code>
   * @return The exactContext.
   */
  com.github.udpa.xds.core.v3.ContextParams getExactContext();
  /**
   * <pre>
   * Additional parameters that can be used to select resource variants.
   * Matches must be exact, i.e. all context parameters must match exactly and
   * there must be no additional context parameters set on the matched
   * resource.
   * </pre>
   *
   * <code>.xds.core.v3.ContextParams exact_context = 5;</code>
   */
  com.github.udpa.xds.core.v3.ContextParamsOrBuilder getExactContextOrBuilder();

  /**
   * <pre>
   * A list of directives that appear in the xDS resource locator #fragment.
   * When encoding to URI form, directives are percent encoded with comma
   * separation.
   * </pre>
   *
   * <code>repeated .xds.core.v3.ResourceLocator.Directive directives = 6;</code>
   */
  java.util.List<com.github.udpa.xds.core.v3.ResourceLocator.Directive> 
      getDirectivesList();
  /**
   * <pre>
   * A list of directives that appear in the xDS resource locator #fragment.
   * When encoding to URI form, directives are percent encoded with comma
   * separation.
   * </pre>
   *
   * <code>repeated .xds.core.v3.ResourceLocator.Directive directives = 6;</code>
   */
  com.github.udpa.xds.core.v3.ResourceLocator.Directive getDirectives(int index);
  /**
   * <pre>
   * A list of directives that appear in the xDS resource locator #fragment.
   * When encoding to URI form, directives are percent encoded with comma
   * separation.
   * </pre>
   *
   * <code>repeated .xds.core.v3.ResourceLocator.Directive directives = 6;</code>
   */
  int getDirectivesCount();
  /**
   * <pre>
   * A list of directives that appear in the xDS resource locator #fragment.
   * When encoding to URI form, directives are percent encoded with comma
   * separation.
   * </pre>
   *
   * <code>repeated .xds.core.v3.ResourceLocator.Directive directives = 6;</code>
   */
  java.util.List<? extends com.github.udpa.xds.core.v3.ResourceLocator.DirectiveOrBuilder> 
      getDirectivesOrBuilderList();
  /**
   * <pre>
   * A list of directives that appear in the xDS resource locator #fragment.
   * When encoding to URI form, directives are percent encoded with comma
   * separation.
   * </pre>
   *
   * <code>repeated .xds.core.v3.ResourceLocator.Directive directives = 6;</code>
   */
  com.github.udpa.xds.core.v3.ResourceLocator.DirectiveOrBuilder getDirectivesOrBuilder(
      int index);

  public com.github.udpa.xds.core.v3.ResourceLocator.ContextParamSpecifierCase getContextParamSpecifierCase();
}
