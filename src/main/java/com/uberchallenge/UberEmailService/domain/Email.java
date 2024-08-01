package com.uberchallenge.UberEmailService.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Email {
    private String from;
    private String to;
    private String subject;
    private String body;

    public Email(EmailRequestDTO emailDTO) {
        this.from = emailDTO.from();
        this.to = emailDTO.to();
        this.subject = emailDTO.subject();
        this.body = emailDTO.body();
    }
}
