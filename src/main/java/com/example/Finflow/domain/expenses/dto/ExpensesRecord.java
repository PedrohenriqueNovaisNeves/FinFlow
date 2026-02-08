package com.example.Finflow.domain.expenses.dto;

import java.math.BigDecimal;

import com.example.Finflow.enums.ExpensesCategory;
import com.example.Finflow.enums.PaymentMethod;
import com.example.Finflow.enums.Status;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ExpensesRecord(
        @NotBlank(message = "A descricao do gasto nao pode ser nulo ou estar em branco!!") String description,
        @NotNull(message = "O valor gasto nao pode ser nulo ou estar em branco!!")BigDecimal expensesValue,
        @NotNull(message = "A categoria do gasto nao pode ser nulo ou estar em branco!!")ExpensesCategory category,
        @NotNull(message = "O tipo de pagamento nao pode ser nulo ou estar em branco!!")PaymentMethod paymentMethod,
        @NotNull(message = "O status do gasto nao pode ser nulo ou estar em branco!!")Status status,
        @NotBlank(message = "O nome do banco no qual esta sendo recebido este valor, nao pode ser nulo nem estar em branco!!")String bankName) {

}
