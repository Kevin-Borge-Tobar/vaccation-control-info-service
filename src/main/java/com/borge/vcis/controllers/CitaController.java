package com.borge.vcis.controllers;

import com.borge.vcis.dtos.CitaDto;
import com.borge.vcis.entities.Cita;
import com.borge.vcis.services.CitaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/citas")
public class CitaController  extends ControllerGeneric<CitaDto, Cita, Integer> {

    public CitaController(CitaService service) {
        super(service);
    }
}
