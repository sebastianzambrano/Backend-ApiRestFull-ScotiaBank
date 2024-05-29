package com.application.restfull.IService;

import com.application.restfull.DTO.IPqrsDto;
import com.application.restfull.DTO.IResultDto;
import com.application.restfull.DTO.IResultTimeDto;
import com.application.restfull.Entity.Pqrs;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface IPqrsService extends IBaseService<Pqrs>{
    List<IPqrsDto> findPqrsByTypePqrs(String typePqrs);

    List<IPqrsDto> findPqrsByCedula(String cedula);

    List<IResultDto> findPqrsByDate(LocalDate registroPqrs);

    List<IResultTimeDto> findPqrsByTime();

}
