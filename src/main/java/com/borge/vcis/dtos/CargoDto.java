package com.borge.vcis.dtos;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.Cargo}
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CargoDto implements Serializable {
    private Integer id;
    private String descripcion;
}