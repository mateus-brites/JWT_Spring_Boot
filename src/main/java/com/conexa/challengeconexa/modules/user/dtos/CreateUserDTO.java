package com.conexa.challengeconexa.modules.user.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record CreateUserDTO(
    @NotBlank @Email String email,
    @NotBlank String password,
    @NotNull UserRoles role
) {
    
}
