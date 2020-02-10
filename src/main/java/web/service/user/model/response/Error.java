package web.service.user.model.response;

public class Error {
    public static ErrorResponse HAVE_EXIST_ACCOUNT = new ErrorResponse("USER_001", "this email address is already being used by another account");
    public static ErrorResponse INVALID_EMAIL = new ErrorResponse("USER_002", "invalid email");
}
