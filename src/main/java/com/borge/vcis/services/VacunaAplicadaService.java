package com.borge.vcis.services;

import com.borge.vcis.dtos.*;
import com.borge.vcis.entities.VacunaAplicada;
import com.borge.vcis.repositories.VacunaAplicadaRepository;
import com.borge.vcis.utils.GenericMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VacunaAplicadaService extends GenericServiceImpl<VacunaAplicadaDto, VacunaAplicada, Integer> {
    private final VacunaAplicadaRepository vacunaAplicadaRepository;
    private final GenericMapper mapper;

    public VacunaAplicadaService(VacunaAplicadaRepository vacunaAplicadaRepository, GenericMapper mapper) {
        super(vacunaAplicadaRepository, mapper, VacunaAplicadaDto.class, VacunaAplicada.class);
        this.vacunaAplicadaRepository = vacunaAplicadaRepository;
        this.mapper = mapper;
    }
    public List<VacunaAplicadaDto> obtenerVacunaAplicadaPorCuiAndVacunaId(String cui, Integer vacunaId) {
        List<VacunaAplicada> aplicadas = vacunaAplicadaRepository.findByCuiAndVacunaId(cui, vacunaId);

        return aplicadas.stream().map(va -> new VacunaAplicadaDto(
                va.getId(),
                va.getVacunas() != null
                        ? new VacunaDto(
                        va.getVacunas().getId(),
                        va.getVacunas().getNombre(),
                        va.getVacunas().getRecomendacion(),
                        va.getVacunas().getDosis(),
                        va.getVacunas().getDescripcion(),
                        va.getVacunas().getIntervaloDosis()
                ) : null,
                va.getDosisAplicada(),
                va.getFechaAplicacion(),
                va.getResponsableAplicacion() != null
                        ? new PersonalDto(
                        va.getResponsableAplicacion().getId(),
                        va.getResponsableAplicacion().getCargo().getDescripcion(),
                        va.getResponsableAplicacion().getCargo() != null
                                ? new CargoDto(
                                va.getResponsableAplicacion().getCargo().getId(),
                                va.getResponsableAplicacion().getCargo().getDescripcion()
                        ) : null,
                        va.getResponsableAplicacion().getStatus(),
                        va.getResponsableAplicacion().getFechaRegistro()
                ) : null,
                va.getInformacionInfante() != null
                        ? new InformacionInfanteDto(
                        va.getInformacionInfante().getId().intValue(),
                        va.getInformacionInfante().getCui(),
                        va.getInformacionInfante().getNombres(),
                        va.getInformacionInfante().getApellidos(),
                        va.getInformacionInfante().getFechaNacimiento(),
                        va.getInformacionInfante().getFechaRegistro(),
                        va.getInformacionInfante().getDescripcion(),
                        va.getInformacionInfante().getSede() != null
                                ? new SedeDto(
                                va.getInformacionInfante().getSede().getId(),
                                va.getInformacionInfante().getSede().getName(),
                                va.getInformacionInfante().getSede().getFechaRegistro()
                        ) : null,
                        va.getInformacionInfante().getGenero() != null
                                ? new GeneroDto(
                                va.getInformacionInfante().getGenero().getId(),
                                va.getInformacionInfante().getGenero().getDescripcion()
                        ) : null
                ) : null
        )).toList();
    }




}