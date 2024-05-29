package com.application.restfull.IReposiroty;

import com.application.restfull.DTO.IPqrsDto;
import com.application.restfull.DTO.IResultDto;
import com.application.restfull.DTO.IResultTimeDto;
import com.application.restfull.Entity.Pqrs;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface IPqrsRepository extends IBaseRepository<Pqrs,Long>{
    @Query("SELECT p FROM Pqrs p WHERE p.typePqrs = :typePqrs")
    List<IPqrsDto> findPqrsByTypePqrs(String typePqrs);

    @Query("SELECT p FROM Pqrs p WHERE p.cedula = :cedula")
    List<IPqrsDto> findPqrsByCedula(@Param("cedula") String cedula);

    @Query("SELECT p.typePqrs AS typePqrs, p.usuario AS usuario, COUNT(p) AS cantidadLlamadasAtendidas " +
        "FROM Pqrs p " +
        "WHERE p.registroPqrs = :registroPqrs " +
        "GROUP BY p.typePqrs, p.usuario")
    List<IResultDto> findPqrsByDate(@Param("registroPqrs") LocalDate registroPqrs);

    @Query("SELECT p FROM Pqrs p")
    List<Pqrs> findPqrsByTime();

}
