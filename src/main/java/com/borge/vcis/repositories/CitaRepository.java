package com.borge.vcis.repositories;

import com.borge.vcis.entities.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepository extends JpaRepository<Cita, Integer> {
}