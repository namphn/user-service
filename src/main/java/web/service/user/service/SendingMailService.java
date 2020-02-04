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
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Data
@Service
public class SendingMailService {

    @Autowired
    private web.service.user.model.MailProperties mailProperties;
    @Autowired
    private final freemarker.template.Configuration templates;
    @Autowired
    private SendGrid sendGrid;

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

        return sendMail(toEMail, subject, new Content("text/plain", body));

    }


    private boolean sendMail(String toEmail, String subject, Content content){
//        try {
//            Properties props = System.getProperties();
//            props.put("mail.transport.protocol", "smtp");
//            props.put("mail.smtp.port", mailProperties.getSmtp().getPort());
//            props.put("mail.smtp.starttls.enable", "true");
//            props.put("mail.smtp,auth", "true");
//
//            Session session = Session.getDefaultInstance(props);
//            session.setDebug(true);
//
//            MimeMessage msg = new MimeMessage(session);
//            msg.setFrom(new InternetAddress(mailProperties.getFrom(), mailProperties.getFromName()));
//            msg.setRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
//            msg.setSubject(subject);
//            msg.setContent(body, "text/html");
//
//            Transport transport = session.getTransport();
//            transport.connect(mailProperties.getSmtp().getHost(), mailProperties.getSmtp().getUsername(), mailProperties.getSmtp().getPassword());
//            transport.sendMessage(msg, msg.getAllRecipients());
//            return true;
//
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        } catch (AddressException e) {
//            e.printStackTrace();
//        } catch (NoSuchProviderException e) {
//            e.printStackTrace();
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//        return false;

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
        System.out.println(response.getStatusCode());
        System.out.println(response.getHeaders());
        System.out.println(response.getBody());
        if(response == null) return false;
        else return true;
    }
}
