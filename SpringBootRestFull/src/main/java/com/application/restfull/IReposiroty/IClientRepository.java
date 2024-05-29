package com.application.restfull.IReposiroty;

import org.springframework.stereotype.Repository;
import com.application.restfull.Entity.Client;

@Repository
public interface IClientRepository extends IBaseRepository <Client,Long>{
}
