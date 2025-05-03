package com.borge.vcis.repositories;

import com.borge.vcis.entities.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
}