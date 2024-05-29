package com.application.restfull.IReposiroty;

import com.application.restfull.DTO.IProductDto;
import com.application.restfull.Entity.Client;
import com.application.restfull.Entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public interface IProductRepository extends IBaseRepository<Product,Long>{
    //@Query("SELECT p FROM Product p WHERE p.client = client")
    //List<IProductDto> findProductByClient(Client client);

    @Query("SELECT p FROM Product p WHERE p.cedula = :cedula")
    List<IProductDto> findProductsByCedula(@Param("cedula") String cedula);

    /*@Query("SELECT p FROM Product p WHERE p.cedula.cedulaNumber = :cedulaNumber")
    List<Product> findProductsByCedulaNumber(@Param("cedulaNumber") String cedulaNumber);]

    @Query("SELECT p FROM Product p WHERE p.client.id = :clientId")
    List<Product> findProductsByClientId(@Param("clientId") Long clientId);*/


}
