package com.borge.vcis.dtos.mapped;

import com.borge.vcis.dtos.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class InformacionGeneralInfanteDto implements Serializable {
    Integer id;
    String cui;
    String nombres;
    String apellidos;
    LocalDate fechaNacimiento;
    LocalDate fechaRegistro;
    String descripcion;
    SedeDto sede;
    GeneroDto genero;
    private List<ResponsableDto> responsables;
    private List<ContactoDto> contactos;
    private List<DomicilioDto> domicilios;
}
