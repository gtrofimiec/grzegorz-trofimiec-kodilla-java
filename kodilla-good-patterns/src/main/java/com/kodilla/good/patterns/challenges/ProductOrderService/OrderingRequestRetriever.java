package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderingRequestRetriever {

    public OrderingRequest retrieve() {

        Customer customer = new Customer("John Bold");
        Product product = new Product("Nokia 3110");

        return new OrderingRequest(customer, product);
    }
}