// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package web.service.user.grpc;

/**
 * Protobuf service {@code UserService}
 */
public  abstract class UserService
    implements com.google.protobuf.Service {
  protected UserService() {}

  public interface Interface {
    /**
     * <pre>
     * create a new account, save new email, password and send verification email
     * </pre>
     *
     * <code>rpc Registration(.RegistrationRequestGrpc) returns (.RegistrationResponseGrpc);</code>
     */
    public abstract void registration(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.RegistrationRequestGrpc request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.RegistrationResponseGrpc> done);

    /**
     * <pre>
     * login account
     * </pre>
     *
     * <code>rpc Login(.LoginRequest) returns (.LoginResponse);</code>
     */
    public abstract void login(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.LoginRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.LoginResponse> done);

    /**
     * <pre>
     * Verify email
     * </pre>
     *
     * <code>rpc VerificationTokenRegistration(.ConfirmEmailRequest) returns (.ConfirmEmailResponse);</code>
     */
    public abstract void verificationTokenRegistration(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.ConfirmEmailRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.ConfirmEmailResponse> done);

    /**
     * <pre>
     * send reset password email
     * </pre>
     *
     * <code>rpc PasswordForgot(.PasswordResetRequest) returns (.PasswordResetResponse);</code>
     */
    public abstract void passwordForgot(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.PasswordResetRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.PasswordResetResponse> done);

    /**
     * <pre>
     * save new password
     * </pre>
     *
     * <code>rpc PasswordReset(.NewPasswordRequest) returns (.NewPasswordResponse);</code>
     */
    public abstract void passwordReset(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.NewPasswordRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.NewPasswordResponse> done);

    /**
     * <pre>
     * register account's information
     * </pre>
     *
     * <code>rpc RegistrationInformation(.RegistrationInformationRequest) returns (.RegistrationInformationResponse);</code>
     */
    public abstract void registrationInformation(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.RegistrationInformationRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.RegistrationInformationResponse> done);

    /**
     * <pre>
     * verify reset password token
     * </pre>
     *
     * <code>rpc VerificationResetPasswordToken(.VerificationResetPasswordTokenRequest) returns (.VerificationResetPasswordTokenResponse);</code>
     */
    public abstract void verificationResetPasswordToken(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.VerificationResetPasswordTokenRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.VerificationResetPasswordTokenResponse> done);

    /**
     * <pre>
     * filter controller call to user service
     * </pre>
     *
     * <code>rpc GetEmailFromToken(.GetEmailRequest) returns (.GetEmailResponse);</code>
     */
    public abstract void getEmailFromToken(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.GetEmailRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.GetEmailResponse> done);

    /**
     * <pre>
     *validate toke
     * </pre>
     *
     * <code>rpc ValidateToken(.ValidateTokenRequest) returns (.ValidateTokenResponse);</code>
     */
    public abstract void validateToken(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.ValidateTokenRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.ValidateTokenResponse> done);

    /**
     * <pre>
     * get all user
     * </pre>
     *
     * <code>rpc GetAllUser(.GetAllUserRequest) returns (.GetAllUserResponse);</code>
     */
    public abstract void getAllUser(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.GetAllUserRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.GetAllUserResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new UserService() {
      @java.lang.Override
      public  void registration(
          com.google.protobuf.RpcController controller,
          web.service.user.grpc.RegistrationRequestGrpc request,
          com.google.protobuf.RpcCallback<web.service.user.grpc.RegistrationResponseGrpc> done) {
        impl.registration(controller, request, done);
      }

      @java.lang.Override
      public  void login(
          com.google.protobuf.RpcController controller,
          web.service.user.grpc.LoginRequest request,
          com.google.protobuf.RpcCallback<web.service.user.grpc.LoginResponse> done) {
        impl.login(controller, request, done);
      }

      @java.lang.Override
      public  void verificationTokenRegistration(
          com.google.protobuf.RpcController controller,
          web.service.user.grpc.ConfirmEmailRequest request,
          com.google.protobuf.RpcCallback<web.service.user.grpc.ConfirmEmailResponse> done) {
        impl.verificationTokenRegistration(controller, request, done);
      }

      @java.lang.Override
      public  void passwordForgot(
          com.google.protobuf.RpcController controller,
          web.service.user.grpc.PasswordResetRequest request,
          com.google.protobuf.RpcCallback<web.service.user.grpc.PasswordResetResponse> done) {
        impl.passwordForgot(controller, request, done);
      }

      @java.lang.Override
      public  void passwordReset(
          com.google.protobuf.RpcController controller,
          web.service.user.grpc.NewPasswordRequest request,
          com.google.protobuf.RpcCallback<web.service.user.grpc.NewPasswordResponse> done) {
        impl.passwordReset(controller, request, done);
      }

      @java.lang.Override
      public  void registrationInformation(
          com.google.protobuf.RpcController controller,
          web.service.user.grpc.RegistrationInformationRequest request,
          com.google.protobuf.RpcCallback<web.service.user.grpc.RegistrationInformationResponse> done) {
        impl.registrationInformation(controller, request, done);
      }

      @java.lang.Override
      public  void verificationResetPasswordToken(
          com.google.protobuf.RpcController controller,
          web.service.user.grpc.VerificationResetPasswordTokenRequest request,
          com.google.protobuf.RpcCallback<web.service.user.grpc.VerificationResetPasswordTokenResponse> done) {
        impl.verificationResetPasswordToken(controller, request, done);
      }

      @java.lang.Override
      public  void getEmailFromToken(
          com.google.protobuf.RpcController controller,
          web.service.user.grpc.GetEmailRequest request,
          com.google.protobuf.RpcCallback<web.service.user.grpc.GetEmailResponse> done) {
        impl.getEmailFromToken(controller, request, done);
      }

      @java.lang.Override
      public  void validateToken(
          com.google.protobuf.RpcController controller,
          web.service.user.grpc.ValidateTokenRequest request,
          com.google.protobuf.RpcCallback<web.service.user.grpc.ValidateTokenResponse> done) {
        impl.validateToken(controller, request, done);
      }

      @java.lang.Override
      public  void getAllUser(
          com.google.protobuf.RpcController controller,
          web.service.user.grpc.GetAllUserRequest request,
          com.google.protobuf.RpcCallback<web.service.user.grpc.GetAllUserResponse> done) {
        impl.getAllUser(controller, request, done);
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
            return impl.registration(controller, (web.service.user.grpc.RegistrationRequestGrpc)request);
          case 1:
            return impl.login(controller, (web.service.user.grpc.LoginRequest)request);
          case 2:
            return impl.verificationTokenRegistration(controller, (web.service.user.grpc.ConfirmEmailRequest)request);
          case 3:
            return impl.passwordForgot(controller, (web.service.user.grpc.PasswordResetRequest)request);
          case 4:
            return impl.passwordReset(controller, (web.service.user.grpc.NewPasswordRequest)request);
          case 5:
            return impl.registrationInformation(controller, (web.service.user.grpc.RegistrationInformationRequest)request);
          case 6:
            return impl.verificationResetPasswordToken(controller, (web.service.user.grpc.VerificationResetPasswordTokenRequest)request);
          case 7:
            return impl.getEmailFromToken(controller, (web.service.user.grpc.GetEmailRequest)request);
          case 8:
            return impl.validateToken(controller, (web.service.user.grpc.ValidateTokenRequest)request);
          case 9:
            return impl.getAllUser(controller, (web.service.user.grpc.GetAllUserRequest)request);
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
            return web.service.user.grpc.RegistrationRequestGrpc.getDefaultInstance();
          case 1:
            return web.service.user.grpc.LoginRequest.getDefaultInstance();
          case 2:
            return web.service.user.grpc.ConfirmEmailRequest.getDefaultInstance();
          case 3:
            return web.service.user.grpc.PasswordResetRequest.getDefaultInstance();
          case 4:
            return web.service.user.grpc.NewPasswordRequest.getDefaultInstance();
          case 5:
            return web.service.user.grpc.RegistrationInformationRequest.getDefaultInstance();
          case 6:
            return web.service.user.grpc.VerificationResetPasswordTokenRequest.getDefaultInstance();
          case 7:
            return web.service.user.grpc.GetEmailRequest.getDefaultInstance();
          case 8:
            return web.service.user.grpc.ValidateTokenRequest.getDefaultInstance();
          case 9:
            return web.service.user.grpc.GetAllUserRequest.getDefaultInstance();
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
            return web.service.user.grpc.RegistrationResponseGrpc.getDefaultInstance();
          case 1:
            return web.service.user.grpc.LoginResponse.getDefaultInstance();
          case 2:
            return web.service.user.grpc.ConfirmEmailResponse.getDefaultInstance();
          case 3:
            return web.service.user.grpc.PasswordResetResponse.getDefaultInstance();
          case 4:
            return web.service.user.grpc.NewPasswordResponse.getDefaultInstance();
          case 5:
            return web.service.user.grpc.RegistrationInformationResponse.getDefaultInstance();
          case 6:
            return web.service.user.grpc.VerificationResetPasswordTokenResponse.getDefaultInstance();
          case 7:
            return web.service.user.grpc.GetEmailResponse.getDefaultInstance();
          case 8:
            return web.service.user.grpc.ValidateTokenResponse.getDefaultInstance();
          case 9:
            return web.service.user.grpc.GetAllUserResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <pre>
   * create a new account, save new email, password and send verification email
   * </pre>
   *
   * <code>rpc Registration(.RegistrationRequestGrpc) returns (.RegistrationResponseGrpc);</code>
   */
  public abstract void registration(
      com.google.protobuf.RpcController controller,
      web.service.user.grpc.RegistrationRequestGrpc request,
      com.google.protobuf.RpcCallback<web.service.user.grpc.RegistrationResponseGrpc> done);

  /**
   * <pre>
   * login account
   * </pre>
   *
   * <code>rpc Login(.LoginRequest) returns (.LoginResponse);</code>
   */
  public abstract void login(
      com.google.protobuf.RpcController controller,
      web.service.user.grpc.LoginRequest request,
      com.google.protobuf.RpcCallback<web.service.user.grpc.LoginResponse> done);

  /**
   * <pre>
   * Verify email
   * </pre>
   *
   * <code>rpc VerificationTokenRegistration(.ConfirmEmailRequest) returns (.ConfirmEmailResponse);</code>
   */
  public abstract void verificationTokenRegistration(
      com.google.protobuf.RpcController controller,
      web.service.user.grpc.ConfirmEmailRequest request,
      com.google.protobuf.RpcCallback<web.service.user.grpc.ConfirmEmailResponse> done);

  /**
   * <pre>
   * send reset password email
   * </pre>
   *
   * <code>rpc PasswordForgot(.PasswordResetRequest) returns (.PasswordResetResponse);</code>
   */
  public abstract void passwordForgot(
      com.google.protobuf.RpcController controller,
      web.service.user.grpc.PasswordResetRequest request,
      com.google.protobuf.RpcCallback<web.service.user.grpc.PasswordResetResponse> done);

  /**
   * <pre>
   * save new password
   * </pre>
   *
   * <code>rpc PasswordReset(.NewPasswordRequest) returns (.NewPasswordResponse);</code>
   */
  public abstract void passwordReset(
      com.google.protobuf.RpcController controller,
      web.service.user.grpc.NewPasswordRequest request,
      com.google.protobuf.RpcCallback<web.service.user.grpc.NewPasswordResponse> done);

  /**
   * <pre>
   * register account's information
   * </pre>
   *
   * <code>rpc RegistrationInformation(.RegistrationInformationRequest) returns (.RegistrationInformationResponse);</code>
   */
  public abstract void registrationInformation(
      com.google.protobuf.RpcController controller,
      web.service.user.grpc.RegistrationInformationRequest request,
      com.google.protobuf.RpcCallback<web.service.user.grpc.RegistrationInformationResponse> done);

  /**
   * <pre>
   * verify reset password token
   * </pre>
   *
   * <code>rpc VerificationResetPasswordToken(.VerificationResetPasswordTokenRequest) returns (.VerificationResetPasswordTokenResponse);</code>
   */
  public abstract void verificationResetPasswordToken(
      com.google.protobuf.RpcController controller,
      web.service.user.grpc.VerificationResetPasswordTokenRequest request,
      com.google.protobuf.RpcCallback<web.service.user.grpc.VerificationResetPasswordTokenResponse> done);

  /**
   * <pre>
   * filter controller call to user service
   * </pre>
   *
   * <code>rpc GetEmailFromToken(.GetEmailRequest) returns (.GetEmailResponse);</code>
   */
  public abstract void getEmailFromToken(
      com.google.protobuf.RpcController controller,
      web.service.user.grpc.GetEmailRequest request,
      com.google.protobuf.RpcCallback<web.service.user.grpc.GetEmailResponse> done);

  /**
   * <pre>
   *validate toke
   * </pre>
   *
   * <code>rpc ValidateToken(.ValidateTokenRequest) returns (.ValidateTokenResponse);</code>
   */
  public abstract void validateToken(
      com.google.protobuf.RpcController controller,
      web.service.user.grpc.ValidateTokenRequest request,
      com.google.protobuf.RpcCallback<web.service.user.grpc.ValidateTokenResponse> done);

  /**
   * <pre>
   * get all user
   * </pre>
   *
   * <code>rpc GetAllUser(.GetAllUserRequest) returns (.GetAllUserResponse);</code>
   */
  public abstract void getAllUser(
      com.google.protobuf.RpcController controller,
      web.service.user.grpc.GetAllUserRequest request,
      com.google.protobuf.RpcCallback<web.service.user.grpc.GetAllUserResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return web.service.user.grpc.User.getDescriptor().getServices().get(0);
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
        this.registration(controller, (web.service.user.grpc.RegistrationRequestGrpc)request,
          com.google.protobuf.RpcUtil.<web.service.user.grpc.RegistrationResponseGrpc>specializeCallback(
            done));
        return;
      case 1:
        this.login(controller, (web.service.user.grpc.LoginRequest)request,
          com.google.protobuf.RpcUtil.<web.service.user.grpc.LoginResponse>specializeCallback(
            done));
        return;
      case 2:
        this.verificationTokenRegistration(controller, (web.service.user.grpc.ConfirmEmailRequest)request,
          com.google.protobuf.RpcUtil.<web.service.user.grpc.ConfirmEmailResponse>specializeCallback(
            done));
        return;
      case 3:
        this.passwordForgot(controller, (web.service.user.grpc.PasswordResetRequest)request,
          com.google.protobuf.RpcUtil.<web.service.user.grpc.PasswordResetResponse>specializeCallback(
            done));
        return;
      case 4:
        this.passwordReset(controller, (web.service.user.grpc.NewPasswordRequest)request,
          com.google.protobuf.RpcUtil.<web.service.user.grpc.NewPasswordResponse>specializeCallback(
            done));
        return;
      case 5:
        this.registrationInformation(controller, (web.service.user.grpc.RegistrationInformationRequest)request,
          com.google.protobuf.RpcUtil.<web.service.user.grpc.RegistrationInformationResponse>specializeCallback(
            done));
        return;
      case 6:
        this.verificationResetPasswordToken(controller, (web.service.user.grpc.VerificationResetPasswordTokenRequest)request,
          com.google.protobuf.RpcUtil.<web.service.user.grpc.VerificationResetPasswordTokenResponse>specializeCallback(
            done));
        return;
      case 7:
        this.getEmailFromToken(controller, (web.service.user.grpc.GetEmailRequest)request,
          com.google.protobuf.RpcUtil.<web.service.user.grpc.GetEmailResponse>specializeCallback(
            done));
        return;
      case 8:
        this.validateToken(controller, (web.service.user.grpc.ValidateTokenRequest)request,
          com.google.protobuf.RpcUtil.<web.service.user.grpc.ValidateTokenResponse>specializeCallback(
            done));
        return;
      case 9:
        this.getAllUser(controller, (web.service.user.grpc.GetAllUserRequest)request,
          com.google.protobuf.RpcUtil.<web.service.user.grpc.GetAllUserResponse>specializeCallback(
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
        return web.service.user.grpc.RegistrationRequestGrpc.getDefaultInstance();
      case 1:
        return web.service.user.grpc.LoginRequest.getDefaultInstance();
      case 2:
        return web.service.user.grpc.ConfirmEmailRequest.getDefaultInstance();
      case 3:
        return web.service.user.grpc.PasswordResetRequest.getDefaultInstance();
      case 4:
        return web.service.user.grpc.NewPasswordRequest.getDefaultInstance();
      case 5:
        return web.service.user.grpc.RegistrationInformationRequest.getDefaultInstance();
      case 6:
        return web.service.user.grpc.VerificationResetPasswordTokenRequest.getDefaultInstance();
      case 7:
        return web.service.user.grpc.GetEmailRequest.getDefaultInstance();
      case 8:
        return web.service.user.grpc.ValidateTokenRequest.getDefaultInstance();
      case 9:
        return web.service.user.grpc.GetAllUserRequest.getDefaultInstance();
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
        return web.service.user.grpc.RegistrationResponseGrpc.getDefaultInstance();
      case 1:
        return web.service.user.grpc.LoginResponse.getDefaultInstance();
      case 2:
        return web.service.user.grpc.ConfirmEmailResponse.getDefaultInstance();
      case 3:
        return web.service.user.grpc.PasswordResetResponse.getDefaultInstance();
      case 4:
        return web.service.user.grpc.NewPasswordResponse.getDefaultInstance();
      case 5:
        return web.service.user.grpc.RegistrationInformationResponse.getDefaultInstance();
      case 6:
        return web.service.user.grpc.VerificationResetPasswordTokenResponse.getDefaultInstance();
      case 7:
        return web.service.user.grpc.GetEmailResponse.getDefaultInstance();
      case 8:
        return web.service.user.grpc.ValidateTokenResponse.getDefaultInstance();
      case 9:
        return web.service.user.grpc.GetAllUserResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends web.service.user.grpc.UserService implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void registration(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.RegistrationRequestGrpc request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.RegistrationResponseGrpc> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        web.service.user.grpc.RegistrationResponseGrpc.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.service.user.grpc.RegistrationResponseGrpc.class,
          web.service.user.grpc.RegistrationResponseGrpc.getDefaultInstance()));
    }

    public  void login(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.LoginRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.LoginResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        web.service.user.grpc.LoginResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.service.user.grpc.LoginResponse.class,
          web.service.user.grpc.LoginResponse.getDefaultInstance()));
    }

    public  void verificationTokenRegistration(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.ConfirmEmailRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.ConfirmEmailResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        web.service.user.grpc.ConfirmEmailResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.service.user.grpc.ConfirmEmailResponse.class,
          web.service.user.grpc.ConfirmEmailResponse.getDefaultInstance()));
    }

    public  void passwordForgot(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.PasswordResetRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.PasswordResetResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        web.service.user.grpc.PasswordResetResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.service.user.grpc.PasswordResetResponse.class,
          web.service.user.grpc.PasswordResetResponse.getDefaultInstance()));
    }

    public  void passwordReset(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.NewPasswordRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.NewPasswordResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        web.service.user.grpc.NewPasswordResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.service.user.grpc.NewPasswordResponse.class,
          web.service.user.grpc.NewPasswordResponse.getDefaultInstance()));
    }

    public  void registrationInformation(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.RegistrationInformationRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.RegistrationInformationResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(5),
        controller,
        request,
        web.service.user.grpc.RegistrationInformationResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.service.user.grpc.RegistrationInformationResponse.class,
          web.service.user.grpc.RegistrationInformationResponse.getDefaultInstance()));
    }

    public  void verificationResetPasswordToken(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.VerificationResetPasswordTokenRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.VerificationResetPasswordTokenResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(6),
        controller,
        request,
        web.service.user.grpc.VerificationResetPasswordTokenResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.service.user.grpc.VerificationResetPasswordTokenResponse.class,
          web.service.user.grpc.VerificationResetPasswordTokenResponse.getDefaultInstance()));
    }

    public  void getEmailFromToken(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.GetEmailRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.GetEmailResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(7),
        controller,
        request,
        web.service.user.grpc.GetEmailResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.service.user.grpc.GetEmailResponse.class,
          web.service.user.grpc.GetEmailResponse.getDefaultInstance()));
    }

    public  void validateToken(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.ValidateTokenRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.ValidateTokenResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(8),
        controller,
        request,
        web.service.user.grpc.ValidateTokenResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.service.user.grpc.ValidateTokenResponse.class,
          web.service.user.grpc.ValidateTokenResponse.getDefaultInstance()));
    }

    public  void getAllUser(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.GetAllUserRequest request,
        com.google.protobuf.RpcCallback<web.service.user.grpc.GetAllUserResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(9),
        controller,
        request,
        web.service.user.grpc.GetAllUserResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          web.service.user.grpc.GetAllUserResponse.class,
          web.service.user.grpc.GetAllUserResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public web.service.user.grpc.RegistrationResponseGrpc registration(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.RegistrationRequestGrpc request)
        throws com.google.protobuf.ServiceException;

    public web.service.user.grpc.LoginResponse login(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.LoginRequest request)
        throws com.google.protobuf.ServiceException;

    public web.service.user.grpc.ConfirmEmailResponse verificationTokenRegistration(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.ConfirmEmailRequest request)
        throws com.google.protobuf.ServiceException;

    public web.service.user.grpc.PasswordResetResponse passwordForgot(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.PasswordResetRequest request)
        throws com.google.protobuf.ServiceException;

    public web.service.user.grpc.NewPasswordResponse passwordReset(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.NewPasswordRequest request)
        throws com.google.protobuf.ServiceException;

    public web.service.user.grpc.RegistrationInformationResponse registrationInformation(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.RegistrationInformationRequest request)
        throws com.google.protobuf.ServiceException;

    public web.service.user.grpc.VerificationResetPasswordTokenResponse verificationResetPasswordToken(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.VerificationResetPasswordTokenRequest request)
        throws com.google.protobuf.ServiceException;

    public web.service.user.grpc.GetEmailResponse getEmailFromToken(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.GetEmailRequest request)
        throws com.google.protobuf.ServiceException;

    public web.service.user.grpc.ValidateTokenResponse validateToken(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.ValidateTokenRequest request)
        throws com.google.protobuf.ServiceException;

    public web.service.user.grpc.GetAllUserResponse getAllUser(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.GetAllUserRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public web.service.user.grpc.RegistrationResponseGrpc registration(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.RegistrationRequestGrpc request)
        throws com.google.protobuf.ServiceException {
      return (web.service.user.grpc.RegistrationResponseGrpc) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        web.service.user.grpc.RegistrationResponseGrpc.getDefaultInstance());
    }


    public web.service.user.grpc.LoginResponse login(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.LoginRequest request)
        throws com.google.protobuf.ServiceException {
      return (web.service.user.grpc.LoginResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        web.service.user.grpc.LoginResponse.getDefaultInstance());
    }


    public web.service.user.grpc.ConfirmEmailResponse verificationTokenRegistration(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.ConfirmEmailRequest request)
        throws com.google.protobuf.ServiceException {
      return (web.service.user.grpc.ConfirmEmailResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(2),
        controller,
        request,
        web.service.user.grpc.ConfirmEmailResponse.getDefaultInstance());
    }


    public web.service.user.grpc.PasswordResetResponse passwordForgot(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.PasswordResetRequest request)
        throws com.google.protobuf.ServiceException {
      return (web.service.user.grpc.PasswordResetResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(3),
        controller,
        request,
        web.service.user.grpc.PasswordResetResponse.getDefaultInstance());
    }


    public web.service.user.grpc.NewPasswordResponse passwordReset(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.NewPasswordRequest request)
        throws com.google.protobuf.ServiceException {
      return (web.service.user.grpc.NewPasswordResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(4),
        controller,
        request,
        web.service.user.grpc.NewPasswordResponse.getDefaultInstance());
    }


    public web.service.user.grpc.RegistrationInformationResponse registrationInformation(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.RegistrationInformationRequest request)
        throws com.google.protobuf.ServiceException {
      return (web.service.user.grpc.RegistrationInformationResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(5),
        controller,
        request,
        web.service.user.grpc.RegistrationInformationResponse.getDefaultInstance());
    }


    public web.service.user.grpc.VerificationResetPasswordTokenResponse verificationResetPasswordToken(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.VerificationResetPasswordTokenRequest request)
        throws com.google.protobuf.ServiceException {
      return (web.service.user.grpc.VerificationResetPasswordTokenResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(6),
        controller,
        request,
        web.service.user.grpc.VerificationResetPasswordTokenResponse.getDefaultInstance());
    }


    public web.service.user.grpc.GetEmailResponse getEmailFromToken(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.GetEmailRequest request)
        throws com.google.protobuf.ServiceException {
      return (web.service.user.grpc.GetEmailResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(7),
        controller,
        request,
        web.service.user.grpc.GetEmailResponse.getDefaultInstance());
    }


    public web.service.user.grpc.ValidateTokenResponse validateToken(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.ValidateTokenRequest request)
        throws com.google.protobuf.ServiceException {
      return (web.service.user.grpc.ValidateTokenResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(8),
        controller,
        request,
        web.service.user.grpc.ValidateTokenResponse.getDefaultInstance());
    }


    public web.service.user.grpc.GetAllUserResponse getAllUser(
        com.google.protobuf.RpcController controller,
        web.service.user.grpc.GetAllUserRequest request)
        throws com.google.protobuf.ServiceException {
      return (web.service.user.grpc.GetAllUserResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(9),
        controller,
        request,
        web.service.user.grpc.GetAllUserResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:UserService)
}

