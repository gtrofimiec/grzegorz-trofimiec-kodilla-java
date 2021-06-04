package com.kodilla.good.patterns.challenges.Food2Door2;

public class Food2DoorApp {

    public static void main(String[] args) {

        OrderingDetailsRetriever orderingDetailsRetriever = new OrderingDetailsRetriever();
        OrderingDetails orderingDetails = orderingDetailsRetriever.retrieve();

        OrderingProcessor orderingProcessor = new OrderingProcessor(orderingDetails);

        orderingProcessor.orderProcess();
    }
}