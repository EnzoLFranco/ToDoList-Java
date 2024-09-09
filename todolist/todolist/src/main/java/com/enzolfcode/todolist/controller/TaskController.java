package com.enzolfcode.todolist.controller;


import com.enzolfcode.todolist.model.Task;
import com.enzolfcode.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("/tasks")
    @ResponseStatus(HttpStatus.CREATED)
    public Task criarTask (@RequestBody Task task){
        return taskService.criarTask(task);
    }

    @GetMapping("/tasks")
    @ResponseStatus(HttpStatus.OK)
    public List<Task> getTodasAsTasks(){
        return taskService.listarTodasAsTasks();
    }

    

}
