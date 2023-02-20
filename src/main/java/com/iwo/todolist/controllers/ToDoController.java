package com.iwo.todolist.controllers;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.requestDTO.RequestBodyPostToDo;
import com.iwo.todolist.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PutMapping("/edit")
    public boolean addNewToDo(@RequestBody ToDoItem[] toDoItem){

        return toDoService.editToDoItem(toDoItem[0]);
    }

    //get tasks between dates




}
