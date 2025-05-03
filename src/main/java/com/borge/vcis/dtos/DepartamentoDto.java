package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.Departamento}
 */
@AllArgsConstructor
@Getter
@ToString
public class DepartamentoDto implements Serializable {
    private final Integer id;
    private final String descripcion;
    private final DomicilioDto domicilio;
}