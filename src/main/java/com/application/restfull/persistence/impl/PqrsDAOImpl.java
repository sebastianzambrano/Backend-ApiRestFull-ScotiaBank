package com.application.restfull.persistence.impl;

import com.application.restfull.entities.Pqrs;
import com.application.restfull.persistence.IPqrsDAO;
import com.application.restfull.repository.PqrsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class PqrsDAOImpl implements IPqrsDAO {
    @Autowired
    private PqrsRepository pqrsRepository;
    @Override
    public Optional<Pqrs> findById(Long id) {
        return pqrsRepository.findById(id);
    }

    @Override
    public List<Pqrs> findPqrsByTypePqrs(String typePqrs) {
        return pqrsRepository.findPqrsByTypePqrs(typePqrs);
    }

    @Override
    public List<Pqrs> findByAll() {
        return (List<Pqrs>) pqrsRepository.findAll();
    }

    @Override
    public void save(Pqrs pqrs) {
        pqrsRepository.save(pqrs);
    }
}
