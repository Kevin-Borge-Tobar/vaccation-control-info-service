package com.borge.vcis.dtos;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.Genero}
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GeneroDto implements Serializable {
    Integer id;
    String descripcion;
}