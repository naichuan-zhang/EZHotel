package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.RoomStyle;
import org.springframework.data.annotation.TypeAlias;

import javax.persistence.*;

/**
 * @author: Naichuan Zhang
 * @create: 06-Nov-2019
 **/

public interface Room {

    Double getPrice();
    String getDescription();
}