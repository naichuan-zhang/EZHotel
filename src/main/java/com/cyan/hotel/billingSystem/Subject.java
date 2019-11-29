package com.cyan.hotel.billingSystem;

/**
 * @author: John Long
 * @create: 28-Nov-2019
 **/
public interface Subject {
    void registerObserver(Observer obj);
    void unRegister(Observer obj);

    void notifyObservers();

    public Object getUpdate(Observer obj);
}
