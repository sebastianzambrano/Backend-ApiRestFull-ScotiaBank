package com.application.restfull.IReposiroty;

import com.application.restfull.DTO.IEmployeeDto;
import com.application.restfull.Entity.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEmployeeRepository extends IBaseRepository<Employee,Long>{
    @Query("SELECT p FROM Employee p WHERE p.user = user")
    List<IEmployeeDto> findEmployeeByUser(String user);
}
