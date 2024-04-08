package com.application.restfull.Controller;

import com.application.restfull.DTO.ApiResponseDocumentDto;
import com.application.restfull.Entity.AuditoriaDocument;
import com.application.restfull.IService.IBaseDocumentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseDocumentController <T extends AuditoriaDocument, S extends IBaseDocumentService<T>>{
    protected S service;
    protected String entityName;
    protected BaseDocumentController(S service, String entityName) {
        this.service = service;
        this.entityName = entityName;
    }

    @GetMapping
    public ResponseEntity<ApiResponseDocumentDto<List<T>>> findByStateTrue() {
        try {
            return ResponseEntity.ok(new ApiResponseDocumentDto<List<T>>("Datos obtenidos", service.findByStateTrue(), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDocumentDto<List<T>>(e.getMessage(), null, false));
        }
    }

    @GetMapping("{id}")
    public ResponseEntity<ApiResponseDocumentDto<T>> show(@PathVariable String id) {
        try {
            T entity = service.findById(id);
            return ResponseEntity.ok(new ApiResponseDocumentDto<T>("Registro encontrado", entity, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDocumentDto<T>(e.getMessage(), null, false));
        }
    }

    @PostMapping
    public ResponseEntity<ApiResponseDocumentDto<T>> save(@RequestBody T entity) {
        try {
            return ResponseEntity.ok(new ApiResponseDocumentDto<T>("Datos guardados", service.save(entity), true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDocumentDto<T>(e.getMessage(), null, false));
        }
    }

    @PutMapping("{id}")
    public ResponseEntity<ApiResponseDocumentDto<T>> update(@PathVariable String id, @RequestBody T entity) {
        try {
            service.update(id, entity);
            return ResponseEntity.ok(new ApiResponseDocumentDto<T>("Datos actualizados", null, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDocumentDto<T>(e.getMessage(), null, false));
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity<ApiResponseDocumentDto<T>> delete(@PathVariable String id) {
        try {
            service.delete(id);
            return ResponseEntity.ok(new ApiResponseDocumentDto<T>("Registro eliminado", null, true));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(new ApiResponseDocumentDto<T>(e.getMessage(), null, false));
        }
    }
}
