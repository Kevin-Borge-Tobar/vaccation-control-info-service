package com.borge.vcis.controllers;

import com.borge.vcis.dtos.ControlAlturaDto;
import com.borge.vcis.entities.ControlAltura;
import com.borge.vcis.services.ControlAlturaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/control-altura")
public class ControlAlturaController extends ControllerGeneric<ControlAlturaDto, ControlAltura, Integer> {

    public ControlAlturaController(ControlAlturaService service) {
        super(service);
    }
}
