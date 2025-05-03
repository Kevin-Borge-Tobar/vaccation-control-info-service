package com.borge.vcis.dtos;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.Genero}
 */
@Value
public class GeneroDto implements Serializable {
    Integer id;
    String descripcion;
}