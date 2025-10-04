package com.borge.vcis.repositories;

import com.borge.vcis.entities.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Integer> {

    @Query("SELECT c FROM Cita c WHERE c.informacionInfante.cui = :cui")
    List<Cita> findByCui(@Param("cui") String cui);

    @Query("SELECT c FROM Cita c WHERE c.informacionInfante.cui = :cui AND c.tipoCita.id = :tipoId AND c.status = 'PENDIENTE'")
    Optional<Cita> findByCuiAndTipoCita_IdAndPendiente(
            @Param("cui") String cui,
            @Param("tipoId") Integer tipoId
    );
    @Query("SELECT c FROM Cita c WHERE c.informacionInfante.cui = :cui AND c.status = 'PENDIENTE'")
    List<Cita> findByCuiAndPendiente(
            @Param("cui") String cui
    );
}
