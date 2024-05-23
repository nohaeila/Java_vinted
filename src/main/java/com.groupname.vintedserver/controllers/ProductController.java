package com.goupname.vintedserver.controllers;

import com.myteam.vintedserver.services.ProductService;
import com.myteam.vintedserver.models.Product;

public class ProductController {
    private ProductService productService = new ProductService();

    public Product getProductById(String productId) {
        return productService.findProductById(productId);
    }
}
