package com.groupname.vintedserver.services;

import com.groupname.vintedserver.models.Product;
import com.groupname.vintedserver.exceptions.ProductNotFindException;

import java.util.HashMap;
import java.util.Map;

public class ProductService {
    private Map<String, Product> productRepository = new HashMap<>();

    public Product findProductById(String productId) throws ProductNotFindException {
        Product product = productRepository.get(productId);
        if (product == null) {
            throw new ProductNotFindException("Product not found for ID: " + productId);
        }
        return product;
    }
}
