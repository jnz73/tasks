package com.gianni.tasks.service;

import com.gianni.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
