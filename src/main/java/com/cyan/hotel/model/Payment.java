package com.cyan.hotel.model;

import com.cyan.hotel.enumeration.PayType;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

/**
 * @author: John Long
 * @create: 07-Nov-2019
 **/

@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentId")
    private Long paymentId;

    @Column(name = "paymentDate")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date paymentDate;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "payType")
    private PayType payType;

    @Column(name = "paymentAmount")
    private Double paymentAmount;

    @Column(name = "payeeName")
    private String payeeName;

    @ManyToOne
    @JoinColumn(name = "userId")
    private Guest guest;

    public Payment() {

    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPayeeName() {
        return payeeName;
    }

    public void setPayeeName(String payeeName) {
        this.payeeName = payeeName;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }
}
