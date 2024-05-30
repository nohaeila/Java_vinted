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

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }
}
