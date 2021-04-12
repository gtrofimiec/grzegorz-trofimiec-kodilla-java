package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {

    private List<Shape> shapesList = new ArrayList<>();

    public boolean addFigure(Shape shape) {
        boolean result = false;
        shapesList.add(shape);
        if(shapesList.contains(shape)) {
            result = true;
        }
        return result = true;
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(shapesList.contains(shape)) {
            shapesList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = shapesList.get(n);
        return shape;
    }

    public List<Shape> showFigures() {
        return shapesList;
    }
}
