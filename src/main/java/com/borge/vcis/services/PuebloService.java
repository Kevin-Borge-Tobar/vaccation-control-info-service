package com.borge.vcis.services;

import com.borge.vcis.dtos.PuebloDto;
import com.borge.vcis.entities.Pueblo;
import com.borge.vcis.repositories.PuebloRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class PuebloService extends GenericServiceImpl<PuebloDto, Pueblo, Integer> {

    public PuebloService(PuebloRepository repository, GenericMapper mapper) {
        super(repository, mapper, PuebloDto.class, Pueblo.class);
    }
}