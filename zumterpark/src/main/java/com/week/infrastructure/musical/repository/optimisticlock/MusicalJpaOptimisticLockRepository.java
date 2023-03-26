package com.week.infrastructure.musical.repository.optimisticlock;

import com.week.infrastructure.musical.entity.MusicalOptimisticEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicalJpaOptimisticLockRepository extends JpaRepository<MusicalOptimisticEntity, Long> {

}
