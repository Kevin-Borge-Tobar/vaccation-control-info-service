package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.Domicilio}
 */
@AllArgsConstructor
@Getter
@ToString
public class DomicilioDto implements Serializable {
    private final Integer id;
    private final String numeroCasa;
    private final String numeroSector;
    private final String direccion;
    private final String comuninidad;
    private final InformacionInfanteDto informacionInfante;
}