package com.cyan.hotel.repositoryService;

import com.cyan.hotel.enumeration.PayType;
import com.cyan.hotel.model.Payment;
import com.cyan.hotel.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Naichuan Zhang
 * @create: 01-Dec-2019
 **/

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired UserService userService;

    @Override
    public void insertPayment(Long userId, String paymentDate, Double paymentAmount, PayType paymentType) {
        Payment payment = new Payment();

        payment.setPaymentAmount(paymentAmount);
        payment.setPaymentDate(paymentDate);
        payment.setPayType(paymentType);
        payment.setUser(userService.findByUserId(userId));

        paymentRepository.save(payment);
    }
}
