package com.borge.vcis.controllers;

import com.borge.vcis.dtos.PuebloDto;
import com.borge.vcis.entities.Pueblo;
import com.borge.vcis.services.PuebloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info-vacunacion/pueblos")
public class PuebloController extends ControllerGeneric<PuebloDto, Pueblo, Integer> {

    public PuebloController(PuebloService puebloService) {
        super(puebloService);
    }
}
