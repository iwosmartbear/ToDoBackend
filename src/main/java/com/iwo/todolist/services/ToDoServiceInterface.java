package com.iwo.todolist.services;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.requestDTO.RequestBodyPostToDo;

import java.time.LocalDate;
import java.util.List;

public interface ToDoServiceInterface {
    List<ToDoItem> getAllToDoItems(String ownerId);

    boolean editToDoItem(ToDoItem toDoItem);

    boolean createToDoItem(RequestBodyPostToDo requestBodyPostToDo);

    List<ToDoItem> getAllItemsByOwnerIdAndBetweenGivenDates(String ownerId, LocalDate startDate, LocalDate endDate);
}
