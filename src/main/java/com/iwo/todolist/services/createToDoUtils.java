package com.iwo.todolist.services;

import com.iwo.todolist.models.ToDoItem;
import com.iwo.todolist.requestDTO.RequestBodyPostToDo;

import java.util.Date;

public class createToDoUtils {
    public static ToDoItem mapRequestDTOIntoToDoItem(RequestBodyPostToDo requestBodyPostToDo){
        ToDoItem item = new ToDoItem();
        item.setOwnerId("jaslkdja-asda-ad-asdasd");
        item.setTaskContent(requestBodyPostToDo.getTaskContent());
        item.setCategory(requestBodyPostToDo.getCategory());
        item.setPriority(requestBodyPostToDo.getPriority());
        item.setCreatedAt(new Date());
        item.setIsOpen((byte) 1);
        item.setDueDate(requestBodyPostToDo.getDueDate());

        return item;
    }

}
