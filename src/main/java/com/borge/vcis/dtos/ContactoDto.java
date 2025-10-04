package com.borge.vcis.dtos;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.Contacto}
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ContactoDto implements Serializable {
    private Integer id;
    private String numero;
    private String descripcion;
    private TipoContactoDto tipoContacto;
    private InformacionInfanteDto informacionInfante;
}