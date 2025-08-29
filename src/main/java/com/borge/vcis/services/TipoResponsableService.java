package com.borge.vcis.services;

import com.borge.vcis.dtos.TipoResponsableDto;
import com.borge.vcis.entities.TipoResponsable;
import com.borge.vcis.repositories.TipoResponsableRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class TipoResponsableService extends GenericServiceImpl<TipoResponsableDto, TipoResponsable, Integer> {

    public TipoResponsableService(TipoResponsableRepository repository, GenericMapper mapper) {
        super(repository, mapper, TipoResponsableDto.class, TipoResponsable.class);
    }
}