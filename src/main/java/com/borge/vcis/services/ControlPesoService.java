package com.borge.vcis.services;

import com.borge.vcis.dtos.ControlPesoDto;
import com.borge.vcis.entities.ControlPeso;
import com.borge.vcis.repositories.ControlPesoRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class ControlPesoService extends GenericServiceImpl<ControlPesoDto, ControlPeso, Integer> {

    public ControlPesoService(ControlPesoRepository repository, GenericMapper mapper) {
        super(repository, mapper, ControlPesoDto.class, ControlPeso.class);
    }

}