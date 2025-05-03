package com.borge.vcis.services;

import com.borge.vcis.dtos.CargoDto;
import com.borge.vcis.exceptions.MapperException;
import com.borge.vcis.utils.GenericMapper;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

@RequiredArgsConstructor
@Slf4j
public abstract class GenericServiceImpl<D, T, ID> implements GenericService<D, T, ID> {


    protected final JpaRepository<T, ID> repository;
    @Autowired
    private GenericMapper mapper;
    private Class<D> dtoClass;
    private Class<T> entityClass;

    public GenericServiceImpl(JpaRepository<T, ID> repository, GenericMapper mapper, Class<D> dtoClass, Class<T> cargoDtoClass) {
        this.repository = repository;
        this.mapper = mapper;
        this.dtoClass = dtoClass;
        this.entityClass = cargoDtoClass;
    }

    @Override
    public List<D> findAll() throws MapperException {
        List<T> entities =  repository.findAll();
       if(entities == null || entities.isEmpty()){
           throw new MapperException("No se encontraron registros validos en la base de datos");
       }
        List<D> dtoList = mapper.toDtoList(entities, dtoClass);
        return dtoList;

    }

    @Override
    public D findById(ID id) throws MapperException {
         T find = repository.findById(id).orElse(null);
        return entityNotNull(find);
    }

    @Override
    public D save(D dto ) throws MapperException {
        T entity = mapper.toEntity(dto, entityClass);
        T entitySaved = repository.save(entity);
        return entityNotNull(entitySaved);
    }

    @Override
    public D update(D entity) throws MapperException {

        T entityToUpdate = (T) mapper.toEntity(entity, entityClass);
        T entityUpdated = repository.save(entityToUpdate);
        return  entityNotNull(entityUpdated);
    }

    @Override
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    public D entityNotNull(T entity) throws MapperException {
        if (entity == null || "".equals(entity)) {
            throw new MapperException("No se encontraron registros validos para la busqueda");
        }
        D dtoResponse = mapper.toDto(entity, dtoClass);
        return dtoResponse;
    }
}
