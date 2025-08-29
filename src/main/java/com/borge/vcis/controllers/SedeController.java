package com.borge.vcis.controllers;

import com.borge.vcis.dtos.SedeDto;
import com.borge.vcis.entities.Sede;
import com.borge.vcis.services.SedeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info-vacunacion/sedes")
public class SedeController extends ControllerGeneric<SedeDto, Sede, Integer> {

    public SedeController(SedeService sedeService) {
        super(sedeService);
    }
}
