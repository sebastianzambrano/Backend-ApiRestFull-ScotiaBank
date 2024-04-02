package com.application.restfull.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Trabajador")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "tipo_documento")
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
    @Column (name = "nombre_usuario")
    private String user;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JsonIgnore
    private List<Pqrs> pqrsList = new ArrayList<>();

}
