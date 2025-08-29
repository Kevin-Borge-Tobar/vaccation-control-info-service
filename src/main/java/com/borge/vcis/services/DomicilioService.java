package com.borge.vcis.services;

import com.borge.vcis.dtos.CitaDto;
import com.borge.vcis.dtos.DomicilioDto;
import com.borge.vcis.entities.Cita;
import com.borge.vcis.entities.Domicilio;
import com.borge.vcis.repositories.DomicilioRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DomicilioService extends GenericServiceImpl<DomicilioDto, Domicilio, Integer> {

    private final DomicilioRepository repository;
    private final GenericMapper mapper;

    public DomicilioService(DomicilioRepository repository, GenericMapper mapper) {
        super(repository, mapper, DomicilioDto.class, Domicilio.class);
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<DomicilioDto> obtenerDomicliosPorIdInfante(Integer idInfante) {
        List<Domicilio> domicilios = this.repository.findByInformacionInfante_Id(idInfante);
        return mapper.toDtoList(domicilios, DomicilioDto.class);
    }
}