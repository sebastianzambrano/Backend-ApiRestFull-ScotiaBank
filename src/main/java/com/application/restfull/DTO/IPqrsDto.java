package com.application.restfull.DTO;

import com.application.restfull.Entity.Employee;
import com.application.restfull.Entity.Product;

public interface IPqrsDto {
    Long getId();
    String getTypePqrs();
    String getDescriptionProblem();
    String getDescriptionSolutionProblem();
    Employee getEmployee();
    Product getProduct();
}
