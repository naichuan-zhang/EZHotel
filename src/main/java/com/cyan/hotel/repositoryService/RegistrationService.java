package com.cyan.hotel.repositoryService;

public interface RegistrationService {
    boolean validateRegistration(String firstName, String lastName, String username, String password, String emailAddress);
}
