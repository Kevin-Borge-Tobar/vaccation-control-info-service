package com.borge.vcis.controllers;

import com.borge.vcis.dtos.DomicilioDto;
import com.borge.vcis.entities.Domicilio;
import com.borge.vcis.services.DomicilioService;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info-vacunacion/domicilios")
public class DomicilioController extends ControllerGeneric<DomicilioDto, Domicilio, Integer> {
    private final DomicilioService domicilioService;

    public DomicilioController(DomicilioService domicilioService) {
        super(domicilioService);
        this.domicilioService = domicilioService;
    }

    @GetMapping("/infanteId/{idInfante}")
    public List<DomicilioDto> obtenerDomiciliosPorIdInfante( @PathVariable int idInfante) {
        List<DomicilioDto> domicilioDtos = domicilioService.obtenerDomicliosPorIdInfante(idInfante);
        return domicilioDtos;
    }
}