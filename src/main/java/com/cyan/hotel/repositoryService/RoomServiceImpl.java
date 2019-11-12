package com.cyan.hotel.repositoryService;

import com.cyan.hotel.exception.RoomNotFoundException;
import com.cyan.hotel.model.Room;
import com.cyan.hotel.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author: John Long
 * @create: 12-Nov-2019
 **/

public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepository;

    @Override
    public Room findRoomByRoomId(Long roomId) {
        return roomRepository.findById(roomId)
                .orElseThrow(()-> new RoomNotFoundException(roomId));
    }

    @Override
    public List<Room> findAllRooms() {
        return null;
    }
}
