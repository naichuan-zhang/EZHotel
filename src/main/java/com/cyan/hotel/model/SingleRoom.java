package com.cyan.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: John Long
 * @create: 24-Nov-2019
 **/

@Entity
@Table(name = "singleRoom")
public class SingleRoom extends Room {

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    public SingleRoom() {
        price = 50.00;
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
