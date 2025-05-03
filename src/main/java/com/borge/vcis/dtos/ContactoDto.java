package com.borge.vcis.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * DTO for {@link com.borge.vcis.entities.Contacto}
 */
@AllArgsConstructor
@Getter
@ToString
public class ContactoDto implements Serializable {
    private final Integer id;
    private final String numero;
    private final String descripcion;
    private final TipoContactoDto tipoContacto;
    private final InformacionInfanteDto informacionInfante;
}