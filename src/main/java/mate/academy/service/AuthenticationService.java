package mate.academy.service;

import mate.academy.model.User;

public class AuthenticationService {
    private UserService userService = new UserService();

    public boolean login(String email, String password) {
        User foundUser = userService.findByEmail(email);
        return foundUser != null && password.equals(foundUser.getPassword());
    }
}
