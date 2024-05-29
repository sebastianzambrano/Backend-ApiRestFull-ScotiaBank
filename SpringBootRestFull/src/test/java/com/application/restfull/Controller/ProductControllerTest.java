package com.application.restfull.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.application.restfull.DTO.ApiResponseDto;
import com.application.restfull.DTO.IProductDto;
import com.application.restfull.IService.IProductService;
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

class ProductControllerTest {
        @InjectMocks
        ProductController productController;

        @Mock
        IProductService productService;

        @BeforeEach
        void setUp() {
            MockitoAnnotations.openMocks(this);
        }

        @Test
        void findProductByCedula() {
            String cedula = "1234567890";
            List<IProductDto> mockProductList = new ArrayList<>(); // create a mock list of IProductDto

            // Configure mock behavior
            when(productService.findProductByCedula(cedula)).thenReturn(mockProductList);

            // Call the controller method
            ResponseEntity<ApiResponseDto<List<IProductDto>>> responseEntity = productController.findProductByCedula(cedula);

            // Assert the response
            assertEquals(200, responseEntity.getStatusCodeValue()); // Assuming OK status code
            assertEquals(mockProductList, responseEntity.getBody().getData()); // Assuming the data matches
        }
    }

