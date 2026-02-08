package com.example.Finflow.domain.account.dto;

import java.math.BigDecimal;

import com.example.Finflow.enums.AccountType;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record AccountRecord(@NotNull(message = "O valor do saldo bancario nao pode estar vazio!!") BigDecimal balance,
        @NotNull(message = "O tipo da conta nao pode ser nulo nem estar em branco!!") AccountType typeOfAccount,
        @NotBlank(message = "O nome do banco no qual a conta pertence, nao pode ser nulo nem estar em branco") String nameOfaBank) {

}
