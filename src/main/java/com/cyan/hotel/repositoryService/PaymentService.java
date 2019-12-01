package com.cyan.hotel.repositoryService;

import com.cyan.hotel.enumeration.PayType;

public interface PaymentService {

    void insertPayment(Long userId, String paymentDate,
                       Double paymentAmount, PayType paymentType);
}
