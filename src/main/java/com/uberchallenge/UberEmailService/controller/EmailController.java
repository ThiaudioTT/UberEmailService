package com.uberchallenge.UberEmailService.controller;

import com.uberchallenge.UberEmailService.domain.Email;
import com.uberchallenge.UberEmailService.domain.EmailRequestDTO;
import com.uberchallenge.UberEmailService.domain.service.EmailServiceManager;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailServiceManager emailService;

    @PostMapping("/send")
    public void sendEmail(@RequestBody @Valid EmailRequestDTO email) {
        // Send email
        System.out.println("Email sent!");
        this.emailService.sendEmail(new Email(email));
    }
}
