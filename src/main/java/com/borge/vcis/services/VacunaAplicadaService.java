package com.borge.vcis.services;

import com.borge.vcis.dtos.*;
import com.borge.vcis.entities.Cita;
import com.borge.vcis.entities.CitaVacunaAplicada;
import com.borge.vcis.entities.VacunaAplicada;
import com.borge.vcis.repositories.CitaRepository;
import com.borge.vcis.repositories.CitaVacunaAplicadaRepository;
import com.borge.vcis.repositories.VacunaAplicadaRepository;
import com.borge.vcis.utils.GenericMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.swing.text.html.parser.Entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class VacunaAplicadaService extends GenericServiceImpl<VacunaAplicadaDto, VacunaAplicada, Integer> {
    private final VacunaAplicadaRepository vacunaAplicadaRepository;
    private final CitaVacunaAplicadaRepository citaVacunaAplicadaRepository;
    private final CitaRepository citaRepository;
    private final GenericMapper mapper;

    public VacunaAplicadaService(VacunaAplicadaRepository vacunaAplicadaRepository, CitaVacunaAplicadaRepository citaVacunaAplicadaRepository, CitaRepository citaRepository, GenericMapper mapper) {
        super(vacunaAplicadaRepository, mapper, VacunaAplicadaDto.class, VacunaAplicada.class);
        this.vacunaAplicadaRepository = vacunaAplicadaRepository;
        this.citaVacunaAplicadaRepository = citaVacunaAplicadaRepository;
        this.citaRepository = citaRepository;
        this.mapper = mapper;
    }
    public List<VacunaAplicadaDto> obtenerVacunaAplicadaPorCuiAndVacunaId(String cui, Integer vacunaId) {
        List<VacunaAplicada> aplicadas = vacunaAplicadaRepository.findByCuiAndVacunaId(cui, vacunaId);
        List<VacunaAplicadaDto> vacunaAplicadaDtos = mapper.toDtoList(aplicadas, VacunaAplicadaDto.class);
        return vacunaAplicadaDtos;
    }


    public void guardarTodas(List<VacunaAplicadaDto> vacunas, Integer idCita) {
        List<VacunaAplicada> entidades = new ArrayList<>();
        try {
            for (VacunaAplicadaDto v : vacunas) {
                log.info("Vacuna Aplicada DTO: {}", v);
                VacunaAplicada entity = mapper.toEntity(v, VacunaAplicada.class);
                entity.setId(null);
                VacunaAplicada saved = vacunaAplicadaRepository.save(entity);
                log.info("Vacuna Aplicada guardada: {}", saved);
                entidades.add(saved);
            }

            for (VacunaAplicada entidad : entidades) {
                log.info("Vacuna Aplicada guardada en la lista: {}", entidades);
                CitaVacunaAplicada citaVacuna = new CitaVacunaAplicada();
                Cita cita = citaRepository.findById(idCita).get();
                citaVacuna.setCita(cita);
                citaVacuna.setId(null);
                citaVacuna.setVacunaAplicada(entidad);
                citaVacunaAplicadaRepository.save(citaVacuna);
                log.info("CitaVacunaAplicada guardada: {}", citaVacuna);
                cita.setFechaAsistencia(LocalDate.now());
                cita.setStatus("ATENDIDA");
                citaRepository.save(cita);
                log.info("Cita actualizada a ATENDIDA: {}", cita.getId());
            }



            log.info("Todas las vacunas se guardaron correctamente.");
        } catch (Exception e) {
            log.error("Error al guardar vacunas: ", e);
            throw e; // o maneja el error según tu lógica
        }
    }


}