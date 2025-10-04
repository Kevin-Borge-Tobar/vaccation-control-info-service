package com.borge.vcis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "control_altura")
public class ControlAltura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "informacion_infante_id", nullable = false)
    private InformacionInfante informacionInfante;

    @Column(name = "altura_registrada", length = 45)
    private String alturaRegistrada;

    @Column(name = "fecha_registro")
    private LocalDate fechaRegistro;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "responsable_medicion", nullable = true)
    private Personal responsableMedicion;

    @Column(name = "edad_meses", nullable = true)
    private int edadMeses;

}