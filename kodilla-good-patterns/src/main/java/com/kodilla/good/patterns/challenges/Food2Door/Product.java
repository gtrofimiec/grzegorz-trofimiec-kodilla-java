package com.kodilla.good.patterns.challenges.Food2Door;

public class Product {

    public String productName;
    public String productType;

    public Product(String productName, String productType) {
        this.productName = productName;
        this.productType = productType;
    }

    public String getProductName() {
        return productName;
    }
}