package com.borge.vcis.services;

import com.borge.vcis.dtos.ControlAlturaDto;
import com.borge.vcis.entities.ControlAltura;
import com.borge.vcis.repositories.CitaRepository;
import com.borge.vcis.repositories.ControlAlturaRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class ControlAlturaService extends GenericServiceImpl<ControlAlturaDto, ControlAltura, Integer> {

    private final ControlAlturaRepository controAlturaRepository;
    private  final GenericMapper mapper;

    public ControlAlturaService(ControlAlturaRepository repository, GenericMapper mapper) {
        super(repository, mapper, ControlAlturaDto.class, ControlAltura.class);
        this.controAlturaRepository = repository;
        this.mapper = mapper;
    }

    public java.util.List<ControlAlturaDto> obtenerAlturasPorCUI(String cui) {
        java.util.List<ControlAltura> alturas = controAlturaRepository.findControlAlturaByInformacionInfante_Cui(cui);
        return mapper.toDtoList(alturas, ControlAlturaDto.class);
    }


}