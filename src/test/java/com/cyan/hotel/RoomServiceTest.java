package com.cyan.hotel;

import com.cyan.hotel.model.Room;
import com.cyan.hotel.model.User;
import com.cyan.hotel.repositoryService.RoomService;
import com.cyan.hotel.repositoryService.RoomServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * @author: John Long
 * @create: 01-Dec-2019
 **/

@RunWith(MockitoJUnitRunner.class)
public class RoomServiceTest {

    @Mock
    RoomService roomServiceMock;

    @InjectMocks
    RoomServiceImpl roomImpl;

    @Test
    public void testGetRoomsByRoomType(){

    }

    @Test
    public void testGetRoomById(){
        Long roomId = 1L;

//        when(roomServiceMock.findRoomByRoomId(roomId)).thenReturn(new Room());
//        assertEquals(room, roomImpl.findRoomByRoomId(roomId));
    }
}
