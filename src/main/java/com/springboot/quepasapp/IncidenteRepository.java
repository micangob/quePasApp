package com.springboot.quepasapp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IncidenteRepository extends JpaRepository<Incidente, Long> {
    List<Incidente> findAll();
}
