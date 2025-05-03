package com.borge.vcis.dtos;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.Sede}
 */
@Value
public class SedeDto implements Serializable {
    Integer id;
    String name;
    LocalDate fechaRegistro;
}