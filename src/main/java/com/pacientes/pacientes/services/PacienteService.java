package com.pacientes.pacientes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pacientes.pacientes.model.Paciente;
import com.pacientes.pacientes.repository.IPacienteRepository;

@Service
public class PacienteService implements IPacienteService {

    @Autowired
    private IPacienteRepository pacienteRepo;

    @Override
    public List<Paciente> getPacientes() {
    return pacienteRepo.findAll();

    }

    @Override
    public void savePaciente(Paciente paciente) {
        pacienteRepo.save(paciente);
    }

    @Override
    public void editPaciente(Long id, Paciente paciente) {

    }

    @Override
    public void deletePaciente(Long id) {
        pacienteRepo.deleteById(id);
    }

    @Override
    public Paciente findPaciente(Long id) {
        return pacienteRepo.findById(id).orElse(null);
    }

    // @Override
    // public Paciente findPacienteByDni(String dni) {
    //     return pacienteRepo.findPacienteByDni(dni)
    // }



    // @Override
    // public Paciente findPacienteByDni(String dni) {
    //     throw new UnsupportedOperationException("Unimplemented method 'findPacienteByDni'");
    // }

}
