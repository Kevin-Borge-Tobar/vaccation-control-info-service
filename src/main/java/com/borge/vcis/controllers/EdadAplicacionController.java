package com.borge.vcis.controllers;

import com.borge.vcis.dtos.EdadAplicacionDto;
import com.borge.vcis.entities.EdadAplicacion;
import com.borge.vcis.entities.EdadAplicacionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info-vacunacion/edades-aplicacion")
public class EdadAplicacionController extends ControllerGeneric<EdadAplicacionDto, EdadAplicacion, Integer> {

    private final EdadAplicacionService edadAplicacionService;

    public EdadAplicacionController(EdadAplicacionService edadAplicacionService) {
        super(edadAplicacionService);
        this.edadAplicacionService = edadAplicacionService;
    }



}
