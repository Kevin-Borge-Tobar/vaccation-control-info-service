package com.borge.vcis.repositories;

import com.borge.vcis.entities.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
    List<Contacto> findByInformacionInfanteId(int informacionInfanteId);
}