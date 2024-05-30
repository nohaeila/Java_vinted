package com.groupname.vintedserver.controllers;

import com.groupname.vintedserver.models.Product;
import com.groupname.vintedserver.services.ProductService;
import com.groupname.vintedserver.exceptions.ProductNotFindException;

/**
 * Controller class responsible for handling product-related requests.
 * It interacts with the ProductService to perform operations on Product entities.
 */
public class ProductController {
    private ProductService productService = new ProductService();

    /**
     * Retrieves a product by its ID.
     * @param productId The ID of the product to retrieve.
     * @return The Product object if found, otherwise null.
     */
    public Product getProductById(String productId) {
        try {
            return productService.findProductById(productId);
        } catch (ProductNotFindException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    /**
     * Adds a new product.
     * @param product The Product object to add.
     */
    public void addProduct(Product product) {
        productService.addProduct(product);
    }
}