package com.groupname.vintedserver.services;

import com.groupname.vintedserver.models.User;
import com.groupname.vintedserver.exceptions.UserNotFindException;

import java.util.HashMap;
import java.util.Map;

/**
 * Service class responsible for the business logic related to users.
 * It interacts with the data repository (simulated with a HashMap here) to manage User entities.
 */
public class UserService {
    // Simulated user repository using a HashMap
    private Map<String, User> userRepository = new HashMap<>();

    /**
     * Finds a user by their ID.
     * @param userId The ID of the user to find.
     * @return The User object if found.
     * @throws UserNotFindException If the user is not found.
     */
    public User findUserById(String userId) throws UserNotFindException {
        User user = userRepository.get(userId);
        if (user == null) {
            throw new UserNotFindException("User not found for ID: " + userId);
        }
        return user;
    }

    /**
     * Adds a new user to the repository.
     * @param user The User object to add.
     */
    public void addUser(User user) {
        userRepository.put(user.getId(), user);
    }

    // Other service methods can be added here
}