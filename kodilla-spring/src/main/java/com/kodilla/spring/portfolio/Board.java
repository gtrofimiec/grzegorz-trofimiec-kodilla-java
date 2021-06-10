package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

@Component
public class Board {

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;
}