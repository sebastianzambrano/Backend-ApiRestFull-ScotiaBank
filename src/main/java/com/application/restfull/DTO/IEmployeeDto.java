package com.application.restfull.DTO;

import com.application.restfull.Entity.Pqrs;
public interface IEmployeeDto {
    Long getIdObject();
    String getTypeDocument();
    Long getNumberDocument();
    String getFirstName();
    String getSecondName();
    String getFirstLastName();
    String getSecondLastName();
    String getAddressResidence();
    String getPhoneMovil();
    String getUser();
    Pqrs getPqrsList();

}
