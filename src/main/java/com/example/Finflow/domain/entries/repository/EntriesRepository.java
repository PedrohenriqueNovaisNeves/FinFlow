package com.example.Finflow.domain.entries.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Finflow.entity.EntriesEntity;

public interface EntriesRepository extends JpaRepository<UUID, EntriesEntity>{

}
