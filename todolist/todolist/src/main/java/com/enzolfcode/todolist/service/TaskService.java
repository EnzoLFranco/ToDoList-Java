package com.enzolfcode.todolist.service;

import com.enzolfcode.todolist.model.Task;
import com.enzolfcode.todolist.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task criarTask (Task task){
        return taskRepository.save(task);
    }
}
