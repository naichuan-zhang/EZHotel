package com.cyan.hotel;

import com.cyan.hotel.repositoryService.BookingService;
import com.cyan.hotel.repositoryService.BookingServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * @author: John Long
 * @create: 01-Dec-2019
 **/

@RunWith(MockitoJUnitRunner.class)
public class BookingServiceTest {

    @Mock
    BookingService bookingServiceMock;

    @InjectMocks
    BookingServiceImpl bookingImpl;

    @Test
    public void testFindTheGreatestFromAllData() {
//        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
//        assertEquals(24, businessImpl.findTheGreatestFromAllData());
    }


}