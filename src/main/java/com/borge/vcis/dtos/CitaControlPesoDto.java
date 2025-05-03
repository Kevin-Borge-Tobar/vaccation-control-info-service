package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.CitaControlPeso}
 */
@AllArgsConstructor
@Getter
@ToString
public class CitaControlPesoDto implements Serializable {
    private final Integer id;
    private final CitaDto cita;
    private final ControlPesoDto controPeso;
}