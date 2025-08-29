package com.borge.vcis.controllers;

import com.borge.vcis.dtos.TipoCitaDto;
import com.borge.vcis.entities.TipoCita;
import com.borge.vcis.services.TipoCitaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info-vacunacion/tipos-citas")
public class TipoCitaController extends  ControllerGeneric<TipoCitaDto, TipoCita, Integer> {

    public TipoCitaController(TipoCitaService service) {
        super(service);
    }
}
