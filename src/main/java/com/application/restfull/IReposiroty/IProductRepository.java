package com.application.restfull.IReposiroty;

import com.application.restfull.DTO.IProductDto;
import com.application.restfull.Entity.Client;
import com.application.restfull.Entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProductRepository extends IBaseRepository<Product,Long>{
    @Query("SELECT p FROM Product p WHERE p.client = client")
    List<IProductDto> findProductByClient(Client client);
}
