package com.groupname.vintedserver.services;

import com.groupname.vintedserver.models.User;
import com.groupname.vintedserver.exceptions.UserNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    private Map<String, User> userRepository = new HashMap<>();

    public User findUserById(String userId) throws UserNotFindException {
        User user = userRepository.get(userId);
        if (user == null) {
            throw new UserNotFindException("User not found for ID: " + userId);
        }
        return user;
    }
}
