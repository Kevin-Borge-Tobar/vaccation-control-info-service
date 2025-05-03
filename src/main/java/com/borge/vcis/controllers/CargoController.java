package com.borge.vcis.controllers;

import com.borge.vcis.dtos.CargoDto;
import com.borge.vcis.entities.Cargo;
import com.borge.vcis.services.CargoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cargos")
public class CargoController extends ControllerGeneric<CargoDto, Cargo, Integer> {

    public CargoController(CargoService cargoService) {
        super(cargoService);
    }
}
