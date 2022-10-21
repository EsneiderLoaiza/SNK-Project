package com.hexagonal.snk.context.titan.infrastructure.secondary;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hexagonal.snk.context.titan.domain.Titan;
import com.hexagonal.snk.context.titan.domain.TitanRepository;
import com.hexagonal.snk.context.titan.infrastructure.primary.mapper.TitanEntityMapper;

@Repository
public class SpringDataTitanRepository implements TitanRepository {

    private final JpaTitanRepository jpaTitanRepository;

    private final TitanEntityMapper titanEntityMapper;


    public SpringDataTitanRepository(JpaTitanRepository jpaTitanRepository, TitanEntityMapper titanEntityMapper) {
        this.jpaTitanRepository = jpaTitanRepository;
        this.titanEntityMapper = titanEntityMapper;
    }

    @Override
    public void save(Titan titan) {
        // TODO Auto-generated method stub

        //Assert.notNull("device", device);  
        // mapear objeto dominio a objeto de BD  
        TitanEntity deviceEntity = titanEntityMapper.toEntity(titan);

        jpaTitanRepository.save(deviceEntity);
        
    }

    @Override
    public Titan findOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Titan> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void deleteTitanById(Long id) {
        // TODO Auto-generated method stub
        
    }
    
}
