package com.application.restfull.IService;

import com.application.restfull.Entity.AuditoriaDocument;

import java.util.List;

public interface IBaseDocumentService <T extends AuditoriaDocument> {
    List<T> all();
    List<T> findByStateTrue();
    T findById(String id) throws Exception;
    T save(T entity) throws Exception;
    void update(String id, T entity) throws Exception;
    void delete(String id) throws Exception;
}
