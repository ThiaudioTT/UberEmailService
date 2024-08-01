package com.uberchallenge.UberEmailService.domain.service;

import com.uberchallenge.UberEmailService.domain.Email;

public interface EmailProviderInterface {
    void sendEmail(Email email) throws Exception;
}
