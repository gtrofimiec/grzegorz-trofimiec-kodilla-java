package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderingDetailsRetriever {

    public OrderingDetails retrieve() {
        HealthyShop supplier1 = new HealthyShop("HealthyShop", "Vege");
        ExtraFoodShop supplier2 = new ExtraFoodShop ("ExtraFoodShop", "Meat");
        GlutenFreeShop supplier3 = new GlutenFreeShop ("GlutenFreeShop", "Gluten free");

        Product product1 = new Product("Potatoes", "Vege");
        Product product2 = new Product("Beef", "Meat");
        Product product3 = new Product("Millet gluten-free", "Gluten free");
        double productQuantity = 3;

        return new OrderingDetails(supplier1, product1, productQuantity);
    }
}