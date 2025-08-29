package com.borge.vcis.services;

import com.borge.vcis.dtos.CitaControlAlturaDto;
import com.borge.vcis.entities.CitaControlAltura;
import com.borge.vcis.repositories.CitaControlAlturaRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class CitaControlAlturaService extends GenericServiceImpl<CitaControlAlturaDto, CitaControlAltura, Integer> {

    public CitaControlAlturaService(CitaControlAlturaRepository repository, GenericMapper mapper) {
        super(repository, mapper, CitaControlAlturaDto.class, CitaControlAltura.class);
    }
}