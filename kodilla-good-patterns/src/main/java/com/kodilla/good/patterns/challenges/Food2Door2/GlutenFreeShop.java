package com.kodilla.good.patterns.challenges.Food2Door2;

public class GlutenFreeShop implements Supplier {

    @Override
    public String toString() {
        return "Gluten Free Shop";
    }

    public boolean process() {
        System.out.println("Order delivered from GlutenFree Shop");
        return true;
    }
}