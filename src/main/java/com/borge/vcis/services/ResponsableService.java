package com.borge.vcis.services;

import com.borge.vcis.dtos.ResponsableDto;
import com.borge.vcis.entities.Responsable;
import com.borge.vcis.repositories.ResponsableRepository;
import org.springframework.stereotype.Service;

@Service
public class ResponsableService extends  GenericServiceImpl<ResponsableDto, Responsable, Integer> {

    public ResponsableService(ResponsableRepository repository) {
        super(repository);
    }
}
