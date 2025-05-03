package com.borge.vcis.services;

import com.borge.vcis.dtos.DomicilioDto;
import com.borge.vcis.entities.Domicilio;
import com.borge.vcis.repositories.DomicilioRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioService extends GenericServiceImpl<DomicilioDto, Domicilio, Integer> {

    public DomicilioService(DomicilioRepository repository) {
        super(repository);
    }
}
