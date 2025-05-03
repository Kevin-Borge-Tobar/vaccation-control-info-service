package com.borge.vcis.services;

import com.borge.vcis.exceptions.MapperException;

import java.util.List;

public interface GenericService<D,T, ID> {
    List<D> findAll() throws MapperException;
    D findById (ID id) throws MapperException;
    D save(D  entity) throws MapperException;
    D update( D entity) throws MapperException;
    void deleteById(ID id);
}
