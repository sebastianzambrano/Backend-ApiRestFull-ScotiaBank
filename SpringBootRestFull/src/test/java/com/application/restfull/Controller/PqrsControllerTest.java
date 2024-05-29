package com.application.restfull.Controller;

import com.application.restfull.DTO.ApiResponseDto;
import com.application.restfull.DTO.IPqrsDto;
import com.application.restfull.DTO.IResultDto;
import com.application.restfull.IService.IPqrsService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PqrsControllerTest {
    @InjectMocks
    PqrsController pqrsController;

    @Mock
    IPqrsService pqrsService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void findPqrsByTypePqrs() {
        String typePqrs = "someType";
        List<IPqrsDto> mockPqrsList = new ArrayList<>(); // create a mock list of IPqrsDto

        // Configure mock behavior
        when(pqrsService.findPqrsByTypePqrs(typePqrs)).thenReturn(mockPqrsList);

        // Call the controller method
        ResponseEntity<ApiResponseDto<List<IPqrsDto>>> responseEntity = pqrsController.findPqrsByTypePqrs(typePqrs);

        // Assert the response
        assertEquals(200, responseEntity.getStatusCodeValue()); // Assuming OK status code
        assertEquals(mockPqrsList, responseEntity.getBody().getData()); // Assuming the data matches
    }

    @Test
    void findPqrsByDate() {
        String fechaString = "2024-05-21";
        LocalDate fecha = LocalDate.parse(fechaString);
        List<IResultDto> mockResultList = new ArrayList<>(); // create a mock list of IResultDto

        // Configure mock behavior
        when(pqrsService.findPqrsByDate(fecha)).thenReturn(mockResultList);

        // Call the controller method
        ResponseEntity<ApiResponseDto<List<IResultDto>>> responseEntity = pqrsController.findPqrsByDate(fechaString);

        // Assert the response
        assertEquals(200, responseEntity.getStatusCodeValue()); // Assuming OK status code
        assertEquals(mockResultList, responseEntity.getBody().getData()); // Assuming the data matches
    }

    void findPqrsByCedula() {
        String cedula = "1234567890";
        List<IPqrsDto> mockPqrsList = new ArrayList<>(); // create a mock list of IPqrsDto

        // Configure mock behavior
        when(pqrsService.findPqrsByCedula(cedula)).thenReturn(mockPqrsList);

        // Call the controller method
        ResponseEntity<ApiResponseDto<List<IPqrsDto>>> responseEntity = pqrsController.findPqrsByCedula(cedula);

        // Assert the response
        assertEquals(200, responseEntity.getStatusCodeValue()); // Assuming OK status code
        assertEquals(mockPqrsList, responseEntity.getBody().getData()); // Assuming the data matches
    }

}