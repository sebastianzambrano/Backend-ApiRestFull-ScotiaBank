package com.application.restfull.Controller;

import com.application.restfull.DTO.ApiResponseDocumentDto;
import com.application.restfull.DTO.IDocumentDto;
import com.application.restfull.Entity.Document;
import com.application.restfull.IService.IDocumentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/document")
public class DocumentController extends BaseDocumentController<Document, IDocumentService>{
    public DocumentController(IDocumentService service) {
        super(service, "Document");
    }
    @GetMapping("/get-list-document-category/{category}")
    public ResponseEntity<ApiResponseDocumentDto<List<IDocumentDto>>> findAllCategoryWithCategory(@PathVariable String category) {
        try {
            return ResponseEntity.ok(new ApiResponseDocumentDto<List<IDocumentDto>>("Datos obtenidos", service.findAllCategoryWithCategory(category), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDocumentDto<List<IDocumentDto>>(e.getMessage(), null, false));
        }
    }
}
