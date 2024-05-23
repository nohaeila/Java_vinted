package com.myteam.vintedserver.services;

import com.myteam.vintedserver.models.User;
import com.myteam.vintedserver.exceptions.UserNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> userRepository = new HashMap<>();

    public User findUserById(String userId) throws UserNotFoundException {
        User user = userRepository.get(userId);
        if (user == null) {
            throw new UserNotFoundException("User not found for ID: " + userId);
        }
        return user;
    }
}
