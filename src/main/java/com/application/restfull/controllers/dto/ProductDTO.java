package com.application.restfull.controllers.dto;

import com.application.restfull.entities.Client;
import com.application.restfull.entities.Pqrs;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
    private Long id;
    private String typeProduct;
    private Long numberProduct;
    private String nameProduct;
    private String branchProduct;
    private BigDecimal balanceProduct;
    private Client client;
    private List<Pqrs> pqrsList = new ArrayList<>();
}
