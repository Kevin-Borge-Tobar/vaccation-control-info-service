package com.borge.vcis.controllers;

import com.borge.vcis.dtos.TipoResponsableDto;
import com.borge.vcis.entities.TipoResponsable;
import com.borge.vcis.services.TipoResponsableService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info-vacunacion/tipos-responsables")
public class TipoResponsableController extends ControllerGeneric<TipoResponsableDto, TipoResponsable, Integer> {

    public TipoResponsableController(TipoResponsableService service) {
        super(service);
    }
}
