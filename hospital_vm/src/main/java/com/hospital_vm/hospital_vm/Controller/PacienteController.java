package com.hospital_vm.hospital_vm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.hospital_vm.hospital_vm.Services.PacienteService;

@RestController
@RequestMapping("")
public class PacienteController {



@Autowired
private PacienteService pacienteService;

@GetMapping
public ResponseEntity<List<Paciente>> listar() {
    List<Paciente> pacientes = pacienteService.findAll();
    if (pacientes.isEmpty()) {
        return ResponseEntity.noContent().build(); //
    }
    return ResponseEntity.ok(pacientes);

}

}
