package com.application.restfull.IReposiroty;

import com.application.restfull.Entity.Auditoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBaseRepository <T extends Auditoria, ID> extends JpaRepository <T, ID> {
}
