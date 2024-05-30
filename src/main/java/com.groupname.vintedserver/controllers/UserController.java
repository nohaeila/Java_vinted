
package com.groupname.vintedserver.controllers;

import com.groupname.vintedserver.models.User;
import com.groupname.vintedserver.services.UserService;
import com.groupname.vintedserver.exceptions.UserNotFoundException;

/**
 * Controller class responsible for handling user-related requests.
 * It interacts with the UserService to perform operations on User entities.
 */
public class UserController {
    private UserService userService = new UserService();

    /**
     * Retrieves a user by their ID.
     * @param userId The ID of the user to retrieve.
     * @return The User object if found, otherwise null.
     */
    public User getUserById(String userId) {
        try {
            return userService.findUserById(userId);
        } catch (UserNotFoundException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    /**
     * Adds a new user.
     * @param user The User object to add.
     */
    public void addUser(User user) {
        userService.addUser(user);
    }

    // Other user-related methods can be added here
}
