package com.application.restfull.service.impl;

import com.application.restfull.entities.Client;
import com.application.restfull.persistence.IClientDAO;
import com.application.restfull.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ClientServiceImpl implements IClientService {
    @Autowired
    private IClientDAO iClientDAO;

    @Override
    public Optional<Client> findById(Long id) {

        return iClientDAO.findById(id);
    }
}
