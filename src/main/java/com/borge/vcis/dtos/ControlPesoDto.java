package com.borge.vcis.dtos;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.ControlPeso}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ControlPesoDto implements Serializable {
    private Integer id;
    private InformacionInfanteDto informacionInfante;
    private String pesoRegistrado;
    private LocalDate fechaRegistro;
    private PersonalDto responsableMedicion;
    private int edadMeses;
}