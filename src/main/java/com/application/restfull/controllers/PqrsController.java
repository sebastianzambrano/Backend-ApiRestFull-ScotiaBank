package com.application.restfull.controllers;

import com.application.restfull.controllers.dto.PqrsDTO;
import com.application.restfull.entities.Pqrs;
import com.application.restfull.service.IPqrsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/pqrs")
public class PqrsController {
    @Autowired
    private IPqrsService iPqrsService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        Optional<Pqrs> pqrsOptional = iPqrsService.findById(id);
        if (pqrsOptional.isPresent()) {
            Pqrs pqrs = pqrsOptional.get();
            PqrsDTO pqrsDTO = PqrsDTO.builder()
                .id(pqrs.getId())
                .typePqrs(pqrs.getTypePqrs())
                .descriptionProblem(pqrs.getDescriptionProblem())
                .descriptionSolutionProblem(pqrs.getDescriptionSolutionProblem())
                .employee(pqrs.getEmployee())
                .product(pqrs.getProduct())
                .build();
            return ResponseEntity.ok(pqrsDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findByAll() {
        List<PqrsDTO> pqrsDTOList = iPqrsService.findByAll()
            .stream()
            .map(pqrs -> PqrsDTO.builder()
                .id(pqrs.getId())
                .typePqrs(pqrs.getTypePqrs())
                .descriptionProblem(pqrs.getDescriptionProblem())
                .descriptionSolutionProblem(pqrs.getDescriptionSolutionProblem())
                .employee(pqrs.getEmployee())
                .product(pqrs.getProduct())
                .build())
            .toList();
        return ResponseEntity.ok(pqrsDTOList);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody PqrsDTO pqrsDTO) throws URISyntaxException {

        if (pqrsDTO.getTypePqrs().isBlank()){
            return ResponseEntity.badRequest().build();
        }

        iPqrsService.save(Pqrs.builder()
            .typePqrs(pqrsDTO.getTypePqrs())
            .descriptionProblem(pqrsDTO.getDescriptionProblem())
            .descriptionSolutionProblem(pqrsDTO.getDescriptionSolutionProblem())
            .employee(pqrsDTO.getEmployee())
            .product(pqrsDTO.getProduct())
            .build());
        return ResponseEntity.created(new URI("api/pqrs/save")).build();
    }

    @GetMapping("/findPqrsByTypePqrs/{typePqrs}")
    public ResponseEntity<List<Pqrs>> findPqrsByTypePqrs(@PathVariable String typePqrs){
        List<Pqrs> pqrs = iPqrsService.findPqrsByTypePqrs(typePqrs);
        return ResponseEntity.ok(pqrs);
    }

}


