package com.week.infrastructure.musical.impl;

import com.week.domain.musical.repository.MusicalRepository;
import com.week.infrastructure.musical.entity.MusicalOptimisticEntity;
import com.week.infrastructure.musical.repository.optimisticlock.MusicalJpaOptimisticLockRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MusicalOptimisticRepositoryImpl implements MusicalRepository {

    private final MusicalJpaOptimisticLockRepository musicalJpaOptimisticLockRepository;

    public MusicalOptimisticRepositoryImpl(
        MusicalJpaOptimisticLockRepository musicalJpaOptimisticLockRepository) {
        this.musicalJpaOptimisticLockRepository = musicalJpaOptimisticLockRepository;
    }

    @Override
    public <T> void save(T entity) {
        musicalJpaOptimisticLockRepository.save((MusicalOptimisticEntity) entity);
    }
}
