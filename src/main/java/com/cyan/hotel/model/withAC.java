package com.cyan.hotel.model;

/**
 * @author: Naichuan Zhang
 * @create: 24-Nov-2019
 **/

public class withAC extends RoomDecorator {

    public withAC(Room room) {
        super(room);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with AC!";
    }
}
