package com.springboot.quepasapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.springboot.quepasapp") // Paquete que contiene las entidades
@EnableJpaRepositories(basePackages = "com.springboot.quepasapp") // Paquete que contiene los repositorios
public class QuePasAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuePasAppApplication.class, args);
    }

}
