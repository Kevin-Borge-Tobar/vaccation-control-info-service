package com.borge.vcis.dtos;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.Domicilio}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DomicilioDto implements Serializable {
    private Integer id;
    private String numeroCasa;
    private String numeroSector;
    private String direccion;
    private String comuninidad;
    private InformacionInfanteDto informacionInfante;
}