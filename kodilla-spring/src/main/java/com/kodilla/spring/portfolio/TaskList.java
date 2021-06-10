package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public final class TaskList {

    public final List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }
}