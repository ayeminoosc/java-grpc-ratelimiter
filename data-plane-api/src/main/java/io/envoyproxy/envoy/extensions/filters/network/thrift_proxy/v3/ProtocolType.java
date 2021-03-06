// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/thrift_proxy/v3/thrift_proxy.proto

package io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3;

/**
 * <pre>
 * Thrift Protocol types supported by Envoy.
 * </pre>
 *
 * Protobuf enum {@code envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType}
 */
public enum ProtocolType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * For downstream connections, the Thrift proxy will attempt to determine which protocol to use.
   * Note that the older, non-strict (or lax) binary protocol is not included in automatic protocol
   * detection. For upstream connections, the Thrift proxy will use the same protocol as the
   * downstream connection.
   * </pre>
   *
   * <code>AUTO_PROTOCOL = 0;</code>
   */
  AUTO_PROTOCOL(0),
  /**
   * <pre>
   * The Thrift proxy will use the Thrift binary protocol.
   * </pre>
   *
   * <code>BINARY = 1;</code>
   */
  BINARY(1),
  /**
   * <pre>
   * The Thrift proxy will use Thrift non-strict binary protocol.
   * </pre>
   *
   * <code>LAX_BINARY = 2;</code>
   */
  LAX_BINARY(2),
  /**
   * <pre>
   * The Thrift proxy will use the Thrift compact protocol.
   * </pre>
   *
   * <code>COMPACT = 3;</code>
   */
  COMPACT(3),
  /**
   * <pre>
   * The Thrift proxy will use the Thrift "Twitter" protocol implemented by the finagle library.
   * </pre>
   *
   * <code>TWITTER = 4;</code>
   */
  TWITTER(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * For downstream connections, the Thrift proxy will attempt to determine which protocol to use.
   * Note that the older, non-strict (or lax) binary protocol is not included in automatic protocol
   * detection. For upstream connections, the Thrift proxy will use the same protocol as the
   * downstream connection.
   * </pre>
   *
   * <code>AUTO_PROTOCOL = 0;</code>
   */
  public static final int AUTO_PROTOCOL_VALUE = 0;
  /**
   * <pre>
   * The Thrift proxy will use the Thrift binary protocol.
   * </pre>
   *
   * <code>BINARY = 1;</code>
   */
  public static final int BINARY_VALUE = 1;
  /**
   * <pre>
   * The Thrift proxy will use Thrift non-strict binary protocol.
   * </pre>
   *
   * <code>LAX_BINARY = 2;</code>
   */
  public static final int LAX_BINARY_VALUE = 2;
  /**
   * <pre>
   * The Thrift proxy will use the Thrift compact protocol.
   * </pre>
   *
   * <code>COMPACT = 3;</code>
   */
  public static final int COMPACT_VALUE = 3;
  /**
   * <pre>
   * The Thrift proxy will use the Thrift "Twitter" protocol implemented by the finagle library.
   * </pre>
   *
   * <code>TWITTER = 4;</code>
   */
  public static final int TWITTER_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ProtocolType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ProtocolType forNumber(int value) {
    switch (value) {
      case 0: return AUTO_PROTOCOL;
      case 1: return BINARY;
      case 2: return LAX_BINARY;
      case 3: return COMPACT;
      case 4: return TWITTER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ProtocolType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ProtocolType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ProtocolType>() {
          public ProtocolType findValueByNumber(int number) {
            return ProtocolType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.envoyproxy.envoy.extensions.filters.network.thrift_proxy.v3.ThriftProxyProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final ProtocolType[] VALUES = values();

  public static ProtocolType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ProtocolType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:envoy.extensions.filters.network.thrift_proxy.v3.ProtocolType)
}

