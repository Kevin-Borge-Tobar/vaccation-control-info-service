package com.borge.vcis.dtos;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.Cita}
 */
@Value
public class CitaDto implements Serializable {
    Integer id;
    LocalDate fechaCita;
    LocalDate fechaAsistencia;
    LocalDate fechaProximaConsulta;
    String observaciones;
    InformacionInfanteDto informacionInfante;
    TipoCitaDto tipoCita;
    String responsableRegistro;
    String status;
    String reprogramada;
}