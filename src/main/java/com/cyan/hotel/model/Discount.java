package com.cyan.hotel.model;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 07-Nov-2019
 **/

@Entity
@Table(name = "discount")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "discountId")
    private Long discountId;

    @Column(name = "discountPercentage")
    private Double discountPercentage;

    public Discount() {

    }

    public Long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(Long discountId) {
        this.discountId = discountId;
    }

    public Double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(Double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
