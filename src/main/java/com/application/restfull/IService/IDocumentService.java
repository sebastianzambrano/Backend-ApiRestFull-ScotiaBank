package com.application.restfull.IService;

import com.application.restfull.DTO.IDocumentDto;
import com.application.restfull.Entity.Document;

import java.util.List;

public interface IDocumentService extends IBaseDocumentService<Document> {
    List<IDocumentDto> findAllCategoryWithCategory(String category);
}
