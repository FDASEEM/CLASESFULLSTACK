package com.hospital_vm.hospital_vm.Model;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import java.util.Date;


@Entity
@Table(name="atencion")
@Data
@NoArgsConstructor
public class Atencion {


    @Column(nullable = false)
    private Medico medico;

    @Column(nullable = false)
    private String diagnostico;

    @Column(nullable = false)
    private Paciente paciente;

    @Column(nullable = false)
    private Date fechaAtencion;



    
}
