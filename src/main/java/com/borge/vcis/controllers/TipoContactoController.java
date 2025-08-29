package com.borge.vcis.controllers;

import com.borge.vcis.dtos.TipoContactoDto;
import com.borge.vcis.entities.TipoContacto;
import com.borge.vcis.services.TipoContactoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info-vacunacion/tipo-contactos")
public class TipoContactoController  extends  ControllerGeneric<TipoContactoDto, TipoContacto, Integer> {

    public TipoContactoController(TipoContactoService service) {
        super(service);
    }
}
