package com.cyan.hotel.billingSystem;

/**
 * @author: John Long
 * @create: 12-Nov-2019
 **/

public class BillingSystem implements Observer {
    int billAmt;

    @Override
    public void updateBill() {
        System.out.println("Bill Total: "+billAmt);
    }

    @Override
    public void setSubject(Subject subj) {

    }
}
