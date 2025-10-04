package com.borge.vcis.controllers;

import com.borge.vcis.dtos.PersonalDto;
import com.borge.vcis.entities.Personal;
import com.borge.vcis.services.PersonalService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info-vacunacion/personal")
public class PersonalController extends  ControllerGeneric<PersonalDto, Personal, Integer> {

    public PersonalController(PersonalService personalService) {
        super(personalService);
    }
}
