package com.iwo.todolist.services;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.requestDTO.RequestBodyPostToDo;

import java.util.Date;
import java.util.List;

public interface ToDoServiceInterface {
    List<ToDoItem> getAllToDoItems();

    String getOneToDoItem(String itemId);

    String editToDoItem();

    boolean createToDoItem(RequestBodyPostToDo requestBodyPostToDo);

    String getAllItemsBetweenGivenDates(Date startDate, Date endDate);
}
