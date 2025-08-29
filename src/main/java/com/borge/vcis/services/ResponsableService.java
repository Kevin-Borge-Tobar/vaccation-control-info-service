package com.borge.vcis.services;

import com.borge.vcis.dtos.ResponsableDto;
import com.borge.vcis.entities.Responsable;
import com.borge.vcis.repositories.ResponsableRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class ResponsableService extends GenericServiceImpl<ResponsableDto, Responsable, Integer> {

    public ResponsableService(ResponsableRepository repository, GenericMapper mapper) {
        super(repository, mapper, ResponsableDto.class, Responsable.class);
    }
}