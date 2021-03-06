// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/common/matcher/v3/matcher.proto

package io.envoyproxy.envoy.config.common.matcher.v3;

public interface MatchPredicateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.common.matcher.v3.MatchPredicate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A set that describes a logical OR. If any member of the set matches, the match configuration
   * matches.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.MatchPredicate.MatchSet or_match = 1;</code>
   * @return Whether the orMatch field is set.
   */
  boolean hasOrMatch();
  /**
   * <pre>
   * A set that describes a logical OR. If any member of the set matches, the match configuration
   * matches.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.MatchPredicate.MatchSet or_match = 1;</code>
   * @return The orMatch.
   */
  io.envoyproxy.envoy.config.common.matcher.v3.MatchPredicate.MatchSet getOrMatch();
  /**
   * <pre>
   * A set that describes a logical OR. If any member of the set matches, the match configuration
   * matches.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.MatchPredicate.MatchSet or_match = 1;</code>
   */
  io.envoyproxy.envoy.config.common.matcher.v3.MatchPredicate.MatchSetOrBuilder getOrMatchOrBuilder();

  /**
   * <pre>
   * A set that describes a logical AND. If all members of the set match, the match configuration
   * matches.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.MatchPredicate.MatchSet and_match = 2;</code>
   * @return Whether the andMatch field is set.
   */
  boolean hasAndMatch();
  /**
   * <pre>
   * A set that describes a logical AND. If all members of the set match, the match configuration
   * matches.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.MatchPredicate.MatchSet and_match = 2;</code>
   * @return The andMatch.
   */
  io.envoyproxy.envoy.config.common.matcher.v3.MatchPredicate.MatchSet getAndMatch();
  /**
   * <pre>
   * A set that describes a logical AND. If all members of the set match, the match configuration
   * matches.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.MatchPredicate.MatchSet and_match = 2;</code>
   */
  io.envoyproxy.envoy.config.common.matcher.v3.MatchPredicate.MatchSetOrBuilder getAndMatchOrBuilder();

  /**
   * <pre>
   * A negation match. The match configuration will match if the negated match condition matches.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.MatchPredicate not_match = 3;</code>
   * @return Whether the notMatch field is set.
   */
  boolean hasNotMatch();
  /**
   * <pre>
   * A negation match. The match configuration will match if the negated match condition matches.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.MatchPredicate not_match = 3;</code>
   * @return The notMatch.
   */
  io.envoyproxy.envoy.config.common.matcher.v3.MatchPredicate getNotMatch();
  /**
   * <pre>
   * A negation match. The match configuration will match if the negated match condition matches.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.MatchPredicate not_match = 3;</code>
   */
  io.envoyproxy.envoy.config.common.matcher.v3.MatchPredicateOrBuilder getNotMatchOrBuilder();

  /**
   * <pre>
   * The match configuration will always match.
   * </pre>
   *
   * <code>bool any_match = 4 [(.validate.rules) = { ... }</code>
   * @return Whether the anyMatch field is set.
   */
  boolean hasAnyMatch();
  /**
   * <pre>
   * The match configuration will always match.
   * </pre>
   *
   * <code>bool any_match = 4 [(.validate.rules) = { ... }</code>
   * @return The anyMatch.
   */
  boolean getAnyMatch();

  /**
   * <pre>
   * HTTP request headers match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpHeadersMatch http_request_headers_match = 5;</code>
   * @return Whether the httpRequestHeadersMatch field is set.
   */
  boolean hasHttpRequestHeadersMatch();
  /**
   * <pre>
   * HTTP request headers match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpHeadersMatch http_request_headers_match = 5;</code>
   * @return The httpRequestHeadersMatch.
   */
  io.envoyproxy.envoy.config.common.matcher.v3.HttpHeadersMatch getHttpRequestHeadersMatch();
  /**
   * <pre>
   * HTTP request headers match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpHeadersMatch http_request_headers_match = 5;</code>
   */
  io.envoyproxy.envoy.config.common.matcher.v3.HttpHeadersMatchOrBuilder getHttpRequestHeadersMatchOrBuilder();

  /**
   * <pre>
   * HTTP request trailers match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpHeadersMatch http_request_trailers_match = 6;</code>
   * @return Whether the httpRequestTrailersMatch field is set.
   */
  boolean hasHttpRequestTrailersMatch();
  /**
   * <pre>
   * HTTP request trailers match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpHeadersMatch http_request_trailers_match = 6;</code>
   * @return The httpRequestTrailersMatch.
   */
  io.envoyproxy.envoy.config.common.matcher.v3.HttpHeadersMatch getHttpRequestTrailersMatch();
  /**
   * <pre>
   * HTTP request trailers match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpHeadersMatch http_request_trailers_match = 6;</code>
   */
  io.envoyproxy.envoy.config.common.matcher.v3.HttpHeadersMatchOrBuilder getHttpRequestTrailersMatchOrBuilder();

  /**
   * <pre>
   * HTTP response headers match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpHeadersMatch http_response_headers_match = 7;</code>
   * @return Whether the httpResponseHeadersMatch field is set.
   */
  boolean hasHttpResponseHeadersMatch();
  /**
   * <pre>
   * HTTP response headers match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpHeadersMatch http_response_headers_match = 7;</code>
   * @return The httpResponseHeadersMatch.
   */
  io.envoyproxy.envoy.config.common.matcher.v3.HttpHeadersMatch getHttpResponseHeadersMatch();
  /**
   * <pre>
   * HTTP response headers match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpHeadersMatch http_response_headers_match = 7;</code>
   */
  io.envoyproxy.envoy.config.common.matcher.v3.HttpHeadersMatchOrBuilder getHttpResponseHeadersMatchOrBuilder();

  /**
   * <pre>
   * HTTP response trailers match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpHeadersMatch http_response_trailers_match = 8;</code>
   * @return Whether the httpResponseTrailersMatch field is set.
   */
  boolean hasHttpResponseTrailersMatch();
  /**
   * <pre>
   * HTTP response trailers match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpHeadersMatch http_response_trailers_match = 8;</code>
   * @return The httpResponseTrailersMatch.
   */
  io.envoyproxy.envoy.config.common.matcher.v3.HttpHeadersMatch getHttpResponseTrailersMatch();
  /**
   * <pre>
   * HTTP response trailers match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpHeadersMatch http_response_trailers_match = 8;</code>
   */
  io.envoyproxy.envoy.config.common.matcher.v3.HttpHeadersMatchOrBuilder getHttpResponseTrailersMatchOrBuilder();

  /**
   * <pre>
   * HTTP request generic body match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpGenericBodyMatch http_request_generic_body_match = 9;</code>
   * @return Whether the httpRequestGenericBodyMatch field is set.
   */
  boolean hasHttpRequestGenericBodyMatch();
  /**
   * <pre>
   * HTTP request generic body match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpGenericBodyMatch http_request_generic_body_match = 9;</code>
   * @return The httpRequestGenericBodyMatch.
   */
  io.envoyproxy.envoy.config.common.matcher.v3.HttpGenericBodyMatch getHttpRequestGenericBodyMatch();
  /**
   * <pre>
   * HTTP request generic body match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpGenericBodyMatch http_request_generic_body_match = 9;</code>
   */
  io.envoyproxy.envoy.config.common.matcher.v3.HttpGenericBodyMatchOrBuilder getHttpRequestGenericBodyMatchOrBuilder();

  /**
   * <pre>
   * HTTP response generic body match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpGenericBodyMatch http_response_generic_body_match = 10;</code>
   * @return Whether the httpResponseGenericBodyMatch field is set.
   */
  boolean hasHttpResponseGenericBodyMatch();
  /**
   * <pre>
   * HTTP response generic body match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpGenericBodyMatch http_response_generic_body_match = 10;</code>
   * @return The httpResponseGenericBodyMatch.
   */
  io.envoyproxy.envoy.config.common.matcher.v3.HttpGenericBodyMatch getHttpResponseGenericBodyMatch();
  /**
   * <pre>
   * HTTP response generic body match configuration.
   * </pre>
   *
   * <code>.envoy.config.common.matcher.v3.HttpGenericBodyMatch http_response_generic_body_match = 10;</code>
   */
  io.envoyproxy.envoy.config.common.matcher.v3.HttpGenericBodyMatchOrBuilder getHttpResponseGenericBodyMatchOrBuilder();

  public io.envoyproxy.envoy.config.common.matcher.v3.MatchPredicate.RuleCase getRuleCase();
}
