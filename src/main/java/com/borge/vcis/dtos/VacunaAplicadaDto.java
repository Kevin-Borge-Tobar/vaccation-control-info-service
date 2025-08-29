package com.borge.vcis.dtos;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.VacunaAplicada}
 */
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Setter
@ToString
public class VacunaAplicadaDto implements Serializable {
    private final Integer id;
    private final VacunaDto vacunas;
    private final String dosisAplicada;
    private final LocalDate fechaAplicacion;
    private final PersonalDto responsableAplicacion;
    private final InformacionInfanteDto informacionInfante;
}