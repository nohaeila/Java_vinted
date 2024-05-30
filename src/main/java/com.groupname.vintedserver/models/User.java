package com.groupname.vintedserver.models;

/**
 * This class represents a user in the system.
 * It contains basic user information such as ID, username, and email.
 */
public class User {
    private String id;
    private String username;
    private String email;

    // Constructor
    public User(String id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
    }

    public String getId() {

        return id;
    }

    public String getUsername() {

        return username;
    }

    public String getEmail() {

        return email;
    }

}