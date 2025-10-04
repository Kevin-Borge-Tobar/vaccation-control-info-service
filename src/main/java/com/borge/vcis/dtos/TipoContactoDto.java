package com.borge.vcis.dtos;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.TipoContacto}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TipoContactoDto implements Serializable {
    private Integer id;
    private String descripcion;
}