package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.RoomStyle;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: John Long
 * @create: 30-Nov-2019
 **/
@Table
@Entity(name = "singleRoom")
public class SingleRoom extends Room {
    @Column(name = "price", columnDefinition = "Decimal(10,2) default '150.0'")
    private Double price;

    @Column(name = "description", columnDefinition = "varchar(100) default 'This is a Single Room'")
    private String description;

    public SingleRoom() {
        price = 150.0;
        description = "This is Single Room";
        this.setRoomType("SINGLE");
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
