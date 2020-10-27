package web.api.rpc.follow;

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
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: follow.proto")
public final class FollowRpcServiceGrpc {

  private FollowRpcServiceGrpc() {}

  public static final String SERVICE_NAME = "FollowRpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<web.api.rpc.follow.GetFollowerAndFollowingRequest,
      web.api.rpc.follow.GetFollowerResponse> getGetFollowerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFollower",
      requestType = web.api.rpc.follow.GetFollowerAndFollowingRequest.class,
      responseType = web.api.rpc.follow.GetFollowerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.api.rpc.follow.GetFollowerAndFollowingRequest,
      web.api.rpc.follow.GetFollowerResponse> getGetFollowerMethod() {
    io.grpc.MethodDescriptor<web.api.rpc.follow.GetFollowerAndFollowingRequest, web.api.rpc.follow.GetFollowerResponse> getGetFollowerMethod;
    if ((getGetFollowerMethod = FollowRpcServiceGrpc.getGetFollowerMethod) == null) {
      synchronized (FollowRpcServiceGrpc.class) {
        if ((getGetFollowerMethod = FollowRpcServiceGrpc.getGetFollowerMethod) == null) {
          FollowRpcServiceGrpc.getGetFollowerMethod = getGetFollowerMethod = 
              io.grpc.MethodDescriptor.<web.api.rpc.follow.GetFollowerAndFollowingRequest, web.api.rpc.follow.GetFollowerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FollowRpcService", "getFollower"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.api.rpc.follow.GetFollowerAndFollowingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.api.rpc.follow.GetFollowerResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FollowRpcServiceMethodDescriptorSupplier("getFollower"))
                  .build();
          }
        }
     }
     return getGetFollowerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.api.rpc.follow.GetFollowerAndFollowingRequest,
      web.api.rpc.follow.GetFollowingResponse> getGetFollowingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFollowing",
      requestType = web.api.rpc.follow.GetFollowerAndFollowingRequest.class,
      responseType = web.api.rpc.follow.GetFollowingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.api.rpc.follow.GetFollowerAndFollowingRequest,
      web.api.rpc.follow.GetFollowingResponse> getGetFollowingMethod() {
    io.grpc.MethodDescriptor<web.api.rpc.follow.GetFollowerAndFollowingRequest, web.api.rpc.follow.GetFollowingResponse> getGetFollowingMethod;
    if ((getGetFollowingMethod = FollowRpcServiceGrpc.getGetFollowingMethod) == null) {
      synchronized (FollowRpcServiceGrpc.class) {
        if ((getGetFollowingMethod = FollowRpcServiceGrpc.getGetFollowingMethod) == null) {
          FollowRpcServiceGrpc.getGetFollowingMethod = getGetFollowingMethod = 
              io.grpc.MethodDescriptor.<web.api.rpc.follow.GetFollowerAndFollowingRequest, web.api.rpc.follow.GetFollowingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FollowRpcService", "getFollowing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.api.rpc.follow.GetFollowerAndFollowingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.api.rpc.follow.GetFollowingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FollowRpcServiceMethodDescriptorSupplier("getFollowing"))
                  .build();
          }
        }
     }
     return getGetFollowingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.api.rpc.follow.AddFollowRequest,
      web.api.rpc.follow.AddFollowResponse> getAddFollowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addFollow",
      requestType = web.api.rpc.follow.AddFollowRequest.class,
      responseType = web.api.rpc.follow.AddFollowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.api.rpc.follow.AddFollowRequest,
      web.api.rpc.follow.AddFollowResponse> getAddFollowMethod() {
    io.grpc.MethodDescriptor<web.api.rpc.follow.AddFollowRequest, web.api.rpc.follow.AddFollowResponse> getAddFollowMethod;
    if ((getAddFollowMethod = FollowRpcServiceGrpc.getAddFollowMethod) == null) {
      synchronized (FollowRpcServiceGrpc.class) {
        if ((getAddFollowMethod = FollowRpcServiceGrpc.getAddFollowMethod) == null) {
          FollowRpcServiceGrpc.getAddFollowMethod = getAddFollowMethod = 
              io.grpc.MethodDescriptor.<web.api.rpc.follow.AddFollowRequest, web.api.rpc.follow.AddFollowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "FollowRpcService", "addFollow"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.api.rpc.follow.AddFollowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.api.rpc.follow.AddFollowResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new FollowRpcServiceMethodDescriptorSupplier("addFollow"))
                  .build();
          }
        }
     }
     return getAddFollowMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FollowRpcServiceStub newStub(io.grpc.Channel channel) {
    return new FollowRpcServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FollowRpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FollowRpcServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FollowRpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FollowRpcServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FollowRpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getFollower(web.api.rpc.follow.GetFollowerAndFollowingRequest request,
        io.grpc.stub.StreamObserver<web.api.rpc.follow.GetFollowerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFollowerMethod(), responseObserver);
    }

    /**
     */
    public void getFollowing(web.api.rpc.follow.GetFollowerAndFollowingRequest request,
        io.grpc.stub.StreamObserver<web.api.rpc.follow.GetFollowingResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFollowingMethod(), responseObserver);
    }

