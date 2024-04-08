package com.application.restfull.Controller;

import com.application.restfull.DTO.ApiResponseDto;

import com.application.restfull.DTO.IProductDto;
import com.application.restfull.Entity.Client;
import com.application.restfull.Entity.Product;
import com.application.restfull.IService.IProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/product")
public class ProductController extends BaseController<Product, IProductService>{
    public ProductController(IProductService service) {super(service, "Product");}

    @GetMapping("/get-list-product-client/{client}")
    public ResponseEntity<ApiResponseDto<List<IProductDto>>> findProductByClient(Client client) {
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IProductDto>>("Datos obtenidos",service.findProductByClient(client), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IProductDto>>(e.getMessage(), null, false));
        }
    }

}
