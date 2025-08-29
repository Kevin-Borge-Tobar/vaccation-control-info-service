package com.borge.vcis.controllers;

import com.borge.vcis.dtos.VacunaAplicadaDto;
import com.borge.vcis.entities.VacunaAplicada;
import com.borge.vcis.services.VacunaAplicadaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info-vacunacion/vacunas-aplicadas")
public class VacunaAplicadaController extends ControllerGeneric<VacunaAplicadaDto, VacunaAplicada, Integer> {
private final  VacunaAplicadaService vacunaAplicadaService;
    public VacunaAplicadaController(VacunaAplicadaService service) {
        super(service);
        this.vacunaAplicadaService = service;
    }

    @GetMapping("/cui/{cui}/vacuna/{vacunaId}")
    public ResponseEntity<List<VacunaAplicadaDto>> obtenerVacunasAplicadasPorCuiAndVacunaId(@PathVariable String cui, @PathVariable Integer vacunaId) {
        try {
            List<VacunaAplicadaDto> vacunasAplicadas = vacunaAplicadaService.obtenerVacunaAplicadaPorCuiAndVacunaId(cui, vacunaId);
            if (vacunasAplicadas != null && !vacunasAplicadas.isEmpty()) {
                return ResponseEntity.ok(vacunasAplicadas);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (Exception e) {
            return ResponseEntity.status(500).build();
        }
    }

}
