package com.application.restfull.Service;

import com.application.restfull.DTO.IPqrsDto;
import com.application.restfull.Entity.Pqrs;
import com.application.restfull.IReposiroty.IBaseRepository;
import com.application.restfull.IReposiroty.IPqrsRepository;
import com.application.restfull.IService.IPqrsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PqrsService extends BaseService<Pqrs> implements IPqrsService {
    @Autowired
    private IPqrsRepository repository;
    @Override
    protected IBaseRepository<Pqrs, Long> getRepository() {
        return repository;
    }


    @Override
    public List<IPqrsDto> findPqrsByTypePqrs(String typePqrs) {
        return repository.findPqrsByTypePqrs(typePqrs);
    }
}
