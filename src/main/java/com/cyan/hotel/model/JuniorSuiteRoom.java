package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.RoomStyle;
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

    @Column(name = "price", columnDefinition = "Decimal(10,2) default '200.0'")
    private Double price;

    @Column(name = "description", columnDefinition = "varchar(100) default 'This is a Junior Suite Room'")
    private String description;

    public JuniorSuiteRoom() {
        price = 200.0;
        description = "This is a Junior Suite Room";
        this.setRoomType("JUNIORSUITE");
    }

    @Override
    public Double getPrice() {
        return 200.0;
    }

    @Override
    public String getDescription() {
        return description;
    }

}
