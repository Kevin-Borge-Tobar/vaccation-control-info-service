package com.borge.vcis.controllers;

import com.borge.vcis.dtos.CitaVacunaAplicadaDto;
import com.borge.vcis.entities.CitaVacunaAplicada;
import com.borge.vcis.services.CitaVacunaAplicadaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info-vacunacion/citas/vacunas-aplicadas")
public class CitaVacunaAplicadaController extends ControllerGeneric<CitaVacunaAplicadaDto, CitaVacunaAplicada, Integer> {

    public CitaVacunaAplicadaController(CitaVacunaAplicadaService service) {
        super(service);
    }
}
