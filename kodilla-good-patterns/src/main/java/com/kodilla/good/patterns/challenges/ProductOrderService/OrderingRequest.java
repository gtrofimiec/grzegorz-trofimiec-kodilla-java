package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderingRequest {

    private Customer customer;
    private Product product;

    public OrderingRequest(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }
}