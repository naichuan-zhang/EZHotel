package com.cyan.hotel;

import com.cyan.hotel.controller.BookingController;
import com.cyan.hotel.repositoryService.BookingService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import javax.ws.rs.GET;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author: John Long
 * @create: 01-Dec-2019
 **/

@RunWith(MockitoJUnitRunner.class)
public class BookingControllerTest {

    private MockMvc mockMvc;

    @Test
    public void testGetRoomByIdForBooking_Success() throws Exception {
//        mockMvc.perform(get("/booking/2", 1L))
//                .andExpect(status().isOk())
//                .andExpect(forwardedUrl("/booking/2"));
    }

}