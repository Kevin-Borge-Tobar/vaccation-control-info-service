package com.borge.vcis.services;

import com.borge.vcis.dtos.CargoDto;
import com.borge.vcis.entities.Cargo;
import com.borge.vcis.repositories.CargoRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

@Service
public class CargoService extends GenericServiceImpl<CargoDto, Cargo, Integer> {

    public CargoService(CargoRepository repository, GenericMapper mapper) {
        super(repository, mapper, CargoDto.class, Cargo.class);
    }
}
