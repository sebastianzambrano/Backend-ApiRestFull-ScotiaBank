package com.application.restfull.Controller;

import com.application.restfull.DTO.ApiResponseDto;
import com.application.restfull.DTO.IPqrsDto;
import com.application.restfull.Entity.Pqrs;
import com.application.restfull.IService.IPqrsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/pqrs")
public class PqrsController extends BaseController<Pqrs, IPqrsService>{
    public PqrsController(IPqrsService service) {
        super(service, "Pqrs");
    }

    @GetMapping("/get-list-pqrs-typepqrs/{typePqrs}")
    public ResponseEntity<ApiResponseDto<List<IPqrsDto>>> findPqrsByTypePqrs(String typePqrs) {
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IPqrsDto>>("Datos obtenidos",service.findPqrsByTypePqrs(typePqrs), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IPqrsDto>>(e.getMessage(), null, false));
        }
    }

}
