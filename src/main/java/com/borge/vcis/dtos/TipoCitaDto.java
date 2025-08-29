package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.TipoCita}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TipoCitaDto implements Serializable {
    Integer id;
    String descripcion;
}