package com.borge.vcis.dtos;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.Pueblo}
 */
@Value
public class PuebloDto implements Serializable {
    Integer id;
    String descripcion;
}