package com.borge.vcis.services;

import com.borge.vcis.dtos.ControlAlturaDto;
import com.borge.vcis.entities.ControlAltura;
import com.borge.vcis.repositories.ControlAlturaRepository;
import org.springframework.stereotype.Service;

@Service
public class ControlAlturaService extends  GenericServiceImpl<ControlAlturaDto, ControlAltura, Integer> {

    public ControlAlturaService(ControlAlturaRepository repository) {
        super(repository);
    }
}
