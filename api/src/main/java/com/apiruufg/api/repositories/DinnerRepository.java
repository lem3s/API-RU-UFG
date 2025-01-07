package com.apiruufg.api.repositories;

import com.apiruufg.api.domain.dinner.Dinner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DinnerRepository extends JpaRepository<Dinner, UUID> {
}
