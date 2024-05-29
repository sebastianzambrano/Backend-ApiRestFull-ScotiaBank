package com.application.restfull.Entity;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import io.swagger.v3.oas.annotations.media.Schema;

@Getter
@Setter
@Document
public abstract class AuditoriaDocument {
    @Id
    private Long id;

    @Field
    private Boolean state;

    @Schema(description = "Fecha de creación del dato", example = "")
    @Field
    private LocalDateTime createdAt;

    @Schema(description = "Fecha de actualización del dato", example = "")
    @Field
    private LocalDateTime updatedAt;

    @Schema(description = "Usuario cración", example = "")
    @Field
    private Long createdUser;

    @Schema(description = "Usuario modificación", example = "")
    @Field
    private Long updatedUser;

    @Schema(description = "Usuarios eliminación", example = "")
    @Field
    private Long deletedUser;

    @Schema(description = "Fecha de eliminación del dato", example = "")
    @Field
    private LocalDateTime deletedAt;

}
