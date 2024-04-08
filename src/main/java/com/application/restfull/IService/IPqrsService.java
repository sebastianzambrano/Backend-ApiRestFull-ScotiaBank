package com.application.restfull.IService;

import com.application.restfull.DTO.IPqrsDto;
import com.application.restfull.Entity.Pqrs;

import java.util.List;

public interface IPqrsService extends IBaseService<Pqrs>{
    List<IPqrsDto> findPqrsByTypePqrs(String typePqrs);
}
