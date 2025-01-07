package com.apiruufg.api.repositories;

import com.apiruufg.api.domain.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MenuRepository extends JpaRepository<Menu, UUID> {
}
