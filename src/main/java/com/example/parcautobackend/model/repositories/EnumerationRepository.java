package com.example.parcautobackend.model.repositories;

import com.example.parcautobackend.model.entities.Enumeration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnumerationRepository extends JpaRepository<Enumeration, Long> {
}