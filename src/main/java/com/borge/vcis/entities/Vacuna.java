package com.borge.vcis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "vacunas")
public class Vacuna {

    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 45)
    private String nombre;

    @Column(name = "recomendacion", nullable = false, length = 45)
    private String recomendacion;

    @Column(name = "dosis", length = 45)
    private String dosis;

    @Column(name = "descripcion", length = 45)
    private String descripcion;

    @Column(name = "intervalo_dosis", length = 45)
    private String intervaloDosis;

    /** Nuevo: número total de dosis de la vacuna */
    @Column(name = "total_dosis")
    private Integer totalDosis;
}
