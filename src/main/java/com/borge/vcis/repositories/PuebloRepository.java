package com.borge.vcis.repositories;

import com.borge.vcis.entities.Pueblo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PuebloRepository extends JpaRepository<Pueblo, Integer> {
}