package com.application.restfull.service;

import com.application.restfull.entities.Pqrs;

import java.util.List;
import java.util.Optional;

public interface IPqrsService {

    Optional<Pqrs> findById(Long id);

    List<Pqrs> findPqrsByTypePqrs(String typePqrs);

    List<Pqrs> findByAll();

    void save(Pqrs pqrs);

}
