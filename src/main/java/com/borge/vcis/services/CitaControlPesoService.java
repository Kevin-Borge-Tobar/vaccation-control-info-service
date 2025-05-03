package com.borge.vcis.services;

import com.borge.vcis.dtos.CitaControlPesoDto;
import com.borge.vcis.entities.CitaControlPeso;
import com.borge.vcis.repositories.CitaControlPesoRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CitaControlPesoService  extends  GenericServiceImpl<CitaControlPesoDto, CitaControlPeso, Integer> {

    public CitaControlPesoService(CitaControlPesoRepository repository) {
        super(repository);
    }
}
