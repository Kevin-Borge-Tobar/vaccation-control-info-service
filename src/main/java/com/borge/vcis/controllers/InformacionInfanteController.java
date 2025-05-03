package com.borge.vcis.controllers;

import com.borge.vcis.dtos.InformacionInfanteDto;
import com.borge.vcis.entities.InformacionInfante;
import com.borge.vcis.services.InformacionInfanteService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/informacion-infante")
public class InformacionInfanteController extends  ControllerGeneric<InformacionInfanteDto, InformacionInfante, Integer> {

    public InformacionInfanteController(InformacionInfanteService informacionInfanteService) {
        super(informacionInfanteService);
    }
}
