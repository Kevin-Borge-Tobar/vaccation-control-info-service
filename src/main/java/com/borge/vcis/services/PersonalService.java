package com.borge.vcis.services;

import com.borge.vcis.dtos.PesonalDto;
import com.borge.vcis.entities.Pesonal;
import org.springframework.stereotype.Service;

@Service
public class PersonalService extends  GenericServiceImpl<PesonalDto, Pesonal, Integer> {

    public PersonalService(com.borge.vcis.repositories.PesonalRepository repository) {
        super(repository);
    }
}
