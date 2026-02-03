package com.example.Finflow.domain.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRecord(@NotBlank(message = "O nome do usuario nao pode esta em branco!!") String nameUser,
        @NotBlank(message = "O CPF do usuario nao pode estar em branco!!")String cpfUser,
        @NotBlank(message = "O email do usuario nao pode estar em branco!!")String emailUser,
        @NotBlank(message = "A senha nao pode estar em branco!!")String password,
        @NotBlank(message = "O numero de telefone nao pode estar em branco!!")String phoneNumber) {

}
