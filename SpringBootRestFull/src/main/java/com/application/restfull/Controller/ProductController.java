package com.application.restfull.Controller;

import com.application.restfull.DTO.ApiResponseDto;

import com.application.restfull.DTO.IProductDto;
import com.application.restfull.Entity.Client;
import com.application.restfull.Entity.Product;
import com.application.restfull.IService.IProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/product")
public class ProductController extends BaseController<Product, IProductService>{
    public ProductController(IProductService service) {super(service, "Product");}

    @GetMapping("/get-list-product-cedula/{cedula}")
    public ResponseEntity<ApiResponseDto<List<IProductDto>>> findProductByCedula(@PathVariable String cedula){
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IProductDto>>("Datos de cedula obtenidos",service.findProductByCedula(cedula), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IProductDto>>(e.getMessage(), null, false));
        }
    }

}
