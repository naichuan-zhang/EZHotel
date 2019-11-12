package com.cyan.hotel.exception;

/**
 * @author: John Long
 * @create: 12-Nov-2019
 **/

public class RoomNotFoundException extends ResourceNotFoundException {
    public RoomNotFoundException(Long roomId) {
        super("Room", "roomId", roomId.toString());
    }
}
