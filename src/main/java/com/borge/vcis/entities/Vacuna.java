package com.borge.vcis.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

}