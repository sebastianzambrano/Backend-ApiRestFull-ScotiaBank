package com.application.restfull.Service;

import com.application.restfull.Entity.Client;
import com.application.restfull.IReposiroty.IBaseRepository;
import com.application.restfull.IReposiroty.IClientRepository;
import com.application.restfull.IService.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService extends BaseService<Client> implements IClientService {

    @Autowired
    private IClientRepository repository;
    @Override
    protected IBaseRepository<Client, Long> getRepository() {
        return repository;
    }



}
