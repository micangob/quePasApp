package com.springboot.quepasapp;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name="incidente")
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Dependiendo de la estrategia de generación de identificadores que estés utilizando
    private Long id;
    @ManyToOne
    @JoinColumn(name = "servicioAfectado_id")
    private PrestacionDeServicio servicioAfectado;
    private String descripcion;

}
