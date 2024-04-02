package com.application.restfull.controllers.dto;

import com.application.restfull.entities.Employee;
import com.application.restfull.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PqrsDTO {
    private Long id;
    private String typePqrs;
    private String descriptionProblem;
    private String descriptionSolutionProblem;
    private Employee employee;
    private Product product;
}
