package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderingDetailsRetriever {

    public OrderingDetails retrieve() {
        Supplier supplier = new Supplier("ExtraFoodShop");
        Product product = new Product("Potatoes", "Vege");
        double productQuantity = 3;

        return new OrderingDetails(supplier, product, productQuantity);
    }
}