package com.example.Finflow.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import com.example.Finflow.enums.AccountType;

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
@Table(name = "TB_BANKACCOUNT")
@Getter
@Setter
public class AccountEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idAccount;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AccountType type;
    @Column(nullable = false)
    private String bankName;
    @Column(nullable = false)
    private boolean active;
    @Column(nullable = false)
    private LocalDateTime creationDate;
    private LocalDateTime dateFoExclusion;
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "idUser", nullable = false)
    private UserEntity user;

}
