package com.cyan.hotel.repository;

import com.cyan.hotel.model.ExecutiveRoom;
import com.cyan.hotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    //TODO : query
//    List<Room> findAllAvailableRooms();
}
