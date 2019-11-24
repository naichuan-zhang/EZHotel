package com.cyan.hotel.model;

import javax.persistence.*;

/**
 * @author: Naichuan Zhang
 * @create: 24-Nov-2019
 **/
@Entity
@Table(name = "executiveRoom")
public class ExecutiveRoom implements Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long executiveRoomId;

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    public ExecutiveRoom() {
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
