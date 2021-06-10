package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board board() {
        return new Board();
    }

    @Bean(name="toDoList")
    public TaskList toDoList() {
        return new TaskList();
    }
    @Bean(name="inProgressList")
    public TaskList inProgressList() {
        return new TaskList();
    }
    @Bean(name="doneList")
    public TaskList doneList() {
        return new TaskList();
    }

//    @Bean
//    public TaskList addInProgressList() {
//        List<String> inProgressList = new ArrayList<>();
//        return new TaskList(inProgressList);
//    }
//
//    @Bean
//    public TaskList addDoneList() {
//        List<String> doneList = new ArrayList<>();
//        return new TaskList(doneList);
//    }
}