package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderingDetails {

    private SupplierConstructor supplier;
    private Product product;
    private double productQuantity;

    public OrderingDetails(SupplierConstructor supplier, Product product, double productQuantity) {
        this.supplier = supplier;
        this.product = product;
        this.productQuantity = productQuantity;
    }

    public SupplierConstructor getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public double getProductQuantity() {
        return productQuantity;
    }
}