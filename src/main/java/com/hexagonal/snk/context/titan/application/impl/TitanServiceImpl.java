package com.hexagonal.snk.context.titan.application.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hexagonal.snk.context.titan.application.TitanService;
import com.hexagonal.snk.context.titan.domain.Titan;
import com.hexagonal.snk.context.titan.domain.TitanRepository;
import com.hexagonal.snk.context.titan.domain.usecases.CreateTitan;
import com.hexagonal.snk.context.titan.domain.usecases.GetAllTitans;
import com.hexagonal.snk.context.titan.infrastructure.primary.dto.TitanDTO;
import com.hexagonal.snk.context.titan.infrastructure.primary.mapper.TitanMapper;

@Service
@Transactional
public class TitanServiceImpl implements TitanService {

    private final CreateTitan createTitan;
    private final GetAllTitans getAllTitans;

    private TitanRepository titanRepository;
    private TitanMapper titanMapper;

    

    public TitanServiceImpl(TitanRepository titanRepository, TitanMapper titanMapper) {
        
        this.titanRepository = titanRepository;
        this.titanMapper = titanMapper;
        this.createTitan = new CreateTitan(titanRepository);
        this.getAllTitans = new GetAllTitans(titanRepository);
    }

    @Override
    public TitanDTO save(TitanDTO titanDTO) {
        // TODO Auto-generated method stub

        Titan titan = titanMapper.toEntity(titanDTO);
        Titan titanCreated = createTitan.create(titan);
        
        return titanMapper.toDto(titanCreated);
    }

    @Override
    public TitanDTO findOne(Long id) {
        Titan titan2 = titanRepository.findOne(id);
        return null;
    }

    @Override
    public List<TitanDTO> findAll() {
        List<Titan> titanList = getAllTitans.getAll();
        return titanMapper.toDto(titanList);
    }

    @Override
    public void deleteTitanById(Long id) {
        // TODO Auto-generated method stub
        
    }
    
}
