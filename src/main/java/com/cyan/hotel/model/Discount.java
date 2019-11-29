package com.cyan.hotel.model;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 07-Nov-2019
 **/

public class Discount {

    private Long discountId;
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
