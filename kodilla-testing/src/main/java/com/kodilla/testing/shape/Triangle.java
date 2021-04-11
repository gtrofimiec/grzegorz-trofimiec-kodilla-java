package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName;
    private int shapeField;

    public Triangle(String shapeName, int shapeField) {
        this.shapeName = shapeName;
        this.shapeField = shapeField;
    }

    public String getShapeName() {
        return shapeName;
    }

    public int getField() {
        return shapeField;
    }

}
