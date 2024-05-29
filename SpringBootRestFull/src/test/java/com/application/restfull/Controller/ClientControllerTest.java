package com.application.restfull.Controller;

import static org.junit.jupiter.api.Assertions.*;
import com.application.restfull.Entity.Client;
import com.application.restfull.IService.IClientService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ClientControllerTest {
        @InjectMocks
        ClientController clientController;

        @Mock
        IClientService clientService;

        @BeforeEach
        void setUp() {
            MockitoAnnotations.openMocks(this);
        }

        // Test methods here if needed

        @Test
        void contextLoads() {
            assertNotNull(clientController);
        }
    }

