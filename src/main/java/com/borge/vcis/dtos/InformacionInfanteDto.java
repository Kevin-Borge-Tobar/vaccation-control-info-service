package com.borge.vcis.dtos;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.InformacionInfante}
 */
@Value
public class InformacionInfanteDto implements Serializable {
    Integer id;
    String cui;
    String nombres;
    String apellidos;
    LocalDate fechaNacimiento;
    LocalDate fechaRegistro;
    String descripcion;
    SedeDto sede;
}