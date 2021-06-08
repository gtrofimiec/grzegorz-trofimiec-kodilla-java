package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks;

    public TaskList(TaskList tasks) {
        this.tasks = new ArrayList<>();
    }
}