package com.borge.vcis.entities;

import com.borge.vcis.dtos.EdadAplicacionDto;
import com.borge.vcis.repositories.EdadAplicacionRepository;
import com.borge.vcis.services.GenericServiceImpl;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class EdadAplicacionService extends GenericServiceImpl<EdadAplicacionDto, EdadAplicacion, Integer> {

    private final  EdadAplicacionRepository edadAplicacionRepository;
    private  final GenericMapper mapper;

    public EdadAplicacionService(EdadAplicacionRepository repository, GenericMapper mapper, EdadAplicacionRepository edadAplicacionRepository, GenericMapper mapper1) {
        super(repository, mapper, EdadAplicacionDto.class, EdadAplicacion.class);
        this.edadAplicacionRepository = edadAplicacionRepository;
        this.mapper = mapper1;
    }
}
