package com.borge.vcis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "vacuna_aplicada")
public class VacunaAplicada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Vacunas_id", nullable = false)
    private Vacuna vacunas;

    /** Texto libre (mantener compatibilidad) ej.: "Dosis 1", "Refuerzo" */
    @Column(name = "dosis_aplicada", length = 45)
    private String dosisAplicada;

    @Column(name = "fecha_aplicacion", nullable = false)
    private LocalDate fechaAplicacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "responsable_aplicacion", nullable = false)
    private Personal responsableAplicacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "informacion_infante_id", nullable = false)
    private InformacionInfante informacionInfante;

    /** NUEVO (opcional): vínculo a la regla aplicada (exacta dosis/edad) */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "edad_aplicacion_id")
    private EdadAplicacion edadAplicacion;
}