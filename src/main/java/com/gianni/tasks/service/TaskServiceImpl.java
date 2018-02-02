package com.gianni.tasks.service;

import com.gianni.tasks.domain.Task;
import com.gianni.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;


@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository repository;

    public TaskServiceImpl(TaskRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Task> list() {
        return this.repository.findAll();
    }
}
