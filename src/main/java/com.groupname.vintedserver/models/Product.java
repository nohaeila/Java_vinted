package com.groupname.vintedserver.models;

/**
 * This class represents a product in the system.
 * It contains basic product information such as ID, name, price, and the seller.
 */
public class Product {
    private String id;
    private String name;
    private double price;
    private User seller;

    // Constructor
    public Product(String id, String name, double price, User seller) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.seller = seller;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public User getSeller() {
        return seller;
    }
}
