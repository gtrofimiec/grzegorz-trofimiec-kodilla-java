package com.kodilla.good.patterns.challenges.ProductOrderService;

public interface OrderingRepository {

    void createOrdering(Customer customer, Product product);
}