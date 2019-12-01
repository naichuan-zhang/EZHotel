package com.cyan.hotel.repository;

import com.cyan.hotel.model.Guest;
import com.cyan.hotel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * @author: Naichuan Zhang
 * @create: 06-Nov-2019
 **/

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByUserId(Long userId);

    @Modifying(clearAutomatically = true)
    @Query("update User user set user.balance=?1 where user.userId=?2")
    void updateUserBalance(Double balance, Long userId);
}
