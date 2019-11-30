package com.cyan.hotel.repository;

import com.cyan.hotel.model.ExecutiveRoom;
import com.cyan.hotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    Room findRoomByRoomId(Long roomId);

    @Query(value = "select r from Room r", nativeQuery = true)
    List<Room> findAllRooms();

    @Query(value = "select r from Room r where r.roomStatus = 0", nativeQuery = true)
    List<Room> findAllAvailableRooms();

}
