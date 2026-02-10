package com.example.Finflow.domain.expenses.repository;

import com.example.Finflow.entity.ExpensesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExpensesRepository extends JpaRepository<ExpensesEntity, UUID> {
}
