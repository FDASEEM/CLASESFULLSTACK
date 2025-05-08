package com.hospital_vm.hospital_vm.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital_vm.hospital_vm.Model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Integer> {

    // encuentra pacientes por apellidos

    List<Paciente> findByApellido(String apellidos);

    // encuentra pacientes por correo electronico

    Paciente findByCorreo(String correo);

    // Encuentra pacientes por nombre y apellido

    List<Paciente> findByNombreAndApellidos(String nombre, String apeliidos);






}
