package com.borge.vcis.repositories;

import com.borge.vcis.entities.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DomicilioRepository extends JpaRepository<Domicilio, Integer> {

    List<Domicilio> findByInformacionInfante_Id(Integer informacionInfanteId);
}