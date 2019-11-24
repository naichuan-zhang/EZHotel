package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.RoomStyle;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * @author: Naichuan Zhang
 * @create: 06-Nov-2019
 **/

@MappedSuperclass
public abstract class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    abstract Double getPrice();
    abstract String getDescription();

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }
}