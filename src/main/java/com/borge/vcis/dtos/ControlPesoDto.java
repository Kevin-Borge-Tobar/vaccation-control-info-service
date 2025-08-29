package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.ControlPeso}
 */
@AllArgsConstructor
@Getter
@ToString
public class ControlPesoDto implements Serializable {
    private final Integer id;
    private final InformacionInfanteDto informacionInfante;
    private final String pesoRegistrado;
    private final LocalDate fechaRegistro;
    private final PersonalDto responsableMedicion;
}