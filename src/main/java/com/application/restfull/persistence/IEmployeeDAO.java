package com.application.restfull.persistence;

import com.application.restfull.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeDAO {

    Optional<Employee> findById(Long id);


    List<Employee> findEmployeeByUser(String user);
}
