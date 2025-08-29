package com.borge.vcis.controllers;

import com.borge.vcis.dtos.CitaDto;
import com.borge.vcis.entities.Cita;
import com.borge.vcis.services.CitaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info-vacunacion/citas")
public class CitaController  extends ControllerGeneric<CitaDto, Cita, Integer> {

    private  final CitaService citaService;
    public CitaController(CitaService service) {
        super(service);
        this.citaService = service;
    }


    @GetMapping("/cui/{cui}")
    public List<CitaDto> obtenerCitasPorCui(@PathVariable String cui) {
        try {
            return citaService.obtenerCitasPorCui(cui);
        } catch (NumberFormatException e) {
            return citaService.obtenerCitasPorCui(cui);
        }
    }
    @GetMapping("/cui/{cui}/tipo/{tipoId}")
    public ResponseEntity<CitaDto> obtenerCitaPorCuiYTipo(
            @PathVariable String cui,
            @PathVariable Integer tipoId) {
        try {
            CitaDto cita = citaService.obtenerCitaPorCuiAndTipoIdAndPendiente(cui, tipoId);
            if (cita != null) {
                return ResponseEntity.ok(cita);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


}