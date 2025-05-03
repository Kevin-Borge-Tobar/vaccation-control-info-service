package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.VacunaAplicada}
 */
@AllArgsConstructor
@Getter
@ToString
public class VacunaAplicadaDto implements Serializable {
    private final Integer id;
    private final VacunaDto vacunas;
    private final String dosisAplicada;
    private final LocalDate fechaAplicaciN;
    private final PesonalDto responsableAplicacion;
    private final InformacionInfanteDto informacionInfante;
}