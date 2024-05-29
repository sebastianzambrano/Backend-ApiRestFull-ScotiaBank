package com.application.restfull.Service;

import com.application.restfull.DTO.IDocumentDto;
import com.application.restfull.Entity.Document;
import com.application.restfull.IReposiroty.IBaseDocumentRepository;
import com.application.restfull.IReposiroty.IDocumentRepository;
import com.application.restfull.IService.IDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DocumentService extends BaseDocumentService<Document> implements IDocumentService {

    @Autowired
    private IDocumentRepository repository;
    @Override
    protected IBaseDocumentRepository<Document, String> getRepository() {
        return repository;
    }

    @Override
    public List<IDocumentDto> findAllCategoryWithCategory(String category) {
        return repository.findAllCategoryWithCategory(category);
    }
}
