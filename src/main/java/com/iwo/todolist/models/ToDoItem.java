package com.iwo.todolist.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class ToDoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String taskContent;

    private Date createdAt;

    private Date dueDate;

    private byte priority;


//@TODO set optimized formats for sql


}
