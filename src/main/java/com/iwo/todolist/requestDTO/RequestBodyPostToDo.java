package com.iwo.todolist.requestDTO;

import lombok.Data;

import java.util.Date;

@Data
public class RequestBodyPostToDo {

    private String ownerId;

    private String taskContent;

    private String category;

    private byte priority;

    private Date dueDate;
}
