package com.borge.vcis.services;

import com.borge.vcis.dtos.TipoCitaDto;
import com.borge.vcis.entities.TipoCita;
import com.borge.vcis.repositories.TipoCitaRepository;
import org.springframework.stereotype.Service;

@Service
public class TipoCitaService extends GenericServiceImpl<TipoCitaDto,TipoCita, Integer> {

    public TipoCitaService(TipoCitaRepository repository) {
        super(repository);
    }
}
