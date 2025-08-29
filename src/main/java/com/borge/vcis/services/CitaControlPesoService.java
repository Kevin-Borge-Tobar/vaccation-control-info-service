package com.borge.vcis.services;

import com.borge.vcis.dtos.CitaControlPesoDto;
import com.borge.vcis.entities.CitaControlPeso;
import com.borge.vcis.repositories.CitaControlPesoRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class CitaControlPesoService extends GenericServiceImpl<CitaControlPesoDto, CitaControlPeso, Integer> {

    public CitaControlPesoService(CitaControlPesoRepository repository, GenericMapper mapper) {
        super(repository, mapper, CitaControlPesoDto.class, CitaControlPeso.class);
    }
}