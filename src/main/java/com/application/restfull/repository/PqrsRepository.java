package com.application.restfull.repository;

import com.application.restfull.entities.Pqrs;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PqrsRepository extends CrudRepository<Pqrs,Long> {

    @Query("SELECT p FROM Pqrs p WHERE p.typePqrs = typePqrs")
    List<Pqrs> findPqrsByTypePqrs(String typePqrs);

}
