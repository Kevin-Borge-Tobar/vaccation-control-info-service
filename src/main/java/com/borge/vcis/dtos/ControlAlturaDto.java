package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.ControlAltura}
 */
@AllArgsConstructor
@Getter
@ToString
public class ControlAlturaDto implements Serializable {
    private final Integer id;
    private final InformacionInfanteDto informacionInfante;
    private final CitaDto cita;
    private final String alturaRegistrada;
    private final LocalDate fechaRegistro;
    private final PersonalDto responsableMedicion;
}