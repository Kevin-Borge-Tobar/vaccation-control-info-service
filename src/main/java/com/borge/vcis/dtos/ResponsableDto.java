package com.borge.vcis.dtos;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link com.borge.vcis.entities.Responsable}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponsableDto implements Serializable {
    private Integer id;
    private String cui;
    private String nombreCompleto;
    private  String responsableCita;
    private InformacionInfanteDto informacionInfante;
    private TipoResponsableDto tipoResponsable;
    private LocalDate fechaRegistro;
}