package com.iwo.todolist.controllers;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.requestDTO.RequestBodyPostToDo;
import com.iwo.todolist.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    ToDoService toDoService;


    @GetMapping("/all")
    public List<ToDoItem> allToDos(){
        return toDoService.getAllToDoItems();
    }

    @PostMapping("/add")
    public boolean addNewToDo(@RequestBody RequestBodyPostToDo[] requestBodyPostToDo){

        return toDoService.createToDoItem(requestBodyPostToDo[0]);
    }

    //edit task

    //get tasks between dates




}
