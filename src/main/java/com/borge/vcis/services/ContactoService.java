package com.borge.vcis.services;

import com.borge.vcis.dtos.ContactoDto;
import com.borge.vcis.entities.Contacto;
import com.borge.vcis.repositories.ContactoRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactoService extends GenericServiceImpl<ContactoDto, Contacto, Integer> {

    public ContactoService(ContactoRepository repository) {
        super(repository);
    }
}
