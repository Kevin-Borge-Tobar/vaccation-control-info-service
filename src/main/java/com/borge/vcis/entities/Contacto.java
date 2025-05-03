package com.borge.vcis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "contacto")
public class Contacto {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "numero", length = 45)
    private String numero;

    @Column(name = "descripcion", length = 45)
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_contacto_id", nullable = false)
    private TipoContacto tipoContacto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "informacion_infante_id", nullable = false)
    private InformacionInfante informacionInfante;

}