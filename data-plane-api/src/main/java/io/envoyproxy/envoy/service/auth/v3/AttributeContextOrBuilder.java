// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/service/auth/v3/attribute_context.proto

package io.envoyproxy.envoy.service.auth.v3;

public interface AttributeContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.service.auth.v3.AttributeContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The source of a network activity, such as starting a TCP connection.
   * In a multi hop network activity, the source represents the sender of the
   * last hop.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.AttributeContext.Peer source = 1;</code>
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   * <pre>
   * The source of a network activity, such as starting a TCP connection.
   * In a multi hop network activity, the source represents the sender of the
   * last hop.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.AttributeContext.Peer source = 1;</code>
   * @return The source.
   */
  io.envoyproxy.envoy.service.auth.v3.AttributeContext.Peer getSource();
  /**
   * <pre>
   * The source of a network activity, such as starting a TCP connection.
   * In a multi hop network activity, the source represents the sender of the
   * last hop.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.AttributeContext.Peer source = 1;</code>
   */
  io.envoyproxy.envoy.service.auth.v3.AttributeContext.PeerOrBuilder getSourceOrBuilder();

  /**
   * <pre>
   * The destination of a network activity, such as accepting a TCP connection.
   * In a multi hop network activity, the destination represents the receiver of
   * the last hop.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.AttributeContext.Peer destination = 2;</code>
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   * <pre>
   * The destination of a network activity, such as accepting a TCP connection.
   * In a multi hop network activity, the destination represents the receiver of
   * the last hop.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.AttributeContext.Peer destination = 2;</code>
   * @return The destination.
   */
  io.envoyproxy.envoy.service.auth.v3.AttributeContext.Peer getDestination();
  /**
   * <pre>
   * The destination of a network activity, such as accepting a TCP connection.
   * In a multi hop network activity, the destination represents the receiver of
   * the last hop.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.AttributeContext.Peer destination = 2;</code>
   */
  io.envoyproxy.envoy.service.auth.v3.AttributeContext.PeerOrBuilder getDestinationOrBuilder();

  /**
   * <pre>
   * Represents a network request, such as an HTTP request.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.AttributeContext.Request request = 4;</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <pre>
   * Represents a network request, such as an HTTP request.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.AttributeContext.Request request = 4;</code>
   * @return The request.
   */
  io.envoyproxy.envoy.service.auth.v3.AttributeContext.Request getRequest();
  /**
   * <pre>
   * Represents a network request, such as an HTTP request.
   * </pre>
   *
   * <code>.envoy.service.auth.v3.AttributeContext.Request request = 4;</code>
   */
  io.envoyproxy.envoy.service.auth.v3.AttributeContext.RequestOrBuilder getRequestOrBuilder();

  /**
   * <pre>
   * This is analogous to http_request.headers, however these contents will not be sent to the
   * upstream server. Context_extensions provide an extension mechanism for sending additional
   * information to the auth server without modifying the proto definition. It maps to the
   * internal opaque context in the filter chain.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context_extensions = 10;</code>
   */
  int getContextExtensionsCount();
  /**
   * <pre>
   * This is analogous to http_request.headers, however these contents will not be sent to the
   * upstream server. Context_extensions provide an extension mechanism for sending additional
   * information to the auth server without modifying the proto definition. It maps to the
   * internal opaque context in the filter chain.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context_extensions = 10;</code>
   */
  boolean containsContextExtensions(
      java.lang.String key);
  /**
   * Use {@link #getContextExtensionsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getContextExtensions();
  /**
   * <pre>
   * This is analogous to http_request.headers, however these contents will not be sent to the
   * upstream server. Context_extensions provide an extension mechanism for sending additional
   * information to the auth server without modifying the proto definition. It maps to the
   * internal opaque context in the filter chain.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context_extensions = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getContextExtensionsMap();
  /**
   * <pre>
   * This is analogous to http_request.headers, however these contents will not be sent to the
   * upstream server. Context_extensions provide an extension mechanism for sending additional
   * information to the auth server without modifying the proto definition. It maps to the
   * internal opaque context in the filter chain.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context_extensions = 10;</code>
   */

  java.lang.String getContextExtensionsOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * This is analogous to http_request.headers, however these contents will not be sent to the
   * upstream server. Context_extensions provide an extension mechanism for sending additional
   * information to the auth server without modifying the proto definition. It maps to the
   * internal opaque context in the filter chain.
   * </pre>
   *
   * <code>map&lt;string, string&gt; context_extensions = 10;</code>
   */

  java.lang.String getContextExtensionsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Dynamic metadata associated with the request.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata_context = 11;</code>
   * @return Whether the metadataContext field is set.
   */
  boolean hasMetadataContext();
  /**
   * <pre>
   * Dynamic metadata associated with the request.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata_context = 11;</code>
   * @return The metadataContext.
   */
  io.envoyproxy.envoy.config.core.v3.Metadata getMetadataContext();
  /**
   * <pre>
   * Dynamic metadata associated with the request.
   * </pre>
   *
   * <code>.envoy.config.core.v3.Metadata metadata_context = 11;</code>
   */
  io.envoyproxy.envoy.config.core.v3.MetadataOrBuilder getMetadataContextOrBuilder();
}