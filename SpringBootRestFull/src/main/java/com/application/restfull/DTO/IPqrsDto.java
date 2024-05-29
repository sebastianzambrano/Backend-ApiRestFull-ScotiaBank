package com.application.restfull.DTO;

import com.application.restfull.Entity.Employee;
import com.application.restfull.Entity.Product;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public interface IPqrsDto {
    Long getId();
    String getTypePqrs();
    String getDescriptionProblem();
    String getDescriptionSolutionProblem();
}


    /*Employee getEmployee();
    Product getProduct();*/
