package com.borge.vcis.controllers;

import com.borge.vcis.dtos.ContactoDto;
import com.borge.vcis.entities.Contacto;
import com.borge.vcis.services.ContactoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info-vacunacion/contactos")
public class ContactoController extends ControllerGeneric<ContactoDto, Contacto, Integer> {

    private ContactoService service;

    public ContactoController(ContactoService contactoService) {
        super(contactoService);
        this.service = contactoService;
    }


    @GetMapping("/infanteId/{id}")
    public List<ContactoDto> getContactos(@PathVariable int id) {
        return service.getContactoByInfanteId(id);
    }
}
