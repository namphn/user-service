package web.service.user.model;

public class Status {
    public static final String SENT_EMAIL = "SENT EMAIL";
    public static final String ERROR = "HAVE ERROR";
    public static final String HAVE_NOT_ACCOUNT = "HAVE NOT ACCOUNT";
    public static final String INVALID_TOKEN = "INVALID TOKEN";
    public static final String EXPIRED_TOKEN = "EXPIRED_TOKEN";
    public static final String SUCCESSFULLY_VERIFY = "SUCCESSFULLY VERIFY";
    public static final String ACCOUNT_IS_INACTIVE = "ACCOUNT IS INACTIVE";
    public static final String EMAIL_ALREADY_EXISTS = "EMAIL ALREADY EXISTS";
    public static final String INVALID_EMAIL = "INVALID EMAIL ADDRESS";
    public static final String INVALID_CONFIRM_PASSWORD = "INVALID CONFIRM PASSWORD";
    public static final String SAVED_NEW_PASSWORD = "SAVED_NEW_PASSWORD";
    public static final String ACCEPT = "ACCEPT";
    public static final String SAVED_INFORMATION = "SAVED INFORMATION";
    public static final String INTERNAL_SERVER = "INTERNAL SERVER ERROR";
    public static final String SUCCESS = "SUCCESS";
    public static final String NODATA = "HAVE NOT DATA";
    public static final String INVALID_PASSWORD = "INVALID PASSWORD";

    public static class StatusCode {
        public static final String NORMAL = "200";
        public static final String NODATA = "202";
        public static final String SERVER_ERROR = "500";
    }
}
