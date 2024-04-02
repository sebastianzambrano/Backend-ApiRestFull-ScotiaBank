package com.application.restfull.service;

import com.application.restfull.entities.Employee;

import java.util.List;
import java.util.Optional;

public interface IEmployeeService {
    Optional<Employee> findById(Long id);

    List<Employee> findEmployeeByUser(String user);
}
