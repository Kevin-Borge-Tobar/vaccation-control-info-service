package com.borge.vcis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "cita_vacuna_aplicada")
public class CitaVacunaAplicada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vacuna_aplicada_id", nullable = false)
    private VacunaAplicada vacunaAplicada;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cita_id", nullable = false)
    private Cita cita;
}
