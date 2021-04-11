package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String shapeName;
    private int shapeField;

    public Circle(String shapeName, int shapeField) {
        this.shapeName = shapeName;
        this.shapeField = shapeField;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getField() {
        return shapeField;
    }

    @Override
    public String toString() {
        return shapeName;
    }
}
