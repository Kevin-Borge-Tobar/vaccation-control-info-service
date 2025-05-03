package com.borge.vcis.services;

import com.borge.vcis.dtos.VacunaAplicadaDto;
import com.borge.vcis.entities.VacunaAplicada;
import com.borge.vcis.repositories.VacunaAplicadaRepository;
import org.springframework.stereotype.Service;

@Service
public class VacunaAplicadaService extends  GenericServiceImpl<VacunaAplicadaDto, VacunaAplicada, Integer> {

    public VacunaAplicadaService(VacunaAplicadaRepository vacunaAplicadaRepository) {
        super(vacunaAplicadaRepository);
    }
}
