package com.borge.vcis.dtos;

import com.borge.vcis.entities.VacunaAplicada;
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
    private final VacunaAplicada vacunaAplicada;
    private final CitaDto cita;
}