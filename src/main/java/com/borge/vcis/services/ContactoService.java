package com.borge.vcis.services;

import com.borge.vcis.dtos.ContactoDto;
import com.borge.vcis.entities.Contacto;
import com.borge.vcis.repositories.ContactoRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ContactoService extends GenericServiceImpl<ContactoDto, Contacto, Integer> {

    private ContactoRepository contactoRepository;
    private GenericMapper genericMapper;

    public ContactoService(ContactoRepository repository, GenericMapper mapper) {
        super(repository, mapper, ContactoDto.class, Contacto.class);
        this.contactoRepository = repository;
        this.genericMapper = mapper;
    }

    public List<ContactoDto> getContactoByInfanteId(@PathVariable int id) {
        List<Contacto> contactos = contactoRepository.findByInformacionInfanteId(id);
        List<ContactoDto> contactoDtos = genericMapper.toDtoList(contactos, ContactoDto.class);
        return contactoDtos;

    }

}