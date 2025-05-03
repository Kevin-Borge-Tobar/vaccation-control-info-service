package com.borge.vcis.services;

import com.borge.vcis.dtos.CitaControlAlturaDto;
import com.borge.vcis.entities.CitaControlAltura;
import com.borge.vcis.repositories.CitaControlAlturaRepository;
import org.springframework.stereotype.Service;

@Service
public class CitaControlAlturaService extends GenericServiceImpl<CitaControlAlturaDto,CitaControlAltura, Integer> {

    public CitaControlAlturaService(CitaControlAlturaRepository repository) {
        super(repository);
    }
}
