package com.borge.vcis.repositories;

import com.borge.vcis.entities.InformacionInfante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface InformacionInfanteRepository extends JpaRepository<InformacionInfante, Long> {


    @Query("SELECT c FROM InformacionInfante c WHERE c.cui = :cui")
    List<InformacionInfante> findByCui(@Param("cui") String cui);
}