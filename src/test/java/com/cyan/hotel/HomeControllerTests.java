package com.cyan.hotel;

import com.cyan.hotel.controller.HomeController;
import com.cyan.hotel.model.Booking;
import com.cyan.hotel.model.User;
import com.cyan.hotel.repositoryService.BookingService;
import com.cyan.hotel.repositoryService.UserService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import java.awt.print.Book;

import static org.springframework.test.util.AssertionErrors.assertEquals;

/**
 * @author: John Long
 * @create: 01-Dec-2019
 **/

public class HomeControllerTests {
    @Autowired
    private UserService userService;

    @Autowired
    BookingService bookingService;

    private User user;

    @Before
    public void before() throws Exception{
        user = new User();
        user.setUsername("jlong");
        user.setBalance(1000.0);
        user.setPassword("1234");
        user.setFirstName("john");
        user.setLastName("long");
    }



    @Test
    public void test1() throws Exception {
        HomeController homeController = new HomeController();
        String s = homeController.home();
        assertEquals(null, "home", s);
    }

    @Test
    public void test2() throws Exception {
        HomeController homeController = new HomeController();
        String s = homeController.contact();
        assertEquals(null, "contact", s);
    }

    @Test
    public void test3(){
//       userService.save(user);
//        bookingService.insertBooking("24/10/2019", 2, 100.0, "jlong");
    }


}