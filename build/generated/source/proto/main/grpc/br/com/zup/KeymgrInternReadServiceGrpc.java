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
public final class KeymgrInternReadServiceGrpc {

  private KeymgrInternReadServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.zup.KeymgrInternReadService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.zup.KeymgrInternReadRequest,
      br.com.zup.KeymgrReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "read",
      requestType = br.com.zup.KeymgrInternReadRequest.class,
      responseType = br.com.zup.KeymgrReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.zup.KeymgrInternReadRequest,
      br.com.zup.KeymgrReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<br.com.zup.KeymgrInternReadRequest, br.com.zup.KeymgrReadResponse> getReadMethod;
    if ((getReadMethod = KeymgrInternReadServiceGrpc.getReadMethod) == null) {
      synchronized (KeymgrInternReadServiceGrpc.class) {
        if ((getReadMethod = KeymgrInternReadServiceGrpc.getReadMethod) == null) {
          KeymgrInternReadServiceGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<br.com.zup.KeymgrInternReadRequest, br.com.zup.KeymgrReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.KeymgrInternReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.zup.KeymgrReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new KeymgrInternReadServiceMethodDescriptorSupplier("read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KeymgrInternReadServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymgrInternReadServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymgrInternReadServiceStub>() {
        @java.lang.Override
        public KeymgrInternReadServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymgrInternReadServiceStub(channel, callOptions);
        }
      };
    return KeymgrInternReadServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KeymgrInternReadServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymgrInternReadServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymgrInternReadServiceBlockingStub>() {
        @java.lang.Override
        public KeymgrInternReadServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymgrInternReadServiceBlockingStub(channel, callOptions);
        }
      };
    return KeymgrInternReadServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KeymgrInternReadServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<KeymgrInternReadServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<KeymgrInternReadServiceFutureStub>() {
        @java.lang.Override
        public KeymgrInternReadServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new KeymgrInternReadServiceFutureStub(channel, callOptions);
        }
      };
    return KeymgrInternReadServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class KeymgrInternReadServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void read(br.com.zup.KeymgrInternReadRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.KeymgrReadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                br.com.zup.KeymgrInternReadRequest,
                br.com.zup.KeymgrReadResponse>(
                  this, METHODID_READ)))
          .build();
    }
  }

  /**
   */
  public static final class KeymgrInternReadServiceStub extends io.grpc.stub.AbstractAsyncStub<KeymgrInternReadServiceStub> {
    private KeymgrInternReadServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymgrInternReadServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymgrInternReadServiceStub(channel, callOptions);
    }

    /**
     */
    public void read(br.com.zup.KeymgrInternReadRequest request,
        io.grpc.stub.StreamObserver<br.com.zup.KeymgrReadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KeymgrInternReadServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<KeymgrInternReadServiceBlockingStub> {
    private KeymgrInternReadServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymgrInternReadServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymgrInternReadServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.zup.KeymgrReadResponse read(br.com.zup.KeymgrInternReadRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KeymgrInternReadServiceFutureStub extends io.grpc.stub.AbstractFutureStub<KeymgrInternReadServiceFutureStub> {
    private KeymgrInternReadServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KeymgrInternReadServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new KeymgrInternReadServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.zup.KeymgrReadResponse> read(
        br.com.zup.KeymgrInternReadRequest request) {
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
    private final KeymgrInternReadServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KeymgrInternReadServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ:
          serviceImpl.read((br.com.zup.KeymgrInternReadRequest) request,
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

  private static abstract class KeymgrInternReadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    KeymgrInternReadServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.zup.Keymgr.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("KeymgrInternReadService");
    }
  }

  private static final class KeymgrInternReadServiceFileDescriptorSupplier
      extends KeymgrInternReadServiceBaseDescriptorSupplier {
    KeymgrInternReadServiceFileDescriptorSupplier() {}
  }

  private static final class KeymgrInternReadServiceMethodDescriptorSupplier
      extends KeymgrInternReadServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    KeymgrInternReadServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (KeymgrInternReadServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new KeymgrInternReadServiceFileDescriptorSupplier())
              .addMethod(getReadMethod())
              .build();
        }
      }
    }
    return result;
  }
}
