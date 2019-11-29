package com.cyan.hotel.model;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

/**
 * @author: Naichuan Zhang
 * @create: 05-Nov-2019
 **/

// TODO: JOINED ? TABLE_PER_CLASS
@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    // TODO: IDENTITY ? TABLE
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userId")
    private Long userId;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Transient
    private String passwordConfirm;

    public User() {

    }

    public User(Builder<?> builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.username = builder.username;
        this.password = builder.password;
    }

    public static Builder<?> builder() {
        return new Builder<User>() {
            @Override
            public User build() {
                return new User(this);
            }
        };
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public static abstract class Builder<T extends User> {
        private String firstName;
        private String lastName;
        private String username;
        private String password;

        public Builder<T> firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder<T> lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder<T> username(String username) {
            this.username = username;
            return this;
        }

        public Builder<T> password(String password) {
            this.password = password;
            return this;
        }

        public abstract T build();
    }
}
