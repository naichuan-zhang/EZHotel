package com.cyan.hotel.model;

import org.springframework.data.annotation.TypeAlias;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author: Naichuan Zhang
 * @create: 30-Nov-2019
 **/

@Entity
@Table(name = "juniorSuiteRoom")
public class JuniorSuiteRoom extends Room {

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    public JuniorSuiteRoom() {
        price = 200.0;
        description = "This is a Junior Suite Room";
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
