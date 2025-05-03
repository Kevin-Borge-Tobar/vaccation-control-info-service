package com.borge.vcis.controllers;

import com.borge.vcis.dtos.ControlPesoDto;
import com.borge.vcis.entities.ControlPeso;
import com.borge.vcis.services.ControlPesoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/control-peso")
public class ControlPesoController extends  ControllerGeneric<ControlPesoDto, ControlPeso, Integer> {

    public ControlPesoController(ControlPesoService controlPesoService) {
        super(controlPesoService);
    }
}
