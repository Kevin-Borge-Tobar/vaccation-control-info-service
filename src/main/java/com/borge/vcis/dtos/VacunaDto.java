package com.borge.vcis.dtos;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.Vacuna}
 */
@Value
public class VacunaDto implements Serializable {
    Integer id;
    String nombre;
    String recomendacion;
    String dosis;
    String descripcion;
    String intervaloDosis;
}