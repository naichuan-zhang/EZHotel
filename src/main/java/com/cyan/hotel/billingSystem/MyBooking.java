package com.cyan.hotel.billingSystem;

import java.util.List;

/**
 * @author: John Long
 * @create: 29-Nov-2019
 **/

public class MyBooking implements Subject {
    private List<Observer> observers;
    private String message;
    private boolean changed;

    @Override
    public void registerObserver(Observer obj) {

    }

    @Override
    public void unRegister(Observer obj) {

    }

    @Override
    public void notifyObservers() {

    }

    @Override
    public Object getUpdate(Observer obj) {
        return null;
    }
}
