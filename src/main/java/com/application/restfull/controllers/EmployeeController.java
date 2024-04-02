package com.application.restfull.controllers;

import com.application.restfull.controllers.dto.ClientDTO;
import com.application.restfull.controllers.dto.EmployeeDTO;
import com.application.restfull.entities.Client;
import com.application.restfull.entities.Employee;
import com.application.restfull.entities.Product;
import com.application.restfull.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

import static java.util.Arrays.stream;

@RestController
@RequestMapping("api/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?>findById(@PathVariable Long id) {
        Optional<Employee> employeeOptional = iEmployeeService.findById(id);
        if (employeeOptional.isPresent()) {
            Employee employee = employeeOptional.get();
            EmployeeDTO employeeDTO = EmployeeDTO.builder()
                .id(employee.getId())
                .typeDocument(employee.getTypeDocument())
                .numberDocument(employee.getNumberDocument())
                .firstName(employee.getFirstName())
                .secondName(employee.getSecondName())
                .firstLastName(employee.getFirstLastName())
                .secondLastName(employee.getSecondLastName())
                .addressResidence(employee.getAddressResidence())
                .phoneMovil(employee.getPhoneMovil())
                .user(employee.getUser())
                .pqrsList(employee.getPqrsList())
                .build();
            return ResponseEntity.ok(employeeDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/findEmployeeByUser/{user}")
    public ResponseEntity<List<Employee>>findEmployeeByUser(@PathVariable String user) {
        List<Employee> employee = iEmployeeService.findEmployeeByUser(user);

        if (employee.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(employee);
    }
}
