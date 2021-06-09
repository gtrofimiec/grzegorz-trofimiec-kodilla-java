package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class TaskList {

    public final List<String> tasks;

    public TaskList(final TaskList tasks) {
        this.tasks = new ArrayList<>();
    }
}