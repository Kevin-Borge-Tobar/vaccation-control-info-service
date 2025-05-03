package com.borge.vcis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "informacion_centro")
public class InformacionCentro {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "area_salud", length = 45)
    private String areaSalud;

    @Column(name = "distrito", length = 45)
    private String distrito;

    @Column(name = "centro_salud", length = 45)
    private String centroSalud;

    @Column(name = "puesto_salud", length = 45)
    private String puestoSalud;

    @Column(name = "sector", length = 45)
    private String sector;

    @Column(name = "otro_servicio", length = 45)
    private String otroServicio;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "pueblo_id", nullable = false)
    private Pueblo pueblo;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "informacion_infante_id", nullable = false)
    private InformacionInfante informacionInfante;

    @Column(name = "fecha_registro", nullable = false)
    private LocalDate fechaRegistro;

}