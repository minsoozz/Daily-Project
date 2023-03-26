package com.week.presentation.musical.controller;

import com.week.application.musiacal.service.MusicalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/musical")
public class MusicalController {

    private final MusicalService musicalService;

    public MusicalController(MusicalService musicalService) {
        this.musicalService = musicalService;
    }

    @PostMapping("/purchase")
    public void purchaseMusical() {

    }
}
