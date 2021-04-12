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
public final class KeymgrExternReadServiceGrpc {

  private KeymgrExternReadServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.KeymgrExternReadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.KeymgrExternReadRequest,
      br.com.zup.KeymgrReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "read",
      requestType = br.com.zup.KeymgrExternReadRequest.class,
      responseType = br.com.zup.KeymgrReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.KeymgrExternReadRequest,
      br.com.zup.KeymgrReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<br.com.zup.KeymgrExternReadRequest, br.com.zup.KeymgrReadResponse> getReadMethod;
    if ((getReadMethod = KeymgrExternReadServiceGrpc.getReadMethod) == null) {
      synchronized (KeymgrExternReadServiceGrpc.class) {
        if ((getReadMethod = KeymgrExternReadServiceGrpc.getReadMethod) == null) {
          KeymgrExternReadServiceGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<br.com.zup.KeymgrExternReadRequest, br.com.zup.KeymgrReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.KeymgrExternReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.KeymgrReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeymgrExternReadServiceMethodDescriptorSupplier("read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeymgrExternReadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymgrExternReadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymgrExternReadServiceStub>() {
        @java.lang.Override
        public KeymgrExternReadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymgrExternReadServiceStub(channel, callOptions);
        }
      };
    return KeymgrExternReadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeymgrExternReadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymgrExternReadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymgrExternReadServiceBlockingStub>() {
        @java.lang.Override
        public KeymgrExternReadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymgrExternReadServiceBlockingStub(channel, callOptions);
        }
      };
    return KeymgrExternReadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeymgrExternReadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymgrExternReadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymgrExternReadServiceFutureStub>() {
        @java.lang.Override
        public KeymgrExternReadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymgrExternReadServiceFutureStub(channel, callOptions);
        }
      };
    return KeymgrExternReadServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeymgrExternReadServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void read(br.com.zup.KeymgrExternReadRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.KeymgrReadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.KeymgrExternReadRequest,
                br.com.zup.KeymgrReadResponse>(
                  this, METHODID_READ)))
          .build();
    }
  }

  /**
   */
  public static final class KeymgrExternReadServiceStub extends io.grpc.stub.AbstractAsyncStub<KeymgrExternReadServiceStub> {
    private KeymgrExternReadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymgrExternReadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymgrExternReadServiceStub(channel, callOptions);
    }

    /**
     */
    public void read(br.com.zup.KeymgrExternReadRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.KeymgrReadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeymgrExternReadServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeymgrExternReadServiceBlockingStub> {
    private KeymgrExternReadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymgrExternReadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymgrExternReadServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.KeymgrReadResponse read(br.com.zup.KeymgrExternReadRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeymgrExternReadServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeymgrExternReadServiceFutureStub> {
    private KeymgrExternReadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymgrExternReadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymgrExternReadServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.KeymgrReadResponse> read(
        br.com.zup.KeymgrExternReadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KeymgrExternReadServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeymgrExternReadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ:
          serviceImpl.read((br.com.zup.KeymgrExternReadRequest) request,
              (io.grpc.stub.StreamObserver<br.com.zup.KeymgrReadResponse>) responseObserver);
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

  private static abstract class KeymgrExternReadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeymgrExternReadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.Keymgr.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeymgrExternReadService");
    }
  }

  private static final class KeymgrExternReadServiceFileDescriptorSupplier
      extends KeymgrExternReadServiceBaseDescriptorSupplier {
    KeymgrExternReadServiceFileDescriptorSupplier() {}
  }

  private static final class KeymgrExternReadServiceMethodDescriptorSupplier
      extends KeymgrExternReadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeymgrExternReadServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeymgrExternReadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeymgrExternReadServiceFileDescriptorSupplier())
              .addMethod(getReadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
