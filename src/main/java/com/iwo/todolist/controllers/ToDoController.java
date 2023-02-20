package com.iwo.todolist.controllers;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @GetMapping("/add")
    public boolean test(){

        return toDoService.createToDoItem();
    }

    @GetMapping("/all")
    public List<ToDoItem> allToDos(){
        return toDoService.getAllToDoItems();
    }


}
