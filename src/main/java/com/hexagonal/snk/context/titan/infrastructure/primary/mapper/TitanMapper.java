package com.hexagonal.snk.context.titan.infrastructure.primary.mapper;

import org.mapstruct.Mapper;

import com.hexagonal.snk.context.titan.domain.Titan;
import com.hexagonal.snk.context.titan.infrastructure.primary.dto.TitanDTO;
import com.hexagonal.snk.technical.infrastructure.primary.mapper.DomainMapper;

@Mapper(componentModel = "spring")
public interface TitanMapper extends DomainMapper<TitanDTO, Titan> {
    
}
