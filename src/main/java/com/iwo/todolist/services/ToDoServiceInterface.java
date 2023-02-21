package com.iwo.todolist.services;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.requestDTO.RequestBodyPostToDo;

import java.time.LocalDate;
import java.util.List;

public interface ToDoServiceInterface {
    List<ToDoItem> getAllToDoItems();

    boolean editToDoItem(ToDoItem toDoItem);

    boolean createToDoItem(RequestBodyPostToDo requestBodyPostToDo);

    List<ToDoItem> getAllItemsBetweenGivenDates(LocalDate startDate, LocalDate endDate);
}
