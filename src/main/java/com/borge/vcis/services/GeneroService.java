package com.borge.vcis.services;

import com.borge.vcis.dtos.GeneroDto;
import com.borge.vcis.entities.Genero;
import com.borge.vcis.repositories.GeneroRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class GeneroService extends GenericServiceImpl<GeneroDto, Genero, Integer> {

    public GeneroService(GeneroRepository repository, GenericMapper mapper) {
        super(repository, mapper, GeneroDto.class, Genero.class);
    }
}