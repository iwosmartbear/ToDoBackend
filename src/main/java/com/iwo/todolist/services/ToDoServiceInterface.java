package com.iwo.todolist.services;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.requestDTO.RequestBodyToDo;

import java.time.LocalDate;
import java.util.List;

public interface ToDoServiceInterface {
    List<ToDoItem> getAllToDoItems(String ownerId);

    boolean editToDoItem(RequestBodyToDo requestBodyToDo);

    boolean createToDoItem(RequestBodyToDo requestBodyToDo);

    boolean deleteToDoItem(RequestBodyToDo requestBodyToDo);

    List<ToDoItem> getAllItemsByOwnerIdAndBetweenGivenDates(String ownerId, LocalDate startDate, LocalDate endDate);
}
