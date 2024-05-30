package com.groupname.vintedserver.controllers;

import com.groupname.vintedserver.services.ProductService;
import com.groupname.vintedserver.models.Product;

public class ProductController {
    private ProductService productService = new ProductService();

    public Product getProductById(String productId) {
        return productService.findProductById(productId);
    }
}
