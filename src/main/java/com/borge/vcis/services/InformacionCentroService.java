package com.borge.vcis.services;

import com.borge.vcis.dtos.InformacionCentroDto;
import com.borge.vcis.entities.InformacionCentro;
import com.borge.vcis.repositories.InformacionCentroRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class InformacionCentroService extends GenericServiceImpl<InformacionCentroDto, InformacionCentro, Integer> {

    public InformacionCentroService(InformacionCentroRepository repository, GenericMapper mapper) {
        super(repository, mapper, InformacionCentroDto.class, InformacionCentro.class);
    }

}