package com.borge.vcis.repositories;

import com.borge.vcis.dtos.ResponsableDto;
import com.borge.vcis.entities.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResponsableRepository extends JpaRepository<Responsable, Integer> {
    List<Responsable> findByInformacionInfante_Id(Long informacionInfanteId);
}