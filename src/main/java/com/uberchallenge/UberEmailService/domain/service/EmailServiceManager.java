package com.uberchallenge.UberEmailService.domain.service;

import com.uberchallenge.UberEmailService.domain.Email;
import com.uberchallenge.UberEmailService.infra.exceptions.SendEmailException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmailServiceManager {

    @Autowired
    private List<EmailProviderInterface> emailProviders;

    public void sendEmail(Email email) {

        for(EmailProviderInterface pr : this.emailProviders) {
            System.out.println("Trying to send email using: " + pr.getClass().getSimpleName() + "...");
            try {
                pr.sendEmail(email);
                System.out.println("Email sent to: " + email.getTo() + " using " + pr.getClass().getSimpleName());
                return;
            } catch (Exception e) {
                System.out.println("Error sending email using: " + pr.getClass().getName() + ". Error: " + e.getMessage());
            }
        }

        // oops, all email providers failed
        throw new SendEmailException("Error sending email to: " + email.getTo());
    }
}
