package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Bean
    public Board board(@Qualifier("toDoList") TaskList taskList1, @Qualifier("inProgressList") TaskList taskList2,
                       @Qualifier("doneList") TaskList taskList3) {
        return new Board(taskList1, taskList2, taskList3);
    }

    @Bean(name="toDoList")
    public TaskList newToDoList() {
        return new TaskList();
    }

    @Bean(name="inProgressList")
    public TaskList newInProgressList() {
        return new TaskList();
    }

    @Bean(name="doneList")
    public TaskList newDoneList() {
        return new TaskList();
    }
}