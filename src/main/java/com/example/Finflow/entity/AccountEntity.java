package com.example.Finflow.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_ACCOUNT")
@Getter
@Setter
public class AccountEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAccount;
    private BigDecimal balance;
    private String type;
    @Column(nullable = false)
    private String bankName;
    @Column(nullable = false)
    private boolean active;
    @Column(nullable = false)
    private LocalDateTime creationDate;
    private LocalDateTime dateFoExclusion;

}
