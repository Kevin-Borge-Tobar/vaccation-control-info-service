package com.borge.vcis.controllers;

import com.borge.vcis.dtos.CitaControlAlturaDto;
import com.borge.vcis.entities.CitaControlAltura;
import com.borge.vcis.services.CitaControlAlturaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info-vacunacion/citas/control-altura")
public class CitaControlAlturaController  extends ControllerGeneric<CitaControlAlturaDto, CitaControlAltura, Integer >{
    protected CitaControlAlturaController(CitaControlAlturaService service) {
        super(service);
    }
}
