package com.springboot.quepasapp;


import jakarta.persistence.*;
import lombok.Getter;


@Getter
@Entity
@Table(name="prestacion_de_servicio")
public class PrestacionDeServicio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "establecimiento_id")
    private Establecimiento establecimiento;
    private String nombre;


}
