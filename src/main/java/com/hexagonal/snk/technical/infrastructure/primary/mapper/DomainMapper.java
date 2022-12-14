package com.hexagonal.snk.technical.infrastructure.primary.mapper;

import java.util.List;

public interface DomainMapper<D, E> {
    
    E toEntity(D dto);

    D toDto(E entity);

    List<E> toEntity(List<D> dtoList);

    List<D> toDto(List<E> entityList);
}
