package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.RoomStyle;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

/**
 * @author: Naichuan Zhang
 * @create: 06-Nov-2019
 **/

@MappedSuperclass
public abstract class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomId")
    private Long roomId;

    @Column(name = "roomStatus")
    @Pattern(regexp = "^[01]")
    private Integer roomStatus;

    public Room() {
        this.roomStatus = 0;
    }

    abstract Double getPrice();
    abstract String getDescription();

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Integer getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
    }

}