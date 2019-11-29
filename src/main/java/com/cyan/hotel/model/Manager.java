package com.cyan.hotel.model;

import javax.persistence.*;

/**
 * @author: Naichuan Zhang
 * @create: 02-Nov-2019
 **/

public class Manager extends User {

    public Manager() {

    }

    public Manager(Builder<?> builder) {
        super(builder);
    }

    public static Builder<?> builder() {
        return new Builder<Manager>() {
            @Override
            public Manager build() {
                return new Manager(this);
            }
        };
    }

    public static abstract class Builder<T extends Manager> extends User.Builder<T> {

    }
}
