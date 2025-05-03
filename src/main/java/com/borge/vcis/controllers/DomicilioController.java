package com.borge.vcis.controllers;

import com.borge.vcis.dtos.DomicilioDto;
import com.borge.vcis.entities.Domicilio;
import com.borge.vcis.services.DomicilioService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/domicilios")
public class DomicilioController extends  ControllerGeneric<DomicilioDto, Domicilio, Integer> {

    public DomicilioController(DomicilioService domicilioService) {
        super(domicilioService);
    }
}
