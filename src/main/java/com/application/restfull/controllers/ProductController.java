package com.application.restfull.controllers;


import com.application.restfull.controllers.dto.ProductDTO;
import com.application.restfull.entities.Client;
import com.application.restfull.entities.Product;
import com.application.restfull.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/product")
public class ProductController {
    @Autowired
    private IProductService iProductService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Product> productOptional = iProductService.findById(id);
        if (productOptional.isPresent()){
            Product product = productOptional.get();
            ProductDTO productDTO = ProductDTO.builder()
                .id(product.getId())
                .typeProduct(product.getTypeProduct())
                .numberProduct(product.getNumberProduct())
                .branchProduct(product.getBranchProduct())
                .balanceProduct(product.getBalanceProduct())
                .client(product.getClient())
                .pqrsList(product.getPqrsList())
                .build();
            return ResponseEntity.ok(productDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/findProductByClient/{client}")
    public ResponseEntity<List<Product>> findProductByClient(@PathVariable Client client){
        List<Product> products = iProductService.findProductByClient(client);
        return ResponseEntity.ok(products);
    }

   }
