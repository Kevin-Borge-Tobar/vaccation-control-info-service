package com.borge.vcis.controllers;

import com.borge.vcis.dtos.PesonalDto;
import com.borge.vcis.entities.Pesonal;
import com.borge.vcis.services.PersonalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/personal")
public class PersonalController extends  ControllerGeneric<PesonalDto, Pesonal, Integer> {

    public PersonalController(PersonalService personalService) {
        super(personalService);
    }
}
