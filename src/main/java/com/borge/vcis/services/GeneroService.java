package com.borge.vcis.services;

import com.borge.vcis.dtos.GeneroDto;
import com.borge.vcis.entities.Genero;
import com.borge.vcis.repositories.GeneroRepository;
import org.springframework.stereotype.Service;

@Service
public class GeneroService extends  GenericServiceImpl<GeneroDto, Genero, Integer> {

    public GeneroService(GeneroRepository repository) {
        super(repository);
    }
}
