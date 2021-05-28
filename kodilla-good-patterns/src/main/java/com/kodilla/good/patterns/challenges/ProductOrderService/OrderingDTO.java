package com.kodilla.good.patterns.challenges.ProductOrderService;

public class OrderingDTO {

    public Customer customer;
    public boolean orderCompleted;

    public OrderingDTO(Customer customer, boolean orderCompleted) {
        this.customer = customer;
        this.orderCompleted = orderCompleted;
    }
}