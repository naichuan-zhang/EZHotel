package com.cyan.hotel.model;

/**
 * @author: Naichuan Zhang
 * @create: 24-Nov-2019
 **/
public class RoomDecorator implements Room {

    private Room room;

    public RoomDecorator(Room room) {
        this.room = room;
    }

    @Override
    public Double getPrice() {
        return room.getPrice();
    }

    @Override
    public String getDescription() {
        return room.getDescription();
    }
}
