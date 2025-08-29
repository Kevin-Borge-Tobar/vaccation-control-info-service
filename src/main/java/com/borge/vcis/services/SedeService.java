package com.borge.vcis.services;

import com.borge.vcis.dtos.SedeDto;
import com.borge.vcis.entities.Sede;
import com.borge.vcis.repositories.SedeRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class SedeService extends GenericServiceImpl<SedeDto, Sede, Integer> {

    public SedeService(SedeRepository repository, GenericMapper mapper) {
        super(repository, mapper, SedeDto.class, Sede.class);
    }
}
