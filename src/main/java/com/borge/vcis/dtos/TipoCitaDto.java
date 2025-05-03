package com.borge.vcis.dtos;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.TipoCita}
 */
@Value
public class TipoCitaDto implements Serializable {
    Integer id;
    String descripcion;
}