package com.groupname.vintedserver.utils;

/**
 * Utility class for validation operations.
 * Contains methods for validating email addresses and prices.
 */
public class ValidationUtils {
    // Method to validate email addresses
    public static boolean isValidEmail(String email) {
        // Simple email validation
        return email != null && email.contains("@");
    }

    // Method to validate prices
    public static boolean isValidPrice(double price) {
        // Simple price validation
        return price > 0;
    }
}
