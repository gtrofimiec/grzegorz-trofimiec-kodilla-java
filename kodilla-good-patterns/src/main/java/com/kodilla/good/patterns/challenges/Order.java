package com.kodilla.good.patterns.challenges;

public class Order implements OrdersRepository {

    int orderID;

    public Order(int orderID) {
        this.orderID = orderID;
    }

    @Override
    public int getOrderID(Order order) {
        return orderID;
    }

    public boolean createOrder(Customer customer, Product product)  {
        return true;
    }
}
