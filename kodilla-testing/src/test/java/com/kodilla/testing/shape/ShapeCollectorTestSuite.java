package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.List;

@DisplayName("TDD: Shapes Collection Test Suite")
class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testAddFigure() {
        //Given
        Shape circle = new Circle("Circle", 1);
        ShapeCollector shapesCollection = new ShapeCollector();

        //When
        shapesCollection.addFigure(circle);

        //Then
        Assertions.assertEquals(1, shapesCollection.getFiguresQuantity());
    }

    @Test
    void testRemoveFigure() {
        //Given
        Shape circle = new Circle("Circle", 1);
        ShapeCollector shapesCollection = new ShapeCollector();
        shapesCollection.addFigure(circle);

        //When
        boolean result = shapesCollection.removeFigure(circle);

        //Then
        Assertions.assertTrue(result);
        Assertions.assertEquals(0, shapesCollection.getFiguresQuantity());
    }

    @Test
    void testGetFigure() {
        //Given
        Shape circle = new Circle("Circle", 1);
        ShapeCollector shapesCollection = new ShapeCollector();
        shapesCollection.addFigure(circle);

        //When
        Shape retrievedShape;
        retrievedShape = shapesCollection.getFigure(1);

        //Then
        Assertions.assertEquals(circle, retrievedShape);
    }

    @Test
    void testShowFigures() {
        //Given
        Shape circle = new Circle("Circle", 1);
        ShapeCollector shapesCollection = new ShapeCollector();
        shapesCollection.addFigure(circle);

        //When
        List<Shape> list = shapesCollection.showFigures();

        //Then
        Assertions.assertTrue(list.size() != 0);
    }
}