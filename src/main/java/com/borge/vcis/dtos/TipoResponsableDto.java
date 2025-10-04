package com.borge.vcis.dtos;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.TipoResponsable}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TipoResponsableDto implements Serializable {
    private Integer id;
    private String descripcion;
}