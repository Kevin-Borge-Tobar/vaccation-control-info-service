package com.borge.vcis.utils;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class GenericMapper {

    private final ModelMapper modelMapper;

    public GenericMapper() {
        this.modelMapper = new ModelMapper();
    }

    public <D, E> D toDto(E entity, Class<D> dtoClass) {
        return modelMapper.map(entity, dtoClass);
    }

    public <D, E> E toEntity(D dto, Class<E> entityClass) {
        return modelMapper.map(dto, entityClass);
    }


    public <D, T> List<D> toDtoList(List<T> entityList, Class<D> dtoClass) {
        if (dtoClass == null) {
            throw new IllegalArgumentException("dtoClass no puede ser null. Verifica que lo pasas en el constructor.");
        }
        return entityList.stream()
                .map(entity -> modelMapper.map(entity, dtoClass))
                .collect(Collectors.toList());
    }
}
