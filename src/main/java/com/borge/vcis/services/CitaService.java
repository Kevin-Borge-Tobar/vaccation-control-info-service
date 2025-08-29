package com.borge.vcis.services;

import com.borge.vcis.dtos.CitaDto;
import com.borge.vcis.dtos.TipoCitaDto;
import com.borge.vcis.entities.Cita;
import com.borge.vcis.repositories.CitaRepository;
import com.borge.vcis.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class CitaService extends GenericServiceImpl<CitaDto, Cita, Integer> {

    private final  CitaRepository citaRepository;
    private  final GenericMapper mapper;

    public CitaService(CitaRepository citaRepository, GenericMapper mapper) {
        super(citaRepository, mapper, CitaDto.class, Cita.class);
        this.citaRepository = citaRepository;
        this.mapper = mapper;
    }

    public List<CitaDto> obtenerCitasPorCui(String cui) {
        List<Cita> citas = citaRepository.findByCui(cui);
        return mapper.toDtoList(citas, CitaDto.class);
    }
    public CitaDto obtenerCitaPorCuiAndTipoIdAndPendiente(String cui, Integer tipoId) {
        Cita cita = citaRepository.findByCuiAndTipoCita_IdAndPendiente(cui, tipoId)
                .orElse(null);
        log.info(cita.toString());

        CitaDto dto = mapper.toDto(cita, CitaDto.class);

        if (cita.getTipoCita() != null) {
            dto.setTipoCitaDto(new TipoCitaDto(
                    cita.getTipoCita().getId(),
                    cita.getTipoCita().getDescripcion()
            ));
        }

        return dto;
    }
}