package com.week.application.musiacal.service;

import com.week.domain.musical.repository.MusicalRepository;
import com.week.infrastructure.musical.entity.MusicalOptimisticEntity;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class MusicalService {

    private final Map<String, MusicalRepository> musicalRepositoryMap;

    public MusicalService(
        Map<String, MusicalRepository> musicalRepositoryMap) {
        this.musicalRepositoryMap = musicalRepositoryMap;
    }

    void decreaseByOptimisticLock(MusicalOptimisticEntity musical) {
        musical.decrease();
        musicalRepositoryMap.get("musicalOptimisticRepositoryImpl").save(musical);
    }
}
