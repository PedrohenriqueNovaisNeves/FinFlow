package com.example.Finflow.domain.entries.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Finflow.entity.EntriesEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface EntriesRepository extends JpaRepository<EntriesEntity, UUID>{

}
