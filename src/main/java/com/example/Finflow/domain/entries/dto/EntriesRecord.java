package com.example.Finflow.domain.entries.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EntriesRecord(
        @NotNull(message = "O valor recebido nao pode ser nulo ou estar em branco!!") BigDecimal inputValue,
        @NotBlank(message = "A descricao nao pode ser nula ou estar em branco!!")String description,
        @NotBlank(message = "O nome do banco no qual esta sendo recebido este valor, nao pode ser nulo nem estar em branco!!")String bankName) {

}
