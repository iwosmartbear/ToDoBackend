package com.iwo.todolist.services;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.repositories.ToDoRepository;
import com.iwo.todolist.requestDTO.RequestBodyToDo;

import java.time.LocalDate;

public class toDoServiceUtils {
    public ToDoRepository toDoRepository;

    public toDoServiceUtils(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }
    public static ToDoItem mapRequestDTOIntoToDoItem(RequestBodyToDo requestBodyToDo){
        ToDoItem item = new ToDoItem();
        item.setExtId(requestBodyToDo.getExtId());
        item.setOwnerId(requestBodyToDo.getOwnerId());
        item.setTaskContent(requestBodyToDo.getTaskContent());
        item.setCategory(requestBodyToDo.getCategory());
        item.setPriority(requestBodyToDo.getPriority());
        item.setCreatedAt(LocalDate.now());
        item.setIsOpen(requestBodyToDo.getIsOpen());
        item.setDueDate(requestBodyToDo.getDueDate());

        return item;
    }
    public static ToDoItem replaceAllFieldsInToDo(ToDoItem toDoItem, RequestBodyToDo requestBodyToDo){
        toDoItem.setTaskContent(requestBodyToDo.getTaskContent());
        toDoItem.setCategory(requestBodyToDo.getCategory());
        toDoItem.setPriority(requestBodyToDo.getPriority());
        toDoItem.setIsOpen(requestBodyToDo.getIsOpen());
        toDoItem.setDueDate(requestBodyToDo.getDueDate());

        return toDoItem;
    }

}
