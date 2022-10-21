package com.hexagonal.snk.context.titan.domain;

import java.util.List;

public interface TitanRepository {
    
    void save(Titan titan);

    Titan findOne(Long id);

    List<Titan> findAll();

    void deleteTitanById(Long id);

}
