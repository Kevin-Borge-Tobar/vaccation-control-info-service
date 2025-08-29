package com.borge.vcis.controllers;

import com.borge.vcis.dtos.ContactoDto;
import com.borge.vcis.entities.Contacto;
import com.borge.vcis.services.ContactoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info-vacunacion/contactos")
public class ContactoController extends ControllerGeneric<ContactoDto, Contacto, Integer> {
    public ContactoController(ContactoService contactoService) {
        super(contactoService);
    }
}
