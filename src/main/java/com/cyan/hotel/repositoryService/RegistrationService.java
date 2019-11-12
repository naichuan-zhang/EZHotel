package com.cyan.hotel.repositoryService;

import com.cyan.hotel.repository.UserRepository;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author: John Long
 * @create: 11-Nov-2019
 **/

@Component
public class RegistrationService {
    private boolean registrationValid;

    public boolean validateRegistration(String username, String password, String confirmPassword,
                                        String phoneNumber, String firstName, String lastName, String emailAddress){

        if(password.equals(confirmPassword))
            registrationValid = true;
        else
            registrationValid = false;

        return registrationValid;
    }
}
