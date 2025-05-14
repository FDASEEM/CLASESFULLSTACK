package com.hospital_vm.hospital_vm.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="medico")
@Data
@NoArgsConstructor

public class Medico {

    
    


    @Column(nullable = false)
    private int rut;


    @Column(nullable = false)
    private String nombre;
    

    @Column(nullable = false) 
    private String apellido;

    @Column(nullable = false)
    private String especialidad;

    
    

}
