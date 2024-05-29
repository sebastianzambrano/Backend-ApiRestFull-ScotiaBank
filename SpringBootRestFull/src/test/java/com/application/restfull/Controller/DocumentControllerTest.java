package com.application.restfull.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import com.application.restfull.DTO.ApiResponseDocumentDto;
import com.application.restfull.DTO.IDocumentDto;
import com.application.restfull.IService.IDocumentService;
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

class DocumentControllerTest {

        @InjectMocks
        DocumentController documentController;

        @Mock
        IDocumentService documentService;

        @BeforeEach
        void setUp() {
            MockitoAnnotations.openMocks(this);
        }

        @Test
        void findAllCategoryWithCategory() {
            String category = "someCategory";
            List<IDocumentDto> mockDocumentList = new ArrayList<>(); // create a mock list of IDocumentDto

            // Configure mock behavior
            when(documentService.findAllCategoryWithCategory(category)).thenReturn(mockDocumentList);

            // Call the controller method
            ResponseEntity<ApiResponseDocumentDto<List<IDocumentDto>>> responseEntity = documentController.findAllCategoryWithCategory(category);

            // Assert the response
            assertEquals(200, responseEntity.getStatusCodeValue()); // Assuming OK status code
            assertEquals(mockDocumentList, responseEntity.getBody().getData()); // Assuming the data matches
        }
    }

