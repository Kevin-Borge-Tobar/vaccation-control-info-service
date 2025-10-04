package com.borge.vcis.dtos;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.Vacuna}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class VacunaDto implements Serializable {
    private Integer id;
    private String nombre;
    private String recomendacion;
    private String dosis;
    private String descripcion;
    private String intervaloDosis;
    private Integer totalDosis;
}