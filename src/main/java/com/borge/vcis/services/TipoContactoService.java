package com.borge.vcis.services;

import com.borge.vcis.dtos.TipoContactoDto;
import com.borge.vcis.entities.TipoContacto;
import com.borge.vcis.repositories.TipoContactoRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class TipoContactoService extends GenericServiceImpl<TipoContactoDto, TipoContacto, Integer> {

    public TipoContactoService(TipoContactoRepository repository, GenericMapper mapper) {
        super(repository, mapper, TipoContactoDto.class, TipoContacto.class);
    }
}