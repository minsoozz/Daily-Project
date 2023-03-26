package com.week.infrastructure.musical.repository;

import com.week.infrastructure.musical.entity.optimisticlock.MusicalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicalJpaRepository extends JpaRepository<MusicalEntity, Long> {


}
