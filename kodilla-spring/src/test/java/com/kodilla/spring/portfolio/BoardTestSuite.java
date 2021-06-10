package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
            board.doneList.tasks.add("task3");

            //Then
            System.out.println("Element of toDoList" + board.toDoList.tasks.get(0));
//            System.out.println("Element of inProgressList" + board.inProgressList.tasks.get(0));
//            System.out.println("Element of doneList" + board.doneList.tasks.get(0));
        }

}