package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.Municipio}
 */
@AllArgsConstructor
@Getter
@ToString
public class MunicipioDto implements Serializable {
    private final Integer id;
    private final String descripcion;
    private final DepartamentoDto departamento;
}