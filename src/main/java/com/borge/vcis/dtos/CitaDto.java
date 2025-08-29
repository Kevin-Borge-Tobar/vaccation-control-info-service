package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.Cita}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CitaDto implements Serializable {
    private Integer id;
    private LocalDate fechaCita;
    private LocalDate fechaAsistencia;
    private LocalDate fechaProximaConsulta;
    private String observaciones;
    private InformacionInfanteDto informacionInfante;
    private TipoCitaDto tipoCitaDto;
    private String responsableRegistro;
    private String status;
    private String reprogramada;
}