package com.apiruufg.api.repositories;

import com.apiruufg.api.domain.lunch.Lunch;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LunchRepository extends JpaRepository<Lunch, UUID> {
}
