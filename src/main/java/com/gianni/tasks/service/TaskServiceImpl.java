package com.gianni.tasks.service;

import com.gianni.tasks.domain.Task;
import com.gianni.tasks.repository.TaskRepository;
import org.springframework.stereotype.Service;


@Service
public class TaskServiceImpl implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository repository) {
        this.taskRepository = repository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task) {
        return this.taskRepository.save(task);
    }

}
