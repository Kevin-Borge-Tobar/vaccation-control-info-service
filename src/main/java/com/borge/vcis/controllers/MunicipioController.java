package com.borge.vcis.controllers;

import com.borge.vcis.dtos.MunicipioDto;
import com.borge.vcis.entities.Municipio;
import com.borge.vcis.services.MunicipioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/municipios")
public class MunicipioController extends  ControllerGeneric<MunicipioDto, Municipio, Integer> {

    public MunicipioController(MunicipioService municipioService) {
        super(municipioService);
    }
}
