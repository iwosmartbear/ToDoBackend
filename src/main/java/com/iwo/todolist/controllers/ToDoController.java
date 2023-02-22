package com.iwo.todolist.controllers;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.requestDTO.RequestBodyPostToDo;
import com.iwo.todolist.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @GetMapping("/all")
    public List<ToDoItem> allToDos(){
        return toDoService.getAllToDoItems();
    }

    @GetMapping("/dates")
    public List<ToDoItem> getToDosWithDueDateBetweenGivenDates(@RequestParam LocalDate startDate, LocalDate endDate){
        return toDoService.getAllItemsBetweenGivenDates(startDate, endDate);
    }

    @PostMapping("/add")
    public boolean addNewToDo(@Validated @RequestBody RequestBodyPostToDo requestBodyPostToDo){

        return toDoService.createToDoItem(requestBodyPostToDo);
    }

    @PutMapping("/edit")
    public boolean addNewToDo(@Validated @RequestBody ToDoItem toDoItem){

        return toDoService.editToDoItem(toDoItem);
    }

    @DeleteMapping("/delete")
    public boolean deleteToDoItem(@Validated @RequestBody ToDoItem toDoItem){

        return toDoService.deleteToDoItem(toDoItem);
    }

}
