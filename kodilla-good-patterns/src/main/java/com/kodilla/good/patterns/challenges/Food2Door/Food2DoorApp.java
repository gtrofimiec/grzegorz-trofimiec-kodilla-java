package com.kodilla.good.patterns.challenges.Food2Door;

public class Food2DoorApp {

    public static void main(String[] args) {


        OrderingDetailsRetriever orderingDetailsRetriever = new OrderingDetailsRetriever();
        OrderingDetails orderingDetails = orderingDetailsRetriever.retrieve();

        orderingDetails.getSupplier().process(orderingDetails);
    }
}