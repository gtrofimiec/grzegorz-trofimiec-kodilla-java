package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        // do nothing
    }

    public int getFiguresQuantity() {
        return 3;
    }

    public boolean removeFigure(Shape shape) {
        return true;
    }

    public Shape getFigure(int n) {
        return null;
    }

    public List<Shape> showFigures() {
        return shapes;
    }
}
