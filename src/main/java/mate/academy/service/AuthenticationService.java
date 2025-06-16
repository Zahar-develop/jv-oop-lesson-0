package mate.academy.service;

import mate.academy.model.User;

public class AuthenticationService {
    UserService userService = new UserService();
    public boolean login(String email, String password) {
        User foundUser = userService.findByEmail(email);
        boolean dataUser = foundUser != null && password.equals(foundUser.getPassword()) ? true : false;
        return dataUser;
    }
}
