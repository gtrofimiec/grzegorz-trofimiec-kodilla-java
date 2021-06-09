package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.DRIVING_TASK);
        String taskName=task.getTaskName();
        task.executeTask();
        task.isTaskExecuted();
        //Then
        assertEquals("Trip to London", taskName);
        assertTrue(task.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.PAINTING_TASK);
        String taskName=task.getTaskName();
        task.executeTask();
        task.isTaskExecuted();
        //Then
        assertEquals("Painting a red picture", taskName);
        assertTrue(task.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task task = factory.makeTask(TaskFactory.SHOPPING_TASK);
        String taskName=task.getTaskName();
        task.executeTask();
        task.isTaskExecuted();
        //Then
        assertEquals("Do shopping", taskName);
        assertTrue(task.isTaskExecuted());
    }

}
