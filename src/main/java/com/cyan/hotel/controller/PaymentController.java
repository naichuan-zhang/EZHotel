package com.cyan.hotel.controller;

import com.cyan.hotel.enumeration.PayType;
import com.cyan.hotel.enumeration.RoomStyle;
import com.cyan.hotel.model.Booking;
import com.cyan.hotel.model.User;
import com.cyan.hotel.repositoryService.BookingService;
import com.cyan.hotel.repositoryService.PaymentService;
import com.cyan.hotel.repositoryService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;

/**
 * @author: Naichuan Zhang
 * @create: 01-Dec-2019
 **/

@Controller
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private UserService userService;

    @Autowired
    private BookingService bookingService;

    @GetMapping(value = "/payment")
    public String payment() {
        return "payment";
    }

    @GetMapping(value = "/payment/{username}/{totalPrice}")
    public String showPayment(@PathVariable String username,
                          @PathVariable Double totalPrice, Model model) {

        if (!username.isEmpty()) {
            User user = userService.findByUsername(username);
            Long userId = user.getUserId();
            Double balance = user.getBalance();
            Booking booking = bookingService.findBookingByUser(user);
            List<PayType> payTypes = getPayTypes();

            model.addAttribute(booking);
            model.addAttribute(userId);
            model.addAttribute(totalPrice);
            model.addAttribute("balance", balance);
            model.addAttribute("payTypesList", payTypes);

            return "payment";
        } else {
            return "redirect:/payment/failed";
        }
    }

    @GetMapping(value = "/payment/{bookingId}/{username}/{totalPrice}/{balance}")
    public String pay(@PathVariable Long bookingId, @PathVariable String username,
                      @PathVariable Double totalPrice, @RequestParam("payTypesList") PayType payType,
                      @PathVariable Double balance, Model model) {

        if (!username.isEmpty()) {

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date date = new Date();
            User user = userService.findByUsername(username);

            double currentBalance = balance - totalPrice;

            if (currentBalance >=0 ) {
                // update user balance here ...
                userService.updateUserBalance(user.getUserId(), currentBalance);
                paymentService.insertPayment(user.getUserId(), formatter.format(date), totalPrice, payType);

                return "redirect:/payment/success";
            } else {
                return "redirect:/payment/failed";
            }

        } else {
            return "redirect:/payment/failed";
        }
    }

    @GetMapping(value = "/payment/success")
    public String success() {
        return "home";
    }

    @GetMapping(value = "/payment/failed")
    public String failed() {
        return "home";
    }

    private List<PayType> getPayTypes() {
        return new ArrayList<PayType>(EnumSet.allOf(PayType.class));
    }
}
