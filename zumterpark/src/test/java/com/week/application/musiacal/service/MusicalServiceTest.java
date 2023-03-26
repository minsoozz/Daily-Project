package com.week.application.musiacal.service;

import com.week.infrastructure.musical.entity.MusicalOptimisticEntity;
import com.week.infrastructure.musical.repository.optimisticlock.MusicalJpaOptimisticLockRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class MusicalServiceTest {

    @Autowired
    MusicalService musicalService;

    @Autowired
    MusicalJpaOptimisticLockRepository musicalJpaOptimisticLockRepository;

    MusicalOptimisticEntity musical;

    @BeforeEach
    void setUp() {
        this.musical = musicalJpaOptimisticLockRepository.save(new MusicalOptimisticEntity(100));
    }

    @Test
    void 낙관적락_테스트() {
        musicalService.decreaseByOptimisticLock(musical);
        MusicalOptimisticEntity savedEntity = musicalJpaOptimisticLockRepository.findById(1L).orElseThrow();
        Assertions.assertEquals(99, savedEntity.getTicketQuantity());
    }
}