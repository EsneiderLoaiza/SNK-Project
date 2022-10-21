package com.hexagonal.snk.context.titan.application;

import java.util.List;

import com.hexagonal.snk.context.titan.infrastructure.primary.dto.TitanDTO;

public interface TitanService {
    
    TitanDTO save(TitanDTO titan);

    TitanDTO findOne(Long id);

    List<TitanDTO> findAll();

    void deleteTitanById(Long id);
}
