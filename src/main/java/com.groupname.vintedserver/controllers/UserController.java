package com.groupname.vintedserver.controllers;

import com.groupname.vintedserver.services.UserService;
import com.groupname.vintedserver.models.User;

public class UserController {
    private UserService userService = new UserService();

    public User getUserById(String userId) {
        return userService.findUserById(userId);
    }
}
