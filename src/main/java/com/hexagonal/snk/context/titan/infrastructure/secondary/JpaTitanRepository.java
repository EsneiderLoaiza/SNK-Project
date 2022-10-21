package com.hexagonal.snk.context.titan.infrastructure.secondary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTitanRepository extends JpaRepository<TitanEntity, Long>, JpaSpecificationExecutor<TitanEntity>{
    
}
