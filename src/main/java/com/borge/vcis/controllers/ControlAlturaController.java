package com.borge.vcis.controllers;

import com.borge.vcis.dtos.CitaDto;
import com.borge.vcis.dtos.ControlAlturaDto;
import com.borge.vcis.entities.ControlAltura;
import com.borge.vcis.services.CitaService;
import com.borge.vcis.services.ControlAlturaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info-vacunacion/control-altura")
public class ControlAlturaController extends ControllerGeneric<ControlAlturaDto, ControlAltura, Integer> {

    private final ControlAlturaService controlAlturaService;

    public ControlAlturaController(ControlAlturaService service, ControlAlturaService controlAlturaService) {
        super(service);
        this.controlAlturaService = controlAlturaService;
    }

    @GetMapping("/cui/{cui}")
    public List<ControlAlturaDto> obtenerAlturasPorCui(@PathVariable String cui) {
        try {
            return controlAlturaService.obtenerAlturasPorCUI(cui);
        } catch (NumberFormatException e) {
            return controlAlturaService.obtenerAlturasPorCUI(cui);
        }
    }

}
