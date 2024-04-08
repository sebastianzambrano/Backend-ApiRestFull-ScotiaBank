package com.application.restfull.IReposiroty;

import com.application.restfull.DTO.IPqrsDto;
import com.application.restfull.Entity.Pqrs;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IPqrsRepository extends IBaseRepository<Pqrs,Long>{
    @Query("SELECT p FROM Pqrs p WHERE p.typePqrs = typePqrs")
    List<IPqrsDto> findPqrsByTypePqrs(String typePqrs);
}
