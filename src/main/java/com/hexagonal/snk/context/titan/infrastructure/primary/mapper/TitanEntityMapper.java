package com.hexagonal.snk.context.titan.infrastructure.primary.mapper;

import org.mapstruct.Mapper;

import com.hexagonal.snk.context.titan.domain.Titan;
import com.hexagonal.snk.context.titan.infrastructure.secondary.TitanEntity;
import com.hexagonal.snk.technical.infrastructure.primary.mapper.EntityMapper;


@Mapper(componentModel = "spring")
public interface TitanEntityMapper extends EntityMapper<Titan, TitanEntity> {
    
}
