package com.springboot.quepasapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@RestController
public class IncidenteController {

    @RequestMapping
    public String helloWorld(){
        return "/incidentes";
    }


    @Controller
    public class IncidentController {

        private final IncidenteRepository incidenteRepository;

        @Autowired
        public IncidentController(IncidenteRepository incidenteRepository) {
            this.incidenteRepository = incidenteRepository;
        }

        @GetMapping("/incidentes")
        public String listIncidentes(Model model) {
            // Obtener todos los incidentes utilizando la proyección
            List<Incidente> incidentes = incidenteRepository.findAll();

            model.addAttribute("incidentes", incidentes);
            return "incidentes";  // Devuelve la plantilla Thymeleaf
        }
    }
}
