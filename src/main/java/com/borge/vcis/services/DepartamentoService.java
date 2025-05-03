package com.borge.vcis.services;

import com.borge.vcis.dtos.DepartamentoDto;
import com.borge.vcis.entities.Departamento;
import com.borge.vcis.repositories.DepartamentoRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoService extends  GenericServiceImpl<DepartamentoDto, Departamento, Integer> {

    public DepartamentoService(DepartamentoRepository repository) {
        super(repository);
    }
}
