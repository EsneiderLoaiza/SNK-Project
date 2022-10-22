package com.hexagonal.snk.context.titan.domain.usecases;

import java.util.List;

import com.hexagonal.snk.context.titan.domain.Titan;
import com.hexagonal.snk.context.titan.domain.TitanRepository;

public class GetAllTitans {
    
    private TitanRepository titanRepository;

    public GetAllTitans(TitanRepository titanRepository) {
        this.titanRepository = titanRepository;
    }

    public List<Titan> getAll() {

        return titanRepository.findAll();
    }
}
