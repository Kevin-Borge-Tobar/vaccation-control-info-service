package com.borge.vcis.dtos;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.ControlAltura}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ControlAlturaDto implements Serializable {
    private Integer id;
    private InformacionInfanteDto informacionInfante;
    private String alturaRegistrada;
    private LocalDate fechaRegistro;
    private PersonalDto responsableMedicion;
    private  int edadMeses;
}