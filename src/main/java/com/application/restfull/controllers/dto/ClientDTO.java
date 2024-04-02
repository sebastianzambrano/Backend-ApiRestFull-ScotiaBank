package com.application.restfull.controllers.dto;

import com.application.restfull.entities.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientDTO {
    private Long id;
    private String typeDocument;
    private Long numberDocument;
    private String firstName;
    private String secondName;
    private String firstLastName;
    private String secondLastName;
    private String addressResidence;
    private String phoneMovil;
    private List<Product> productList = new ArrayList<>();
    //private Set<Product> products;

}
