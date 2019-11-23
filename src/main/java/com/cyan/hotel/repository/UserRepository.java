package com.cyan.hotel.repository;

import com.cyan.hotel.model.Guest;
import com.cyan.hotel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * @author: Naichuan Zhang
 * @create: 06-Nov-2019
 **/

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    @Query(value = "SELECT u from User where u.username = :username")
//    User findUserByUsername(@Param("username") String username);

    User findByUsername(String username);

//    List<User> findUserByUsername(String username);
//    @Query(TODO)
//    long insertUser(String username, String password, String phoneNumber,
//                    String firstName, String lastName, String email);
}
