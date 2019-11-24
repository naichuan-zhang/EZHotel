package com.cyan.hotel.model;

/**
 * @author: Naichuan Zhang
 * @create: 24-Nov-2019
 **/
public class withWiFi extends RoomDecorator {

    public withWiFi(Room room) {
        super(room);
    }

    @Override
    public Double getPrice() {
        return super.getPrice() + 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ": with WiFi!";
    }
}
