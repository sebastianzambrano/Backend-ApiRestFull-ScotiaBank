package com.application.restfull.Service;

import com.application.restfull.DTO.IProductDto;
import com.application.restfull.Entity.Client;
import com.application.restfull.Entity.Product;
import com.application.restfull.IReposiroty.IBaseRepository;
import com.application.restfull.IReposiroty.IProductRepository;
import com.application.restfull.IService.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService extends BaseService<Product> implements IProductService {
    @Autowired
    private IProductRepository repository;
    @Override
    protected IBaseRepository<Product, Long> getRepository() {
        return repository;
    }

    @Override
    public List<IProductDto> findProductByClient(Client client) {
        return repository.findProductByClient(client);
    }
}
