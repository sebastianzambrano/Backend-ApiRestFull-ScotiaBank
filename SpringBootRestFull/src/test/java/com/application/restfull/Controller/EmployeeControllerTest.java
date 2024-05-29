package com.application.restfull.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.application.restfull.DTO.ApiResponseDto;
import com.application.restfull.DTO.IEmployeeDto;
import com.application.restfull.IService.IEmployeeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class EmployeeControllerTest {


        @InjectMocks
        EmployeeController employeeController;

        @Mock
        IEmployeeService employeeService;

        @BeforeEach
        void setUp() {
            MockitoAnnotations.openMocks(this);
        }

        @Test
        void findEmployeeByUser() {
            String user = "someUser";
            List<IEmployeeDto> mockEmployeeList = new ArrayList<>(); // create a mock list of IEmployeeDto

            // Configure mock behavior
            when(employeeService.findEmployeeByUser(user)).thenReturn(mockEmployeeList);

            // Call the controller method
            ResponseEntity<ApiResponseDto<List<IEmployeeDto>>> responseEntity = employeeController.findEmployeeByUser(user);

            // Assert the response
            assertEquals(200, responseEntity.getStatusCodeValue()); // Assuming OK status code
            assertEquals(mockEmployeeList, responseEntity.getBody().getData()); // Assuming the data matches
        }
    }


