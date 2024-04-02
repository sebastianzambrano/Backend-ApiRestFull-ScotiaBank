package com.application.restfull.persistence;

import com.application.restfull.entities.Client;
import com.application.restfull.entities.Product;

import java.util.List;
import java.util.Optional;

public interface IProductDAO {
    Optional<Product> findById(Long id);
    List<Product> findProductByClient(Client client);
}
