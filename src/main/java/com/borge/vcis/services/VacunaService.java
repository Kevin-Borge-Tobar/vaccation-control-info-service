package com.borge.vcis.services;

import com.borge.vcis.dtos.VacunaDto;
import com.borge.vcis.entities.Vacuna;
import com.borge.vcis.repositories.VacunaRepository;
import org.springframework.stereotype.Service;

@Service
public class VacunaService extends GenericServiceImpl<VacunaDto, Vacuna, Integer> {

    public VacunaService(VacunaRepository repository) {
        super(repository);
    }
}
