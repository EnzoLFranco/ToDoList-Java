package com.enzolfcode.todolist.service;

import com.enzolfcode.todolist.model.Task;
import com.enzolfcode.todolist.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task criarTask (Task task){
        return taskRepository.save(task);
    }

    public List<Task> listarTodasAsTasks(){
        return taskRepository.findAll();
    }

    public ResponseEntity<Task> buscarTaskPorID(Long id){
        return taskRepository.findById(id)
                .map(task -> ResponseEntity.ok().body(task))
                .orElse(ResponseEntity.notFound().build());
    }
}
