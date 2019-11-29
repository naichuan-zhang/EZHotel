package com.cyan.hotel.model;

import javax.persistence.*;

/**
 * @author: Naichuan Zhang
 * @create: 24-Nov-2019
 **/

public class ExecutiveRoom extends Room {

    private Double price;
    private String description;

    public ExecutiveRoom() {
        price = 500.0;
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
