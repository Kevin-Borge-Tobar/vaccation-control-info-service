package com.borge.vcis.services;

import com.borge.vcis.dtos.ResponsableDto;
import com.borge.vcis.entities.Responsable;
import com.borge.vcis.repositories.ResponsableRepository;
import com.borge.vcis.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class ResponsableService extends GenericServiceImpl<ResponsableDto, Responsable, Integer> {

    private final  ResponsableRepository repository;
    private  final GenericMapper mapper;
    public ResponsableService(ResponsableRepository repository, GenericMapper mapper) {
        super(repository, mapper, ResponsableDto.class, Responsable.class);
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<ResponsableDto> findByInfanteId(long id) {
        List<ResponsableDto> responsableDtos;
        List<Responsable> entities = repository.findByInformacionInfante_Id(id);
        for (Responsable responsable : entities) {
            log.info("Responsable Entity: {}", responsable.getTipoResponsable().getDescripcion());
        }
        responsableDtos = mapper.toDtoList(entities, ResponsableDto.class);
        for (ResponsableDto responsableDto : responsableDtos) {
//            log.info("ResponsableDto: {}", responsableDto.getTipoResponsable().getDescripcion());
        }
        return responsableDtos;
    }
}