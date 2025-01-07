package com.apiruufg.api.repositories;

import com.apiruufg.api.domain.breakfast.Breakfast;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BreakfastRepository extends JpaRepository<Breakfast, UUID> {
}
