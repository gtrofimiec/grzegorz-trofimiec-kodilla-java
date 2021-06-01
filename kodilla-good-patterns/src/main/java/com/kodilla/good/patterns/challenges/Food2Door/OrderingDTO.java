package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderingDTO {

    public Supplier supplier;
    public boolean orderCompleted;

    public OrderingDTO(Supplier supplier, boolean orderCompleted) {
        this.supplier = supplier;
        this.orderCompleted = orderCompleted;
    }
}
