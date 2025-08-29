package com.borge.vcis.controllers;

import com.borge.vcis.dtos.ResponsableDto;
import com.borge.vcis.entities.Responsable;
import com.borge.vcis.services.ResponsableService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info-vacunacion/responsables")
public class ResponsableController extends  ControllerGeneric<ResponsableDto, Responsable, Integer> {
    public ResponsableController(ResponsableService service) {
        super(service);
    }
}
