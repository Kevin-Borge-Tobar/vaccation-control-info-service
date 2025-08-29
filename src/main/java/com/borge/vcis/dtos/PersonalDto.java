package com.borge.vcis.dtos;

import com.borge.vcis.entities.Personal;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link Personal}
 */
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Data
@Getter
@Setter
public class PersonalDto implements Serializable {
    private final Integer id;
    private final String nombre;
    private final CargoDto cargo;
    private final String status;
    private final LocalDate fechaRegistro;
}