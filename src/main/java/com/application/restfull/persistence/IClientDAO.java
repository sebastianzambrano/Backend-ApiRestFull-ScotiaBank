package com.application.restfull.persistence;

import com.application.restfull.entities.Client;

import java.util.Optional;

public interface IClientDAO {

    Optional <Client> findById(Long id);

}
