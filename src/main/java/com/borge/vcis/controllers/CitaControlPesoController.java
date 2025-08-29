package com.borge.vcis.controllers;

import com.borge.vcis.dtos.CitaControlPesoDto;
import com.borge.vcis.entities.CitaControlPeso;
import com.borge.vcis.services.CitaControlPesoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info-vacunacion/citas-control-peso")
public class CitaControlPesoController extends ControllerGeneric<CitaControlPesoDto, CitaControlPeso, Integer> {

    public CitaControlPesoController(CitaControlPesoService citaControlPesoService) {
        super(citaControlPesoService);
    }
}
