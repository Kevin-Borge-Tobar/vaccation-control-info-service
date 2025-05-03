package com.borge.vcis.services;

import com.borge.vcis.dtos.CitaVacunaAplicadaDto;
import com.borge.vcis.entities.CitaVacunaAplicada;
import com.borge.vcis.repositories.CitaVacunaAplicadaRepository;
import org.springframework.stereotype.Service;
@Service
public class CitaVacunaAplicadaService extends GenericServiceImpl<CitaVacunaAplicadaDto, CitaVacunaAplicada, Integer> {
    public CitaVacunaAplicadaService(CitaVacunaAplicadaRepository citaVacunaAplicadaRepository) {
        super(citaVacunaAplicadaRepository);
    }
}
