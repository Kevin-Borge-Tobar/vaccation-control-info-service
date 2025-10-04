package com.borge.vcis.controllers;

import com.borge.vcis.dtos.ResponsableDto;
import com.borge.vcis.entities.Responsable;
import com.borge.vcis.services.ResponsableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info-vacunacion/responsables")
public class ResponsableController extends  ControllerGeneric<ResponsableDto, Responsable, Integer> {

    private final  ResponsableService service;

    public ResponsableController(ResponsableService service) {
        super(service);
        this.service = service;
    }

    @GetMapping("/infanteId/{id}")
    public List<ResponsableDto> getResponsablesByinfanteId(@PathVariable long id) {
        return service.findByInfanteId(id);
    }
}
