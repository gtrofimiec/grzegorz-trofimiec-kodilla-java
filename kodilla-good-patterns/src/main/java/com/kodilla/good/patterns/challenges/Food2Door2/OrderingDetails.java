package com.kodilla.good.patterns.challenges.Food2Door2;

public class OrderingDetails {

    private Supplier supplier;
    private Product product;
    private double productQuantity;

    public OrderingDetails(Supplier supplier, Product product, double productQuantity) {
        this.supplier = supplier;
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public double getProductQuantity() {
        return productQuantity;
    }
}