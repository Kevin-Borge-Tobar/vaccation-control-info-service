package com.borge.vcis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "responsable")
public class Responsable {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "cui", length = 45)
    private String cui;

    @Column(name = "nombre_completo", length = 45)
    private String nombreCompleto;

    @Column(name = "responsable_cita", length = 45)
    private String responsableCita;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "informacion_infante_id", nullable = false)
    private InformacionInfante informacionInfante;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_responsable_id", nullable = false)
    private TipoResponsable tipoResponsable;

    @Column(name = "fecha_registro", nullable = false)
    private LocalDate fechaRegistro;

}