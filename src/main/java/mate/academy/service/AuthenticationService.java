package mate.academy.service;

import mate.academy.model.User;
import mate.academy.service.UserService;

import static mate.academy.service.UserService.users;
import static mate.academy.service.UserService.getUsers;

public class AuthenticationService {
    
    public boolean login(String email, String password) {
        UserService userService = new UserService();
        User foundUser = userService.findByEmail(email);
        if (foundUser != null && password.equals(foundUser.getPassword())){
            return true;
        }
        return  false;
    }

}
