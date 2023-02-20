package com.iwo.todolist.services;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.repositories.ToDoRepository;
import com.iwo.todolist.requestDTO.RequestBodyPostToDo;

import java.util.Date;
import java.util.Optional;

public class createToDoUtils {
    public ToDoRepository toDoRepository;

    public createToDoUtils(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }
    public static ToDoItem mapRequestDTOIntoToDoItem(RequestBodyPostToDo requestBodyPostToDo){
        ToDoItem item = new ToDoItem();
        item.setOwnerId(requestBodyPostToDo.getOwnerId());
        item.setTaskContent(requestBodyPostToDo.getTaskContent());
        item.setCategory(requestBodyPostToDo.getCategory());
        item.setPriority(requestBodyPostToDo.getPriority());
        item.setCreatedAt(new Date());
        item.setIsOpen((byte) 1);
        item.setDueDate(requestBodyPostToDo.getDueDate());

        return item;
    }

    public Optional<ToDoItem> findToDoById(String id){
        Optional<ToDoItem> foundItem = toDoRepository.findById(id);

        return foundItem;
    }

}
