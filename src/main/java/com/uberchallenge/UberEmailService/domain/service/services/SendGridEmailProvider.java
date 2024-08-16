package com.uberchallenge.UberEmailService.domain.service.services;

import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.uberchallenge.UberEmailService.domain.Email;
import com.uberchallenge.UberEmailService.domain.service.EmailProviderInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class SendGridEmailProvider implements EmailProviderInterface {

    @Value("${sendgrid.apiKey}")
    private String apiKey;

    @Override
    public void sendEmail(Email em) throws IOException { // todo: custom errors
        SendGrid sg = new SendGrid(apiKey);

        Request req = new Request();
        req.setEndpoint("mail/send");
        req.setMethod(Method.POST);

        // todo: not so readable but this is a json string
        req.setBody("{\"personalizations\":[{\"to\":[{\"email\":\"" + em.getTo() + "\"}]}],\"from\":{\"email\":\"" + em.getFrom() + "\"},\"subject\":\"" + em.getSubject() + "\",\"content\":[{\"type\":\"text/plain\",\"value\":\"" + em.getBody() + "\"}]}");
        Response res = sg.api(req);

        if (res.getStatusCode() != 202) {
            throw new IOException("Error sending email to: " + em.getTo() + ". Status code: " + res.getStatusCode());
        }
    }
}
