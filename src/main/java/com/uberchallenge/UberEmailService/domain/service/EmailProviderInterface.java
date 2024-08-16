package com.uberchallenge.UberEmailService.domain.service;

import com.uberchallenge.UberEmailService.domain.Email;
import com.uberchallenge.UberEmailService.infra.exceptions.SendEmailException;

public interface EmailProviderInterface {
    void sendEmail(Email email) throws SendEmailException;
}
