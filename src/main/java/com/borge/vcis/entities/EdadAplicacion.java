package com.borge.vcis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(
        name = "edades_aplicacion",
        uniqueConstraints = {
                @UniqueConstraint(name = "uq_vacuna_orden", columnNames = {"vacuna_id", "orden"})
        }
)
public class EdadAplicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    /** Catálogo de vacuna */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vacuna_id", nullable = false)
    private Vacuna vacuna;

    /** Orden de dosis dentro de la serie (1,2,3…; 0 si única) */
    @Column(name = "orden", nullable = false)
    private Integer orden;

    /** Texto visible: "2 meses", "4 meses", "Refuerzo 18 meses", etc. */
    @Column(name = "descripcion", nullable = false, length = 60)
    private String descripcion;

    /** Ventana de edad recomendada (días desde nacimiento) */
    @Column(name = "edad_min_dias")
    private Integer edadMinDias;

    @Column(name = "edad_max_dias")
    private Integer edadMaxDias;

    /** Intervalo mínimo/máximo (días) respecto de la dosis previa de la MISMA vacuna */
    @Column(name = "intervalo_min_prev_dias")
    private Integer intervaloMinPrevDias;

    @Column(name = "intervalo_max_prev_dias")
    private Integer intervaloMaxPrevDias;

    /** ¿Permite esquema de rescate si está fuera de la edad recomendada? */
    @Column(name = "catchup_permitido", nullable = false)
    private Boolean catchupPermitido = Boolean.TRUE;

    /** Tope de edad para INICIAR/COMPLETAR serie (ej.: Rotavirus ~274 días). NULL si no aplica. */
    @Column(name = "serie_edad_max_dias")
    private Integer serieEdadMaxDias;

    /** Notas operativas/clinicas (opcional) */
    @Column(name = "notas", length = 255)
    private String notas;
}
