package com.iwo.todolist.services;

import com.iwo.todolist.models.ToDoItem;

import java.util.Date;
import java.util.List;

public interface ToDoServiceInterface {
    List<ToDoItem> getAllToDoItems();

    String getOneToDoItem(String itemId);

    String editToDoItem();

    boolean createToDoItem();

    String getAllItemsBetweenGivenDates(Date startDate, Date endDate);
}
