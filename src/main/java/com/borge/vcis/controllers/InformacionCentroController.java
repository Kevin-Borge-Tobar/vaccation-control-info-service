package com.borge.vcis.controllers;

import com.borge.vcis.dtos.InformacionCentroDto;
import com.borge.vcis.entities.InformacionCentro;
import com.borge.vcis.services.InformacionCentroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/info-vacunacion/informacion-centro")
public class InformacionCentroController  extends  ControllerGeneric<InformacionCentroDto, InformacionCentro, Integer> {

    public InformacionCentroController(InformacionCentroService informacionCentroService) {
        super(informacionCentroService);
    }
}
