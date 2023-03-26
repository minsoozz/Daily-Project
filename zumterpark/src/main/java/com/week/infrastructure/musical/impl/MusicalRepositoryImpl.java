package com.week.infrastructure.musical.impl;

import com.week.domain.musical.repository.MusicalRepository;
import com.week.infrastructure.musical.entity.optimisticlock.MusicalEntity;
import com.week.infrastructure.musical.repository.MusicalJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MusicalRepositoryImpl implements MusicalRepository {

    private final MusicalJpaRepository musicalJpaRepository;

    public MusicalRepositoryImpl(MusicalJpaRepository musicalJpaRepository) {
        this.musicalJpaRepository = musicalJpaRepository;
    }

    @Override
    public <T> void save(T entity) {
        musicalJpaRepository.save((MusicalEntity) entity);
    }
}
