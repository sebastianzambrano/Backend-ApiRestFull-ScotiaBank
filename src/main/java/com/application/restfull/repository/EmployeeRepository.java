package com.application.restfull.repository;

import com.application.restfull.entities.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository <Employee,Long> {
    List<Employee> findEmployeeByUser(String user);

}
