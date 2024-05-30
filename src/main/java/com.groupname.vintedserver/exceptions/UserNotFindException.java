package com.groupname.vintedserver.exceptions;
/**
 * Custom exception to be thrown when a user is not found.
 */
public class UserNotFindException extends Exception {
    public UserNotFindException(String message) {
        super(message);
    }
}