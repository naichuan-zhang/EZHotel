package com.cyan.hotel.model;

import javax.persistence.*;

/**
 * @author: Naichuan Zhang
 * @create: 24-Nov-2019
 **/
@Entity
@Table(name = "Room")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class SingleRoom extends Room {

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    public SingleRoom() {
        price = 100.0;
        description = "";
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

