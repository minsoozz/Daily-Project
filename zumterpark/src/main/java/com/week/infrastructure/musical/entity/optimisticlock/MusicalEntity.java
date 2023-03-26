package com.week.infrastructure.musical.entity.optimisticlock;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MusicalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int ticketQuantity;

    public void decrease() {
        this.ticketQuantity--;
    }
}
