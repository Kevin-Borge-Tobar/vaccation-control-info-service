package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.CitaControlAltura}
 */
@AllArgsConstructor
@Getter
@ToString
public class CitaControlAlturaDto implements Serializable {
    private final Integer id;
    private final CitaDto cita;
    private final ControlAlturaDto controlAltura;
}