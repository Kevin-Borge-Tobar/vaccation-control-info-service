package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.EdadAplicacion}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class EdadAplicacionDto implements Serializable {
    private Integer id;
    private VacunaDto vacuna;
    private Integer orden;
    private String descripcion;
    private String nombreDosis;
    private Integer edadMesesObjetivo;
    private Integer intervaloSiguienteDias;
    private Integer edadMinDias;
    private Integer edadMaxDias;
    private Integer intervaloMinPrevDias;
    private Integer intervaloMaxPrevDias;
    private Boolean catchupPermitado;
    private Integer serieEdadMaxDias;
    private String notas;
}