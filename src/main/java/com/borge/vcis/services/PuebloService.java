package com.borge.vcis.services;

import com.borge.vcis.dtos.PuebloDto;
import com.borge.vcis.entities.Pueblo;
import com.borge.vcis.repositories.PuebloRepository;
import org.springframework.stereotype.Service;

@Service
public class PuebloService extends GenericServiceImpl<PuebloDto, Pueblo, Integer> {

    public PuebloService(PuebloRepository repository) {
        super(repository);
    }
}
