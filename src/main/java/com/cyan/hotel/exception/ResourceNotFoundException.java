package com.cyan.hotel.exception;

/**
 * @author: John Long
 * @create: 12-Nov-2019
 **/

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String resourceType, String name, String value){
        super("Error: " + resourceType + " with " + name +
                "[" + value + "] not found!!");
    }
}
