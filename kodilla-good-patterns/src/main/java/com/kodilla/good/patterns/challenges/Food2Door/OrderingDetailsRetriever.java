package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderingDetailsRetriever {

    public OrderingDetails retrieve() {

        Product product1 = new Product("Tomatoes");
        double productQuantity = 3;

        return new OrderingDetails(new HealthyShop(), product1, productQuantity);
    }
}