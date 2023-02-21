package com.iwo.todolist.services;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.repositories.ToDoRepository;
import com.iwo.todolist.requestDTO.RequestBodyPostToDo;

import java.time.LocalDate;
import java.util.Optional;

public class toDoServiceUtils {
    public ToDoRepository toDoRepository;

    public toDoServiceUtils(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }
    public static ToDoItem mapRequestDTOIntoToDoItem(RequestBodyPostToDo requestBodyPostToDo){
        ToDoItem item = new ToDoItem();
        item.setOwnerId(requestBodyPostToDo.getOwnerId());
        item.setTaskContent(requestBodyPostToDo.getTaskContent());
        item.setCategory(requestBodyPostToDo.getCategory());
        item.setPriority(requestBodyPostToDo.getPriority());
        item.setCreatedAt(LocalDate.now());
        item.setIsOpen(1);
        item.setDueDate(requestBodyPostToDo.getDueDate());

        return item;
    }
    public static ToDoItem replaceAllFieldsInToDo(ToDoItem toDoItem, ToDoItem toDoItem2){
        toDoItem.setTaskContent(toDoItem2.getTaskContent());
        toDoItem.setCategory(toDoItem2.getCategory());
        toDoItem.setPriority(toDoItem2.getPriority());
        toDoItem.setCreatedAt(toDoItem2.getCreatedAt());
        toDoItem.setIsOpen(toDoItem2.getIsOpen());
        toDoItem.setDueDate(toDoItem2.getDueDate());

        return toDoItem;
    }

}
