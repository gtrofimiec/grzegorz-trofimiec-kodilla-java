package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.toDoList.tasks.add("task1");
        board.inProgressList.tasks.add("task2");
        board.inProgressList.tasks.add("task3");
        board.doneList.tasks.add("task4");
        board.doneList.tasks.add("task5");
        board.doneList.tasks.add("task6");

        //Then
        assertEquals(1,board.toDoList.tasks.size());
        assertEquals(2,board.inProgressList.tasks.size());
        assertEquals(3,board.doneList.tasks.size());
        }
}