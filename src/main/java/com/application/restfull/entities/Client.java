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
@Table(name = "Cliente")
public class Client {
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
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    @JsonIgnore
    private List<Product> productList = new ArrayList<>();



}
