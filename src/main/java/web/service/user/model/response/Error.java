package web.service.user.model.response;

public class Error {

    public static ErrorResponse HAVE_EXIST_ACCOUNT = new ErrorResponse("USER_001",
            "this email address is already being used by another account");

    public static ErrorResponse INVALID_EMAIL = new ErrorResponse("USER_002", "invalid email");
    public static ErrorResponse INVALID_CONFIRM_PASSWORD = new ErrorResponse("USER_003",
            "Your password and confirmation password do not match");
}
