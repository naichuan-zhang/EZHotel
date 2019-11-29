package com.cyan.hotel.model;

/**
 * @author: John Long
 * @create: 29-Nov-2019
 **/

public class withBottleOfWine extends RoomDecorator {

    public withBottleOfWine(Room room) {
        super(room);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with bottle of wine!";
    }
}

