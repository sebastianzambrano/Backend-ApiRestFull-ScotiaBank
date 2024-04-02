package com.application.restfull.persistence.impl;

import com.application.restfull.entities.Client;
import com.application.restfull.entities.Product;
import com.application.restfull.persistence.IProductDAO;
import com.application.restfull.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public class ProductDAOImpl implements IProductDAO {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> findProductByClient(Client client) {
        return productRepository.findProductByClient(client);
    }
}
