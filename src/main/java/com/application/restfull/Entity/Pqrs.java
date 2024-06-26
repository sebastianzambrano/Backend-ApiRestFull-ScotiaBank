package com.application.restfull.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Pqrs")
public class Pqrs extends Auditoria{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tipo_pqrs")
    private String typePqrs;
    @Column (name = "descripcion_problema")
    private String descriptionProblem;
    @Column (name = "solucion_problema")
    private String descriptionSolutionProblem;

    @ManyToOne
    @JoinColumn(name = "id_trabajador", nullable = false)
    @JsonIgnore
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    @JsonIgnore
    private Product product;
}
