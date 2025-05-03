package com.borge.vcis.services;

import com.borge.vcis.dtos.CitaDto;
import com.borge.vcis.entities.Cita;
import com.borge.vcis.repositories.CitaRepository;
import org.springframework.stereotype.Service;

@Service
public class CitaService extends GenericServiceImpl<CitaDto,Cita, Integer> {

    public CitaService(CitaRepository citaRepository) {
        super(citaRepository);
    }
}
