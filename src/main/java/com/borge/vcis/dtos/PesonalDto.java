package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.Pesonal}
 */
@AllArgsConstructor
@Getter
@ToString
public class PesonalDto implements Serializable {
    private final Integer id;
    private final String nombre;
    private final CargoDto cargo;
    private final String status;
    private final LocalDate fechaRegistro;
}