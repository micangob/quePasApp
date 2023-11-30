package com.springboot.quepasapp;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name="establecimiento")
public class Establecimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Dependiendo de la estrategia de generación de identificadores que estés utilizando
    private Long id;
    private String nombre;

}
