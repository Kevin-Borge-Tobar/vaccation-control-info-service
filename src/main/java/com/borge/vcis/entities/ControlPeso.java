package com.borge.vcis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "control_peso")
public class ControlPeso {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "informacion_infante_id", nullable = false)
    private InformacionInfante informacionInfante;

    @Column(name = "peso_registrado", length = 45)
    private String pesoRegistrado;

    @Column(name = "fecha_registro", nullable = false)
    private LocalDate fechaRegistro;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "responsable_medicion", nullable = false)
    private Pesonal responsableMedicion;

}