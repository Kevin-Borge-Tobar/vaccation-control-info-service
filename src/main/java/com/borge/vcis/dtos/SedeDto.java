package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.Sede}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SedeDto implements Serializable {
    Integer id;
    String name;
    LocalDate fechaRegistro;
}