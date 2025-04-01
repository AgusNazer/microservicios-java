package com.pacientes.pacientes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pacientes.pacientes.model.Paciente;

@Repository
public interface IPacienteRepository extends JpaRepository<Paciente, Long> {
    
    @Query("SELECT p FROM Paciente p WHERE p.dni=:dni")
    Paciente findByDni(String dni);
}

