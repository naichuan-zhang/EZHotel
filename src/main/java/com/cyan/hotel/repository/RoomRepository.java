package com.cyan.hotel.repository;

import com.cyan.hotel.model.Booking;
import com.cyan.hotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    @Query(value = "select r from Room r", nativeQuery = true)
    List<Room> findAllRooms();

    @Query(value = "select r from Room r where r.roomStatus = 0", nativeQuery = true)
    List<Room> findAllAvailableRooms();

    List<Room> getRoomsByRoomType(String roomType);

    Room getRoomByRoomId(Long roomId);

//    @Modifying(clearAutomatically = true)
//    @Query("update Room room set room.roomStatus=?2 where room.roomId=?1")
//    void updateRoomStatus(Long roomId, Integer roomStatus);
}
