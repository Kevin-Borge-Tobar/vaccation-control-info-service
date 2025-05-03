package com.borge.vcis.controllers;

import com.borge.vcis.dtos.DepartamentoDto;
import com.borge.vcis.entities.Departamento;
import com.borge.vcis.services.DepartamentoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/departamentos")
public class DepartamentoController extends  ControllerGeneric<DepartamentoDto, Departamento, Integer> {

    public DepartamentoController(DepartamentoService departamentoService) {
        super(departamentoService);
    }
}
