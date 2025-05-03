package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.CitaVacunaAplicada}
 */
@AllArgsConstructor
@Getter
@ToString
public class CitaVacunaAplicadaDto implements Serializable {
    private final Integer id;
    private final VacunaAplicadaDto vacunaAplicada;
    private final CitaDto cita;
}