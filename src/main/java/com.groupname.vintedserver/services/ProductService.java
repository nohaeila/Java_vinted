package com.groupname.vintedserver.services;

import com.groupname.vintedserver.models.Product;
import com.groupname.vintedserver.exceptions.ProductNotFindException;

import java.util.HashMap;
import java.util.Map;

/**
 * Service class responsible for the business logic related to products.
 * It interacts with the data repository (simulated with a HashMap here) to manage Product entities.
 */
public class ProductService {
    // Simulated product repository using a HashMap
    private Map<String, Product> productRepository = new HashMap<>();

    /**
     * Finds a product by its ID.
     * @param productId The ID of the product to find.
     * @return The Product object if found.
     * @throws ProductNotFindException If the product is not found.
     */
    public Product findProductById(String productId) throws ProductNotFindException {
        Product product = productRepository.get(productId);
        if (product == null) {
            throw new ProductNotFindException("Product not found for ID: " + productId);
        }
        return product;
    }

    /**
     * Adds a new product to the repository.
     * @param product The Product object to add.
     */
    public void addProduct(Product product) {
        productRepository.put(product.getId(), product);
    }

    // Other service methods can be added here
}

