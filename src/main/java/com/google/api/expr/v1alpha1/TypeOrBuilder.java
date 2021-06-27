// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/expr/v1alpha1/checked.proto

package com.google.api.expr.v1alpha1;

public interface TypeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1alpha1.Type)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Dynamic type.
   * </pre>
   *
   * <code>.google.protobuf.Empty dyn = 1;</code>
   * @return Whether the dyn field is set.
   */
  boolean hasDyn();
  /**
   * <pre>
   * Dynamic type.
   * </pre>
   *
   * <code>.google.protobuf.Empty dyn = 1;</code>
   * @return The dyn.
   */
  com.google.protobuf.Empty getDyn();
  /**
   * <pre>
   * Dynamic type.
   * </pre>
   *
   * <code>.google.protobuf.Empty dyn = 1;</code>
   */
  com.google.protobuf.EmptyOrBuilder getDynOrBuilder();

  /**
   * <pre>
   * Null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null = 2;</code>
   * @return Whether the null field is set.
   */
  boolean hasNull();
  /**
   * <pre>
   * Null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null = 2;</code>
   * @return The enum numeric value on the wire for null.
   */
  int getNullValue();
  /**
   * <pre>
   * Null value.
   * </pre>
   *
   * <code>.google.protobuf.NullValue null = 2;</code>
   * @return The null.
   */
  com.google.protobuf.NullValue getNull();

  /**
   * <pre>
   * Primitive types: `true`, `1u`, `-2.0`, `'string'`, `b'bytes'`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.PrimitiveType primitive = 3;</code>
   * @return Whether the primitive field is set.
   */
  boolean hasPrimitive();
  /**
   * <pre>
   * Primitive types: `true`, `1u`, `-2.0`, `'string'`, `b'bytes'`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.PrimitiveType primitive = 3;</code>
   * @return The enum numeric value on the wire for primitive.
   */
  int getPrimitiveValue();
  /**
   * <pre>
   * Primitive types: `true`, `1u`, `-2.0`, `'string'`, `b'bytes'`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.PrimitiveType primitive = 3;</code>
   * @return The primitive.
   */
  com.google.api.expr.v1alpha1.Type.PrimitiveType getPrimitive();

  /**
   * <pre>
   * Wrapper of a primitive type, e.g. `google.protobuf.Int64Value`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.PrimitiveType wrapper = 4;</code>
   * @return Whether the wrapper field is set.
   */
  boolean hasWrapper();
  /**
   * <pre>
   * Wrapper of a primitive type, e.g. `google.protobuf.Int64Value`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.PrimitiveType wrapper = 4;</code>
   * @return The enum numeric value on the wire for wrapper.
   */
  int getWrapperValue();
  /**
   * <pre>
   * Wrapper of a primitive type, e.g. `google.protobuf.Int64Value`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.PrimitiveType wrapper = 4;</code>
   * @return The wrapper.
   */
  com.google.api.expr.v1alpha1.Type.PrimitiveType getWrapper();

  /**
   * <pre>
   * Well-known protobuf type such as `google.protobuf.Timestamp`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.WellKnownType well_known = 5;</code>
   * @return Whether the wellKnown field is set.
   */
  boolean hasWellKnown();
  /**
   * <pre>
   * Well-known protobuf type such as `google.protobuf.Timestamp`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.WellKnownType well_known = 5;</code>
   * @return The enum numeric value on the wire for wellKnown.
   */
  int getWellKnownValue();
  /**
   * <pre>
   * Well-known protobuf type such as `google.protobuf.Timestamp`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.WellKnownType well_known = 5;</code>
   * @return The wellKnown.
   */
  com.google.api.expr.v1alpha1.Type.WellKnownType getWellKnown();

  /**
   * <pre>
   * Parameterized list with elements of `list_type`, e.g. `list&lt;timestamp&gt;`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.ListType list_type = 6;</code>
   * @return Whether the listType field is set.
   */
  boolean hasListType();
  /**
   * <pre>
   * Parameterized list with elements of `list_type`, e.g. `list&lt;timestamp&gt;`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.ListType list_type = 6;</code>
   * @return The listType.
   */
  com.google.api.expr.v1alpha1.Type.ListType getListType();
  /**
   * <pre>
   * Parameterized list with elements of `list_type`, e.g. `list&lt;timestamp&gt;`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.ListType list_type = 6;</code>
   */
  com.google.api.expr.v1alpha1.Type.ListTypeOrBuilder getListTypeOrBuilder();

  /**
   * <pre>
   * Parameterized map with typed keys and values.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.MapType map_type = 7;</code>
   * @return Whether the mapType field is set.
   */
  boolean hasMapType();
  /**
   * <pre>
   * Parameterized map with typed keys and values.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.MapType map_type = 7;</code>
   * @return The mapType.
   */
  com.google.api.expr.v1alpha1.Type.MapType getMapType();
  /**
   * <pre>
   * Parameterized map with typed keys and values.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.MapType map_type = 7;</code>
   */
  com.google.api.expr.v1alpha1.Type.MapTypeOrBuilder getMapTypeOrBuilder();

  /**
   * <pre>
   * Function type.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.FunctionType function = 8;</code>
   * @return Whether the function field is set.
   */
  boolean hasFunction();
  /**
   * <pre>
   * Function type.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.FunctionType function = 8;</code>
   * @return The function.
   */
  com.google.api.expr.v1alpha1.Type.FunctionType getFunction();
  /**
   * <pre>
   * Function type.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.FunctionType function = 8;</code>
   */
  com.google.api.expr.v1alpha1.Type.FunctionTypeOrBuilder getFunctionOrBuilder();

  /**
   * <pre>
   * Protocol buffer message type.
   * The `message_type` string specifies the qualified message type name. For
   * example, `google.plus.Profile`.
   * </pre>
   *
   * <code>string message_type = 9;</code>
   * @return Whether the messageType field is set.
   */
  boolean hasMessageType();
  /**
   * <pre>
   * Protocol buffer message type.
   * The `message_type` string specifies the qualified message type name. For
   * example, `google.plus.Profile`.
   * </pre>
   *
   * <code>string message_type = 9;</code>
   * @return The messageType.
   */
  java.lang.String getMessageType();
  /**
   * <pre>
   * Protocol buffer message type.
   * The `message_type` string specifies the qualified message type name. For
   * example, `google.plus.Profile`.
   * </pre>
   *
   * <code>string message_type = 9;</code>
   * @return The bytes for messageType.
   */
  com.google.protobuf.ByteString
      getMessageTypeBytes();

  /**
   * <pre>
   * Type param type.
   * The `type_param` string specifies the type parameter name, e.g. `list&lt;E&gt;`
   * would be a `list_type` whose element type was a `type_param` type
   * named `E`.
   * </pre>
   *
   * <code>string type_param = 10;</code>
   * @return Whether the typeParam field is set.
   */
  boolean hasTypeParam();
  /**
   * <pre>
   * Type param type.
   * The `type_param` string specifies the type parameter name, e.g. `list&lt;E&gt;`
   * would be a `list_type` whose element type was a `type_param` type
   * named `E`.
   * </pre>
   *
   * <code>string type_param = 10;</code>
   * @return The typeParam.
   */
  java.lang.String getTypeParam();
  /**
   * <pre>
   * Type param type.
   * The `type_param` string specifies the type parameter name, e.g. `list&lt;E&gt;`
   * would be a `list_type` whose element type was a `type_param` type
   * named `E`.
   * </pre>
   *
   * <code>string type_param = 10;</code>
   * @return The bytes for typeParam.
   */
  com.google.protobuf.ByteString
      getTypeParamBytes();

  /**
   * <pre>
   * Type type.
   * The `type` value specifies the target type. e.g. int is type with a
   * target type of `Primitive.INT`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type type = 11;</code>
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   * <pre>
   * Type type.
   * The `type` value specifies the target type. e.g. int is type with a
   * target type of `Primitive.INT`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type type = 11;</code>
   * @return The type.
   */
  com.google.api.expr.v1alpha1.Type getType();
  /**
   * <pre>
   * Type type.
   * The `type` value specifies the target type. e.g. int is type with a
   * target type of `Primitive.INT`.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type type = 11;</code>
   */
  com.google.api.expr.v1alpha1.TypeOrBuilder getTypeOrBuilder();

  /**
   * <pre>
   * Error type.
   * During type-checking if an expression is an error, its type is propagated
   * as the `ERROR` type. This permits the type-checker to discover other
   * errors present in the expression.
   * </pre>
   *
   * <code>.google.protobuf.Empty error = 12;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <pre>
   * Error type.
   * During type-checking if an expression is an error, its type is propagated
   * as the `ERROR` type. This permits the type-checker to discover other
   * errors present in the expression.
   * </pre>
   *
   * <code>.google.protobuf.Empty error = 12;</code>
   * @return The error.
   */
  com.google.protobuf.Empty getError();
  /**
   * <pre>
   * Error type.
   * During type-checking if an expression is an error, its type is propagated
   * as the `ERROR` type. This permits the type-checker to discover other
   * errors present in the expression.
   * </pre>
   *
   * <code>.google.protobuf.Empty error = 12;</code>
   */
  com.google.protobuf.EmptyOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   * Abstract, application defined type.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.AbstractType abstract_type = 14;</code>
   * @return Whether the abstractType field is set.
   */
  boolean hasAbstractType();
  /**
   * <pre>
   * Abstract, application defined type.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.AbstractType abstract_type = 14;</code>
   * @return The abstractType.
   */
  com.google.api.expr.v1alpha1.Type.AbstractType getAbstractType();
  /**
   * <pre>
   * Abstract, application defined type.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Type.AbstractType abstract_type = 14;</code>
   */
  com.google.api.expr.v1alpha1.Type.AbstractTypeOrBuilder getAbstractTypeOrBuilder();

  public com.google.api.expr.v1alpha1.Type.TypeKindCase getTypeKindCase();
}
