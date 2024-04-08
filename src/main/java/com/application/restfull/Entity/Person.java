package com.application.restfull.Entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@MappedSuperclass
public abstract class Person extends Auditoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tipo_documento")
    private String typeDocument;
    @Column (name = "numero_documento")
    private Long numberDocument;
    @Column (name = "primer_nombre")
    private String firstName;
    @Column (name = "segundo_nombre")
    private String secondName;
    @Column (name = "primer_apellido")
    private String firstLastName;
    @Column (name = "segundo_apellido")
    private String secondLastName;
    @Column (name = "direccion_residencia")
    private String addressResidence;
    @Column (name = "telefono_movil")
    private String phoneMovil;

}
