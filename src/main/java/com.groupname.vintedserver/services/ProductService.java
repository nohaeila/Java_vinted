package com.myteam.vintedserver.services;

import com.groupname.vintedserver.models.Product;
import com.groupname.vintedserver.exceptions.ProductNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class ProductService {
    private Map<String, Product> productRepository = new HashMap<>();

    public Product findProductById(String productId) throws ProductNotFoundException {
        Product product = productRepository.get(productId);
        if (product == null) {
            throw new ProductNotFoundException("Product not found for ID: " + productId);
        }
        return product;
    }
}
