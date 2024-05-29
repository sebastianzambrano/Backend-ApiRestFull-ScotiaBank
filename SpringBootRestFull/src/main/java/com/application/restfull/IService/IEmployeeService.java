package com.application.restfull.IService;

import com.application.restfull.DTO.IEmployeeDto;
import com.application.restfull.Entity.Employee;

import java.util.List;

public interface IEmployeeService extends IBaseService<Employee>{
    List<IEmployeeDto> findEmployeeByUser(String user);
}
