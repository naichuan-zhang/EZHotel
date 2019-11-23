package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.User;
import com.cyan.hotel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: Naichuan Zhang
 * @create: 09-Nov-2019
 **/

@Component
public class LoginService {
    @Autowired
    UserRepository userRepository;

    public boolean validateUser(String user, String password) {
        User username = userRepository.findByUsername(user);
        return (user.equalsIgnoreCase(username.getUsername()));
//        return (user.equalsIgnoreCase("naichuan") && password.equals("123"))
//                || (user.equalsIgnoreCase("john") && password.equals("123"));
    }
}
