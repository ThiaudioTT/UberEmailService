package com.uberchallenge.UberEmailService.domain.service;

import com.uberchallenge.UberEmailService.domain.Email;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceManager {


    public void sendEmail(Email email) {
        // Send email using one of the email providers
        System.out.println("Email sent to: " + email.getTo());
    }
}
