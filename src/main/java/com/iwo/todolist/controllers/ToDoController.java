package com.iwo.todolist.controllers;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.requestDTO.RequestBodyPostToDo;
import com.iwo.todolist.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class ToDoController {

    @Autowired
    ToDoService toDoService;


    @GetMapping("/all")
    public List<ToDoItem> allToDos(@RequestHeader String token){
        return toDoService.getAllToDoItems(token);
    }

    @GetMapping("/dates")
    public List<ToDoItem> getToDosWithDueDateBetweenGivenDates(
            @RequestHeader String token,
            @RequestParam LocalDate startDate, LocalDate endDate
    ){
        return toDoService.getAllItemsByOwnerIdAndBetweenGivenDates(token, startDate, endDate);
    }

    @PostMapping("/add")
    public boolean addNewToDo(@Validated @RequestBody RequestBodyPostToDo requestBodyPostToDo){

        return toDoService.createToDoItem(requestBodyPostToDo);
    }

    @PutMapping("/edit")
    public boolean updateToDo(@Validated @RequestBody ToDoItem toDoItem){

        return toDoService.editToDoItem(toDoItem);
    }

    @DeleteMapping("/delete")
    public boolean deleteToDoItem(@Validated @RequestBody ToDoItem toDoItem){

        return toDoService.deleteToDoItem(toDoItem);
    }

}
