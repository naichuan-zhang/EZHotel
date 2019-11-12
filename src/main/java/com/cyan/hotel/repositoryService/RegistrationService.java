package com.cyan.hotel.repositoryService;

public interface RegistrationService {
    boolean validateRegistration(String username, String password, String confirmPassword,
                                        String phoneNumber, String firstName, String lastName, String emailAddress);
}
