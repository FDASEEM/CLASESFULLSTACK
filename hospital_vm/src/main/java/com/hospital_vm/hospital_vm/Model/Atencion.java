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

    @ManyToOne
    @JoinColumn(name = "medico_rut")
    @Column(nullable = false)
    private Medico medico;

    @Column(nullable = false)
    private String diagnostico;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    @Column(nullable = false)
    private Paciente paciente;
    
    @Column(nullable = false)
    private Date fechaAtencion;



    
}
