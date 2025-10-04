package com.borge.vcis.dtos;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.VacunaAplicada}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VacunaAplicadaDto implements Serializable {
    private Integer id;
    private VacunaDto vacunas;
    private String dosisAplicada;
    private LocalDate fechaAplicacion;
    private PersonalDto responsableAplicacion;
    private InformacionInfanteDto informacionInfante;
    private EdadAplicacionDto edadAplicacion;
}