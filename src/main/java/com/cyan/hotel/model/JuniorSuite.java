package com.cyan.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: John Long
 * @create: 24-Nov-2019
 **/

@Entity
@Table(name = "juniorSuite")
public class JuniorSuite extends Room {

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    public JuniorSuite() {
        price = 200.00;
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
