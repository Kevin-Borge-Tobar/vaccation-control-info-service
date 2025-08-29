package com.borge.vcis.controllers;

import com.borge.vcis.dtos.VacunaDto;
import com.borge.vcis.entities.Vacuna;
import com.borge.vcis.services.VacunaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info-vacunacion/vacunas")
public class VacunaController extends  ControllerGeneric<VacunaDto, Vacuna, Integer> {
    public VacunaController(VacunaService vacunaService) {
        super(vacunaService);
    }
}
