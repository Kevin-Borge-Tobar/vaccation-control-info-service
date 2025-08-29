package com.borge.vcis.services;

import com.borge.vcis.dtos.ContactoDto;
import com.borge.vcis.entities.Contacto;
import com.borge.vcis.repositories.ContactoRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class ContactoService extends GenericServiceImpl<ContactoDto, Contacto, Integer> {

    public ContactoService(ContactoRepository repository, GenericMapper mapper) {
        super(repository, mapper, ContactoDto.class, Contacto.class);
    }
}