package com.kodilla.good.patterns.challenges.Food2Door2;

public class Product {

    String productName;

    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return productName;
    }
}