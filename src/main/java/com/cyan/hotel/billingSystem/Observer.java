package com.cyan.hotel.billingSystem;

/**
 * @author: John Long
 * @create: 28-Nov-2019
 **/
public interface Observer {
    public void updateBill();

    public void setSubject(Subject subj);
}
