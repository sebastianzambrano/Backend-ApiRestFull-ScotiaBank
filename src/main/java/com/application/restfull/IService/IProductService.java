package com.application.restfull.IService;

import com.application.restfull.DTO.IProductDto;
import com.application.restfull.Entity.Client;
import com.application.restfull.Entity.Product;

import java.util.List;

public interface IProductService extends IBaseService<Product>{
    List<IProductDto> findProductByClient(Client client);
}
