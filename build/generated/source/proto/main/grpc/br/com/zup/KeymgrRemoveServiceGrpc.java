package br.com.zup;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: keymgr.proto")
public final class KeymgrRemoveServiceGrpc {

  private KeymgrRemoveServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.KeymgrRemoveService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.KeymgrExcludeRequest,
      br.com.zup.KeymgrExcludeResponse> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "remove",
      requestType = br.com.zup.KeymgrExcludeRequest.class,
      responseType = br.com.zup.KeymgrExcludeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.KeymgrExcludeRequest,
      br.com.zup.KeymgrExcludeResponse> getRemoveMethod() {
    io.grpc.MethodDescriptor<br.com.zup.KeymgrExcludeRequest, br.com.zup.KeymgrExcludeResponse> getRemoveMethod;
    if ((getRemoveMethod = KeymgrRemoveServiceGrpc.getRemoveMethod) == null) {
      synchronized (KeymgrRemoveServiceGrpc.class) {
        if ((getRemoveMethod = KeymgrRemoveServiceGrpc.getRemoveMethod) == null) {
          KeymgrRemoveServiceGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<br.com.zup.KeymgrExcludeRequest, br.com.zup.KeymgrExcludeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.KeymgrExcludeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.KeymgrExcludeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeymgrRemoveServiceMethodDescriptorSupplier("remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeymgrRemoveServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymgrRemoveServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymgrRemoveServiceStub>() {
        @java.lang.Override
        public KeymgrRemoveServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymgrRemoveServiceStub(channel, callOptions);
        }
      };
    return KeymgrRemoveServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeymgrRemoveServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymgrRemoveServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymgrRemoveServiceBlockingStub>() {
        @java.lang.Override
        public KeymgrRemoveServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymgrRemoveServiceBlockingStub(channel, callOptions);
        }
      };
    return KeymgrRemoveServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeymgrRemoveServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymgrRemoveServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymgrRemoveServiceFutureStub>() {
        @java.lang.Override
        public KeymgrRemoveServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymgrRemoveServiceFutureStub(channel, callOptions);
        }
      };
    return KeymgrRemoveServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeymgrRemoveServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void remove(br.com.zup.KeymgrExcludeRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.KeymgrExcludeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.KeymgrExcludeRequest,
                br.com.zup.KeymgrExcludeResponse>(
                  this, METHODID_REMOVE)))
          .build();
    }
  }

  /**
   */
  public static final class KeymgrRemoveServiceStub extends io.grpc.stub.AbstractAsyncStub<KeymgrRemoveServiceStub> {
    private KeymgrRemoveServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymgrRemoveServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymgrRemoveServiceStub(channel, callOptions);
    }

    /**
     */
    public void remove(br.com.zup.KeymgrExcludeRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.KeymgrExcludeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeymgrRemoveServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeymgrRemoveServiceBlockingStub> {
    private KeymgrRemoveServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymgrRemoveServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymgrRemoveServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.KeymgrExcludeResponse remove(br.com.zup.KeymgrExcludeRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeymgrRemoveServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeymgrRemoveServiceFutureStub> {
    private KeymgrRemoveServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymgrRemoveServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymgrRemoveServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.KeymgrExcludeResponse> remove(
        br.com.zup.KeymgrExcludeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REMOVE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeymgrRemoveServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeymgrRemoveServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REMOVE:
          serviceImpl.remove((br.com.zup.KeymgrExcludeRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.KeymgrExcludeResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class KeymgrRemoveServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeymgrRemoveServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.Keymgr.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeymgrRemoveService");
    }
  }

  private static final class KeymgrRemoveServiceFileDescriptorSupplier
      extends KeymgrRemoveServiceBaseDescriptorSupplier {
    KeymgrRemoveServiceFileDescriptorSupplier() {}
  }

  private static final class KeymgrRemoveServiceMethodDescriptorSupplier
      extends KeymgrRemoveServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeymgrRemoveServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (KeymgrRemoveServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeymgrRemoveServiceFileDescriptorSupplier())
              .addMethod(getRemoveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
