package com.example.Finflow.domain.account.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Finflow.entity.AccountEntity;

public interface AccountRepository extends JpaRepository<UUID, AccountEntity>{

}
