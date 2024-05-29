package com.application.restfull.Controller;

import com.application.restfull.DTO.ApiResponseDto;
import com.application.restfull.DTO.IPqrsDto;
import com.application.restfull.DTO.IResultDto;
import com.application.restfull.DTO.IResultTimeDto;
import com.application.restfull.Entity.Pqrs;
import com.application.restfull.IService.IPqrsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/pqrs")
public class PqrsController extends BaseController<Pqrs, IPqrsService>{
    public PqrsController(IPqrsService service) {
        super(service, "Pqrs");
    }

    @GetMapping("/get-list-pqrs-typepqrs/{typePqrs}")
    public ResponseEntity<ApiResponseDto<List<IPqrsDto>>> findPqrsByTypePqrs(@PathVariable String typePqrs) {
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IPqrsDto>>("Datos obtenidos",service.findPqrsByTypePqrs(typePqrs), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IPqrsDto>>(e.getMessage(), null, false));
        }
    }

    @GetMapping("/get-list-pqrs-cedula/{cedula}")
    public ResponseEntity<ApiResponseDto<List<IPqrsDto>>> findPqrsByCedula(@PathVariable String cedula) {
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IPqrsDto>>("Datos obtenidos",service.findPqrsByCedula(cedula), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IPqrsDto>>(e.getMessage(), null, false));
        }
    }

    @GetMapping("/get-list-pqrs-date/{fechaString}")
    public ResponseEntity<ApiResponseDto<List<IResultDto>>> findPqrsByDate(@PathVariable String fechaString){
        LocalDate fecha = convertirAFecha(fechaString);
        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IResultDto>>("Datos obtenidos",service.findPqrsByDate(fecha), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IResultDto>>(e.getMessage(), null, false));
        }
    }

    public LocalDate convertirAFecha(String fechaString) {
        if (fechaString == null || fechaString.isEmpty()) {
            // Manejar el caso en el que la cadena de fecha es nula o vacía
            throw new IllegalArgumentException("La cadena de fecha no puede ser nula o vacía");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            return LocalDate.parse(fechaString, formatter);
        } catch (DateTimeParseException e) {
            // Manejar la excepción si la cadena no se puede convertir a fecha
            throw new IllegalArgumentException("Formato de fecha inválido: " + fechaString, e);
        }
    }

    @GetMapping("/get-list-pqrs-time")
    public ResponseEntity<ApiResponseDto<List<IResultTimeDto>>> findPqrsByTime() {

        try {
            return ResponseEntity.ok(new ApiResponseDto<List<IResultTimeDto>>("Datos obtenidos",service.findPqrsByTime(), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDto<List<IResultTimeDto>>(e.getMessage(), null, false));
        }
    }

}


