package com.application.restfull.DTO;

import com.application.restfull.Entity.Client;
import com.application.restfull.Entity.Pqrs;

import java.math.BigDecimal;

public interface IProductDto {
    Long getId();
    String getTypeProduct();
    Long getNumberProduct();
    String getNameProduct();
    String getBranchProduct();
    BigDecimal getBalanceProduct();
    String getCedula();
   /*
    Client getClient();
    Pqrs getPqrsList();

*/
}
