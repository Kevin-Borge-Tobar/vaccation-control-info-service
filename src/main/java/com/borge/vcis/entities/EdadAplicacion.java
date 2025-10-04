package com.borge.vcis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "edades_aplicacion")
public class EdadAplicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "vacuna_id", nullable = false)
    private Vacuna vacuna;

    /** Orden de la dosis (1, 2, 3; 0 si única) */
    @Column(name = "orden", nullable = false)
    private Integer orden;

    /** Texto descriptivo: "2 meses", "18 meses", etc. */
    @Column(name = "descripcion", nullable = false, length = 60)
    private String descripcion;

    /** Nuevo: nombre de la dosis ("Dosis 1", "Refuerzo", etc.) */
    @Column(name = "nombre_dosis", length = 40)
    private String nombreDosis;

    /** Nuevo: edad objetivo en meses */
    @Column(name = "edad_meses_objetivo")
    private Integer edadMesesObjetivo;

    /** Nuevo: intervalo hacia la siguiente dosis (en días) */
    @Column(name = "intervalo_siguiente_dias")
    private Integer intervaloSiguienteDias;

    // Campos originales que ya tenías
    @Column(name = "edad_min_dias")
    private Integer edadMinDias;

    @Column(name = "edad_max_dias")
    private Integer edadMaxDias;

    @Column(name = "intervalo_min_prev_dias")
    private Integer intervaloMinPrevDias;

    @Column(name = "intervalo_max_prev_dias")
    private Integer intervaloMaxPrevDias;

    @Column(name = "catchup_permitido", nullable = false)
    private Boolean catchupPermitado = Boolean.TRUE;

    @Column(name = "serie_edad_max_dias")
    private Integer serieEdadMaxDias;

    @Column(name = "notas", length = 255)
    private String notas;
}
