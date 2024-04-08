package com.application.restfull.IReposiroty;

import com.application.restfull.DTO.IDocumentDto;
import com.application.restfull.Entity.Document;
import org.springframework.stereotype.Repository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


@Repository
public interface IDocumentRepository extends IBaseDocumentRepository <Document,String> {
    @Query(value = "{ 'category': category }")
    List<IDocumentDto> findAllCategoryWithCategory(String category);
}
