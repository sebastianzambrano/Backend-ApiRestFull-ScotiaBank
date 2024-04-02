package com.application.restfull.persistence.impl;

import com.application.restfull.entities.Client;
import com.application.restfull.persistence.IClientDAO;
import com.application.restfull.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
@Component
public class ClientDAOImpl implements IClientDAO {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public Optional<Client> findById(Long id) {
        return clientRepository.findById(id);
    }
}
