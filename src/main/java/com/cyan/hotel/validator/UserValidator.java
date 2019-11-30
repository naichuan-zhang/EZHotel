package com.cyan.hotel.validator;

import com.cyan.hotel.model.User;
import com.cyan.hotel.repositoryService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author: Naichuan Zhang
 * @create: 29-Nov-2019
 **/

@Component
public class UserValidator implements Validator {

    @Autowired
    private UserService userService;

    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        User user = (User) o;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "Can't be empty");
        if (user.getUsername().length() < 6 || user.getUsername().length() > 32) {
            errors.rejectValue("username", "Size.userForm.username");
        }
        if (userService.findByUsername(user.getUsername()) != null) {
            errors.rejectValue("username", "Duplicate.userForm.username");
        }

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Can't be empty");
        if (user.getPassword().length() < 6 || user.getPassword().length() > 32) {
            errors.rejectValue("password", "Size.userForm.password");
        }
        if (!user.getPasswordConfirm().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirm", "Diff.userForm.passwordConfirm");
        }
    }

    public void validateLogin(Errors errors, String username, String password){
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "Cannot be empty");        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "Cannot be empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Cannot be empty");        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "Cannot be empty");

        if (userService.findByUsername(username) == null){
            errors.rejectValue("username", "User does not exist");
        }else{
            User user = userService.findByUsername(username);
            if(!user.getPassword().equals(password)){
                errors.rejectValue("password", "Password incorrect");
            }
        }
    }
}
