package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.User;

/**
 * @author: Naichuan Zhang
 * @create: 29-Nov-2019
 **/

public interface UserService {

    User findByUsername(String username);
    void save(User user);

    boolean validateUser(String username, String password);
}
