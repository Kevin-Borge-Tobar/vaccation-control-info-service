package com.borge.vcis.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@ToString
@Table(name = "cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "fecha_cita", nullable = false)
    private LocalDate fechaCita;

    @Column(name = "fecha_asistencia")
    private LocalDate fechaAsistencia;

    @Column(name = "fecha_proxima_consulta", nullable = false)
    private LocalDate fechaProximaConsulta;

    @Column(name = "Observaciones", length = 45)
    private String observaciones;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "informacion_infante_id", nullable = false)
//    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private InformacionInfante informacionInfante;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_cita_id", nullable = false)
    private TipoCita tipoCita;

    @Column(name = "responsable_registro", length = 45)
    private String responsableRegistro;

    @Column(name = "status", length = 45)
    private String status;

    @Column(name = "reprogramada", length = 45)
    private String reprogramada;

}