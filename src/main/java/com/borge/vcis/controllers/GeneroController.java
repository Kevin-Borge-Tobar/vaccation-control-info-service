package com.borge.vcis.controllers;

import com.borge.vcis.dtos.GeneroDto;
import com.borge.vcis.entities.Genero;
import com.borge.vcis.services.GeneroService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/generos")
public class GeneroController  extends ControllerGeneric<GeneroDto, Genero, Integer> {

    public GeneroController(GeneroService generoService) {
        super(generoService);
    }
}
