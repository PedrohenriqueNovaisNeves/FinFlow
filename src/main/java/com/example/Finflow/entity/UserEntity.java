package com.example.Finflow.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_USER")
@Getter
@Setter
public class UserEntity {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idUser;
    @Column(nullable = false)
    private String nameUser;
    @Column(nullable = false, unique = true)
    private String cpfUser;
    @Column(nullable = false)
    private LocalDateTime creationDate;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String password;
    private LocalDateTime dateOfExclusion;
    @Column(nullable = false, unique = true)
    private String phoneNumber;

}
