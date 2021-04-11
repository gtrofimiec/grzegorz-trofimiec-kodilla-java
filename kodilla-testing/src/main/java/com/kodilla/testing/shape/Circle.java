package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private int shapeField;

    public Circle(String shapeName, int shapeField) {
        this.shapeName = shapeName;
        this.shapeField = shapeField;
    }

    @Override
    public void getShapeName() {
    }

    @Override
    public void getField() {
    }
}
