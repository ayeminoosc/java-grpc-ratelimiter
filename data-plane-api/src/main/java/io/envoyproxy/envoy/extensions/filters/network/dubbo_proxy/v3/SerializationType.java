// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: envoy/extensions/filters/network/dubbo_proxy/v3/dubbo_proxy.proto

package io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3;

/**
 * <pre>
 * Dubbo Serialization types supported by Envoy.
 * </pre>
 *
 * Protobuf enum {@code envoy.extensions.filters.network.dubbo_proxy.v3.SerializationType}
 */
public enum SerializationType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * the default serialization protocol.
   * </pre>
   *
   * <code>Hessian2 = 0;</code>
   */
  Hessian2(0),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * the default serialization protocol.
   * </pre>
   *
   * <code>Hessian2 = 0;</code>
   */
  public static final int Hessian2_VALUE = 0;


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
  public static SerializationType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SerializationType forNumber(int value) {
    switch (value) {
      case 0: return Hessian2;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SerializationType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      SerializationType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<SerializationType>() {
          public SerializationType findValueByNumber(int number) {
            return SerializationType.forNumber(number);
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
    return io.envoyproxy.envoy.extensions.filters.network.dubbo_proxy.v3.DubboProxyProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final SerializationType[] VALUES = values();

  public static SerializationType valueOf(
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

  private SerializationType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:envoy.extensions.filters.network.dubbo_proxy.v3.SerializationType)
}

