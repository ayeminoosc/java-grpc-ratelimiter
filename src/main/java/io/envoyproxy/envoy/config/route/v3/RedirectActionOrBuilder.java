// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/route/v3/route_components.proto

package io.envoyproxy.envoy.config.route.v3;

public interface RedirectActionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.route.v3.RedirectAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The scheme portion of the URL will be swapped with "https".
   * </pre>
   *
   * <code>bool https_redirect = 4;</code>
   * @return Whether the httpsRedirect field is set.
   */
  boolean hasHttpsRedirect();
  /**
   * <pre>
   * The scheme portion of the URL will be swapped with "https".
   * </pre>
   *
   * <code>bool https_redirect = 4;</code>
   * @return The httpsRedirect.
   */
  boolean getHttpsRedirect();

  /**
   * <pre>
   * The scheme portion of the URL will be swapped with this value.
   * </pre>
   *
   * <code>string scheme_redirect = 7;</code>
   * @return Whether the schemeRedirect field is set.
   */
  boolean hasSchemeRedirect();
  /**
   * <pre>
   * The scheme portion of the URL will be swapped with this value.
   * </pre>
   *
   * <code>string scheme_redirect = 7;</code>
   * @return The schemeRedirect.
   */
  java.lang.String getSchemeRedirect();
  /**
   * <pre>
   * The scheme portion of the URL will be swapped with this value.
   * </pre>
   *
   * <code>string scheme_redirect = 7;</code>
   * @return The bytes for schemeRedirect.
   */
  com.google.protobuf.ByteString
      getSchemeRedirectBytes();

  /**
   * <pre>
   * The host portion of the URL will be swapped with this value.
   * </pre>
   *
   * <code>string host_redirect = 1 [(.validate.rules) = { ... }</code>
   * @return The hostRedirect.
   */
  java.lang.String getHostRedirect();
  /**
   * <pre>
   * The host portion of the URL will be swapped with this value.
   * </pre>
   *
   * <code>string host_redirect = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for hostRedirect.
   */
  com.google.protobuf.ByteString
      getHostRedirectBytes();

  /**
   * <pre>
   * The port value of the URL will be swapped with this value.
   * </pre>
   *
   * <code>uint32 port_redirect = 8;</code>
   * @return The portRedirect.
   */
  int getPortRedirect();

  /**
   * <pre>
   * The path portion of the URL will be swapped with this value.
   * Please note that query string in path_redirect will override the
   * request's query string and will not be stripped.
   * For example, let's say we have the following routes:
   * - match: { path: "/old-path-1" }
   *   redirect: { path_redirect: "/new-path-1" }
   * - match: { path: "/old-path-2" }
   *   redirect: { path_redirect: "/new-path-2", strip-query: "true" }
   * - match: { path: "/old-path-3" }
   *   redirect: { path_redirect: "/new-path-3?foo=1", strip_query: "true" }
   * 1. if request uri is "/old-path-1?bar=1", users will be redirected to "/new-path-1?bar=1"
   * 2. if request uri is "/old-path-2?bar=1", users will be redirected to "/new-path-2"
   * 3. if request uri is "/old-path-3?bar=1", users will be redirected to "/new-path-3?foo=1"
   * </pre>
   *
   * <code>string path_redirect = 2 [(.validate.rules) = { ... }</code>
   * @return Whether the pathRedirect field is set.
   */
  boolean hasPathRedirect();
  /**
   * <pre>
   * The path portion of the URL will be swapped with this value.
   * Please note that query string in path_redirect will override the
   * request's query string and will not be stripped.
   * For example, let's say we have the following routes:
   * - match: { path: "/old-path-1" }
   *   redirect: { path_redirect: "/new-path-1" }
   * - match: { path: "/old-path-2" }
   *   redirect: { path_redirect: "/new-path-2", strip-query: "true" }
   * - match: { path: "/old-path-3" }
   *   redirect: { path_redirect: "/new-path-3?foo=1", strip_query: "true" }
   * 1. if request uri is "/old-path-1?bar=1", users will be redirected to "/new-path-1?bar=1"
   * 2. if request uri is "/old-path-2?bar=1", users will be redirected to "/new-path-2"
   * 3. if request uri is "/old-path-3?bar=1", users will be redirected to "/new-path-3?foo=1"
   * </pre>
   *
   * <code>string path_redirect = 2 [(.validate.rules) = { ... }</code>
   * @return The pathRedirect.
   */
  java.lang.String getPathRedirect();
  /**
   * <pre>
   * The path portion of the URL will be swapped with this value.
   * Please note that query string in path_redirect will override the
   * request's query string and will not be stripped.
   * For example, let's say we have the following routes:
   * - match: { path: "/old-path-1" }
   *   redirect: { path_redirect: "/new-path-1" }
   * - match: { path: "/old-path-2" }
   *   redirect: { path_redirect: "/new-path-2", strip-query: "true" }
   * - match: { path: "/old-path-3" }
   *   redirect: { path_redirect: "/new-path-3?foo=1", strip_query: "true" }
   * 1. if request uri is "/old-path-1?bar=1", users will be redirected to "/new-path-1?bar=1"
   * 2. if request uri is "/old-path-2?bar=1", users will be redirected to "/new-path-2"
   * 3. if request uri is "/old-path-3?bar=1", users will be redirected to "/new-path-3?foo=1"
   * </pre>
   *
   * <code>string path_redirect = 2 [(.validate.rules) = { ... }</code>
   * @return The bytes for pathRedirect.
   */
  com.google.protobuf.ByteString
      getPathRedirectBytes();

  /**
   * <pre>
   * Indicates that during redirection, the matched prefix (or path)
   * should be swapped with this value. This option allows redirect URLs be dynamically created
   * based on the request.
   * .. attention::
   *   Pay attention to the use of trailing slashes as mentioned in
   *   :ref:`RouteAction's prefix_rewrite &lt;envoy_api_field_config.route.v3.RouteAction.prefix_rewrite&gt;`.
   * </pre>
   *
   * <code>string prefix_rewrite = 5 [(.validate.rules) = { ... }</code>
   * @return Whether the prefixRewrite field is set.
   */
  boolean hasPrefixRewrite();
  /**
   * <pre>
   * Indicates that during redirection, the matched prefix (or path)
   * should be swapped with this value. This option allows redirect URLs be dynamically created
   * based on the request.
   * .. attention::
   *   Pay attention to the use of trailing slashes as mentioned in
   *   :ref:`RouteAction's prefix_rewrite &lt;envoy_api_field_config.route.v3.RouteAction.prefix_rewrite&gt;`.
   * </pre>
   *
   * <code>string prefix_rewrite = 5 [(.validate.rules) = { ... }</code>
   * @return The prefixRewrite.
   */
  java.lang.String getPrefixRewrite();
  /**
   * <pre>
   * Indicates that during redirection, the matched prefix (or path)
   * should be swapped with this value. This option allows redirect URLs be dynamically created
   * based on the request.
   * .. attention::
   *   Pay attention to the use of trailing slashes as mentioned in
   *   :ref:`RouteAction's prefix_rewrite &lt;envoy_api_field_config.route.v3.RouteAction.prefix_rewrite&gt;`.
   * </pre>
   *
   * <code>string prefix_rewrite = 5 [(.validate.rules) = { ... }</code>
   * @return The bytes for prefixRewrite.
   */
  com.google.protobuf.ByteString
      getPrefixRewriteBytes();

  /**
   * <pre>
   * Indicates that during redirect, portions of the path that match the
   * pattern should be rewritten, even allowing the substitution of capture
   * groups from the pattern into the new path as specified by the rewrite
   * substitution string. This is useful to allow application paths to be
   * rewritten in a way that is aware of segments with variable content like
   * identifiers.
   * Examples using Google's `RE2 &lt;https://github.com/google/re2&gt;`_ engine:
   * * The path pattern ``^/service/([^/]+)(/.*)$`` paired with a substitution
   *   string of ``&#92;2/instance/&#92;1`` would transform ``/service/foo/v1/api``
   *   into ``/v1/api/instance/foo``.
   * * The pattern ``one`` paired with a substitution string of ``two`` would
   *   transform ``/xxx/one/yyy/one/zzz`` into ``/xxx/two/yyy/two/zzz``.
   * * The pattern ``^(.*?)one(.*)$`` paired with a substitution string of
   *   ``&#92;1two&#92;2`` would replace only the first occurrence of ``one``,
   *   transforming path ``/xxx/one/yyy/one/zzz`` into ``/xxx/two/yyy/one/zzz``.
   * * The pattern ``(?i)/xxx/`` paired with a substitution string of ``/yyy/``
   *   would do a case-insensitive match and transform path ``/aaa/XxX/bbb`` to
   *   ``/aaa/yyy/bbb``.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.RegexMatchAndSubstitute regex_rewrite = 9;</code>
   * @return Whether the regexRewrite field is set.
   */
  boolean hasRegexRewrite();
  /**
   * <pre>
   * Indicates that during redirect, portions of the path that match the
   * pattern should be rewritten, even allowing the substitution of capture
   * groups from the pattern into the new path as specified by the rewrite
   * substitution string. This is useful to allow application paths to be
   * rewritten in a way that is aware of segments with variable content like
   * identifiers.
   * Examples using Google's `RE2 &lt;https://github.com/google/re2&gt;`_ engine:
   * * The path pattern ``^/service/([^/]+)(/.*)$`` paired with a substitution
   *   string of ``&#92;2/instance/&#92;1`` would transform ``/service/foo/v1/api``
   *   into ``/v1/api/instance/foo``.
   * * The pattern ``one`` paired with a substitution string of ``two`` would
   *   transform ``/xxx/one/yyy/one/zzz`` into ``/xxx/two/yyy/two/zzz``.
   * * The pattern ``^(.*?)one(.*)$`` paired with a substitution string of
   *   ``&#92;1two&#92;2`` would replace only the first occurrence of ``one``,
   *   transforming path ``/xxx/one/yyy/one/zzz`` into ``/xxx/two/yyy/one/zzz``.
   * * The pattern ``(?i)/xxx/`` paired with a substitution string of ``/yyy/``
   *   would do a case-insensitive match and transform path ``/aaa/XxX/bbb`` to
   *   ``/aaa/yyy/bbb``.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.RegexMatchAndSubstitute regex_rewrite = 9;</code>
   * @return The regexRewrite.
   */
  io.envoyproxy.envoy.type.matcher.v3.RegexMatchAndSubstitute getRegexRewrite();
  /**
   * <pre>
   * Indicates that during redirect, portions of the path that match the
   * pattern should be rewritten, even allowing the substitution of capture
   * groups from the pattern into the new path as specified by the rewrite
   * substitution string. This is useful to allow application paths to be
   * rewritten in a way that is aware of segments with variable content like
   * identifiers.
   * Examples using Google's `RE2 &lt;https://github.com/google/re2&gt;`_ engine:
   * * The path pattern ``^/service/([^/]+)(/.*)$`` paired with a substitution
   *   string of ``&#92;2/instance/&#92;1`` would transform ``/service/foo/v1/api``
   *   into ``/v1/api/instance/foo``.
   * * The pattern ``one`` paired with a substitution string of ``two`` would
   *   transform ``/xxx/one/yyy/one/zzz`` into ``/xxx/two/yyy/two/zzz``.
   * * The pattern ``^(.*?)one(.*)$`` paired with a substitution string of
   *   ``&#92;1two&#92;2`` would replace only the first occurrence of ``one``,
   *   transforming path ``/xxx/one/yyy/one/zzz`` into ``/xxx/two/yyy/one/zzz``.
   * * The pattern ``(?i)/xxx/`` paired with a substitution string of ``/yyy/``
   *   would do a case-insensitive match and transform path ``/aaa/XxX/bbb`` to
   *   ``/aaa/yyy/bbb``.
   * </pre>
   *
   * <code>.envoy.type.matcher.v3.RegexMatchAndSubstitute regex_rewrite = 9;</code>
   */
  io.envoyproxy.envoy.type.matcher.v3.RegexMatchAndSubstituteOrBuilder getRegexRewriteOrBuilder();

  /**
   * <pre>
   * The HTTP status code to use in the redirect response. The default response
   * code is MOVED_PERMANENTLY (301).
   * </pre>
   *
   * <code>.envoy.config.route.v3.RedirectAction.RedirectResponseCode response_code = 3 [(.validate.rules) = { ... }</code>
   * @return The enum numeric value on the wire for responseCode.
   */
  int getResponseCodeValue();
  /**
   * <pre>
   * The HTTP status code to use in the redirect response. The default response
   * code is MOVED_PERMANENTLY (301).
   * </pre>
   *
   * <code>.envoy.config.route.v3.RedirectAction.RedirectResponseCode response_code = 3 [(.validate.rules) = { ... }</code>
   * @return The responseCode.
   */
  io.envoyproxy.envoy.config.route.v3.RedirectAction.RedirectResponseCode getResponseCode();

  /**
   * <pre>
   * Indicates that during redirection, the query portion of the URL will
   * be removed. Default value is false.
   * </pre>
   *
   * <code>bool strip_query = 6;</code>
   * @return The stripQuery.
   */
  boolean getStripQuery();

  public io.envoyproxy.envoy.config.route.v3.RedirectAction.SchemeRewriteSpecifierCase getSchemeRewriteSpecifierCase();

  public io.envoyproxy.envoy.config.route.v3.RedirectAction.PathRewriteSpecifierCase getPathRewriteSpecifierCase();
}
