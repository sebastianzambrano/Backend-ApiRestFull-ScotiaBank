package com.application.restfull.service;

import com.application.restfull.entities.Client;

import java.util.Optional;

public interface IClientService {
    Optional<Client> findById(Long id);
}
