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
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "Vacunas_id", nullable = false)
    private Vacuna vacunas;

    @Column(name = "dosis_aplicada", length = 45)
    private String dosisAplicada;

    @Column(name = "`fecha_aplicacion`")
    private LocalDate fechaAplicaciN;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "responsable_aplicacion", nullable = false)
    private Pesonal responsableAplicacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "informacion_infante_id", nullable = false)
    private InformacionInfante informacionInfante;

}