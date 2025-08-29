package com.borge.vcis.services;

import com.borge.vcis.dtos.InformacionInfanteDto;
import com.borge.vcis.entities.InformacionInfante;
import com.borge.vcis.repositories.InformacionInfanteRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformacionInfanteService extends GenericServiceImpl<InformacionInfanteDto, InformacionInfante, Long> {
    private final InformacionInfanteRepository informacionInfanteRepository;
    private final GenericMapper mapper;

    public InformacionInfanteService(InformacionInfanteRepository repository, GenericMapper mapper) {
        super(repository, mapper, InformacionInfanteDto.class, InformacionInfante.class);
        this.informacionInfanteRepository = repository;
        this.mapper = mapper;
    }

    public List<InformacionInfanteDto> obtenerInfantePorCui(String cui) {
        List<InformacionInfante> infantes = informacionInfanteRepository.findByCui(cui);
        return mapper.toDtoList(infantes, InformacionInfanteDto.class);
    }
}