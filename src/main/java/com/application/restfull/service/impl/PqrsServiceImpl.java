package com.application.restfull.service.impl;

import com.application.restfull.entities.Pqrs;
import com.application.restfull.persistence.IPqrsDAO;
import com.application.restfull.service.IPqrsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PqrsServiceImpl implements IPqrsService {
    @Autowired
    private IPqrsDAO iPqrsDAO;

    @Override
    public Optional<Pqrs> findById(Long id) {
        return iPqrsDAO.findById(id);
    }

    @Override
    public List<Pqrs> findByAll() {
        return iPqrsDAO.findByAll();
    }

    @Override
    public void save(Pqrs pqrs) {
        iPqrsDAO.save(pqrs);
    }
    @Override
    public List<Pqrs> findPqrsByTypePqrs(String typePqrs) {
        return iPqrsDAO.findPqrsByTypePqrs(typePqrs);
    }

}
