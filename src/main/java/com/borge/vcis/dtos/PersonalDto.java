package com.borge.vcis.dtos;

import com.borge.vcis.entities.Personal;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link Personal}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PersonalDto implements Serializable {
    private Integer id;
    private String nombre;
    private CargoDto cargo;
    private String status;
    private LocalDate fechaRegistro;
}