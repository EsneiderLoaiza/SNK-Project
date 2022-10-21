package com.hexagonal.snk.context.titan.domain;

public class CreateTitan {
    
    private TitanRepository titanRepository;

    public CreateTitan(TitanRepository titanRepository) {
        this.titanRepository = titanRepository;
    }

    public Titan create(Titan titan) {
    
        // validar para poder crear           
          
        titan.setName("Attack Titan");
        titan.setHeight("15 meters");
        titan.setCarrier("Eren Jaeger");

        titanRepository.save(titan);

        return titan;
      }
    
}
