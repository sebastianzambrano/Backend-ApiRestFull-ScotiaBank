package com.application.restfull.service.impl;

import com.application.restfull.entities.Employee;
import com.application.restfull.persistence.IEmployeeDAO;
import com.application.restfull.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private IEmployeeDAO iEmployeeDAO;

    @Override
    public Optional<Employee> findById(Long id) {
        return iEmployeeDAO.findById(id);
    }

    @Override
    public List<Employee> findEmployeeByUser(String user) {
        return iEmployeeDAO.findEmployeeByUser(user);
    }
}
