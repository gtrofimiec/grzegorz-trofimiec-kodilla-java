package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderingProcessor {

    private OrderingDetails orderingDetails;

    public OrderingProcessor(OrderingDetails orderingDetails) {
        this.orderingDetails = orderingDetails;
    }

    public void orderProcess() {

        boolean processResult = orderingDetails.getSupplier().process();
        if (processResult) {
            System.out.println("Specification:\nProduct: " + orderingDetails.getProduct()
                    + "\nProduct quantity: " + orderingDetails.getProductQuantity()
                    + "\nOrder completed");
        } else {
            System.out.println("Order rejected!");
        }
    }
}