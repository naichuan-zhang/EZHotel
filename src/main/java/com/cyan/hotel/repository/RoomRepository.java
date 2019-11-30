package com.cyan.hotel.repository;

import com.cyan.hotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    @Query(value = "select r from Room r", nativeQuery = true)
    List<Room> findAllRooms();

    @Query(value = "select r from Room r where r.roomStatus = 0", nativeQuery = true)
    List<Room> findAllAvailableRooms();

    List<Room> getRoomsByRoomType(String roomType);

    Room getRoomByRoomId(Long roomId);
}
