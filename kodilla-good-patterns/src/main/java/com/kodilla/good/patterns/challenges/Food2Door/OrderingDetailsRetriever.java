package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderingDetailsRetriever {

    public OrderingDetails retrieve() {
        Supplier supplier1 = new Supplier("HealthyShop", "Vege");
        Supplier supplier2 = new Supplier("ExtraFoodShop", "Meat");
        Supplier supplier3 = new Supplier("GlutenFreeShop", "Gluten free");

        Product product1 = new Product("Potatoes", "Vege");
        Product product2 = new Product("Beef", "Meat");
        Product product3 = new Product("Millet gluten-free", "Gluten free");
        double productQuantity = 3;

        return new OrderingDetails(supplier1, product2, productQuantity);
    }
}