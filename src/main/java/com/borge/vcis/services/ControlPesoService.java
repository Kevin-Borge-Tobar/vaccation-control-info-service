package com.borge.vcis.services;

import com.borge.vcis.dtos.ControlPesoDto;
import com.borge.vcis.entities.ControlPeso;
import com.borge.vcis.repositories.ControlPesoRepository;
import org.springframework.stereotype.Service;

@Service
public class ControlPesoService extends GenericServiceImpl<ControlPesoDto, ControlPeso, Integer> {

    public ControlPesoService(ControlPesoRepository repository) {
        super(repository);
    }

}
