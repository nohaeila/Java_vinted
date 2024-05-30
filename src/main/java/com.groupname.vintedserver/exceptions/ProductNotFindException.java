package com.groupname.vintedserver.exceptions;

/**
 * Custom exception to be thrown when a product is not found.
 */
public class ProductNotFindException extends Exception {
    public ProductNotFindException(String message) {
        super(message);
    }
}