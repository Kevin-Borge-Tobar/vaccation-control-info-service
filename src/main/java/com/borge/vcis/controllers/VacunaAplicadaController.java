package com.borge.vcis.controllers;

import com.borge.vcis.dtos.VacunaAplicadaDto;
import com.borge.vcis.entities.VacunaAplicada;
import com.borge.vcis.services.VacunaAplicadaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vacunas-aplicadas")
public class VacunaAplicadaController extends ControllerGeneric<VacunaAplicadaDto, VacunaAplicada, Integer> {

    public VacunaAplicadaController(VacunaAplicadaService service) {
        super(service);
    }

}
