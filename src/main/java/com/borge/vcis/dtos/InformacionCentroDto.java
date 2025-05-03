package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.InformacionCentro}
 */
@AllArgsConstructor
@Getter
@ToString
public class InformacionCentroDto implements Serializable {
    private final Integer id;
    private final String areaSalud;
    private final String distrito;
    private final String centroSalud;
    private final String puestoSalud;
    private final String sector;
    private final String otroServicio;
    private final PuebloDto pueblo;
    private final InformacionInfanteDto informacionInfante;
    private final LocalDate fechaRegistro;
}