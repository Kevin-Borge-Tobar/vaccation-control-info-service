package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.Responsable}
 */
@AllArgsConstructor
@Getter
@ToString
public class ResponsableDto implements Serializable {
    private final Integer id;
    private final String cui;
    private final String nombreCompleto;
    private final String responsableCita;
    private final InformacionInfanteDto informacionInfante;
    private final TipoResponsableDto tipoResponsable;
    private final LocalDate fechaRegistro;
}