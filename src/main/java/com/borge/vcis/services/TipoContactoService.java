package com.borge.vcis.services;

import com.borge.vcis.dtos.TipoContactoDto;
import com.borge.vcis.entities.TipoContacto;
import com.borge.vcis.repositories.TipoContactoRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoContactoService extends GenericServiceImpl<TipoContactoDto,TipoContacto, Integer> {

    public TipoContactoService(TipoContactoRepository repository) {
        super(repository);
    }
}
