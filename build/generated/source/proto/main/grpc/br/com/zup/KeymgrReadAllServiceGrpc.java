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
public final class KeymgrReadAllServiceGrpc {

  private KeymgrReadAllServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.KeymgrReadAllService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.KeymgrReadAllRequest,
      br.com.zup.KeymgrReadAllResponse> getReadAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readAll",
      requestType = br.com.zup.KeymgrReadAllRequest.class,
      responseType = br.com.zup.KeymgrReadAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.KeymgrReadAllRequest,
      br.com.zup.KeymgrReadAllResponse> getReadAllMethod() {
    io.grpc.MethodDescriptor<br.com.zup.KeymgrReadAllRequest, br.com.zup.KeymgrReadAllResponse> getReadAllMethod;
    if ((getReadAllMethod = KeymgrReadAllServiceGrpc.getReadAllMethod) == null) {
      synchronized (KeymgrReadAllServiceGrpc.class) {
        if ((getReadAllMethod = KeymgrReadAllServiceGrpc.getReadAllMethod) == null) {
          KeymgrReadAllServiceGrpc.getReadAllMethod = getReadAllMethod =
              io.grpc.MethodDescriptor.<br.com.zup.KeymgrReadAllRequest, br.com.zup.KeymgrReadAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "readAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.KeymgrReadAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.KeymgrReadAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeymgrReadAllServiceMethodDescriptorSupplier("readAll"))
              .build();
        }
      }
    }
    return getReadAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeymgrReadAllServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymgrReadAllServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymgrReadAllServiceStub>() {
        @java.lang.Override
        public KeymgrReadAllServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymgrReadAllServiceStub(channel, callOptions);
        }
      };
    return KeymgrReadAllServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeymgrReadAllServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymgrReadAllServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymgrReadAllServiceBlockingStub>() {
        @java.lang.Override
        public KeymgrReadAllServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymgrReadAllServiceBlockingStub(channel, callOptions);
        }
      };
    return KeymgrReadAllServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeymgrReadAllServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymgrReadAllServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymgrReadAllServiceFutureStub>() {
        @java.lang.Override
        public KeymgrReadAllServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymgrReadAllServiceFutureStub(channel, callOptions);
        }
      };
    return KeymgrReadAllServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeymgrReadAllServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void readAll(br.com.zup.KeymgrReadAllRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.KeymgrReadAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.KeymgrReadAllRequest,
                br.com.zup.KeymgrReadAllResponse>(
                  this, METHODID_READ_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class KeymgrReadAllServiceStub extends io.grpc.stub.AbstractAsyncStub<KeymgrReadAllServiceStub> {
    private KeymgrReadAllServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymgrReadAllServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymgrReadAllServiceStub(channel, callOptions);
    }

    /**
     */
    public void readAll(br.com.zup.KeymgrReadAllRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.KeymgrReadAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeymgrReadAllServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeymgrReadAllServiceBlockingStub> {
    private KeymgrReadAllServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymgrReadAllServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymgrReadAllServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.KeymgrReadAllResponse readAll(br.com.zup.KeymgrReadAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeymgrReadAllServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeymgrReadAllServiceFutureStub> {
    private KeymgrReadAllServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymgrReadAllServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymgrReadAllServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.KeymgrReadAllResponse> readAll(
        br.com.zup.KeymgrReadAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ_ALL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeymgrReadAllServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeymgrReadAllServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ_ALL:
          serviceImpl.readAll((br.com.zup.KeymgrReadAllRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.KeymgrReadAllResponse>) responseObserver);
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

  private static abstract class KeymgrReadAllServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeymgrReadAllServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.Keymgr.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeymgrReadAllService");
    }
  }

  private static final class KeymgrReadAllServiceFileDescriptorSupplier
      extends KeymgrReadAllServiceBaseDescriptorSupplier {
    KeymgrReadAllServiceFileDescriptorSupplier() {}
  }

  private static final class KeymgrReadAllServiceMethodDescriptorSupplier
      extends KeymgrReadAllServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeymgrReadAllServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeymgrReadAllServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeymgrReadAllServiceFileDescriptorSupplier())
              .addMethod(getReadAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
