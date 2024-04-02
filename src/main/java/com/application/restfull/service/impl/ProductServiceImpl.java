package com.application.restfull.service.impl;

import com.application.restfull.entities.Client;
import com.application.restfull.entities.Product;
import com.application.restfull.persistence.IProductDAO;
import com.application.restfull.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductDAO iProductDAO;

    @Override
    public Optional<Product> findById(Long id) {

        return iProductDAO.findById(id);
    }

    @Override
    public List<Product> findProductByClient(Client client) {

        return iProductDAO.findProductByClient(client);
    }
}
