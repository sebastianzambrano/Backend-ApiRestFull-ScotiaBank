package com.application.restfull.Entity;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

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
    @Column (name = "cedula")
    private String cedula;
    @Column (name = "usuario")
    private String usuario;
    @Schema(description = "Fecha de registro pqrs", example = "")
    @Column(name = "registro_pqrs", nullable = false)
    private LocalDate registroPqrs;

    @ApiModelProperty(example = "12:12:12")
    @JsonFormat(pattern = "HH:mm:ss")
    @Schema(description = "Hora Inicio registro pqrs", example = "12:12:12", format = "time")
    @Column(name = "hora_inicio_pqrs", nullable = false)
    private LocalTime horaInicio;

    @ApiModelProperty(example = "12:12:12")
    @JsonFormat(pattern = "HH:mm:ss")
    @Schema(description = "Hora Fin registro pqrs", example = "01:12:12", format = "time")
    @Column(name = "hora_fin_pqrs", nullable = false)
    private LocalTime horaFin;

    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public LocalTime getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }

    /*
    @ManyToOne
    @JoinColumn(name = "id_trabajador", nullable = false)
    @JsonIgnore
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    @JsonIgnore
    private Product product;*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypePqrs() {
        return typePqrs;
    }

    public void setTypePqrs(String typePqrs) {
        this.typePqrs = typePqrs;
    }

    public String getDescriptionProblem() {
        return descriptionProblem;
    }

    public void setDescriptionProblem(String descriptionProblem) {
        this.descriptionProblem = descriptionProblem;
    }

    public String getDescriptionSolutionProblem() {
        return descriptionSolutionProblem;
    }

    public void setDescriptionSolutionProblem(String descriptionSolutionProblem) {
        this.descriptionSolutionProblem = descriptionSolutionProblem;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public LocalDate getRegistroPqrs() {
        return registroPqrs;
    }

    public void setRegistroPqrs(LocalDate registroPqrs) {
        this.registroPqrs = registroPqrs;
    }
}
