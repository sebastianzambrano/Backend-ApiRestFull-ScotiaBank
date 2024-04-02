package com.application.restfull.controllers.dto;

import com.application.restfull.entities.Pqrs;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {
    private Long id;
    private String typeDocument;
    private Long numberDocument;
    private String firstName;
    private String secondName;
    private String firstLastName;
    private String secondLastName;
    private String addressResidence;
    private String phoneMovil;
    private String user;
    private List<Pqrs> pqrsList = new ArrayList<>();
}
