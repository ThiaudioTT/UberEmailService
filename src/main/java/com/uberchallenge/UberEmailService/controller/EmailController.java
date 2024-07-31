package com.uberchallenge.UberEmailService.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @PostMapping("/send")
    public void sendEmail() {
        // Send email
        System.out.println("Email sent!");
    }
}
