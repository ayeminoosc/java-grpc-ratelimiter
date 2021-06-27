// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HelloService.proto

package com.ayemin.grpc.proto;

/**
 * Protobuf service {@code com.ayemin.grpc.proto.HelloService}
 */
public  abstract class HelloService
    implements com.google.protobuf.Service {
  protected HelloService() {}

  public interface Interface {
    /**
     * <code>rpc hello(.com.ayemin.grpc.proto.HelloRequest) returns (.com.ayemin.grpc.proto.HelloResponse);</code>
     */
    public abstract void hello(
        com.google.protobuf.RpcController controller,
        com.ayemin.grpc.proto.HelloRequest request,
        com.google.protobuf.RpcCallback<com.ayemin.grpc.proto.HelloResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new HelloService() {
      @java.lang.Override
      public  void hello(
          com.google.protobuf.RpcController controller,
          com.ayemin.grpc.proto.HelloRequest request,
          com.google.protobuf.RpcCallback<com.ayemin.grpc.proto.HelloResponse> done) {
        impl.hello(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.hello(controller, (com.ayemin.grpc.proto.HelloRequest)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.ayemin.grpc.proto.HelloRequest.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return com.ayemin.grpc.proto.HelloResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc hello(.com.ayemin.grpc.proto.HelloRequest) returns (.com.ayemin.grpc.proto.HelloResponse);</code>
   */
  public abstract void hello(
      com.google.protobuf.RpcController controller,
      com.ayemin.grpc.proto.HelloRequest request,
      com.google.protobuf.RpcCallback<com.ayemin.grpc.proto.HelloResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return com.ayemin.grpc.proto.HelloServiceOuterClass.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.hello(controller, (com.ayemin.grpc.proto.HelloRequest)request,
          com.google.protobuf.RpcUtil.<com.ayemin.grpc.proto.HelloResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.ayemin.grpc.proto.HelloRequest.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return com.ayemin.grpc.proto.HelloResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends com.ayemin.grpc.proto.HelloService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void hello(
        com.google.protobuf.RpcController controller,
        com.ayemin.grpc.proto.HelloRequest request,
        com.google.protobuf.RpcCallback<com.ayemin.grpc.proto.HelloResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.ayemin.grpc.proto.HelloResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          com.ayemin.grpc.proto.HelloResponse.class,
          com.ayemin.grpc.proto.HelloResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public com.ayemin.grpc.proto.HelloResponse hello(
        com.google.protobuf.RpcController controller,
        com.ayemin.grpc.proto.HelloRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public com.ayemin.grpc.proto.HelloResponse hello(
        com.google.protobuf.RpcController controller,
        com.ayemin.grpc.proto.HelloRequest request)
        throws com.google.protobuf.ServiceException {
      return (com.ayemin.grpc.proto.HelloResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        com.ayemin.grpc.proto.HelloResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:com.ayemin.grpc.proto.HelloService)
}

