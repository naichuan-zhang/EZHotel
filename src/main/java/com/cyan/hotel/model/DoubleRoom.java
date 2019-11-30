package com.cyan.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: John Long
 * @create: 30-Nov-2019
 **/
@Table
@Entity(name = "DoubleRoom")
public class DoubleRoom extends Room {
    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    public DoubleRoom() {
        price = 200.0;
        description = "Double Room";
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
