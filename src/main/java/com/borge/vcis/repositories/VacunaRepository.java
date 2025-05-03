package com.borge.vcis.repositories;

import com.borge.vcis.entities.Vacuna;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacunaRepository extends JpaRepository<Vacuna, Integer> {
}