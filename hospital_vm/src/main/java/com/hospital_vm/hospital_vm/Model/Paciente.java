package com.hospital_vm.hospital_vm.Model;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
 import java.util.Date;

@Entity
@Table(name="paciente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, length = 13, nullable = false)
    private String run;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false) 
    private String apellido;

    @Column(nullable = true)
    private Date fechaNacimiento; 

    @Column(nullable = true)
    private String correo;




}
