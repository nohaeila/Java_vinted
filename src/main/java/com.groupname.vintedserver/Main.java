package com.groupname.vintedserver;

import com.groupname.vintedserver.controllers.UserController;
import com.groupname.vintedserver.controllers.ProductController;
import com.groupname.vintedserver.models.User;
import com.groupname.vintedserver.models.Product;

/**
 * Main class to demonstrate the functionality of the Vinted-like application.
 */
public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();
        ProductController productController = new ProductController();

        // Create a new user
        User user = new User("1", "john_doe", "john@example.com");
        userController.addUser(user);

        // Retrieve the user by ID
        User retrievedUser = userController.getUserById("1");
        if (retrievedUser != null) {
            System.out.println("User retrieved: " + retrievedUser.getUsername());
        }

        // Create a new product
        Product product = new Product("101", "Laptop", 500.0, user);
        productController.addProduct(product);

        // Retrieve the product by ID
        Product retrievedProduct = productController.getProductById("101");
        if (retrievedProduct != null) {
            System.out.println("Product retrieved: " + retrievedProduct.getName() + ", Price: " + retrievedProduct.getPrice());
        }
    }
}
