package com.borge.vcis.services;

import com.borge.vcis.dtos.PersonalDto;
import com.borge.vcis.entities.Personal;
import com.borge.vcis.repositories.PesonalRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class PersonalService extends GenericServiceImpl<PersonalDto, Personal, Integer> {

    public PersonalService(PesonalRepository repository, GenericMapper mapper) {
        super(repository, mapper, PersonalDto.class, Personal.class);
    }
}