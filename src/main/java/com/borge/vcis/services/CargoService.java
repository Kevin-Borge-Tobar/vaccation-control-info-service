package com.borge.vcis.services;

import com.borge.vcis.dtos.CargoDto;
import com.borge.vcis.entities.Cargo;
import com.borge.vcis.repositories.CargoRepository;
import com.borge.vcis.utils.GenericMapper;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CargoService extends  GenericServiceImpl<CargoDto,Cargo, Integer>{

    public CargoService (CargoRepository repository, GenericMapper genericMapper) {
        super(repository, genericMapper, CargoDto.class, Cargo.class);
    }
}
