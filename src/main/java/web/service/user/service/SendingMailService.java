package web.service.user.service;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import web.service.user.model.MailProperties;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
;

@Data
@Service
public class SendingMailService {

    private final web.service.user.model.MailProperties mailProperties;
    private final freemarker.template.Configuration templates;
    private final SendGrid sendGrid;

    @Autowired
    public SendingMailService(MailProperties mailProperties, Configuration templates, SendGrid sendGrid) {
        this.mailProperties = mailProperties;
        this.templates = templates;
        this.sendGrid = sendGrid;
    }

    public boolean sendVerificationMail(String toEMail, String verificationCode) {
        String subject = "Please verify your email";
        String body = "";

        try {
            Template t = templates.getTemplate("email-verification.ftl");
            Map<String, String> map = new HashMap<>();
            map.put("VERIFICATION_URL", mailProperties.getVerificationApi() + verificationCode);
            body = FreeMarkerTemplateUtils.processTemplateIntoString(t,map);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }

        return sendMail(toEMail, subject, new Content("text/html", body));
    }

    public boolean sendPasswordResetMail(String toEmail, String passwordForgotToken, String url){
        String subject = "Your password reset request";
        String body = "";

        try {
            Template resetPasswordTemplate = templates.getTemplate("email-passwordreset.ftl");
            Map<String, String> map = new HashMap<>();
            map.put("TO_EMAIL", toEmail);
            map.put("PASSWORD_RESET_URL", url + "/reset-password?token=" + passwordForgotToken);
            body = FreeMarkerTemplateUtils.processTemplateIntoString(resetPasswordTemplate, map);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }
        return sendMail(toEmail, subject, new Content("text/html", body));
    }

    private boolean sendMail(String toEmail, String subject, Content content){

        Mail mail = new Mail(new Email(mailProperties.getFrom()), subject, new Email(toEmail), content);
        mail.setReplyTo(new Email("hoangnamuet.vnu@gmail.com"));
        Request request = new Request();
        Response response = null;

        request.setMethod(Method.POST);
        request.setEndpoint("mail/send");

        try {
            request.setBody(mail.build());
            response = this.sendGrid.api(request);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(response == null) return false;
        else return true;
    }
}
