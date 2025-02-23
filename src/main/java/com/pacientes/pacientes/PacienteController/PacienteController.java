package com.pacientes.pacientes.PacienteController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pacientes.pacientes.model.Paciente;
import com.pacientes.pacientes.services.IPacienteService;
import org.springframework.web.bind.annotation.PutMapping;



@RestController
public class PacienteController {

    //endpoints
    @Autowired
    private IPacienteService pacienteService;

    @PostMapping("/pacientes/crear")
    public String crearPaciente(@RequestBody Paciente paciente){
        pacienteService.savePaciente(paciente);
                return "Paciente creado correctamente";
    }

    @GetMapping("/pacientes/getAll")
    public List<Paciente> obtenerPacientes(){
        return pacienteService.getPacientes();
    }
    @GetMapping("/pacientes/{id}")
    public Paciente getById(@PathVariable Long id) {
        return pacienteService.findPaciente(id);
    }
    @DeleteMapping("/pacientes/delete/{id}")
    public String deletePaciente(@PathVariable Long id){
        pacienteService.deletePaciente(id);
                return "El paciente fue eliminado correctamente";
    }
    @PutMapping("/pacientes/editar/{id_original}")
    public Paciente editPaciente(@PathVariable Long id_original,
                        @RequestBody Paciente pacienteEditar){
                            pacienteService.editPaciente(id_original, pacienteEditar);
                            Paciente pacienteEditado = pacienteService.findPaciente(id_original);

                                return pacienteEditado;
                        }
    
    

}
