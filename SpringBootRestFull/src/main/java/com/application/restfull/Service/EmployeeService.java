package com.application.restfull.Service;

import com.application.restfull.DTO.IEmployeeDto;
import com.application.restfull.Entity.Employee;
import com.application.restfull.IReposiroty.IBaseRepository;
import com.application.restfull.IReposiroty.IEmployeeRepository;
import com.application.restfull.IService.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService extends BaseService<Employee> implements IEmployeeService {
    @Autowired
    private IEmployeeRepository repository;
    @Override
    protected IBaseRepository<Employee, Long> getRepository() {
        return repository;
    }
    @Override
    public List<IEmployeeDto> findEmployeeByUser(String user) {
        return repository.findEmployeeByUser(user);
    }
}
