package com.borge.vcis.repositories;

import com.borge.vcis.entities.EdadAplicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface EdadAplicacionRepository extends JpaRepository<EdadAplicacion, Integer> {
}