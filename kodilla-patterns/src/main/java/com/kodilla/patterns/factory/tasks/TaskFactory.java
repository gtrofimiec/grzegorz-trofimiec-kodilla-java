package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String DRIVING_TASK = "DRIVING TASK";
    public static final String PAINTING_TASK = "PAINTING TASK";
    public static final String SHOPPING_TASK = "SHOPPING TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVING_TASK:
                return new DrivingTask("Trip to London","London","Airplane");
            case PAINTING_TASK:
                return new PaintingTask("Painting a red picture","Red","Picture");
            case SHOPPING_TASK:
                return new ShoppingTask("Do shopping", "Potatoes", 23);
            default:
                return null;
        }
    }

}
