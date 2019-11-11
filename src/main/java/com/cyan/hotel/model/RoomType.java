package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.RoomTypes;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 11-Nov-2019
 **/

public class RoomType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roomTypeId")
    private Long roomTypeId;

    @Column(name = "roomType")
    @Enumerated(EnumType.STRING)
    private RoomTypes roomType;

    @Column(name = "roomRate")
    private int roomRate;

    @Column(name = "numBeds")
    private int numBeds;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "description")
    private String description;

    public Long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public RoomTypes getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomTypes roomType) {
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
}