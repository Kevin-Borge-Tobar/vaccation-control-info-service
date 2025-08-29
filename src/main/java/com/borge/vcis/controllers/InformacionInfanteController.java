package com.borge.vcis.controllers;

import com.borge.vcis.dtos.InformacionInfanteDto;
import com.borge.vcis.entities.InformacionInfante;
import com.borge.vcis.services.InformacionInfanteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info-vacunacion/informacion-infante")
public class InformacionInfanteController extends ControllerGeneric<InformacionInfanteDto, InformacionInfante, Long> {

    private final InformacionInfanteService informacionInfanteService;

    public InformacionInfanteController(InformacionInfanteService informacionInfanteService) {
        super(informacionInfanteService);
        this.informacionInfanteService = informacionInfanteService;
    }

    @GetMapping("/cui/{cui}")
    public List<InformacionInfanteDto> obtenerInfanteorCui(@PathVariable String cui) {
        return informacionInfanteService.obtenerInfantePorCui(cui);
    }
}