package com.borge.vcis.services;

import com.borge.vcis.dtos.CitaDto;
import com.borge.vcis.dtos.TipoCitaDto;
import com.borge.vcis.entities.Cita;
import com.borge.vcis.repositories.CitaRepository;
import com.borge.vcis.repositories.TipoCitaRepository;
import com.borge.vcis.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CitaService extends GenericServiceImpl<CitaDto, Cita, Integer> {

    private final  CitaRepository citaRepository;
    private  final GenericMapper mapper;
    private final TipoCitaRepository tipoCitaRepository;

    public CitaService(CitaRepository citaRepository, GenericMapper mapper, TipoCitaRepository tipoCitaRepository) {
        super(citaRepository, mapper, CitaDto.class, Cita.class);
        this.citaRepository = citaRepository;
        this.mapper = mapper;
        this.tipoCitaRepository = tipoCitaRepository;
    }

    public List<CitaDto> obtenerCitasCUIAndPendiente(String cui) {
        List<Cita> citas = citaRepository.findByCuiAndPendiente(cui);
        List<CitaDto> citaDtos = mapper.toDtoList(citas, CitaDto.class);
        return citaDtos;
    }



    public List<CitaDto> obtenerCitasPorCui(String cui) {
        List<Cita> citas = citaRepository.findByCui(cui);
        return mapper.toDtoList(citas, CitaDto.class);
    }
    public CitaDto obtenerCitaPorCuiAndTipoIdAndPendiente(String cui, Integer tipoId) {
        Cita cita = citaRepository.findByCuiAndTipoCita_IdAndPendiente(cui, tipoId)
                .orElse(null);
        log.info(cita.toString());
        log.info("Tipo Cita:" +cita.getTipoCita().getId()+ cita.getTipoCita().getDescripcion());
        CitaDto dto = mapper.toDto(cita, CitaDto.class);
        return dto;
    }
}