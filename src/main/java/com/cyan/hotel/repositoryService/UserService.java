package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.User;

/**
 * @author: Naichuan Zhang
 * @create: 29-Nov-2019
 **/

public interface UserService {

    User findByUsername(String username);
    void save(User user);
    User findByUserId(Long userId);
    boolean validateUser(String username, String password);
}
