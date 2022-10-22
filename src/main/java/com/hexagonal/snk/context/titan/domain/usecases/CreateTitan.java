package com.hexagonal.snk.context.titan.domain.usecases;

import com.hexagonal.snk.context.titan.domain.Titan;
import com.hexagonal.snk.context.titan.domain.TitanRepository;

public class CreateTitan {
    
    private TitanRepository titanRepository;

    public CreateTitan(TitanRepository titanRepository) {
        this.titanRepository = titanRepository;
    }

    public Titan create(Titan titan) {
    
        // validar para poder crear           
          

        titanRepository.save(titan);

        return titan;
    }
    
}
