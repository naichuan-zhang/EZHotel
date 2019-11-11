package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.RoomTypes;

import javax.persistence.*;

/**
 * @author: Naichuan Zhang
 * @create: 06-Nov-2019
 **/
@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "roomId")
    private Long roomId;

    @Column(name = "price")
    private Double price;

    @Column(name = "type")
    private RoomType type;

    @Column(name = "status")
    private Integer status;

    public Room() {

    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }
}
