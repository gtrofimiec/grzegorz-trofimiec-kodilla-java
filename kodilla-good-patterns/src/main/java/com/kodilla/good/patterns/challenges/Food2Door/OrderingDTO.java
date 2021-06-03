package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderingDTO {

    public SupplierConstructor supplier;
    public boolean orderCompleted;

    public OrderingDTO(SupplierConstructor supplier, boolean orderCompleted) {
        this.supplier = supplier;
        this.orderCompleted = orderCompleted;
    }
}