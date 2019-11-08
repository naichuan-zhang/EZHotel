package com.cyan.hotel.model;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 08-Nov-2019
 **/

@Entity
@Table(name = "roomtype")
public class RoomType {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "roomTypeId")
    private int roomTypeId;

    @Column(name = "roomType")
    private String roomType;

    @Column(name = "roomRate")
    private int roomRate;

    @Column(name = "numBeds")
    private int numBeds;

    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomRate() {
        return roomRate;
    }

    public void setRoomRate(int roomRate) {
        this.roomRate = roomRate;
    }

    public int getNumBeds() {
        return numBeds;
    }

    public void setNumBeds(int numBeds) {
        this.numBeds = numBeds;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "description")
    private String description;

}
