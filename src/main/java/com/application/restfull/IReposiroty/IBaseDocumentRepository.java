package com.application.restfull.IReposiroty;

import com.application.restfull.Entity.AuditoriaDocument;
import com.application.restfull.Entity.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBaseDocumentRepository <T extends AuditoriaDocument, ID> extends MongoRepository<T,ID> {

}
