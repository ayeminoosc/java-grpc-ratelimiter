// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/config/bootstrap/v3/bootstrap.proto

package io.envoyproxy.envoy.config.bootstrap.v3;

public interface RuntimeLayerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.config.bootstrap.v3.RuntimeLayer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Descriptive name for the runtime layer. This is only used for the runtime
   * :http:get:`/runtime` output.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Descriptive name for the runtime layer. This is only used for the runtime
   * :http:get:`/runtime` output.
   * </pre>
   *
   * <code>string name = 1 [(.validate.rules) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * :ref:`Static runtime &lt;config_runtime_bootstrap&gt;` layer.
   * This follows the :ref:`runtime protobuf JSON representation encoding
   * &lt;config_runtime_proto_json&gt;`. Unlike static xDS resources, this static
   * layer is overridable by later layers in the runtime virtual filesystem.
   * </pre>
   *
   * <code>.google.protobuf.Struct static_layer = 2;</code>
   * @return Whether the staticLayer field is set.
   */
  boolean hasStaticLayer();
  /**
   * <pre>
   * :ref:`Static runtime &lt;config_runtime_bootstrap&gt;` layer.
   * This follows the :ref:`runtime protobuf JSON representation encoding
   * &lt;config_runtime_proto_json&gt;`. Unlike static xDS resources, this static
   * layer is overridable by later layers in the runtime virtual filesystem.
   * </pre>
   *
   * <code>.google.protobuf.Struct static_layer = 2;</code>
   * @return The staticLayer.
   */
  com.google.protobuf.Struct getStaticLayer();
  /**
   * <pre>
   * :ref:`Static runtime &lt;config_runtime_bootstrap&gt;` layer.
   * This follows the :ref:`runtime protobuf JSON representation encoding
   * &lt;config_runtime_proto_json&gt;`. Unlike static xDS resources, this static
   * layer is overridable by later layers in the runtime virtual filesystem.
   * </pre>
   *
   * <code>.google.protobuf.Struct static_layer = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getStaticLayerOrBuilder();

  /**
   * <code>.envoy.config.bootstrap.v3.RuntimeLayer.DiskLayer disk_layer = 3;</code>
   * @return Whether the diskLayer field is set.
   */
  boolean hasDiskLayer();
  /**
   * <code>.envoy.config.bootstrap.v3.RuntimeLayer.DiskLayer disk_layer = 3;</code>
   * @return The diskLayer.
   */
  io.envoyproxy.envoy.config.bootstrap.v3.RuntimeLayer.DiskLayer getDiskLayer();
  /**
   * <code>.envoy.config.bootstrap.v3.RuntimeLayer.DiskLayer disk_layer = 3;</code>
   */
  io.envoyproxy.envoy.config.bootstrap.v3.RuntimeLayer.DiskLayerOrBuilder getDiskLayerOrBuilder();

  /**
   * <code>.envoy.config.bootstrap.v3.RuntimeLayer.AdminLayer admin_layer = 4;</code>
   * @return Whether the adminLayer field is set.
   */
  boolean hasAdminLayer();
  /**
   * <code>.envoy.config.bootstrap.v3.RuntimeLayer.AdminLayer admin_layer = 4;</code>
   * @return The adminLayer.
   */
  io.envoyproxy.envoy.config.bootstrap.v3.RuntimeLayer.AdminLayer getAdminLayer();
  /**
   * <code>.envoy.config.bootstrap.v3.RuntimeLayer.AdminLayer admin_layer = 4;</code>
   */
  io.envoyproxy.envoy.config.bootstrap.v3.RuntimeLayer.AdminLayerOrBuilder getAdminLayerOrBuilder();

  /**
   * <code>.envoy.config.bootstrap.v3.RuntimeLayer.RtdsLayer rtds_layer = 5;</code>
   * @return Whether the rtdsLayer field is set.
   */
  boolean hasRtdsLayer();
  /**
   * <code>.envoy.config.bootstrap.v3.RuntimeLayer.RtdsLayer rtds_layer = 5;</code>
   * @return The rtdsLayer.
   */
  io.envoyproxy.envoy.config.bootstrap.v3.RuntimeLayer.RtdsLayer getRtdsLayer();
  /**
   * <code>.envoy.config.bootstrap.v3.RuntimeLayer.RtdsLayer rtds_layer = 5;</code>
   */
  io.envoyproxy.envoy.config.bootstrap.v3.RuntimeLayer.RtdsLayerOrBuilder getRtdsLayerOrBuilder();

  public io.envoyproxy.envoy.config.bootstrap.v3.RuntimeLayer.LayerSpecifierCase getLayerSpecifierCase();
}
