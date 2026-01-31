package com.example.Finflow.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.example.Finflow.enums.ExpensesCategory;
import com.example.Finflow.enums.PaymentMethod;
import com.example.Finflow.enums.Status;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_EXPENSES")
@Getter
@Setter
public class ExpensesEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID expensesId;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private BigDecimal expenseValue;
    @Column(nullable = false)
    private LocalDateTime departureDate;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ExpensesCategory category;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PaymentMethod paymentMethod;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;
    @JoinColumn(name = "account", referencedColumnName = "idAccount", nullable = false)
    @ManyToOne
    private AccountEntity account;
}
