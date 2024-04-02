package com.application.restfull.controllers;

import com.application.restfull.controllers.dto.ClientDTO;
import com.application.restfull.entities.Client;
import com.application.restfull.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/client")
public class ClientControllers {
    @Autowired
    private IClientService iClientService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?>findById(@PathVariable Long id){
        Optional<Client> clientOptional = iClientService.findById(id);
        if (clientOptional.isPresent()){
            Client client = clientOptional.get();
            ClientDTO clientDTO = ClientDTO.builder()
                .id(client.getId())
                .typeDocument(client.getTypeDocument())
                .numberDocument(client.getNumberDocument())
                .firstName(client.getFirstName())
                .secondName(client.getSecondName())
                .firstLastName(client.getFirstLastName())
                .secondLastName(client.getSecondLastName())
                .addressResidence(client.getAddressResidence())
                .phoneMovil(client.getPhoneMovil())
                .productList(client.getProductList())
                //.products(client.getProducts())
                .build();
            return ResponseEntity.ok(clientDTO);
        }

        return ResponseEntity.notFound().build();
    }


}
