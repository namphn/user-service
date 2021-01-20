package web.service.user.grpc;

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
    comments = "Source: user.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.RegistrationRequestGrpc,
      web.service.user.grpc.RegistrationResponseGrpc> getRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Registration",
      requestType = web.service.user.grpc.RegistrationRequestGrpc.class,
      responseType = web.service.user.grpc.RegistrationResponseGrpc.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.RegistrationRequestGrpc,
      web.service.user.grpc.RegistrationResponseGrpc> getRegistrationMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.RegistrationRequestGrpc, web.service.user.grpc.RegistrationResponseGrpc> getRegistrationMethod;
    if ((getRegistrationMethod = UserServiceGrpc.getRegistrationMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegistrationMethod = UserServiceGrpc.getRegistrationMethod) == null) {
          UserServiceGrpc.getRegistrationMethod = getRegistrationMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.RegistrationRequestGrpc, web.service.user.grpc.RegistrationResponseGrpc>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "Registration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.RegistrationRequestGrpc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.RegistrationResponseGrpc.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Registration"))
                  .build();
          }
        }
     }
     return getRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.LoginRequest,
      web.service.user.grpc.LoginResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Login",
      requestType = web.service.user.grpc.LoginRequest.class,
      responseType = web.service.user.grpc.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.LoginRequest,
      web.service.user.grpc.LoginResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.LoginRequest, web.service.user.grpc.LoginResponse> getLoginMethod;
    if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLoginMethod = UserServiceGrpc.getLoginMethod) == null) {
          UserServiceGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.LoginRequest, web.service.user.grpc.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "Login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.LoginResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("Login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.ConfirmEmailRequest,
      web.service.user.grpc.ConfirmEmailResponse> getVerificationTokenRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerificationTokenRegistration",
      requestType = web.service.user.grpc.ConfirmEmailRequest.class,
      responseType = web.service.user.grpc.ConfirmEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.ConfirmEmailRequest,
      web.service.user.grpc.ConfirmEmailResponse> getVerificationTokenRegistrationMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.ConfirmEmailRequest, web.service.user.grpc.ConfirmEmailResponse> getVerificationTokenRegistrationMethod;
    if ((getVerificationTokenRegistrationMethod = UserServiceGrpc.getVerificationTokenRegistrationMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getVerificationTokenRegistrationMethod = UserServiceGrpc.getVerificationTokenRegistrationMethod) == null) {
          UserServiceGrpc.getVerificationTokenRegistrationMethod = getVerificationTokenRegistrationMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.ConfirmEmailRequest, web.service.user.grpc.ConfirmEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "VerificationTokenRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.ConfirmEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.ConfirmEmailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("VerificationTokenRegistration"))
                  .build();
          }
        }
     }
     return getVerificationTokenRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.PasswordResetRequest,
      web.service.user.grpc.PasswordResetResponse> getPasswordForgotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PasswordForgot",
      requestType = web.service.user.grpc.PasswordResetRequest.class,
      responseType = web.service.user.grpc.PasswordResetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.PasswordResetRequest,
      web.service.user.grpc.PasswordResetResponse> getPasswordForgotMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.PasswordResetRequest, web.service.user.grpc.PasswordResetResponse> getPasswordForgotMethod;
    if ((getPasswordForgotMethod = UserServiceGrpc.getPasswordForgotMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getPasswordForgotMethod = UserServiceGrpc.getPasswordForgotMethod) == null) {
          UserServiceGrpc.getPasswordForgotMethod = getPasswordForgotMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.PasswordResetRequest, web.service.user.grpc.PasswordResetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "PasswordForgot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.PasswordResetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.PasswordResetResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("PasswordForgot"))
                  .build();
          }
        }
     }
     return getPasswordForgotMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.NewPasswordRequest,
      web.service.user.grpc.NewPasswordResponse> getPasswordResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PasswordReset",
      requestType = web.service.user.grpc.NewPasswordRequest.class,
      responseType = web.service.user.grpc.NewPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.NewPasswordRequest,
      web.service.user.grpc.NewPasswordResponse> getPasswordResetMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.NewPasswordRequest, web.service.user.grpc.NewPasswordResponse> getPasswordResetMethod;
    if ((getPasswordResetMethod = UserServiceGrpc.getPasswordResetMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getPasswordResetMethod = UserServiceGrpc.getPasswordResetMethod) == null) {
          UserServiceGrpc.getPasswordResetMethod = getPasswordResetMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.NewPasswordRequest, web.service.user.grpc.NewPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "PasswordReset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.NewPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.NewPasswordResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("PasswordReset"))
                  .build();
          }
        }
     }
     return getPasswordResetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.RegistrationInformationRequest,
      web.service.user.grpc.RegistrationInformationResponse> getRegistrationInformationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegistrationInformation",
      requestType = web.service.user.grpc.RegistrationInformationRequest.class,
      responseType = web.service.user.grpc.RegistrationInformationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.RegistrationInformationRequest,
      web.service.user.grpc.RegistrationInformationResponse> getRegistrationInformationMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.RegistrationInformationRequest, web.service.user.grpc.RegistrationInformationResponse> getRegistrationInformationMethod;
    if ((getRegistrationInformationMethod = UserServiceGrpc.getRegistrationInformationMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegistrationInformationMethod = UserServiceGrpc.getRegistrationInformationMethod) == null) {
          UserServiceGrpc.getRegistrationInformationMethod = getRegistrationInformationMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.RegistrationInformationRequest, web.service.user.grpc.RegistrationInformationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "RegistrationInformation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.RegistrationInformationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.RegistrationInformationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RegistrationInformation"))
                  .build();
          }
        }
     }
     return getRegistrationInformationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.VerificationResetPasswordTokenRequest,
      web.service.user.grpc.VerificationResetPasswordTokenResponse> getVerificationResetPasswordTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerificationResetPasswordToken",
      requestType = web.service.user.grpc.VerificationResetPasswordTokenRequest.class,
      responseType = web.service.user.grpc.VerificationResetPasswordTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.VerificationResetPasswordTokenRequest,
      web.service.user.grpc.VerificationResetPasswordTokenResponse> getVerificationResetPasswordTokenMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.VerificationResetPasswordTokenRequest, web.service.user.grpc.VerificationResetPasswordTokenResponse> getVerificationResetPasswordTokenMethod;
    if ((getVerificationResetPasswordTokenMethod = UserServiceGrpc.getVerificationResetPasswordTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getVerificationResetPasswordTokenMethod = UserServiceGrpc.getVerificationResetPasswordTokenMethod) == null) {
          UserServiceGrpc.getVerificationResetPasswordTokenMethod = getVerificationResetPasswordTokenMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.VerificationResetPasswordTokenRequest, web.service.user.grpc.VerificationResetPasswordTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "VerificationResetPasswordToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.VerificationResetPasswordTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.VerificationResetPasswordTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("VerificationResetPasswordToken"))
                  .build();
          }
        }
     }
     return getVerificationResetPasswordTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.GetEmailRequest,
      web.service.user.grpc.GetEmailResponse> getGetEmailFromTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmailFromToken",
      requestType = web.service.user.grpc.GetEmailRequest.class,
      responseType = web.service.user.grpc.GetEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.GetEmailRequest,
      web.service.user.grpc.GetEmailResponse> getGetEmailFromTokenMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.GetEmailRequest, web.service.user.grpc.GetEmailResponse> getGetEmailFromTokenMethod;
    if ((getGetEmailFromTokenMethod = UserServiceGrpc.getGetEmailFromTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetEmailFromTokenMethod = UserServiceGrpc.getGetEmailFromTokenMethod) == null) {
          UserServiceGrpc.getGetEmailFromTokenMethod = getGetEmailFromTokenMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.GetEmailRequest, web.service.user.grpc.GetEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "GetEmailFromToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.GetEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.GetEmailResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetEmailFromToken"))
                  .build();
          }
        }
     }
     return getGetEmailFromTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.ValidateTokenRequest,
      web.service.user.grpc.ValidateTokenResponse> getValidateTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateToken",
      requestType = web.service.user.grpc.ValidateTokenRequest.class,
      responseType = web.service.user.grpc.ValidateTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.ValidateTokenRequest,
      web.service.user.grpc.ValidateTokenResponse> getValidateTokenMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.ValidateTokenRequest, web.service.user.grpc.ValidateTokenResponse> getValidateTokenMethod;
    if ((getValidateTokenMethod = UserServiceGrpc.getValidateTokenMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getValidateTokenMethod = UserServiceGrpc.getValidateTokenMethod) == null) {
          UserServiceGrpc.getValidateTokenMethod = getValidateTokenMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.ValidateTokenRequest, web.service.user.grpc.ValidateTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "ValidateToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.ValidateTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.ValidateTokenResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("ValidateToken"))
                  .build();
          }
        }
     }
     return getValidateTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.GetAllUserRequest,
      web.service.user.grpc.GetAllUserResponse> getGetAllUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllUser",
      requestType = web.service.user.grpc.GetAllUserRequest.class,
      responseType = web.service.user.grpc.GetAllUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.GetAllUserRequest,
      web.service.user.grpc.GetAllUserResponse> getGetAllUserMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.GetAllUserRequest, web.service.user.grpc.GetAllUserResponse> getGetAllUserMethod;
    if ((getGetAllUserMethod = UserServiceGrpc.getGetAllUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetAllUserMethod = UserServiceGrpc.getGetAllUserMethod) == null) {
          UserServiceGrpc.getGetAllUserMethod = getGetAllUserMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.GetAllUserRequest, web.service.user.grpc.GetAllUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "GetAllUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.GetAllUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.GetAllUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetAllUser"))
                  .build();
          }
        }
     }
     return getGetAllUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.GetUserRequest,
      web.service.user.grpc.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = web.service.user.grpc.GetUserRequest.class,
      responseType = web.service.user.grpc.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.GetUserRequest,
      web.service.user.grpc.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.GetUserRequest, web.service.user.grpc.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserMethod = UserServiceGrpc.getGetUserMethod) == null) {
          UserServiceGrpc.getGetUserMethod = getGetUserMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.GetUserRequest, web.service.user.grpc.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.GetUserResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("GetUser"))
                  .build();
          }
        }
     }
     return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.ChangeUserNameRpcRequest,
      web.service.user.grpc.ChangeUserNameRpcResponse> getRenameUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenameUser",
      requestType = web.service.user.grpc.ChangeUserNameRpcRequest.class,
      responseType = web.service.user.grpc.ChangeUserNameRpcResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.ChangeUserNameRpcRequest,
      web.service.user.grpc.ChangeUserNameRpcResponse> getRenameUserMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.ChangeUserNameRpcRequest, web.service.user.grpc.ChangeUserNameRpcResponse> getRenameUserMethod;
    if ((getRenameUserMethod = UserServiceGrpc.getRenameUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRenameUserMethod = UserServiceGrpc.getRenameUserMethod) == null) {
          UserServiceGrpc.getRenameUserMethod = getRenameUserMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.ChangeUserNameRpcRequest, web.service.user.grpc.ChangeUserNameRpcResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "RenameUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.ChangeUserNameRpcRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.ChangeUserNameRpcResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RenameUser"))
                  .build();
          }
        }
     }
     return getRenameUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.SaveUserAvatarRequest,
      web.service.user.grpc.SaveUserAvatarResponse> getSaveAvatarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveAvatar",
      requestType = web.service.user.grpc.SaveUserAvatarRequest.class,
      responseType = web.service.user.grpc.SaveUserAvatarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.SaveUserAvatarRequest,
      web.service.user.grpc.SaveUserAvatarResponse> getSaveAvatarMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.SaveUserAvatarRequest, web.service.user.grpc.SaveUserAvatarResponse> getSaveAvatarMethod;
    if ((getSaveAvatarMethod = UserServiceGrpc.getSaveAvatarMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getSaveAvatarMethod = UserServiceGrpc.getSaveAvatarMethod) == null) {
          UserServiceGrpc.getSaveAvatarMethod = getSaveAvatarMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.SaveUserAvatarRequest, web.service.user.grpc.SaveUserAvatarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "SaveAvatar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.SaveUserAvatarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.SaveUserAvatarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("SaveAvatar"))
                  .build();
          }
        }
     }
     return getSaveAvatarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.GetUserAvatarRequest,
      web.service.user.grpc.GetUserAvatarResponse> getGetUserAvatarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserAvatar",
      requestType = web.service.user.grpc.GetUserAvatarRequest.class,
      responseType = web.service.user.grpc.GetUserAvatarResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.GetUserAvatarRequest,
      web.service.user.grpc.GetUserAvatarResponse> getGetUserAvatarMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.GetUserAvatarRequest, web.service.user.grpc.GetUserAvatarResponse> getGetUserAvatarMethod;
    if ((getGetUserAvatarMethod = UserServiceGrpc.getGetUserAvatarMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserAvatarMethod = UserServiceGrpc.getGetUserAvatarMethod) == null) {
          UserServiceGrpc.getGetUserAvatarMethod = getGetUserAvatarMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.GetUserAvatarRequest, web.service.user.grpc.GetUserAvatarResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "getUserAvatar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.GetUserAvatarRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.GetUserAvatarResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserAvatar"))
                  .build();
          }
        }
     }
     return getGetUserAvatarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.AddNewImageRequest,
      web.service.user.grpc.AddNewImageResponse> getAddNewImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addNewImage",
      requestType = web.service.user.grpc.AddNewImageRequest.class,
      responseType = web.service.user.grpc.AddNewImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.AddNewImageRequest,
      web.service.user.grpc.AddNewImageResponse> getAddNewImageMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.AddNewImageRequest, web.service.user.grpc.AddNewImageResponse> getAddNewImageMethod;
    if ((getAddNewImageMethod = UserServiceGrpc.getAddNewImageMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getAddNewImageMethod = UserServiceGrpc.getAddNewImageMethod) == null) {
          UserServiceGrpc.getAddNewImageMethod = getAddNewImageMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.AddNewImageRequest, web.service.user.grpc.AddNewImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "addNewImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.AddNewImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.AddNewImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("addNewImage"))
                  .build();
          }
        }
     }
     return getAddNewImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.GetUserInfoRequest,
      web.service.user.grpc.GetUserInfoResponse> getGetUserInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserInfo",
      requestType = web.service.user.grpc.GetUserInfoRequest.class,
      responseType = web.service.user.grpc.GetUserInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.GetUserInfoRequest,
      web.service.user.grpc.GetUserInfoResponse> getGetUserInfoMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.GetUserInfoRequest, web.service.user.grpc.GetUserInfoResponse> getGetUserInfoMethod;
    if ((getGetUserInfoMethod = UserServiceGrpc.getGetUserInfoMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserInfoMethod = UserServiceGrpc.getGetUserInfoMethod) == null) {
          UserServiceGrpc.getGetUserInfoMethod = getGetUserInfoMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.GetUserInfoRequest, web.service.user.grpc.GetUserInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "getUserInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.GetUserInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.GetUserInfoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserInfo"))
                  .build();
          }
        }
     }
     return getGetUserInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<web.service.user.grpc.GetUserNameRequest,
      web.service.user.grpc.GetUserNameResponse> getGetUserNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserName",
      requestType = web.service.user.grpc.GetUserNameRequest.class,
      responseType = web.service.user.grpc.GetUserNameResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<web.service.user.grpc.GetUserNameRequest,
      web.service.user.grpc.GetUserNameResponse> getGetUserNameMethod() {
    io.grpc.MethodDescriptor<web.service.user.grpc.GetUserNameRequest, web.service.user.grpc.GetUserNameResponse> getGetUserNameMethod;
    if ((getGetUserNameMethod = UserServiceGrpc.getGetUserNameMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getGetUserNameMethod = UserServiceGrpc.getGetUserNameMethod) == null) {
          UserServiceGrpc.getGetUserNameMethod = getGetUserNameMethod = 
              io.grpc.MethodDescriptor.<web.service.user.grpc.GetUserNameRequest, web.service.user.grpc.GetUserNameResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "UserService", "getUserName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.GetUserNameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  web.service.user.grpc.GetUserNameResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("getUserName"))
                  .build();
          }
        }
     }
     return getGetUserNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * create a new account, save new email, password and send verification email
     * </pre>
     */
    public void registration(web.service.user.grpc.RegistrationRequestGrpc request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.RegistrationResponseGrpc> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * login account
     * </pre>
     */
    public void login(web.service.user.grpc.LoginRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.LoginResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     * Verify email
     * </pre>
     */
    public void verificationTokenRegistration(web.service.user.grpc.ConfirmEmailRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.ConfirmEmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerificationTokenRegistrationMethod(), responseObserver);
    }

    /**
     * <pre>
     * send reset password email
     * </pre>
     */
    public void passwordForgot(web.service.user.grpc.PasswordResetRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.PasswordResetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPasswordForgotMethod(), responseObserver);
    }

    /**
     * <pre>
     * save new password
     * </pre>
     */
    public void passwordReset(web.service.user.grpc.NewPasswordRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.NewPasswordResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPasswordResetMethod(), responseObserver);
    }

    /**
     * <pre>
     * register account's information
     * </pre>
     */
    public void registrationInformation(web.service.user.grpc.RegistrationInformationRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.RegistrationInformationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegistrationInformationMethod(), responseObserver);
    }

    /**
     * <pre>
     * verify reset password token
     * </pre>
     */
    public void verificationResetPasswordToken(web.service.user.grpc.VerificationResetPasswordTokenRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.VerificationResetPasswordTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerificationResetPasswordTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * filter controller call to user service
     * </pre>
     */
    public void getEmailFromToken(web.service.user.grpc.GetEmailRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.GetEmailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEmailFromTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     *validate toke
     * </pre>
     */
    public void validateToken(web.service.user.grpc.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.ValidateTokenResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateTokenMethod(), responseObserver);
    }

    /**
     * <pre>
     * get all user
     * </pre>
     */
    public void getAllUser(web.service.user.grpc.GetAllUserRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.GetAllUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllUserMethod(), responseObserver);
    }

    /**
     * <pre>
     *get user by userId
     * </pre>
     */
    public void getUser(web.service.user.grpc.GetUserRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.GetUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * change user's name
     * </pre>
     */
    public void renameUser(web.service.user.grpc.ChangeUserNameRpcRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.ChangeUserNameRpcResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRenameUserMethod(), responseObserver);
    }

    /**
     * <pre>
     * save source user's avatar to DB
     * </pre>
     */
    public void saveAvatar(web.service.user.grpc.SaveUserAvatarRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.SaveUserAvatarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveAvatarMethod(), responseObserver);
    }

    /**
     * <pre>
     * get user avatar
     * </pre>
     */
    public void getUserAvatar(web.service.user.grpc.GetUserAvatarRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.GetUserAvatarResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserAvatarMethod(), responseObserver);
    }

    /**
     * <pre>
     * user add image
     * </pre>
     */
    public void addNewImage(web.service.user.grpc.AddNewImageRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.AddNewImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddNewImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * get user information
     * </pre>
     */
    public void getUserInfo(web.service.user.grpc.GetUserInfoRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.GetUserInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * get user name
     * </pre>
     */
    public void getUserName(web.service.user.grpc.GetUserNameRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.GetUserNameResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegistrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.RegistrationRequestGrpc,
                web.service.user.grpc.RegistrationResponseGrpc>(
                  this, METHODID_REGISTRATION)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.LoginRequest,
                web.service.user.grpc.LoginResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getVerificationTokenRegistrationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.ConfirmEmailRequest,
                web.service.user.grpc.ConfirmEmailResponse>(
                  this, METHODID_VERIFICATION_TOKEN_REGISTRATION)))
          .addMethod(
            getPasswordForgotMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.PasswordResetRequest,
                web.service.user.grpc.PasswordResetResponse>(
                  this, METHODID_PASSWORD_FORGOT)))
          .addMethod(
            getPasswordResetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.NewPasswordRequest,
                web.service.user.grpc.NewPasswordResponse>(
                  this, METHODID_PASSWORD_RESET)))
          .addMethod(
            getRegistrationInformationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.RegistrationInformationRequest,
                web.service.user.grpc.RegistrationInformationResponse>(
                  this, METHODID_REGISTRATION_INFORMATION)))
          .addMethod(
            getVerificationResetPasswordTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.VerificationResetPasswordTokenRequest,
                web.service.user.grpc.VerificationResetPasswordTokenResponse>(
                  this, METHODID_VERIFICATION_RESET_PASSWORD_TOKEN)))
          .addMethod(
            getGetEmailFromTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.GetEmailRequest,
                web.service.user.grpc.GetEmailResponse>(
                  this, METHODID_GET_EMAIL_FROM_TOKEN)))
          .addMethod(
            getValidateTokenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.ValidateTokenRequest,
                web.service.user.grpc.ValidateTokenResponse>(
                  this, METHODID_VALIDATE_TOKEN)))
          .addMethod(
            getGetAllUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.GetAllUserRequest,
                web.service.user.grpc.GetAllUserResponse>(
                  this, METHODID_GET_ALL_USER)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.GetUserRequest,
                web.service.user.grpc.GetUserResponse>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getRenameUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.ChangeUserNameRpcRequest,
                web.service.user.grpc.ChangeUserNameRpcResponse>(
                  this, METHODID_RENAME_USER)))
          .addMethod(
            getSaveAvatarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.SaveUserAvatarRequest,
                web.service.user.grpc.SaveUserAvatarResponse>(
                  this, METHODID_SAVE_AVATAR)))
          .addMethod(
            getGetUserAvatarMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.GetUserAvatarRequest,
                web.service.user.grpc.GetUserAvatarResponse>(
                  this, METHODID_GET_USER_AVATAR)))
          .addMethod(
            getAddNewImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.AddNewImageRequest,
                web.service.user.grpc.AddNewImageResponse>(
                  this, METHODID_ADD_NEW_IMAGE)))
          .addMethod(
            getGetUserInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.GetUserInfoRequest,
                web.service.user.grpc.GetUserInfoResponse>(
                  this, METHODID_GET_USER_INFO)))
          .addMethod(
            getGetUserNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                web.service.user.grpc.GetUserNameRequest,
                web.service.user.grpc.GetUserNameResponse>(
                  this, METHODID_GET_USER_NAME)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * create a new account, save new email, password and send verification email
     * </pre>
     */
    public void registration(web.service.user.grpc.RegistrationRequestGrpc request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.RegistrationResponseGrpc> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * login account
     * </pre>
     */
    public void login(web.service.user.grpc.LoginRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.LoginResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Verify email
     * </pre>
     */
    public void verificationTokenRegistration(web.service.user.grpc.ConfirmEmailRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.ConfirmEmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerificationTokenRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * send reset password email
     * </pre>
     */
    public void passwordForgot(web.service.user.grpc.PasswordResetRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.PasswordResetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPasswordForgotMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * save new password
     * </pre>
     */
    public void passwordReset(web.service.user.grpc.NewPasswordRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.NewPasswordResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPasswordResetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * register account's information
     * </pre>
     */
    public void registrationInformation(web.service.user.grpc.RegistrationInformationRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.RegistrationInformationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegistrationInformationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * verify reset password token
     * </pre>
     */
    public void verificationResetPasswordToken(web.service.user.grpc.VerificationResetPasswordTokenRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.VerificationResetPasswordTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerificationResetPasswordTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * filter controller call to user service
     * </pre>
     */
    public void getEmailFromToken(web.service.user.grpc.GetEmailRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.GetEmailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEmailFromTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *validate toke
     * </pre>
     */
    public void validateToken(web.service.user.grpc.ValidateTokenRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.ValidateTokenResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get all user
     * </pre>
     */
    public void getAllUser(web.service.user.grpc.GetAllUserRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.GetAllUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *get user by userId
     * </pre>
     */
    public void getUser(web.service.user.grpc.GetUserRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.GetUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * change user's name
     * </pre>
     */
    public void renameUser(web.service.user.grpc.ChangeUserNameRpcRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.ChangeUserNameRpcResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRenameUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * save source user's avatar to DB
     * </pre>
     */
    public void saveAvatar(web.service.user.grpc.SaveUserAvatarRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.SaveUserAvatarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveAvatarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get user avatar
     * </pre>
     */
    public void getUserAvatar(web.service.user.grpc.GetUserAvatarRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.GetUserAvatarResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserAvatarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * user add image
     * </pre>
     */
    public void addNewImage(web.service.user.grpc.AddNewImageRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.AddNewImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddNewImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get user information
     * </pre>
     */
    public void getUserInfo(web.service.user.grpc.GetUserInfoRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.GetUserInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get user name
     * </pre>
     */
    public void getUserName(web.service.user.grpc.GetUserNameRequest request,
        io.grpc.stub.StreamObserver<web.service.user.grpc.GetUserNameResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * create a new account, save new email, password and send verification email
     * </pre>
     */
    public web.service.user.grpc.RegistrationResponseGrpc registration(web.service.user.grpc.RegistrationRequestGrpc request) {
      return blockingUnaryCall(
          getChannel(), getRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * login account
     * </pre>
     */
    public web.service.user.grpc.LoginResponse login(web.service.user.grpc.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Verify email
     * </pre>
     */
    public web.service.user.grpc.ConfirmEmailResponse verificationTokenRegistration(web.service.user.grpc.ConfirmEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), getVerificationTokenRegistrationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * send reset password email
     * </pre>
     */
    public web.service.user.grpc.PasswordResetResponse passwordForgot(web.service.user.grpc.PasswordResetRequest request) {
      return blockingUnaryCall(
          getChannel(), getPasswordForgotMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * save new password
     * </pre>
     */
    public web.service.user.grpc.NewPasswordResponse passwordReset(web.service.user.grpc.NewPasswordRequest request) {
      return blockingUnaryCall(
          getChannel(), getPasswordResetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * register account's information
     * </pre>
     */
    public web.service.user.grpc.RegistrationInformationResponse registrationInformation(web.service.user.grpc.RegistrationInformationRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegistrationInformationMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * verify reset password token
     * </pre>
     */
    public web.service.user.grpc.VerificationResetPasswordTokenResponse verificationResetPasswordToken(web.service.user.grpc.VerificationResetPasswordTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getVerificationResetPasswordTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * filter controller call to user service
     * </pre>
     */
    public web.service.user.grpc.GetEmailResponse getEmailFromToken(web.service.user.grpc.GetEmailRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEmailFromTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *validate toke
     * </pre>
     */
    public web.service.user.grpc.ValidateTokenResponse validateToken(web.service.user.grpc.ValidateTokenRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidateTokenMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get all user
     * </pre>
     */
    public web.service.user.grpc.GetAllUserResponse getAllUser(web.service.user.grpc.GetAllUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *get user by userId
     * </pre>
     */
    public web.service.user.grpc.GetUserResponse getUser(web.service.user.grpc.GetUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * change user's name
     * </pre>
     */
    public web.service.user.grpc.ChangeUserNameRpcResponse renameUser(web.service.user.grpc.ChangeUserNameRpcRequest request) {
      return blockingUnaryCall(
          getChannel(), getRenameUserMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * save source user's avatar to DB
     * </pre>
     */
    public web.service.user.grpc.SaveUserAvatarResponse saveAvatar(web.service.user.grpc.SaveUserAvatarRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveAvatarMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get user avatar
     * </pre>
     */
    public web.service.user.grpc.GetUserAvatarResponse getUserAvatar(web.service.user.grpc.GetUserAvatarRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserAvatarMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * user add image
     * </pre>
     */
    public web.service.user.grpc.AddNewImageResponse addNewImage(web.service.user.grpc.AddNewImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddNewImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get user information
     * </pre>
     */
    public web.service.user.grpc.GetUserInfoResponse getUserInfo(web.service.user.grpc.GetUserInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get user name
     * </pre>
     */
    public web.service.user.grpc.GetUserNameResponse getUserName(web.service.user.grpc.GetUserNameRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUserNameMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * create a new account, save new email, password and send verification email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.RegistrationResponseGrpc> registration(
        web.service.user.grpc.RegistrationRequestGrpc request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * login account
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.LoginResponse> login(
        web.service.user.grpc.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Verify email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.ConfirmEmailResponse> verificationTokenRegistration(
        web.service.user.grpc.ConfirmEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVerificationTokenRegistrationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * send reset password email
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.PasswordResetResponse> passwordForgot(
        web.service.user.grpc.PasswordResetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPasswordForgotMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * save new password
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.NewPasswordResponse> passwordReset(
        web.service.user.grpc.NewPasswordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPasswordResetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * register account's information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.RegistrationInformationResponse> registrationInformation(
        web.service.user.grpc.RegistrationInformationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegistrationInformationMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * verify reset password token
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.VerificationResetPasswordTokenResponse> verificationResetPasswordToken(
        web.service.user.grpc.VerificationResetPasswordTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVerificationResetPasswordTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * filter controller call to user service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.GetEmailResponse> getEmailFromToken(
        web.service.user.grpc.GetEmailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEmailFromTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *validate toke
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.ValidateTokenResponse> validateToken(
        web.service.user.grpc.ValidateTokenRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateTokenMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get all user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.GetAllUserResponse> getAllUser(
        web.service.user.grpc.GetAllUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *get user by userId
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.GetUserResponse> getUser(
        web.service.user.grpc.GetUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * change user's name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.ChangeUserNameRpcResponse> renameUser(
        web.service.user.grpc.ChangeUserNameRpcRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRenameUserMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * save source user's avatar to DB
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.SaveUserAvatarResponse> saveAvatar(
        web.service.user.grpc.SaveUserAvatarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveAvatarMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get user avatar
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.GetUserAvatarResponse> getUserAvatar(
        web.service.user.grpc.GetUserAvatarRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserAvatarMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * user add image
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.AddNewImageResponse> addNewImage(
        web.service.user.grpc.AddNewImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddNewImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get user information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.GetUserInfoResponse> getUserInfo(
        web.service.user.grpc.GetUserInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get user name
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<web.service.user.grpc.GetUserNameResponse> getUserName(
        web.service.user.grpc.GetUserNameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTRATION = 0;
  private static final int METHODID_LOGIN = 1;
  private static final int METHODID_VERIFICATION_TOKEN_REGISTRATION = 2;
  private static final int METHODID_PASSWORD_FORGOT = 3;
  private static final int METHODID_PASSWORD_RESET = 4;
  private static final int METHODID_REGISTRATION_INFORMATION = 5;
  private static final int METHODID_VERIFICATION_RESET_PASSWORD_TOKEN = 6;
  private static final int METHODID_GET_EMAIL_FROM_TOKEN = 7;
  private static final int METHODID_VALIDATE_TOKEN = 8;
  private static final int METHODID_GET_ALL_USER = 9;
  private static final int METHODID_GET_USER = 10;
  private static final int METHODID_RENAME_USER = 11;
  private static final int METHODID_SAVE_AVATAR = 12;
  private static final int METHODID_GET_USER_AVATAR = 13;
  private static final int METHODID_ADD_NEW_IMAGE = 14;
  private static final int METHODID_GET_USER_INFO = 15;
  private static final int METHODID_GET_USER_NAME = 16;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTRATION:
          serviceImpl.registration((web.service.user.grpc.RegistrationRequestGrpc) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.RegistrationResponseGrpc>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((web.service.user.grpc.LoginRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.LoginResponse>) responseObserver);
          break;
        case METHODID_VERIFICATION_TOKEN_REGISTRATION:
          serviceImpl.verificationTokenRegistration((web.service.user.grpc.ConfirmEmailRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.ConfirmEmailResponse>) responseObserver);
          break;
        case METHODID_PASSWORD_FORGOT:
          serviceImpl.passwordForgot((web.service.user.grpc.PasswordResetRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.PasswordResetResponse>) responseObserver);
          break;
        case METHODID_PASSWORD_RESET:
          serviceImpl.passwordReset((web.service.user.grpc.NewPasswordRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.NewPasswordResponse>) responseObserver);
          break;
        case METHODID_REGISTRATION_INFORMATION:
          serviceImpl.registrationInformation((web.service.user.grpc.RegistrationInformationRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.RegistrationInformationResponse>) responseObserver);
          break;
        case METHODID_VERIFICATION_RESET_PASSWORD_TOKEN:
          serviceImpl.verificationResetPasswordToken((web.service.user.grpc.VerificationResetPasswordTokenRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.VerificationResetPasswordTokenResponse>) responseObserver);
          break;
        case METHODID_GET_EMAIL_FROM_TOKEN:
          serviceImpl.getEmailFromToken((web.service.user.grpc.GetEmailRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.GetEmailResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_TOKEN:
          serviceImpl.validateToken((web.service.user.grpc.ValidateTokenRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.ValidateTokenResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_USER:
          serviceImpl.getAllUser((web.service.user.grpc.GetAllUserRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.GetAllUserResponse>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((web.service.user.grpc.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.GetUserResponse>) responseObserver);
          break;
        case METHODID_RENAME_USER:
          serviceImpl.renameUser((web.service.user.grpc.ChangeUserNameRpcRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.ChangeUserNameRpcResponse>) responseObserver);
          break;
        case METHODID_SAVE_AVATAR:
          serviceImpl.saveAvatar((web.service.user.grpc.SaveUserAvatarRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.SaveUserAvatarResponse>) responseObserver);
          break;
        case METHODID_GET_USER_AVATAR:
          serviceImpl.getUserAvatar((web.service.user.grpc.GetUserAvatarRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.GetUserAvatarResponse>) responseObserver);
          break;
        case METHODID_ADD_NEW_IMAGE:
          serviceImpl.addNewImage((web.service.user.grpc.AddNewImageRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.AddNewImageResponse>) responseObserver);
          break;
        case METHODID_GET_USER_INFO:
          serviceImpl.getUserInfo((web.service.user.grpc.GetUserInfoRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.GetUserInfoResponse>) responseObserver);
          break;
        case METHODID_GET_USER_NAME:
          serviceImpl.getUserName((web.service.user.grpc.GetUserNameRequest) request,
              (io.grpc.stub.StreamObserver<web.service.user.grpc.GetUserNameResponse>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return web.service.user.grpc.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getRegistrationMethod())
              .addMethod(getLoginMethod())
              .addMethod(getVerificationTokenRegistrationMethod())
              .addMethod(getPasswordForgotMethod())
              .addMethod(getPasswordResetMethod())
              .addMethod(getRegistrationInformationMethod())
              .addMethod(getVerificationResetPasswordTokenMethod())
              .addMethod(getGetEmailFromTokenMethod())
              .addMethod(getValidateTokenMethod())
              .addMethod(getGetAllUserMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getRenameUserMethod())
              .addMethod(getSaveAvatarMethod())
              .addMethod(getGetUserAvatarMethod())
              .addMethod(getAddNewImageMethod())
              .addMethod(getGetUserInfoMethod())
              .addMethod(getGetUserNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
