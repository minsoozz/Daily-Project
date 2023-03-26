package com.week.infrastructure.musical.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class MusicalOptimisticEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int ticketQuantity;

    @Version
    private int version;


    public MusicalOptimisticEntity() {

    }

    public MusicalOptimisticEntity(int ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }

    public void decrease() {
        this.ticketQuantity--;
    }

    public int getTicketQuantity(){
        return this.ticketQuantity;
    }
}
