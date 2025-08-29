package com.borge.vcis.services;

import com.borge.vcis.dtos.MunicipioDto;
import com.borge.vcis.entities.Municipio;
import com.borge.vcis.repositories.MunicipioRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class MunicipioService extends GenericServiceImpl<MunicipioDto, Municipio, Integer> {

    public MunicipioService(MunicipioRepository repository, GenericMapper mapper) {
        super(repository, mapper, MunicipioDto.class, Municipio.class);
    }
}