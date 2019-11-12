package com.cyan.hotel.repositoryService;

import org.springframework.stereotype.Component;

/**
 * @author: Naichuan Zhang
 * @create: 09-Nov-2019
 **/

@Component
public class LoginService {

    public boolean validateUser(String user, String password) {

        return (user.equalsIgnoreCase("naichuan") && password.equals("123"))
                || (user.equalsIgnoreCase("john") && password.equals("123"));
    }
}
