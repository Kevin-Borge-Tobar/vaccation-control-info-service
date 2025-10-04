package com.borge.vcis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "domicilio")
public class Domicilio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "numero_casa", length = 45)
    private String numeroCasa;

    @Column(name = "numero_sector", length = 45)
    private String numeroSector;

    @Column(name = "direccion", length = 45)
    private String direccion;

    @Column(name = "comuninidad", length = 45)
    private String comuninidad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "informacion_infante_id", nullable = false)
    private InformacionInfante informacionInfante;

}