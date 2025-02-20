package com.pacientes.pacientes.services;

import java.util.List;

import com.pacientes.pacientes.model.Paciente;

public interface IPacienteService {

    public List<Paciente> getPacientes();

    public void savePaciente(Paciente paciente);

    public void editPaciente(Long id, Paciente paciente);

    public void deletePaciente(Long id);

    public Paciente findPaciente(Long id);
    
    public Paciente findPacienteByDni(String dni);

}
