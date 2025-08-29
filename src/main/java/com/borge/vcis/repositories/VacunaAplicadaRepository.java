package com.borge.vcis.repositories;

import com.borge.vcis.entities.VacunaAplicada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VacunaAplicadaRepository extends JpaRepository<VacunaAplicada, Integer> {
    @Query("SELECT va FROM VacunaAplicada va " +
            "WHERE va.informacionInfante.cui = :cui " +
            "AND va.vacunas.id = :vacunaId")
    List<VacunaAplicada> findByCuiAndVacunaId(
            @Param("cui") String cui,
            @Param("vacunaId") Integer vacunaId
    );


}