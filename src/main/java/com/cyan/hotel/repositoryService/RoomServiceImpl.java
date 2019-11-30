package com.cyan.hotel.repositoryService;

import com.cyan.hotel.exception.RoomNotFoundException;
import com.cyan.hotel.model.Room;
import com.cyan.hotel.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: John Long
 * @create: 12-Nov-2019
 **/

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    private RoomRepository roomRepository;

//    @Override
//    public Room getRoomByRoomId(Long roomId) {
////        return roomRepository.findById(roomId)
////                .orElseThrow(()-> new RoomNotFoundException(roomId));
//        return roomRepository.findRoomByRoomId(roomId);
//    }

    @Override
    public Room findRoomByRoomId(Long roomId) {
        return roomRepository.getRoomByRoomId(roomId);
        //return roomRepository.findById(roomId).orElseThrow(() -> new RoomNotFoundException(roomId));
    }

    @Override
    public List<Room> findAllRooms() {
        return roomRepository.findAllRooms();
    }

    @Override
    public List<Room> findAllAvailableRooms() {
        return roomRepository.findAllAvailableRooms();
    }

    @Override
    public List<Room> getRoomsByRoomType(String roomType) {
        return roomRepository.getRoomsByRoomType(roomType);
    }
}