    /**
     */
    public void addFollow(web.api.rpc.follow.AddFollowRequest request,
        io.grpc.stub.StreamObserver<web.api.rpc.follow.AddFollowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddFollowMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFollowerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.api.rpc.follow.GetFollowerAndFollowingRequest,
                web.api.rpc.follow.GetFollowerResponse>(
                  this, METHODID_GET_FOLLOWER)))
          .addMethod(
            getGetFollowingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.api.rpc.follow.GetFollowerAndFollowingRequest,
                web.api.rpc.follow.GetFollowingResponse>(
                  this, METHODID_GET_FOLLOWING)))
          .addMethod(
            getAddFollowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.api.rpc.follow.AddFollowRequest,
                web.api.rpc.follow.AddFollowResponse>(
                  this, METHODID_ADD_FOLLOW)))
          .build();
    }
  }

  /**
   */
  public static final class FollowRpcServiceStub extends io.grpc.stub.AbstractStub<FollowRpcServiceStub> {
    private FollowRpcServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FollowRpcServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FollowRpcServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FollowRpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void getFollower(web.api.rpc.follow.GetFollowerAndFollowingRequest request,
        io.grpc.stub.StreamObserver<web.api.rpc.follow.GetFollowerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFollowerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFollowing(web.api.rpc.follow.GetFollowerAndFollowingRequest request,
        io.grpc.stub.StreamObserver<web.api.rpc.follow.GetFollowingResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFollowingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addFollow(web.api.rpc.follow.AddFollowRequest request,
        io.grpc.stub.StreamObserver<web.api.rpc.follow.AddFollowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddFollowMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FollowRpcServiceBlockingStub extends io.grpc.stub.AbstractStub<FollowRpcServiceBlockingStub> {
    private FollowRpcServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FollowRpcServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FollowRpcServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FollowRpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public web.api.rpc.follow.GetFollowerResponse getFollower(web.api.rpc.follow.GetFollowerAndFollowingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFollowerMethod(), getCallOptions(), request);
    }

    /**
     */
    public web.api.rpc.follow.GetFollowingResponse getFollowing(web.api.rpc.follow.GetFollowerAndFollowingRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFollowingMethod(), getCallOptions(), request);
    }

    /**
     */
    public web.api.rpc.follow.AddFollowResponse addFollow(web.api.rpc.follow.AddFollowRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddFollowMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FollowRpcServiceFutureStub extends io.grpc.stub.AbstractStub<FollowRpcServiceFutureStub> {
    private FollowRpcServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FollowRpcServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FollowRpcServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FollowRpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<web.api.rpc.follow.GetFollowerResponse> getFollower(
        web.api.rpc.follow.GetFollowerAndFollowingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFollowerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<web.api.rpc.follow.GetFollowingResponse> getFollowing(
        web.api.rpc.follow.GetFollowerAndFollowingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFollowingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<web.api.rpc.follow.AddFollowResponse> addFollow(
        web.api.rpc.follow.AddFollowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddFollowMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FOLLOWER = 0;
  private static final int METHODID_GET_FOLLOWING = 1;
  private static final int METHODID_ADD_FOLLOW = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FollowRpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FollowRpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FOLLOWER:
          serviceImpl.getFollower((web.api.rpc.follow.GetFollowerAndFollowingRequest) request,
              (io.grpc.stub.StreamObserver<web.api.rpc.follow.GetFollowerResponse>) responseObserver);
          break;
        case METHODID_GET_FOLLOWING:
          serviceImpl.getFollowing((web.api.rpc.follow.GetFollowerAndFollowingRequest) request,
              (io.grpc.stub.StreamObserver<web.api.rpc.follow.GetFollowingResponse>) responseObserver);
          break;
        case METHODID_ADD_FOLLOW:
          serviceImpl.addFollow((web.api.rpc.follow.AddFollowRequest) request,
              (io.grpc.stub.StreamObserver<web.api.rpc.follow.AddFollowResponse>) responseObserver);
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

  private static abstract class FollowRpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FollowRpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return web.api.rpc.follow.Follow.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FollowRpcService");
    }
  }

  private static final class FollowRpcServiceFileDescriptorSupplier
      extends FollowRpcServiceBaseDescriptorSupplier {
    FollowRpcServiceFileDescriptorSupplier() {}
  }

  private static final class FollowRpcServiceMethodDescriptorSupplier
      extends FollowRpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FollowRpcServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (FollowRpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FollowRpcServiceFileDescriptorSupplier())
              .addMethod(getGetFollowerMethod())
              .addMethod(getGetFollowingMethod())
              .addMethod(getAddFollowMethod())
              .build();
        }
      }
    }
    return result;
  }
}
