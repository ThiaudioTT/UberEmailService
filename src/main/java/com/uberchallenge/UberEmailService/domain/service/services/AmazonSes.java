package com.uberchallenge.UberEmailService.domain.service.services;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import com.uberchallenge.UberEmailService.domain.Email;
import com.uberchallenge.UberEmailService.domain.service.EmailProviderInterface;
import com.uberchallenge.UberEmailService.infra.exceptions.SendEmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class AmazonSes implements EmailProviderInterface {

    @Autowired
    private AmazonSimpleEmailService awsSesClient;

    @Value("${aws.ses.sender}")
    private String sender;

    @Override
    public void sendEmail(Email email) throws SendEmailException {
        SendEmailRequest request = new SendEmailRequest()
                .withDestination(new Destination().withToAddresses(email.getTo()))
                .withMessage(new Message()
                        .withBody(new Body().withHtml(new Content().withCharset("UTF-8").withData(email.getBody())))
                        .withSubject(new Content().withCharset("UTF-8").withData(email.getSubject())))
                .withSource(sender);


        awsSesClient.sendEmail(request);
    }
}
