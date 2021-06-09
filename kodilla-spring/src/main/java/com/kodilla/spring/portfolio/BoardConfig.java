package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    TaskList taskList;

    @Bean
    public Board board() {
        return new Board();
    }

    @Bean
    public TaskList toDoList() {
        return new TaskList(toDoList());
    }

    @Bean
    public TaskList inProgressList() {
        return new TaskList(inProgressList());
    }

    @Bean
    public TaskList doneList() {
        return  new TaskList(doneList());
    }


//    @Bean
//    public TaskList toDoList() {
//        return new TaskList(board.toDoList);
//    }
//
//    @Bean
//    public TaskList getInProgressList() {
//        return board.inProgressList;
//    }
//
//    @Bean
//    public TaskList getDoneList() {
//        return board.doneList;
//    }

//    @Bean
//    public TaskList getBoardToDoList() {
//        return board.getToDoList();
//    }
//
//    @Bean
//    public TaskList getBoardInProgressList() {
//        return board.getInProgressList();
//    }
//
//    @Bean
//    public TaskList getBoardDoneList() {
//        return board.getDoneList();
//    }
}