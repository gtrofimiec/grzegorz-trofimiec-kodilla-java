package com.kodilla.good.patterns.challenges.Food2Door2;

public class ExtraFoodShop implements Supplier {

    @Override
    public String toString() {
        return "Extra Food Shop";
    }

    public boolean process() {
        System.out.println("Order delivered from Extra Food Shop");
        return true;
    }
}