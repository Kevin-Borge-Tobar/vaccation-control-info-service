package com.borge.vcis.repositories;

import com.borge.vcis.entities.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicipioRepository extends JpaRepository<Municipio, Integer> {
}