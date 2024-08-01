package com.uberchallenge.UberEmailService.domain;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record EmailRequestDTO(
        @Email
        String from,
        @Email
        String to,
        @NotBlank
        String subject,
        @NotBlank
        String body
) {
}
