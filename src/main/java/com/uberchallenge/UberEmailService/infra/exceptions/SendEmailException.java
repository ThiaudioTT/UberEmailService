package com.uberchallenge.UberEmailService.infra.exceptions;

/**
 * When an error occurs while sending an email. Generally, this exception is thrown when ALL the email providers is not available.
 */
public class SendEmailException extends RuntimeException {
    public SendEmailException(String message) {
        super(message);
    }
}
