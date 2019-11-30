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
@Entity(name = "DoubleRoom")
public class DoubleRoom extends Room {
    @Column(name = "price", columnDefinition = "Decimal(10,2) default '200.0'")
    private Double price;

    @Column(name = "description", columnDefinition = "varchar(100) default 'This is a Double Room'")
    private String description;

    public DoubleRoom() {
        price = 200.0;
        description = "Double Room";
        this.setRoomType("DOUBLE");
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
