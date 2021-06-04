package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderingDetailsRetriever {

    public OrderingDetails retrieve() {
        HealthyShop healthyShop = new HealthyShop();
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();

        Product product1 = new Product("Tomatoes");
        double productQuantity = 3;

        return new OrderingDetails(healthyShop, product1, productQuantity);
    }
}