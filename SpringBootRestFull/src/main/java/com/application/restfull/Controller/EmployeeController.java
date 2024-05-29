package com.application.restfull.Controller;

import com.application.restfull.DTO.ApiResponseDto;
import com.application.restfull.DTO.IEmployeeDto;
import com.application.restfull.Entity.Employee;
import com.application.restfull.IService.IEmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/employee")
public class EmployeeController extends BaseController<Employee, IEmployeeService> {
    public EmployeeController(IEmployeeService service) {
        super(service, "Employee");
    }

    @GetMapping("/get-employee-user/{user}")
    public ResponseEntity<ApiResponseDto<List<IEmployeeDto>>> findEmployeeByUser(String user) {
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IEmployeeDto>>("Datos obtenidos", service.findEmployeeByUser(user), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IEmployeeDto>>(e.getMessage(), null, false));
        }
    }

}
