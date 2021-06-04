package com.kodilla.good.patterns.challenges.Food2Door2;

public class HealthyShop implements Supplier {

    @Override
    public String toString() {
        return "Healthy Shop";
    }

    public boolean process() {
        System.out.println("Order delivered from Healthy Shop");
        return true;
    }
}