package com.application.restfull.persistence.impl;

import com.application.restfull.entities.Employee;
import com.application.restfull.persistence.IEmployeeDAO;
import com.application.restfull.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class EmployeeDAOImpl implements IEmployeeDAO {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }


    @Override
    public List<Employee> findEmployeeByUser(String user) {
        return employeeRepository.findEmployeeByUser(user);
    }


}
