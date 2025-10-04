package com.borge.vcis.repositories;

import com.borge.vcis.entities.ControlAltura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ControlAlturaRepository extends JpaRepository<ControlAltura, Integer> {
    List<ControlAltura> findControlAlturaByInformacionInfante_Cui(String cui);
}