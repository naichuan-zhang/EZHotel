package com.cyan.hotel.model;

/**
 * @author: John Long
 * @create: 29-Nov-2019
 **/

public class withDinner extends RoomDecorator {

    public withDinner(Room room) {
        super(room);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 150;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with dinner!";
    }
}
