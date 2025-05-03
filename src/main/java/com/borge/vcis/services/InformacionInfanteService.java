package com.borge.vcis.services;

import com.borge.vcis.dtos.InformacionInfanteDto;
import com.borge.vcis.entities.InformacionCentro;
import com.borge.vcis.entities.InformacionInfante;
import com.borge.vcis.repositories.InformacionInfanteRepository;
import org.springframework.stereotype.Service;

@Service
public class InformacionInfanteService extends  GenericServiceImpl<InformacionInfanteDto,InformacionInfante, Integer> {

    public InformacionInfanteService(InformacionInfanteRepository repository) {
        super(repository);
    }
}
