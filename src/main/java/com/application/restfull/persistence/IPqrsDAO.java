package com.application.restfull.persistence;

import com.application.restfull.entities.Pqrs;

import java.util.List;
import java.util.Optional;

public interface IPqrsDAO {

    Optional<Pqrs> findById(Long id);

    List<Pqrs> findPqrsByTypePqrs(String typePqrs);

    List<Pqrs> findByAll();

    void save(Pqrs pqrs);

}
