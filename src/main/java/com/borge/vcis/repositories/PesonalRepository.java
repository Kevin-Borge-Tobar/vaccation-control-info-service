package com.borge.vcis.repositories;

import com.borge.vcis.entities.Personal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PesonalRepository extends JpaRepository<Personal, Integer> {
}