package com.uberchallenge.UberEmailService.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Email {
    private String from;
    private String to;
    private String subject;
    private String body;
}
